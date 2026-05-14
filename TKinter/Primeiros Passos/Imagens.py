import tkinter
from tkinter import *

#pillow também é conhecido como PIL
from PIL import ImageTk, Image

#tk - Biblioteca do tkinter
#Tk - Janela / Tela
janela = Tk()

#Define um tamanho fixo para a tela
janela.geometry("600x600")

#Altera o título da tela
janela.title("Imagens")

caminhoImagemPlanoFundo = Image.open("planoFundo.jpg")
img = ImageTk.PhotoImage(caminhoImagemPlanoFundo)

labelParaFundo = tkinter.Label(image=img)
labelParaFundo.place(x=0,y=0) #Colocando o Label na posição 0


#pack - cria e centraliza e deixa um em baixo do outro
Label(janela, text="Imagem",
              font="Arial 20").pack(side=TOP) #Topo da tela

caminhoImagem = ImageTk.PhotoImage(Image.open("SAIR.jpg"))

botaoImagem = Button(image=caminhoImagem,
                     command=janela.destroy).pack(side=LEFT) #Lado esquerdo




#mainloop - No Tkinter uma janela funciona como um loop infinito
#A janela que o Python mostra na verdade é um programa em funcionamento
janela.mainloop()