from tkinter import *

#tk - Biblioteca do tkinter
#Tk - Janela / Tela
janela = Tk()

#Define um tamanho fixo para a tela
janela.geometry("600x600")

#Altera o título da tela
janela.title("Listbox")

labelInstrucao = Label(janela,
                       text="Dia da Semana",
                       font="Arial 26").pack() #Cria e centraliza

#Cria a listbox
listbox = Listbox(janela, font="Arial 20")

#Popula as informações na listbox
listbox.insert(1, "Domingo")
listbox.insert(2, "Segunda-feira")
listbox.insert(3, "Terça-feira")
listbox.insert(4, "Quarta-feira")
listbox.insert(5, "Quinta-feira")
listbox.insert(6, "Sexta-feira")
listbox.insert(7, "Sábado")

listbox.pack() #Cria e centraliza

#mainloop - No Tkinter uma janela funciona como um loop infinito
#A janela que o Python mostra na verdade é um programa em funcionamento
janela.mainloop()