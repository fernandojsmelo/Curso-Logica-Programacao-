#include "mainwindow.h"
#include "ui_mainwindow.h"

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


void MainWindow::on_btnNovaTab_clicked()
{

    //Modo 1
    //ui->tabWidget->addTab(new QWidget(), "Nova TAB");

    ui->tabWidget->addTab(new QWidget(), "QT " +
                          QString::number(ui->tabWidget->count()+1));

}


void MainWindow::on_tabWidget_tabCloseRequested(int index)
{

    ui->tabWidget->removeTab(index);

}

