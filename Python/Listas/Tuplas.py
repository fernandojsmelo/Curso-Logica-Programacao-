"""
A difereça das listas para Tuplas é que não podemos
editar os elementos da Tupla, não podemos adicionar
elementos, não podemos remover elementos
"""

tuplaLetras = ("A", "B", "C", "D")

print(tuplaLetras)       #Imprimindo a tupla
print(type(tuplaLetras)) #Imprimindo o tipo da tupla
print(len(tuplaLetras))  #Tamanho da tupla
print(tuplaLetras[0])    #Acessando os itens da tupla
print(tuplaLetras[1])    #Acessando os itens da tupla
print(tuplaLetras[-1])   #Acessando o último item da tupla

#------------------------------------

novaTupla = ("E",)       #Cria uma nova tupla
print(novaTupla)         #Imprime a tupla
print(type(novaTupla))   #Mostra o tipo do dado

tuplaLetras += novaTupla #Unindo as tuplas

print("\n")              #Quebra de linha
print(tuplaLetras)       #Imprimindo

#---------------------------------------

tuplaNumeros = (1, 2, 3, 4, 5, 6, 7)
listaNumeros = list(tuplaNumeros)  #Convertendo tupla em lista
listaNumeros.remove(4)             #Removendo o item 4 da lista
tuplaNumeros = tuple(listaNumeros) #Convertendo a lista em tupla

print("\n")
print(tuplaNumeros)
print("\n")

#---------------------------------------

#Imprimindo itens da tupla
tuplaFrutas = ("Banana", "Abacaxi", "Laranja", "Maça")

#for = para
for item in tuplaFrutas:
    print(item)