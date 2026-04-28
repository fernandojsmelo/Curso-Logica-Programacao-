#include "mainwindow.h"
#include "ui_mainwindow.h"
#include <QDebug>

QVector<int> itensSelecionados;

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


void MainWindow::on_btnAdicionar_clicked()
{

    //Adionar item
    ui->listWidgetItens->addItem(ui->txtTexto->text());

    //Limpando o campo de texto sempre que adicionar o item
    ui->txtTexto->clear();

    //Voltando para o campo de texto para digitar um novo texto
    ui->txtTexto->setFocus();

}


void MainWindow::on_listWidgetItens_currentRowChanged(int currentRow)
{
    //Se
    if( itensSelecionados.indexOf(currentRow) == -1){

        itensSelecionados.push_back(currentRow);
        ui->listWidgetItens->currentItem()->setBackground(Qt::blue);
        ui->listWidgetItens->currentItem()->setForeground(Qt::white);

        qDebug() << "Itens: " << itensSelecionados;

    }else {

        itensSelecionados.erase(itensSelecionados.begin()+itensSelecionados.indexOf(currentRow));
        ui->listWidgetItens->currentItem()->setBackground(Qt::white);
        ui->listWidgetItens->currentItem()->setForeground(Qt::black);

        qDebug() << "Itens: " << itensSelecionados;

    }

}

