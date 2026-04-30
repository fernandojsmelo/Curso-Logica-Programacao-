#include "editarfuncionario.h"
#include "ui_editarfuncionario.h"

#include <QtSql>
#include <QMessageBox>

static int idSelecionado;

EditarFuncionario::EditarFuncionario(QWidget *parent, int alterarFuncionario_ID) :
    QDialog(parent),
    ui(new Ui::EditarFuncionario)
{
    ui->setupUi(this);

    QSqlQuery dados;

    idSelecionado = alterarFuncionario_ID;

    QString id = QString::number(alterarFuncionario_ID);

    dados.prepare("SELECT * From Funcionarios Where idFuncionario="+id);


    if( dados.exec() ){

        dados.first();

        ui->lblEditarFuncionario_ID->setText(dados.value(0).toString());
        ui->txtEditarFuncionario_CPF->setText(dados.value(1).toString());
        ui->txtEditarFuncionario_Nome->setText(dados.value(2).toString());

        QString valortexto;

        auto formato = QLocale("de_DE");
        double valorMoeda = dados.value(3).toDouble();

        //f = double - Casas decimais 5.50
        valortexto = formato.toString(valorMoeda, 'f', 2);

        ui->txtEditarFuncionario_Salario->setText("R$ " + valortexto);
        ui->cmbEditarFuncionario_Departamento->setCurrentText(dados.value(4).toString());
        ui->txtEditarFuncionario_DataDeNascimento->setText(dados.value(5).toString());
        ui->txtEditarFuncionario_Telefone->setText(dados.value(6).toString());
        ui->txtEditarFuncionario_Email->setText(dados.value(7).toString());

    }else{

        QMessageBox::critical(this, "Atenção", "Erro ao carregar informações do funcionário");

    }



}

EditarFuncionario::~EditarFuncionario()
{
    delete ui;
}

void EditarFuncionario::on_txtEditarFuncionario_Salario_editingFinished()
{

    QString valortexto;

    auto formato = QLocale("de_DE");
    double valorMoeda = ui->txtEditarFuncionario_Salario->text().toDouble();

    //f = double - Casas decimais 5.50
    valortexto = formato.toString(valorMoeda, 'f', 2);

    ui->txtEditarFuncionario_Salario->setText("R$ " + valortexto);

}


void EditarFuncionario::on_btnSalvarEdicaoFuncionario_clicked()
{

    QString id = ui->lblEditarFuncionario_ID->text();
    QString cpf = ui->txtEditarFuncionario_CPF->text();
    QString nome = ui->txtEditarFuncionario_Nome->text();

    QString salarioSemVirgula;
    salarioSemVirgula = ui->txtEditarFuncionario_Salario->text();

    //Antes - R$ 1.235,10
    //Depois - 1234.10
    salarioSemVirgula.replace(0, 3, "");
    salarioSemVirgula.replace(".", "");
    salarioSemVirgula.replace(",", ".");

    QString salario = salarioSemVirgula;

    QString departamento = ui->cmbEditarFuncionario_Departamento->currentText();
    QString dataNascimento = ui->txtEditarFuncionario_DataDeNascimento->text();
    QString telefone = ui->txtEditarFuncionario_Telefone->text();
    QString email = ui->txtEditarFuncionario_Email->text();


    QSqlQuery dados;

    dados.prepare("Update Funcionarios set idFuncionario='"+id+"',"
                                     "cpfFuncionario='"+cpf+"',"
                                     "nomeFuncionario='"+nome+"',"
                                     "salarioFuncionario='"+salario+"',"
                                     "departamentoFuncionario='"+departamento+"',"
                                     "dataNascimentoFuncionario='"+dataNascimento+"',"
                                     "telefoneFuncionario='"+telefone+"',"
                                      "emailFuncionario='"+email+"' where idFuncionario="+QString::number(idSelecionado));

    if(dados.exec()){

        this->close();

    }else{

        QMessageBox::critical(this, "Atenção!", "Erro ao salvar as alterações");

    }




}


void EditarFuncionario::on_btnCancelarEdicaoFuncionario_clicked()
{
    close();
}

