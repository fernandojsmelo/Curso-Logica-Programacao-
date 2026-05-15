from tkinter import *
from tkinter import messagebox

#tk - Biblioteca do tkinter
#Tk - Janela / Tela
janela = Tk()

#Define um tamanho fixo para a tela
janela.geometry("600x600")

#Altera o título da tela
janela.title("Menssagebox exemplo 1")

messagebox.showinfo("Informação", "Bem vindo(a) ao curso de Tkinter")
messagebox.showwarning("Aviso", "Você está usando Tkinter")
messagebox.showerror("Erro", "Erro ao carregar o sistema")
messagebox.askquestion("Questão" ,"Tkinter é com Python?")
messagebox.askokcancel("Ok ou Cancelar", "Deseja continuar?")
messagebox.askyesno("Sim ou Não", "Quer procurar o valor?")
messagebox.askretrycancel("Repetir ou Cancelar", "Quer tentar novamente?")

#mainloop - No Tkinter uma janela funciona como um 'loop' infinito
#A janela que o Python mostra na verdade é um programa em funcionamento
janela.mainloop()