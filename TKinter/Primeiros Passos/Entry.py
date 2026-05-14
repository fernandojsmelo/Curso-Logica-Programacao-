from tkinter import *

#tk - Biblioteca do tkinter
#Tk - Janela / Tela
janela = Tk()

#Define um tamanho fixo para a tela
janela.geometry("900x600")

#Altera o título da tela
janela.title("Entry")

#grid   - Divide a tela em grades / parte
#sticky - Usamos para preencher o 'item' na tela toda, ou seja
#         para não ficar espaços em branco nas laterais
#sticky - NSEW - (Norte, Sul, Leste e Oeste)
nome = Label(text="Nome: ", font="Arial 40")
nome.grid(row=1, column=0, sticky="W")

#Entry - Campo de entrada de dados
exibirNome = Entry(font= "Arial 40")
exibirNome.grid(row=1, column=1, sticky="W")

#grid   - Divide a tela em grades / parte
#sticky - Usamos para preencher o 'item' na tela toda, ou seja
#         para não ficar espaços em branco nas laterais
#sticky - NSEW - (Norte, Sul, Leste e Oeste)
sobrenome = Label(text="Sobrenome: ", font="Arial 40")
sobrenome.grid(row=2, column=0, sticky="W")

#Entry - Campo de entrada de dados
exibirSobreNome = Entry(font= "Arial 40")
exibirSobreNome.grid(row=2, column=1, sticky="W")

#mainloop - No Tkinter uma janela funciona como um 'loop' infinito
#A janela que o Python mostra, na verdade, é um programa em funcionamento
janela.mainloop()