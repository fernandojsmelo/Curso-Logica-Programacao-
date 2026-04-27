#include "mainwindow.h"
#include "ui_mainwindow.h"
#include "QMessageBox"

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


void MainWindow::on_btnInformacao_clicked()
{

    QMessageBox::information(this, "Mensagem Informação",
                             "Mensagem Informação mõdulo QT Creator");

}


void MainWindow::on_btnCritical_clicked()
{

    QMessageBox::critical(this, "Mensagem crítica",
                          "Mensagem Crítica módulo QT Creator");

}


void MainWindow::on_btnPergunta_clicked()
{

    QMessageBox::StandardButton repitir;
    repitir = QMessageBox::question(this, "Atenção!",
                                    "Tem certeza que deseja excluir esse registro?");

    if(repitir == QMessageBox::Yes){

        QMessageBox::information(this, "Mensagem",
                                 "Registro excluído com sucesso!");

    }

}


void MainWindow::on_btnSobre_clicked()
{

    QMessageBox::about(this, "Mensagem Sobre",
                       "Mensagem sobre o QT Creator");

}


void MainWindow::on_btnAviso_clicked()
{

    QMessageBox::warning(this, "Mensagem Aviso",
                         "Mensagem Aviso QT Creator!");

}

