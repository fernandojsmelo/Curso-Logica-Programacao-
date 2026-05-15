from tkinter import *

#tk - Biblioteca do tkinter
#Tk - Janela / Tela
janela = Tk()

#Define um tamanho fixo para a tela
janela.geometry("600x600")

#Altera o título da tela
janela.title("Radiobutton exemplo 2")

def imprimirItemSelecionado():

    print("Você selecionou a letra: " + variavelOpcaoSelecionada.get() )

variavelOpcaoSelecionada = StringVar(janela, "0")

opcoes = {"Letra A" : "A",
          "Letra B" : "B",
          "Letra C" : "C",
          "Letra D" : "D",
          "Letra E" : "E",
          "Letra F" : "F",
          "Letra G" : "G",
          "Letra H" : "H",
          "Letra I" : "I",
          "Letra J" : "J",
          "Letra K" : "K"

}

#for - para
for (textoColuna0, textoColuna1) in opcoes.items():
    Radiobutton(janela,
                text=textoColuna0,
                font="Arial 26",
                value=textoColuna1,
                variable=variavelOpcaoSelecionada,
                command=imprimirItemSelecionado).pack()  # Criar e centralizar

#mainloop - No Tkinter uma janela funciona como um 'loop' infinito
#A janela que o Python mostra na verdade é um programa em funcionamento
janela.mainloop()