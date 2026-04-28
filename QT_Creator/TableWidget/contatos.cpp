#include "contatos.h"
#include "ui_contatos.h"

Contatos::Contatos(QWidget *parent) :
    QDialog(parent),
    ui(new Ui::Contatos)
{
    ui->setupUi(this);
}

Contatos::~Contatos()
{
    delete ui;
}

//Passando as informações para o contato.h
QString Contatos::nomeContato() const{

    return ui->txtNome->text();

}

QString Contatos::telefoneContato() const{

    return ui->txtTelefone->text();

}

QString Contatos::emailContato() const{

    return ui->txtEmail->text();

}

void Contatos::on_buttonBox_accepted()
{

    accept();

}


void Contatos::on_buttonBox_rejected()
{

    reject();

}

