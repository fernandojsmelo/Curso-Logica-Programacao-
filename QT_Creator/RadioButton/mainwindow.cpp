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


void MainWindow::on_btnVerificaDiaSemana_clicked()
{

    QString dia;

    if( ui->rbSegunda->isChecked() == true ){

        dia = "Segunda-feira";

    }else if( ui->rbTerca->isChecked() == true ){

        dia = "Terça-feira";

    }else if( ui->rbQuarta->isChecked() == true ){

        dia = "Quarta-feira";

    }else if( ui->rbQuinta->isChecked() == true ){

        dia = "Quinta-feira";

    }else if( ui->rbSexta->isChecked() == true ){

        dia = "Sexta-feira";

    }else if( ui->rbSabado->isChecked() == true ){

        dia = "Sábado";

    }else {

        dia = "Domingo";

    }

    QMessageBox::information(this,
                             "Opção Selecionada",
                             dia);


}

