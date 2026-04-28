#include "mainwindow.h"
#include "ui_mainwindow.h"

#include <QFontDialog>
#include <QColorDialog>
#include <QMessageBox>
#include <QFileDialog>
#include <QTextStream>
#include <QFile>

MainWindow::MainWindow(QWidget *parent)
    : QMainWindow(parent)
    , ui(new Ui::MainWindow)
{
    ui->setupUi(this);

    //Deixa o campo de texto centralizado
    setCentralWidget(ui->txtTexto);

}

MainWindow::~MainWindow()
{
    delete ui;
}


void MainWindow::on_actionSair_triggered()
{

    //Fecha o programa
    close();

}


void MainWindow::on_actionCopiar_triggered()
{

    //Copia o texto selecionado
    ui->txtTexto->copy();

}


void MainWindow::on_actionColar_triggered()
{

    //Cola o texto que está na memória
    ui->txtTexto->paste();

}


void MainWindow::on_actionRecortar_triggered()
{

    //Recorta o texto selecionado
    ui->txtTexto->cut();

}


void MainWindow::on_actionFonte_triggered()
{

    bool confirmar;
    QFont fonte;
    fonte = QFontDialog::getFont(&confirmar, this);

    //if = se
    if( !confirmar ){

        //Encerro e fecho a opção
        return;

    }else{

        ui->txtTexto->setFont(fonte);

    }

}


void MainWindow::on_actionCor_triggered()
{

    QColor corEscolhida;
    corEscolhida = QColorDialog::getColor(Qt::white, this);

    ui->txtTexto->setTextColor(corEscolhida);

}


void MainWindow::on_actionFundo_triggered()
{

    QPalette paletaCores;
    QColor corEscolhida = QColorDialog::getColor(Qt::white, this);
    paletaCores.setColor(QPalette::Base, corEscolhida);

    if( corEscolhida.isValid() ){

        ui->txtTexto->setPalette(paletaCores);

    }else{

        return;

    }


}


void MainWindow::on_actionSobre_triggered()
{

    QString mensagem;
    mensagem = "Curso Lógica Programação\n";
    mensagem += "Curso C++\n";
    mensagem += "Curso QT Creator\n";
    mensagem += "Curso Python\n";
    mensagem += "Estude muito e aprenda!\n";

    QMessageBox::about(this, "Sobre", mensagem);

}


void MainWindow::on_actionSalvar_Como_triggered()
{

    QFile arquivo;
    QTextStream caminho;
    QString nomeArquivo;
    nomeArquivo = QFileDialog::getSaveFileName(this,
                   "Selecione o local onde quer Salvar");

    //Se não selecionar a pasta, apenas encerre a operção
    if( nomeArquivo.isEmpty() ){

        return;

    }

    arquivo.setFileName(nomeArquivo);

    arquivo.open(QIODevice::WriteOnly | QIODevice::Text );

    if( arquivo.isOpen() ){



    }else {

        QMessageBox::critical(this, "Aviso",
                              "Erro ao salvar o arquivo");

    }

    caminho.setDevice(&arquivo);
    caminho << ui->txtTexto->toPlainText();

    //Fecha o arquivo
    arquivo.close();



}


void MainWindow::on_actionAbrir_triggered()
{

    QFile arquivo;
    QTextStream caminho;
    QString nomeArquivo;
    nomeArquivo = QFileDialog::getOpenFileName(this,
                   "Selecione o Arquivo");

    //Se não selecionar a pasta, apenas encerre a operção
    if( nomeArquivo.isEmpty() ){

        return;

    }

    arquivo.setFileName(nomeArquivo);

    arquivo.open(QIODevice::ReadOnly | QIODevice::Text );

    if( arquivo.isOpen() ){



    }else {

        QMessageBox::critical(this, "Aviso",
                              "Erro ao abrir o arquivo");

        return;

    }

    caminho.setDevice(&arquivo);
    ui->txtTexto->setPlainText(caminho.readAll());

    //Limpar as informações
    arquivo.flush();

    //Fecha o arquivo
    arquivo.close();


}

