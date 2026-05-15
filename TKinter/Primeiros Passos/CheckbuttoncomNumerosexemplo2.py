from tkinter import *
from tkinter import messagebox

#tk - Biblioteca do tkinter
#Tk - Janela / Tela
janela = Tk()

#Defeni um tamanho fixo para a tela
janela.geometry("600x600")

#Altera o título da tela
janela.title("CheckButton com Números Exemplo")

labelInformacao = Label(janela, text="Selecione a opção desejada!",
                                foreground="Blue",
                                font="Arial 20").pack() #Cria e centraliza

total = 0
valorAntigo = 0

def funcaoSomar():

    global total
    global valorAntigo

    #A primeira vez que passar o valor antigo recebe o valor atual do total
    valorAntigo = total

    #total = total + int(
    #          varNumero5.get()) + int(varNumero10.get()) + int(varNumero15.get()
    #          )
    total += int(varNumero5.get()) + int(varNumero10.get()) + int(varNumero15.get())

    print(valorAntigo, " : ", total)


#Criando as variáveis
varNumero5 = IntVar()
varNumero10 = IntVar()
varNumero15 = IntVar()

checkNumero5 = Checkbutton(janela,  text="Número 5",
                                    font="Arial 20",
                                    variable=varNumero5,
                                    onvalue= 5,
                                    offvalue= 0,
                                    command=funcaoSomar).pack() #Criar e centralizar

checkNumero10 = Checkbutton(janela, text="Número 10",
                                    font="Arial 20",
                                    variable=varNumero10,
                                    onvalue= 10,
                                    offvalue= 0,
                                    command=funcaoSomar).pack() #Criar e centralizar

checkNumero15 = Checkbutton(janela, text="Número 15",
                                    font="Arial 20",
                                    variable=varNumero15,
                                    onvalue= 15,
                                    offvalue= 0,
                                    command=funcaoSomar).pack() #Criar e centralizar


#mainloop - No Tkinter uma janela funciona como um loop infinito
#A janela que o Python mostra na verdade é um programa em funcionamento
janela.mainloop()