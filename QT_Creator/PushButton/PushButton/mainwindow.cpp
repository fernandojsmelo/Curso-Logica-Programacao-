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


void MainWindow::on_btnMensagem1_clicked()
{
    //Ui = User Interface
    ui->txtMensagem->setText("Olá, mundo!");

}


void MainWindow::on_btnMensagem2_clicked()
{

    ui->txtMensagem->setText("Estou fazendo o curso de QT Creator!");

}


void MainWindow::on_btnMensagem3_clicked()
{

    QMessageBox::about(this, "Mensagem", "Botão 3 exibindo alerta!");

}

