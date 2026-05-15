from tkinter import *
from tkinter import messagebox

#tk - Biblioteca do tkinter
#Tk - Janela / Tela
janela = Tk()

#Define um tamanho fixo para a tela
janela.geometry("600x600")

#Altera o título da tela
janela.title("Menssagebox exemplo 2")

def mensagemInformacao():

    messagebox.showinfo("Informação", "Bem vindo(a) ao curso de Tkinter")

def mensagemAviso():

    messagebox.showwarning("Aviso", "Você está usando Tkinter")

def mensagemErro():

    messagebox.showerror("Erro", "Erro ao carregar o sistema")

def mensagemQuestao():

    resultado = messagebox.askquestion("Deletar","Tem certeza que deseja deletar?")

    #if - se
    if resultado == "yes":

        print("Deletado com sucesso!")

    else:

        print("Cancelado com sucesso!")

def mensagemOkouCancelar():

    resultado = messagebox.askokcancel("Ok ou Cancelar", "Deseja continuar?")

    # if - se
    if resultado:

        print("Continuando...")

    else:

        print("Cancelado com sucesso!")


def mensagemSimouNao():

    resultado = messagebox.askyesno("Sim ou Não", "Quer procurar o valor?")

    # if - se
    if resultado:

        print("Procurando...")

    else:

        print("Cancelado com sucesso!")

def mensagemRepetirouCancelar():

    resultado = messagebox.askretrycancel("Repetir ou Cancelar", "Quer tentar novamente?")

    # if - se
    if resultado:

        print("Repetindo...")

    #else - Senão
    else:

        print("Cancelado com sucesso!")

botaoInformacao = Button(janela,
                         text="Informação",
                         font="Arial 20",
                         pady=10,
                         padx=10,
                         command=mensagemInformacao).pack() #Cria e centraliza na tela

botaoAviso = Button(janela,
                         text="Aviso",
                         font="Arial 20",
                         pady=10,
                         padx=10,
                         command=mensagemAviso).pack() #Cria e centraliza na tela

botaoErro = Button(janela,
                         text="Erro",
                         font="Arial 20",
                         pady=10,
                         padx=10,
                         command=mensagemErro).pack() #Cria e centraliza na tela

botaoQuestao = Button(janela,
                         text="Questão",
                         font="Arial 20",
                         pady=10,
                         padx=10,
                         command=mensagemQuestao).pack() #Cria e centraliza na tela

botaoOkouCancelar = Button(janela,
                         text="Ok ou Cancelar",
                         font="Arial 20",
                         pady=10,
                         padx=10,
                         command=mensagemOkouCancelar).pack() #Cria e centraliza na tela

botaoSimouNao = Button(janela,
                         text="Sim ou Não",
                         font="Arial 20",
                         pady=10,
                         padx=10,
                         command=mensagemSimouNao).pack() #Cria e centraliza na tela


botaoRepetirouCancelar = Button(janela,
                         text="Repetir ou Cancelar",
                         font="Arial 20",
                         pady=10,
                         padx=10,
                         command=mensagemRepetirouCancelar).pack() #Cria e centraliza na tela

#mainloop - No Tkinter uma janela funciona como um 'loop' infinito
#A janela que o Python mostra na verdade é um programa em funcionamento
janela.mainloop()