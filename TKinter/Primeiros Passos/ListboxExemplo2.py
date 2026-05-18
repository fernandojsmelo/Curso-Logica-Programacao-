from tkinter import *
from tkinter import messagebox

#tk - Biblioteca do tkinter
#Tk - Janela / Tela
janela = Tk()

#Define um tamanho fixo para a tela
janela.geometry("600x600")

#Altera o título da tela
janela.title("Listbox exemplo 2")

labelInstrucao = Label(janela,
                       text="Dia da Semana",
                       font="Arial 26").pack() #Cria e centraliza

#Criando a lista de nomes
listaNomes = ("Ana", "Amanda", "Cesar", "Pedro", "Allan",
              "Carlos", "Marcos", "Roger", "Emile")

#Cria a variavel que vai conter todos os nome no formato de Variable
variavelNomes = Variable(value=listaNomes)

#Cria a listbox e popula
#selectmode - SINGLE, BROWSE, MULTIPLE, EXTENDED
listbox = Listbox(janela,
                  font="Arial 20",
                  listvariable= variavelNomes, #Lista que contém todos os nomes
                  selectmode=SINGLE)           #selectmode=SINGLE -
                                               # Permite uma simples seleção

#Expandir a listbox para oculpar toda a tela
#fill=BOTH - Expandir
listbox.pack(expand=True, fill=BOTH) #Cria e centraliza

def itemSelecionado(evento):

    #Retornar todos os indices / Posições selecionadas
    indiceSelecionado = listbox.curselection()

    #join - Junta todos os itens que estão selecionados na lista
    item = ",".join([listbox.get(posicao) for posicao in indiceSelecionado])
    mensagem = "Você seleciou: " + item
    messagebox.showinfo(title="Atenção!", message=mensagem)
    print(mensagem)

#Criando um evento de click para pegar a posição do 'item' selecionado
listbox.bind("<<ListboxSelect>>", itemSelecionado)

#Caixa digitavel ou entrada de dados
textoParaAdicionar = Entry(font="Arial 40")
textoParaAdicionar.pack(expand=True, fill=BOTH)

def addItem():

    listbox.insert(END, str(textoParaAdicionar.get()))

botaoAdicionar = Button(text="Adicionar texto",
                        font="Arial 30",
                        command= addItem).pack(expand=True, fill=BOTH)

#mainloop - No Tkinter uma janela funciona como um 'loop' infinito
#A janela que o Python mostra na verdade é um programa em funcionamento
janela.mainloop()