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


void MainWindow::on_btnNumero_clicked()
{

    QMessageBox::information(this, "Item",
                             ui->comboBoxNumero->currentText());

}


void MainWindow::on_btnAddItem_clicked()
{
    ui->comboBoxAddItem->addItem(ui->txtTexto->text());
}

