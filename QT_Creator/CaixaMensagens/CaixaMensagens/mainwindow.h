#ifndef MAINWINDOW_H
#define MAINWINDOW_H

#include <QMainWindow>

QT_BEGIN_NAMESPACE
namespace Ui { class MainWindow; }
QT_END_NAMESPACE

class MainWindow : public QMainWindow
{
    Q_OBJECT

public:
    MainWindow(QWidget *parent = nullptr);
    ~MainWindow();

private slots:
    void on_btnInformacao_clicked();

    void on_btnCritical_clicked();

    void on_btnPergunta_clicked();

    void on_btnSobre_clicked();

    void on_btnAviso_clicked();

private:
    Ui::MainWindow *ui;
};
#endif // MAINWINDOW_H
