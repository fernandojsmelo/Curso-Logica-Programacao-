#ifndef CONTATOS_H
#define CONTATOS_H

#include <QDialog>

namespace Ui {
class Contatos;
}

class Contatos : public QDialog
{
    Q_OBJECT

public:
    explicit Contatos(QWidget *parent = nullptr);
    ~Contatos();

    //Criando as variaveis para serem acessadas de outros formulários
    QString nomeContato() const;
    QString telefoneContato() const;
    QString emailContato() const;


private slots:
    void on_buttonBox_accepted();

    void on_buttonBox_rejected();

private:
    Ui::Contatos *ui;
};

#endif // CONTATOS_H
