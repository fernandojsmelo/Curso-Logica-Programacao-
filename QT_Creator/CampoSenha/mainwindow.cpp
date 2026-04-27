#include "mainwindow.h"
#include "ui_mainwindow.h"
#include <QMessageBox>

MainWindow::MainWindow(QWidget *parent)
    : QMainWindow(parent)
    , ui(new Ui::MainWindow)
{
    ui->setupUi(this);
}

MainWindow::~MainWindow()
{
    delete ui;
}


void MainWindow::on_btnEntrar_clicked()
{

    QString nome = ui->txtUsuario->text();
    QString senha = ui->txtSenha->text();

    if ( nome == "Ana Paula" && senha == "aluno" ){

        QMessageBox::information(this, "Tela Login",
                                 "Usuário logado com sucesso!!!");

    }else{

        QMessageBox::information(this, "Tela Login",
                                 "Usuário ou senha inválidos");

    }

}

