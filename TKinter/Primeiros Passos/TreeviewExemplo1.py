from tkinter import *
from tkinter import ttk

#tk - Biblioteca do tkinter
#Tk - Janela / Tela
janela = Tk()

#Define um tamanho fixo para a tela
janela.geometry("900x400")

#Altera o título da tela
janela.title("Treeview exemplo 1")

#clam, alt, default, classic
stilo = ttk.Style()
stilo.theme_use("alt")
#stilo.configure(".")

treeviewDados = ttk.Treeview(janela, columns=(1, 2, 3, 4), show="headings")

#Populando o titulo
treeviewDados.column("1", anchor=CENTER)
treeviewDados.heading("1", text="ID")

treeviewDados.column("2", anchor=CENTER)
treeviewDados.heading("2", text="Nome")

treeviewDados.column("3", anchor=CENTER)
treeviewDados.heading("3", text="Idade")

treeviewDados.column("4", anchor=CENTER)
treeviewDados.heading("4", text="Sexo")

treeviewDados.insert("", "end", text="1",
                     values=("1", "Allan", 29, "Masculino"))

treeviewDados.insert("", "end", text="2",
                     values=("2", "Ana", 41, "Feminino"))

treeviewDados.insert("", "end", text="3",
                     values=("3", "Berenice", 50, "Feminino"))

treeviewDados.insert("", "end", text="4",
                     values=("4", "Roger", 21, "Masculino"))

treeviewDados.insert("", "end", text="5",
                     values=("5", "Pedro", 45, "Masculino"))

treeviewDados.pack() #Criar e cetraliza

#mainloop - No Tkinter uma janela funciona como um 'loop' infinito
#A janela que o Python mostra, na verdade, é um programa em funcionamento
janela.mainloop()