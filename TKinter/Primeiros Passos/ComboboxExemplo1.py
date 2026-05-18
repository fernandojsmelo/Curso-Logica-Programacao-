from tkinter import *
from tkinter import ttk

#tk - Biblioteca do tkinter
#Tk - Janela / Tela
janela = Tk()

#Define um tamanho fixo para a tela
janela.geometry("600x600")

#Altera o título da tela
janela.title("Combobox exemplo 1")

#Criando o Label
Label(janela, text= "Selecione um mês:",
              font= ("Arial 20")).grid(
                                    row=0,
                                    column=0) #grid - divide a janela em partes

#Criando a Combobox
comboboxMesSelecionado = ttk.Combobox(janela, font=("Arial 20"))

#Adicionando os valores na combobox
comboboxMesSelecionado["values"] = ("Janeiro",
                                    "Fevereiro",
                                    "Março",
                                    "Abril",
                                    "Maio",
                                    "Junho",
                                    "Julho",
                                    "Agosto",
                                    "Setembro",
                                    "Outubro",
                                    "Novembro",
                                    "Dezembro"
                                    )

#Colocando a comboboxMesSelecionado na tela na linha 0 coluna 1
comboboxMesSelecionado.grid(row=0, column=1)

#selecionar um valor como padrão
comboboxMesSelecionado.current(5)

#Criando a função que pega o 'item' da combobox e imprime
def itemSelecionado():

    print(str(comboboxMesSelecionado.get()))

botaoPegaItemSelecionado = Button(janela,
                                          text="Item Selecionado",
                                          font="Arial 20",
                                          command=itemSelecionado)

#columnspan    - Vai oculpar o espaço de quantas colunas passarmos
#sticky="NSEW" - Estica o campo para as laterais para não ficar espaço em branco
#sticky="NSEW" - Norte, Sul, Leste e Oeste
botaoPegaItemSelecionado.grid(row=1, column=0, columnspan=2, sticky="NSEW")

#mainloop - No Tkinter uma janela funciona como um 'loop' infinito
#A janela que o Python mostra na verdade é um programa em funcionamento
janela.mainloop()