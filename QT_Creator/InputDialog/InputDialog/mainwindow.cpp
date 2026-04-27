#include "mainwindow.h"
#include "ui_mainwindow.h"
#include <QInputDialog>

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


void MainWindow::on_btnInputDialogExemplo1_clicked()
{

    QString nome = QInputDialog::getText(this, "Mensagem",
                                         "Digite o seu Nome");
    ui->lblNome->setText(nome);


    int idade = QInputDialog::getInt(this, "Mensagem",
                                         "Digite a sua idade");

    ui->lblIdade->setText(QString::number(idade));

}


void MainWindow::on_btnMedia_clicked()
{

    double nota1 = QInputDialog::getDouble(this,"Mensagem", "Digite a nota 1");
    ui->lblNota1->setText(QString::number(nota1));

    double nota2 = QInputDialog::getDouble(this,"Mensagem", "Digite a nota 2");
    ui->lblNota2->setText(QString::number(nota2));

    double media = (nota1 + nota2) / 2;

    ui->lblMedia->setText(QString::number(media));

}


void MainWindow::on_btnInputDialogMultiLine_clicked()
{

    QString frase = QInputDialog::getMultiLineText(this, "Mensagem", "Digite a frase");
    ui->lblFrase->setText(frase);

}


void MainWindow::on_btnEscolhaCor_clicked()
{

    QStringList cores;
    cores << "Amarelo";
    cores << "Azul";
    cores << "Verde";
    cores << "Laranja";

    QString corSelecionada = QInputDialog::getItem(this, "Escolha",
                                                   "Clique em uma cor para selecionar",
                                                   cores);

    ui->lblCor->setText(corSelecionada);

}

