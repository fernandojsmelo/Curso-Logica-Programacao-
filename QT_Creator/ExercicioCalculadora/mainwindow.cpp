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


void MainWindow::on_btnAdicao_clicked()
{

    QString valor1 = ui->txtNumero1->text();
    QString valor2 = ui->txtNumero2->text();

    if ( valor1 == "" ){

        QMessageBox::information(this, "Atenção!",
                                 "Você precisa digitar o primeiro número");

    }else if(valor2 == ""){

        QMessageBox::information(this, "Atenção!",
                                 "Você precisa digitar o segundo número");

    }else{

        double numero1, numero2, total;

        numero1 = QString(valor1).toDouble();
        numero2 = QString(valor2).toDouble();

        total = numero1 + numero2;

        ui -> txtResultado->setText(QString::number(total));

    }

}


void MainWindow::on_btnSubtracao_clicked()
{

    QString valor1 = ui->txtNumero1->text();
    QString valor2 = ui->txtNumero2->text();

    if ( valor1 == "" ){

        QMessageBox::information(this, "Atenção!",
                                 "Você precisa digitar o primeiro número");

    }else if(valor2 == ""){

        QMessageBox::information(this, "Atenção!",
                                 "Você precisa digitar o segundo número");

    }else{

        double numero1, numero2, total;

        numero1 = QString(valor1).toDouble();
        numero2 = QString(valor2).toDouble();

        total = numero1 - numero2;

        ui -> txtResultado->setText(QString::number(total));

    }

}


void MainWindow::on_btnMultiplicacao_clicked()
{

    QString valor1 = ui->txtNumero1->text();
    QString valor2 = ui->txtNumero2->text();

    if ( valor1 == "" ){

        QMessageBox::information(this, "Atenção!",
                                 "Você precisa digitar o primeiro número");

    }else if(valor2 == ""){

        QMessageBox::information(this, "Atenção!",
                                 "Você precisa digitar o segundo número");

    }else{

        double numero1, numero2, total;

        numero1 = QString(valor1).toDouble();
        numero2 = QString(valor2).toDouble();

        total = numero1 * numero2;

        ui -> txtResultado->setText(QString::number(total));

    }

}


void MainWindow::on_btnDivisao_clicked()
{

    QString valor1 = ui->txtNumero1->text();
    QString valor2 = ui->txtNumero2->text();

    if ( valor1 == "" ){

        QMessageBox::information(this, "Atenção!",
                                 "Você precisa digitar o primeiro número");

    }else if(valor2 == ""){

        QMessageBox::information(this, "Atenção!",
                                 "Você precisa digitar o segundo número");

    }else{

        double numero1, numero2, total;

        numero1 = QString(valor1).toDouble();
        numero2 = QString(valor2).toDouble();

        total = numero1 / numero2;

        ui -> txtResultado->setText(QString::number(total));

    }

}

