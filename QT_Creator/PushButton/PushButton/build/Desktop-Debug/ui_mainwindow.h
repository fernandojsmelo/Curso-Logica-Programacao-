/********************************************************************************
** Form generated from reading UI file 'mainwindow.ui'
**
** Created by: Qt User Interface Compiler version 6.10.2
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_MAINWINDOW_H
#define UI_MAINWINDOW_H

#include <QtCore/QVariant>
#include <QtWidgets/QApplication>
#include <QtWidgets/QLineEdit>
#include <QtWidgets/QMainWindow>
#include <QtWidgets/QMenuBar>
#include <QtWidgets/QPushButton>
#include <QtWidgets/QStatusBar>
#include <QtWidgets/QWidget>

QT_BEGIN_NAMESPACE

class Ui_MainWindow
{
public:
    QWidget *centralwidget;
    QLineEdit *txtMensagem;
    QPushButton *btnMensagem1;
    QPushButton *btnMensagem2;
    QPushButton *btnMensagem3;
    QMenuBar *menubar;
    QStatusBar *statusbar;

    void setupUi(QMainWindow *MainWindow)
    {
        if (MainWindow->objectName().isEmpty())
            MainWindow->setObjectName("MainWindow");
        MainWindow->resize(800, 600);
        centralwidget = new QWidget(MainWindow);
        centralwidget->setObjectName("centralwidget");
        txtMensagem = new QLineEdit(centralwidget);
        txtMensagem->setObjectName("txtMensagem");
        txtMensagem->setGeometry(QRect(130, 150, 481, 41));
        QFont font;
        font.setPointSize(16);
        txtMensagem->setFont(font);
        btnMensagem1 = new QPushButton(centralwidget);
        btnMensagem1->setObjectName("btnMensagem1");
        btnMensagem1->setGeometry(QRect(130, 210, 241, 29));
        btnMensagem2 = new QPushButton(centralwidget);
        btnMensagem2->setObjectName("btnMensagem2");
        btnMensagem2->setGeometry(QRect(380, 210, 231, 29));
        btnMensagem3 = new QPushButton(centralwidget);
        btnMensagem3->setObjectName("btnMensagem3");
        btnMensagem3->setGeometry(QRect(130, 270, 481, 29));
        MainWindow->setCentralWidget(centralwidget);
        menubar = new QMenuBar(MainWindow);
        menubar->setObjectName("menubar");
        menubar->setGeometry(QRect(0, 0, 800, 26));
        MainWindow->setMenuBar(menubar);
        statusbar = new QStatusBar(MainWindow);
        statusbar->setObjectName("statusbar");
        MainWindow->setStatusBar(statusbar);

        retranslateUi(MainWindow);

        QMetaObject::connectSlotsByName(MainWindow);
    } // setupUi

    void retranslateUi(QMainWindow *MainWindow)
    {
        MainWindow->setWindowTitle(QCoreApplication::translate("MainWindow", "MainWindow", nullptr));
        btnMensagem1->setText(QCoreApplication::translate("MainWindow", "Mensagem 1", nullptr));
        btnMensagem2->setText(QCoreApplication::translate("MainWindow", "Mensagem 2", nullptr));
        btnMensagem3->setText(QCoreApplication::translate("MainWindow", "Mensagem 3", nullptr));
    } // retranslateUi

};

namespace Ui {
    class MainWindow: public Ui_MainWindow {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_MAINWINDOW_H
