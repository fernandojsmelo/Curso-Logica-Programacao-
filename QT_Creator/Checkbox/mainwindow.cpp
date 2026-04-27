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


void MainWindow::on_btnViajar_clicked()
{
    //Se
    if( ui->checkBoxViajar->isChecked() ){

        QMessageBox::information(this,
                                 "Mensagem",
                                 "Você gosta de viajar!");

    }else{

        QMessageBox::information(this,
                                 "Mensagem",
                                 "Você NÃO gosta de viajar!");

    }

}


void MainWindow::on_btnTestarLetra_clicked()
{

    bool letraA, letraB, letraC;

    letraA = ui->cbLetraA->isChecked();
    letraB = ui->cbLetraB->isChecked();
    letraC = ui->cbLetraC->isChecked();

    QString mensagem;

    if(letraA == true && letraB == false && letraC == false ){

        mensagem = "A letra A está marcada!";

    }else if(letraA == true && letraB == true && letraC == false ){

        mensagem = "As letras A e B estão marcadas!";

    }else if(letraA == true && letraB == true && letraC == true ){

        mensagem = "As letras A, B e C estão marcadas!";

    }else if(letraA == true && letraB == false && letraC == true ){

        mensagem = "As letras A e C estão marcadas!";

    }else if(letraB == true && letraA == false && letraC == false ){

        mensagem = "A letra B está marcada!";

    }else if(letraB == true && letraA == false && letraC == true ){

        mensagem = "As letras B e C estão marcadas!";

    }else if(letraC == true && letraA == false && letraB == false ){

        mensagem = "A letra C está marcada!";

    }else{

        mensagem = "Nenhuma letra está marcada!";

    }


    QMessageBox::information(this,
                             "Opção",
                             mensagem);

}

