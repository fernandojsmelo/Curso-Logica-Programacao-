from tkinter import *

#tk - Biblioteca do tkinter
#Tk - Janela / Tela
janela = Tk()

#Define um tamanho fixo para a tela
janela.geometry("400x400")

#Altera o título da tela
janela.title("Interface Gráfica")

#for - para
for linha in  range(5):
    for coluna in range(3):
        # master - Mestre - Representa a janela PAI
        # relief - Relevo ou seja, uma borda decorativa
        tabela = Frame(
            master      = janela,
            relief      = SUNKEN,
            borderwidth = 1
        )

        #padx - Espaçamento
        tabela.grid(row=linha, column=coluna, padx=5, pady=5)
        criaLabel = Label(master=tabela, text=f"Linha {linha} \n Coluna {coluna}")
        criaLabel.pack()

#mainloop - No Tkinter uma janela funciona como um loop infinito
#A janela que o Python mostra na verdade é um programa em funcionamento
janela.mainloop()