from tkinter import *
from tkinter import messagebox

#tk - Biblioteca do tkinter
#Tk - Janela / Tela
janela = Tk()

#Defeni um tamanho fixo para a tela
janela.geometry("600x600")

#Altera o título da tela
janela.title("CheckButton")

labelInformacao = Label(janela, text="Selecione a opção desejada!",
                                foreground="Blue",
                                font="Arial 20").pack() #Cria e centraliza

def funcaoAzulClicado():

    messagebox.showinfo("Mensagem", varAzul.get())

def funcaoAmareloClicado():

    messagebox.showinfo("Mensagem", varAmarelo.get())

def funcaoVerdeClicado():

    messagebox.showinfo("Mensagem", varVerde.get())

#Criando as variaveis
varAzul = StringVar()
varAmarelo = StringVar()
varVerde = StringVar()

checkAzul = Checkbutton(janela, text="Azul",
                        font="Arial 20",
                        variable=varAzul,
                        onvalue= "Clicou na cor Azul",
                        offvalue="",
                        command=funcaoAzulClicado).pack() #Criar e centralizar

checkAmarelo = Checkbutton(janela, text="Amarelo",
                        font="Arial 20",
                        variable=varAmarelo,
                        onvalue= "Clicou na cor Amarela",
                        offvalue="",
                        command=funcaoAmareloClicado).pack() #Criar e centralizar

checkVerde = Checkbutton(janela, text="Verde",
                        font="Arial 20",
                        variable=varVerde,
                        onvalue= "Clicou na cor Verde",
                        offvalue="",
                        command=funcaoVerdeClicado).pack() #Criar e centralizar

#mainloop - No Tkinter uma janela funciona como um 'loop' infinito
#A janela que o Python mostra na verdade é um programa em funcionamento
janela.mainloop()