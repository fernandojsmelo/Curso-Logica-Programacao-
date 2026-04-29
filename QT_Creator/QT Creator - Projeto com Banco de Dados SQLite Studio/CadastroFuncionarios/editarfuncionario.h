#ifndef EDITARFUNCIONARIO_H
#define EDITARFUNCIONARIO_H

#include <QDialog>

namespace Ui {
class EditarFuncionario;
}

class EditarFuncionario : public QDialog
{
    Q_OBJECT

public:

    //Colocando um novo parametro do tipo int
    //Contrutor
    explicit EditarFuncionario(QWidget *parent = nullptr, int alterarFuncionario_ID = 0);
    ~EditarFuncionario();

private slots:
    void on_txtEditarFuncionario_Salario_editingFinished();

    void on_btnSalvarEdicaoFuncionario_clicked();

    void on_btnCancelarEdicaoFuncionario_clicked();

private:
    Ui::EditarFuncionario *ui;
};

#endif // EDITARFUNCIONARIO_H
