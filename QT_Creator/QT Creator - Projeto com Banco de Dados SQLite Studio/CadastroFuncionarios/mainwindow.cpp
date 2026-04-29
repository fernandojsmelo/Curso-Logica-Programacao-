#include "mainwindow.h"
#include "ui_mainwindow.h"

#include <telaprincipal.h>

#include <QtSql>
#include <QDebug>
#include <QFileInfo>
#include <QMessageBox>
#include <QCoreApplication>

//Declara como banco de dados glocal
static QSqlDatabase bancoDados = QSqlDatabase::addDatabase("QSQLITE");


MainWindow::MainWindow(QWidget *parent)
    : QMainWindow(parent)
    , ui(new Ui::MainWindow)
{
    ui->setupUi(this);

    //Cria a conexão com o banco de dados
    bancoDados.setDatabaseName("/home/fernandomelo/Cuso logica Progamação/Curso-Logica-Programacao-/QT_Creator/QT Creator - Projeto com Banco de Dados SQLite Studio/CadastroFuncionarios/Banco de Dados.db");

    //Verifica se o banco de dados está aberto
    if(bancoDados.open()){

        ui->statusbar->showMessage("Banco de dados conectado com sucesso!");

    }else{

        ui->statusbar->showMessage("Erro ao conectar com o banco de dados!");

    }

    //Mensagem de previa ou aviso para o usuário
    ui->txtNome->setPlaceholderText("Digite seu nome");
    ui->txtSenha->setPlaceholderText("Digite sua senha");


}

MainWindow::~MainWindow()
{
    delete ui;
}


void MainWindow::on_btnLogar_clicked()
{

    QString nomeUsuario = ui->txtNome->text();
    QString senhaUsuario = ui->txtSenha->text();

    //Se
    if(bancoDados.isOpen()){

        //Criamos uma variavel do tipo query para fazer a pesquisa no BD
        QSqlQuery consultaNoBancoDeDados;

        //O exec = vai me retorna true se conseguir fazer a pesquisa
        //from = onde
        //where = quando
        //select = selecione
        if( consultaNoBancoDeDados.exec("SELECT * FROM Login WHERE nome='"+nomeUsuario+"' and senha='"+senhaUsuario+"' ") ){

                int contaRegistrosEncontrados = 0;

                //while = enquanto
                //next = proximo valor
                while(consultaNoBancoDeDados.next()){

                    contaRegistrosEncontrados++;

                }

                if(contaRegistrosEncontrados == 1){

                    //Fecho a tela
                    this->close();

                    TelaPrincipal abrirTelaPrincipal;

                    abrirTelaPrincipal.setModal(true);
                    abrirTelaPrincipal.exec();


                }else{

                    QMessageBox::critical(this, "Atenção!",
                                          "Usuário ou senha inválidos!");

                }

        }



    }else{

        QMessageBox::critical(this, "Alerta!",
                              "O Bando de dados não está aberto");
        return;

    }



}

