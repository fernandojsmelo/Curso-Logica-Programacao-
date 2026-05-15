from tkinter import *
from tkinter import messagebox

#tk - Biblioteca do tkinter
#Tk - Janela / Tela
janela = Tk()

#Define um tamanho fixo para a tela
janela.geometry("600x600")

#Altera o título da tela
janela.title("CheckButton com Números")

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

    #total = total + int(varNumero.get())
    total += int(varNumero.get())

    #0 + 5 = 5
    #messagebox.showinfo(
    #           "Mensagem", valorAntigo, " + ", varNumero.get(), " = ", total
    #           )
    print(valorAntigo, " + ", varNumero.get(), " = ", total)


#Criando a variável
varNumero = IntVar()

checkNumero5 = Checkbutton(janela,  text="5",
                                    font="Arial 20",
                                    variable=varNumero,
                                    onvalue= 5,
                                    offvalue= 0,
                                    command=funcaoSomar).pack() #Criar e centralizar

checkNumero10 = Checkbutton(janela, text="10",
                                    font="Arial 20",
                                    variable=varNumero,
                                    onvalue= 10,
                                    offvalue= 0,
                                    command=funcaoSomar).pack() #Criar e centralizar

checkNumero15 = Checkbutton(janela, text="15",
                                    font="Arial 20",
                                    variable=varNumero,
                                    onvalue= 15,
                                    offvalue= 0,
                                    command=funcaoSomar).pack() #Criar e centralizar


#mainloop - No Tkinter uma janela funciona como um 'loop' infinito
#A janela que o Python mostra na verdade é um programa em funcionamento
janela.mainloop()