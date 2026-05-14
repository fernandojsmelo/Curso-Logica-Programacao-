from tkinter import *

#tk - Biblioteca do tkinter
#Tk - Janela / Tela
janela = Tk()

#Defeni um tamanho fixo para a tela
janela.geometry("850x850")

#Altera o título da tela
janela.title("Interface Gráfica")

#Label - É onde escrevemos os textos que queremos que o utilizador leia
#background - bg - Cor do Fundo
#foreground - fg - Cor do Texto
#relief - Relevo ou seja, uma borda decorativa
#relief - ‘FLAT’, RAISED, SUNKEN, GROOVE
rotulo1 = Label(janela, text="FLAT",
                        relief=FLAT,
                        bg="green",
                        fg="white",
                        font="Arial 40"
                )
rotulo2 = Label(janela, text="RAISED",
                        relief=RAISED,
                        bg="blue",
                        fg="white",
                        font="Arial 40"
                )
rotulo3 = Label(janela, text="SUNKEN",
                        relief=SUNKEN,
                        bg="white",
                        fg="black",
                        font="Arial 40"
                )
rotulo4 = Label(janela, text="GROOVE",
                        relief=GROOVE,
                        bg="green",
                        fg="white",
                        font="Arial 40"
                )

#pack - Coloca os objetos dentro da janela / tela
rotulo1.pack() #pack - cria e centraliza e deixa um em baixo do outro
rotulo2.pack()
rotulo3.pack()
rotulo4.pack()

texto = """
Curso de Tkinter
Aprendendo como criar
Interface gráfica com
Python.
"""

rotulo5 = Label(janela,
                font= "Arial 40 bold",
                text= texto
                )

rotulo5.pack()



#mainloop - No Tkinter uma janela funciona como um loop infinito
#A janela que o Python mostra na verdade é um programa em funcionamento
janela.mainloop()