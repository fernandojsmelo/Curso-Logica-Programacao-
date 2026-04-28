#include "mainwindow.h"
#include "ui_mainwindow.h"
#include "contatos.h"

MainWindow::MainWindow(QWidget *parent)
    : QMainWindow(parent)
    , ui(new Ui::MainWindow)
{
    ui->setupUi(this);

    //Configurando a tableWidget
    QStringList titulos;
    ui->tableWidgetContatos->setColumnCount(3);

    titulos << "Nome" << "Telefone" << "Email";
    ui->tableWidgetContatos->setHorizontalHeaderLabels(titulos);

}

MainWindow::~MainWindow()
{
    delete ui;
}


void MainWindow::on_btnNovo_clicked()
{
    int resultado;

    QString nome, telefone, email;

    //Abre a tela cadastro contato
    Contatos dadosContato;
    resultado = dadosContato.exec();

    //Se
    if( resultado == QDialog::Rejected ){

        return;

    }else{

        nome = dadosContato.nomeContato();
        telefone = dadosContato.telefoneContato();
        email = dadosContato.emailContato();

        ui->tableWidgetContatos->insertRow(ui->tableWidgetContatos->rowCount());

        //Passando os dados para a tableWidgetContatos
        ui->tableWidgetContatos->setItem(ui->tableWidgetContatos->rowCount() -1, 0,
                                         new QTableWidgetItem(nome));

        ui->tableWidgetContatos->setItem(ui->tableWidgetContatos->rowCount() -1, 1,
                                         new QTableWidgetItem(telefone));

        ui->tableWidgetContatos->setItem(ui->tableWidgetContatos->rowCount() -1, 2,
                                         new QTableWidgetItem(email));


    }

}

