#include "mainwindow.h"
#include "ui_mainwindow.h"

MainWindow::MainWindow(QWidget *parent)
    : QMainWindow(parent)
    , ui(new Ui::MainWindow)
{
    ui->setupUi(this);

    QPixmap caminhoImagem(":/Imagens/Imagens Carros/Carro4.jpeg");
    ui->lblImagem4->setPixmap(caminhoImagem);

}

MainWindow::~MainWindow()
{
    delete ui;
}

