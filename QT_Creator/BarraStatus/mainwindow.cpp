#include "mainwindow.h"
#include "ui_mainwindow.h"

MainWindow::MainWindow(QWidget *parent)
    : QMainWindow(parent)
    , ui(new Ui::MainWindow)
{
    ui->setupUi(this);

    //Adiciona uma mensagem na barra de status ao abrir
    ui->statusbar->showMessage("Boa noite, estou fazendo o curso de QT");

}

MainWindow::~MainWindow()
{
    delete ui;
}


void MainWindow::on_btnAlterarBarraStatus_clicked()
{

    ui->statusbar->showMessage("Mensagem: " + ui->txtMensagem->text());

}

