from tkinter import *

#tk - Biblioteca do tkinter
#Tk - Janela / Tela
janela = Tk()

#Defeni um tamanho fixo para a tela
janela.geometry("600x600")

def imprimirItemSelecionado():

    print("Você selecionou a letra: " + variavelOpcaoSelecionada.get() )

variavelOpcaoSelecionada = StringVar(janela, "0")

#Altera o título da tela
janela.title("Radiobutton exemplo 1")

radiobutton_1 = Radiobutton(janela,
                            text="Letra A",
                            font="Arial 26",
                            value="A",
                            variable=variavelOpcaoSelecionada,
                            command=imprimirItemSelecionado).pack() #Criar e centralizar

radiobutton_2 = Radiobutton(janela,
                            text="Letra B",
                            font="Arial 26",
                            value="B",
                            variable=variavelOpcaoSelecionada,
                            command=imprimirItemSelecionado).pack() #Criar e centralizar

radiobutton_3 = Radiobutton(janela,
                            text="Letra C",
                            font="Arial 26",
                            value="C",
                            variable=variavelOpcaoSelecionada,
                            command=imprimirItemSelecionado).pack() #Criar e centralizar

#mainloop - No Tkinter uma janela funciona como um 'loop' infinito
#A janela que o Python mostra, na verdade, é um programa em funcionamento
janela.mainloop()