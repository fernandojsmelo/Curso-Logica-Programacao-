from tkinter import *
from tkinter import messagebox

#tk - Biblioteca do tkinter
#Tk - Janela / Tela
janela = Tk()

#Define um tamanho fixo para a tela
janela.geometry("600x600")

#Altera o título da tela
janela.title("Interface Gráfica - Button")

botao = Button(janela, text="Enviar", font="Arial 40")

#pack - cria e centraliza e deixa um em baixo do outro
botao.pack()

# Método para exibir a mensagem
def exibirMensagem():
    messagebox.showinfo("Mensagem","Olá, mundo!")

botaoOlaMundo = Button(janela, text="Mensagem",
                               font="Arial 40",
                               command = exibirMensagem
                       )

#pack - cria e centraliza e deixa um em baixo do outro
botaoOlaMundo.pack()

#Botão para fechar o sistema
botaoSair = Button(janela, text="Sair",
                           font="Arial 40",
                           command = janela.destroy) #Fechar a tela do Tkinter

#pack - cria e centraliza e deixa um em baixo do outro
botaoSair.pack()

botaoVerde = Button(janela, text="VERDE",
                            font="Arial 40", #Muda a fonte e tamanho da letra
                            fg="white",      #Cor da letra
                            bg="green")      #Cor do fundo
botaoVerde.pack()

botaoAmarelo = Button(janela, text="AMARELO",
                              font="Arial 40", #Muda a fonte e tamanho da letra
                              fg="black",      #Cor da letra
                              bg="yellow")     #Cor do fundo
botaoAmarelo.pack()

#mainloop - No Tkinter uma janela funciona como um loop infinito
#A janela que o Python mostra na verdade é um programa em funcionamento
janela.mainloop()