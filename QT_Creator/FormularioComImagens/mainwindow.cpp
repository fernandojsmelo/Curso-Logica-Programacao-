#include "mainwindow.h"
#include "ui_mainwindow.h"

MainWindow::MainWindow(QWidget *parent)
    : QMainWindow(parent)
    , ui(new Ui::MainWindow)
{
    ui->setupUi(this);

    QPixmap caminhoImagem("/home/fernandomelo/Cuso logica Progamação/Curso-Logica-Programacao-/QT_Creator/imagens/carro2.jpg");
    ui->lblImagem->setPixmap(caminhoImagem.scaled(331, 291, Qt::KeepAspectRatio));

}

MainWindow::~MainWindow()
{
    delete ui;
}

