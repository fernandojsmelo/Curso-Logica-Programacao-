from tkinter import *

#tk - Biblioteca do tkinter
#Tk - janela / Tela
janela = Tk()

#Define um tamanho fixo para a tela
janela.geometry('500x500')

#Label - É onde escrevemos os textos que queremos que o utilizador leia
instrucao = Label(text="\nOlá, Mundo!", font=("Arial", 25))

#pack - Coloca os objetos dentro da janela / tela
#       Cria e centraliza e deixa um em baixo do outro
instrucao.pack()

#Label - É onde escrevemos os textos que queremos que o utilizador leia
instrucao_2 = Label(text="\nCurso de Tkinter!", font=("Arial", 25))

#pack - Coloca os objetos dentro da janela / tela
#       Cria e centraliza e deixa um em baixo do outro
instrucao_2.pack()

#Altera o titulo da tela
janela.title('Primeiros Passos / Ola, Mundo')

#mainloop - No Tkinter uma janela funciona como um ‘loop’.
#A janela que o Python mostra na tela na verdade é um programa em funcionamento.
janela.mainloop()
