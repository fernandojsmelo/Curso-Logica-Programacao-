#include "telaprincipal.h"
#include "ui_telaprincipal.h"

#include <QtSql>
#include <QMessageBox>

#include "cadastrofuncionarios.h"
#include "editarfuncionario.h"

#include <QFileDialog>
#include <QTextStream>
#include <QFile>

TelaPrincipal::TelaPrincipal(QWidget *parent) :
    QDialog(parent),
    ui(new Ui::TelaPrincipal)
{
    ui->setupUi(this);

    //Colocando instrução para o usuário
    ui->txtPesquisarFuncionario->setPlaceholderText("Digite algo para pesquisar");

    ui->txtPesquisarFuncionario->setStyleSheet("color: black;"
                                               "background-color: yellow;"
                                               "selection-color: black;"
                                               "selection-background-color: yellow;");

    ui->btnCadastrarFuncionarios->setStyleSheet(
                                                "color: white;"
                                                "background-color: green;"
                                                "border-style: outset;"
                                                "border-width: 2px;"
                                                "border-radius: 10px;"
                                                "border-color: beige;"
                                                "font: bold 14px;");

    ui->btnExcluirFuncionario->setStyleSheet(
                                               "color: white;"
                                               "background-color: green;"
                                               "border-style: outset;"
                                               "border-width: 2px;"
                                               "border-radius: 10px;"
                                               "border-color: beige;"
                                               "font: bold 14px;");


    QFont fonte = ui->lblTotalSalario->font();
    fonte.setPointSize(20); //Tamanho da fonte
    fonte.setBold(true); //Negrito
    ui->lblTotalSalario->setFont(fonte);

    //Mudar a cor do texto lblTotalSalario
    QPalette paleta = ui->lblTotalSalario->palette();
    paleta.setColor(ui->lblTotalSalario->foregroundRole(), Qt::blue);
    ui->lblTotalSalario->setPalette(paleta);


    carregarDados();



}

TelaPrincipal::~TelaPrincipal()
{
    delete ui;
}

void TelaPrincipal::carregarDados(){

    //Remover os dados da tableWidgetFuncionario
    limparTableWidGet(ui->tableWidgetFuncionario);

    QSqlQuery pegaDados;
    pegaDados.prepare("Select * from Funcionarios");

    if( pegaDados.exec() ){

           int linha = 0;
           ui->tableWidgetFuncionario->setColumnCount(8);

           //while = enquanto
           //Sempre que o pegaDados encontrar um valor ele insere uma nova linha na tableWidgetFuncionario
           while(pegaDados.next()){

               ui->tableWidgetFuncionario->insertRow(linha);

               ui->tableWidgetFuncionario->setItem(linha, 0, new QTableWidgetItem(pegaDados.value(0).toString()));
               ui->tableWidgetFuncionario->setItem(linha, 1, new QTableWidgetItem(pegaDados.value(1).toString()));
               ui->tableWidgetFuncionario->setItem(linha, 2, new QTableWidgetItem(pegaDados.value(2).toString()));
               ui->tableWidgetFuncionario->setItem(linha, 3, new QTableWidgetItem(pegaDados.value(3).toString()));
               ui->tableWidgetFuncionario->setItem(linha, 4, new QTableWidgetItem(pegaDados.value(4).toString()));
               ui->tableWidgetFuncionario->setItem(linha, 5, new QTableWidgetItem(pegaDados.value(5).toString()));
               ui->tableWidgetFuncionario->setItem(linha, 6, new QTableWidgetItem(pegaDados.value(6).toString()));
               ui->tableWidgetFuncionario->setItem(linha, 7, new QTableWidgetItem(pegaDados.value(7).toString()));

               ui->tableWidgetFuncionario->setRowHeight(linha, 40);

               linha++;

               QString valortexto;

               auto formato = QLocale("de_DE");
               double valorMoeda = somaTotalSalarios(ui->tableWidgetFuncionario, 3);

               //f = double - Casas decimais 5.50
               valortexto = formato.toString(valorMoeda, 'f', 2);

               ui->lblTotalSalario->setText("R$ "+ valortexto);

           }

           ui->lblTotalRegistros->setText("Registro encontrados " + QString::number(linha));

           QStringList titulos;

           //Titulo da tableWidgetFuncionario
           titulos = {"ID", "CPF", "Nome", "Salário", "Departamento", "Data Nascimento", "Telefone", "Email"};
           ui->tableWidgetFuncionario->setHorizontalHeaderLabels(titulos);

           //Oculta os números das linhas que ficaram na esquerda
           ui->tableWidgetFuncionario->verticalHeader()->setVisible(false);

           //Ajusta a largura das colunas da tableWidgetFuncionario
           ui->tableWidgetFuncionario->horizontalHeader()->resizeSections(QHeaderView::ResizeToContents);
           ui->tableWidgetFuncionario->verticalHeader()->resizeSections(QHeaderView::ResizeToContents);

           //Desabilita a edição dos dados direto na tableWidgetFuncionario
           ui->tableWidgetFuncionario->setEditTriggers(QAbstractItemView::NoEditTriggers);

           //Seleciona a linha inteira da tableWidgetFuncionario
           ui->tableWidgetFuncionario->setSelectionBehavior(QAbstractItemView::SelectRows);

           //Mudo a cor do título
           ui->tableWidgetFuncionario->setStyleSheet("QHeaderView::section { color: white; background-color:blue }");




    }else{

        QMessageBox::information(this, "Atenção",
                                 "Erro ao carregar os funcionários!");

    }

}

void TelaPrincipal::limparTableWidGet(QTableWidget *limpaTW){

    //while = enquano
    while(limpaTW->rowCount() > 0){

        //0 = A primeira linha
        limpaTW->removeRow(0);

    }

}

void TelaPrincipal::on_txtPesquisarFuncionario_textChanged(const QString &arg1)
{

    QString pesquisa;

    //Remover os dados da tableWidgetFuncionario
    limparTableWidGet(ui->tableWidgetFuncionario);

    QString colunaFiltro = ui->comboBoxColunaFiltro->currentText();

    QString textoPesquisa = ui->txtPesquisarFuncionario->text();

    //SE


         if( colunaFiltro == "ID" ){

             //Like = Para não precisar digitar todo o nome, digitando parte do nome o like já trás
             //% = Começe com qualquer valor e termine com qualquer valor
             pesquisa = "Select idFuncionario, cpfFuncionario, nomeFuncionario, salarioFuncionario, departamentoFuncionario, dataNascimentoFuncionario, telefoneFuncionario, emailFuncionario From Funcionarios Where idFuncionario like '%"+textoPesquisa+"%'";


         }else if(  colunaFiltro == "CPF"  ){

             pesquisa = "Select idFuncionario, cpfFuncionario, nomeFuncionario, salarioFuncionario, departamentoFuncionario, dataNascimentoFuncionario, telefoneFuncionario, emailFuncionario From Funcionarios Where cpfFuncionario like '%"+textoPesquisa+"%'";

         }else if(  colunaFiltro == "Nome"  ){

             pesquisa = "Select idFuncionario, cpfFuncionario, nomeFuncionario, salarioFuncionario, departamentoFuncionario, dataNascimentoFuncionario, telefoneFuncionario, emailFuncionario From Funcionarios Where nomeFuncionario like '%"+textoPesquisa+"%'";

         }else if(  colunaFiltro == "Salário"  ){

             pesquisa = "Select idFuncionario, cpfFuncionario, nomeFuncionario, salarioFuncionario, departamentoFuncionario, dataNascimentoFuncionario, telefoneFuncionario, emailFuncionario From Funcionarios Where salarioFuncionario like '%"+textoPesquisa+"%'";

         }else if(  colunaFiltro == "Departamento"  ){

             pesquisa = "Select idFuncionario, cpfFuncionario, nomeFuncionario, salarioFuncionario, departamentoFuncionario, dataNascimentoFuncionario, telefoneFuncionario, emailFuncionario From Funcionarios Where departamentoFuncionario like '%"+textoPesquisa+"%'";

         }else if(  colunaFiltro == "Data de Nascimento"  ){

             pesquisa = "Select idFuncionario, cpfFuncionario, nomeFuncionario, salarioFuncionario, departamentoFuncionario, dataNascimentoFuncionario, telefoneFuncionario, emailFuncionario From Funcionarios Where dataNascimentoFuncionario like '%"+textoPesquisa+"%'";


         }else if(  colunaFiltro == "Telefone"  ){

             pesquisa = "Select idFuncionario, cpfFuncionario, nomeFuncionario, salarioFuncionario, departamentoFuncionario, dataNascimentoFuncionario, telefoneFuncionario, emailFuncionario From Funcionarios Where telefoneFuncionario like '%"+textoPesquisa+"%'";


         }else if(  colunaFiltro == "Email"  ){

             pesquisa = "Select idFuncionario, cpfFuncionario, nomeFuncionario, salarioFuncionario, departamentoFuncionario, dataNascimentoFuncionario, telefoneFuncionario, emailFuncionario From Funcionarios Where emailFuncionario like '%"+textoPesquisa+"%'";

         }else{

             pesquisa = "Select idFuncionario, cpfFuncionario, nomeFuncionario, salarioFuncionario, departamentoFuncionario, dataNascimentoFuncionario, telefoneFuncionario, emailFuncionario From Funcionarios Where idFuncionario like '%"+textoPesquisa+"%'";

         }




    int linha = 0;

    QSqlQuery pegaDados;

    pegaDados.prepare(pesquisa);

    if(pegaDados.exec()){

           //Enquanto o next encontrar algo
           while(pegaDados.next()){

                //Insere a linha de acordo com a variavel linha
                ui->tableWidgetFuncionario->insertRow(linha);

                //Passa os itens (linha, coluna, item QTableWidgetItem)
                ui->tableWidgetFuncionario->setItem(linha, 0, new QTableWidgetItem(pegaDados.value(0).toString()));
                ui->tableWidgetFuncionario->setItem(linha, 1, new QTableWidgetItem(pegaDados.value(1).toString()));
                ui->tableWidgetFuncionario->setItem(linha, 2, new QTableWidgetItem(pegaDados.value(2).toString()));
                ui->tableWidgetFuncionario->setItem(linha, 3, new QTableWidgetItem(pegaDados.value(3).toString()));
                ui->tableWidgetFuncionario->setItem(linha, 4, new QTableWidgetItem(pegaDados.value(4).toString()));
                ui->tableWidgetFuncionario->setItem(linha, 5, new QTableWidgetItem(pegaDados.value(5).toString()));
                ui->tableWidgetFuncionario->setItem(linha, 6, new QTableWidgetItem(pegaDados.value(6).toString()));
                ui->tableWidgetFuncionario->setItem(linha, 7, new QTableWidgetItem(pegaDados.value(7).toString()));

                ui->tableWidgetFuncionario->setRowHeight(linha, 40);

               linha++;

               QString valortexto;

               auto formato = QLocale("de_DE");
               double valorMoeda = somaTotalSalarios(ui->tableWidgetFuncionario, 3);

               //f = double - Casas decimais 5.50
               valortexto = formato.toString(valorMoeda, 'f', 2);

               ui->lblTotalSalario->setText("R$ "+ valortexto);

           }

           ui->lblTotalRegistros->setText("Registro encontrados " + QString::number(linha));

    }else{

         QMessageBox::information(this, "Atenção!",
                                  "Erro ao encontrar funcionários");

    }





}


void TelaPrincipal::on_btnCadastrarFuncionarios_clicked()
{

    CadastroFuncionarios abreFormularioCadastro;
    abreFormularioCadastro.exec();

    carregarDados();

}


void TelaPrincipal::on_btnExcluirFuncionario_clicked()
{

    //Pega ou começa da linha onde está selecionada
    int linhaAtual = ui->tableWidgetFuncionario->currentRow();

    QString idSelecionado = ui->tableWidgetFuncionario->item(linhaAtual, 0)->text();

    QSqlQuery bancoDeDados;

    //From = Onde, Where = Quando
    bancoDeDados.prepare("Delete from Funcionarios Where idFuncionario="+idSelecionado);


    if( bancoDeDados.exec() ){

        ui->tableWidgetFuncionario->removeRow(linhaAtual);

        QMessageBox::information(this, "Atenção",
                                 "Funcionário excluido com sucesso!");


    }else{

        QMessageBox::information(this, "Atenção",
                                 "Erro ao excluir o funcionário!");

    }




}


void TelaPrincipal::on_tableWidgetFuncionario_cellDoubleClicked(int row, int column)
{

    int linhaAtual;
    linhaAtual = ui->tableWidgetFuncionario->currentRow();

    int idFuncionario;

    idFuncionario = ui->tableWidgetFuncionario->item(linhaAtual, 0)->text().toInt();

    EditarFuncionario dadosFuncionario(this, idFuncionario);

    dadosFuncionario.exec();


    //-----------------------------------------

    //Remover os dados da tableWidgetFuncionario
    limparTableWidGet(ui->tableWidgetFuncionario);

    QSqlQuery pegaDados;
    pegaDados.prepare("Select * from Funcionarios");

    if( pegaDados.exec() ){

           int linha = 0;
           ui->tableWidgetFuncionario->setColumnCount(8);

           //while = enquanto
           //Sempre que o pegaDados encontrar um valor ele insere uma nova linha na tableWidgetFuncionario
           while(pegaDados.next()){

               ui->tableWidgetFuncionario->insertRow(linha);

               ui->tableWidgetFuncionario->setItem(linha, 0, new QTableWidgetItem(pegaDados.value(0).toString()));
               ui->tableWidgetFuncionario->setItem(linha, 1, new QTableWidgetItem(pegaDados.value(1).toString()));
               ui->tableWidgetFuncionario->setItem(linha, 2, new QTableWidgetItem(pegaDados.value(2).toString()));
               ui->tableWidgetFuncionario->setItem(linha, 3, new QTableWidgetItem(pegaDados.value(3).toString()));
               ui->tableWidgetFuncionario->setItem(linha, 4, new QTableWidgetItem(pegaDados.value(4).toString()));
               ui->tableWidgetFuncionario->setItem(linha, 5, new QTableWidgetItem(pegaDados.value(5).toString()));
               ui->tableWidgetFuncionario->setItem(linha, 6, new QTableWidgetItem(pegaDados.value(6).toString()));
               ui->tableWidgetFuncionario->setItem(linha, 7, new QTableWidgetItem(pegaDados.value(7).toString()));

               ui->tableWidgetFuncionario->setRowHeight(linha, 40);

               linha++;

           }

           ui->lblTotalRegistros->setText("Registro encontrados " + QString::number(linha));

           QStringList titulos;

           //Titulo da tableWidgetFuncionario
           titulos = {"ID", "CPF", "Nome", "Salário", "Departamento", "Data Nascimento", "Telefone", "Email"};
           ui->tableWidgetFuncionario->setHorizontalHeaderLabels(titulos);

           //Oculta os números das linhas que ficaram na esquerda
           ui->tableWidgetFuncionario->verticalHeader()->setVisible(false);

           //Ajusta a largura das colunas da tableWidgetFuncionario
           ui->tableWidgetFuncionario->horizontalHeader()->resizeSections(QHeaderView::ResizeToContents);
           ui->tableWidgetFuncionario->verticalHeader()->resizeSections(QHeaderView::ResizeToContents);

           //Desabilita a edição dos dados direto na tableWidgetFuncionario
           ui->tableWidgetFuncionario->setEditTriggers(QAbstractItemView::NoEditTriggers);

           //Seleciona a linha inteira da tableWidgetFuncionario
           ui->tableWidgetFuncionario->setSelectionBehavior(QAbstractItemView::SelectRows);

           //Mudo a cor do título
           ui->tableWidgetFuncionario->setStyleSheet("QHeaderView::section { color: white; background-color:blue }");




    }else{

        QMessageBox::information(this, "Atenção",
                                 "Erro ao carregar os funcionários!");

    }




}

double TelaPrincipal::somaTotalSalarios(QTableWidget *tabela, int coluna){

    int totalLinhas;
    double total;

    totalLinhas=tabela->rowCount();

    for(int linha = 0; linha < totalLinhas; linha++){

        total+=tabela->item(linha, coluna)->text().toDouble();

    }

    return total;

}


void TelaPrincipal::on_btnExportarExcel_clicked()
{

    //Caminho Arquivo para Salvar
    auto nomeArquivo = QFileDialog::getSaveFileName(this,
          "Salvar", QDir::rootPath(), "CSV File (*.csv)");

    if(nomeArquivo.isEmpty()){

        //Fecha se não tiver selecionado o caminho
        return;

    }

    //QIODevice::WriteOnly = O arquivo está aberto para escrita
    //QIODevice::Text = Ao ler e escrever pula sempre para próxima
    QFile file(nomeArquivo);
    if(!file.open(QIODevice::WriteOnly | QIODevice::Text)){

        return;

    }

    //A classe QTextStream cria uma interface amigavel para leitura e escrita dos dados
    QTextStream arquivoExcel(&file);

    int linha = 0;

    //Estamos contando quantas linhas e colunas existem preenchidas
    const int quantidadeLinhas = ui->tableWidgetFuncionario->rowCount();
    const int quantidadeColunas = ui->tableWidgetFuncionario->columnCount();

    for(linha; linha < quantidadeLinhas; ++linha){

        //Pegando as informações
        arquivoExcel << getValueAt(linha, 0);

        for(int coluna = 1; coluna < quantidadeColunas; ++coluna ){

            //Colocando as informações no Excel
            arquivoExcel << "," << getValueAt(linha, coluna);

        }

        //Ir para linha de baixo
        arquivoExcel << "\n";


    }

    //Limpa
    file.flush();

    //Fecha
    file.close();

    QMessageBox::information(this, "Atenção!",
                     "Relatório exportado com sucesso!");
}

QString TelaPrincipal::getValueAt(int linha, int coluna){

    if(!ui->tableWidgetFuncionario->item(linha, coluna)){

        //Se tiver limpa a tableWidgetFuncionario salva o arquivo em branco
        return "";

    }else {

        //Retorn as informações da posição da linha e da coluna
        return ui->tableWidgetFuncionario->item(linha, coluna)->text();

    }

}

