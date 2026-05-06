listaLetras = ["A", "C", "E", "D", "F", "B"]
print(listaLetras)
listaLetras.sort() #sort / ordenando de A a Z
print(listaLetras)

listaLetras.sort(reverse=True) #sort / ordenando de Z a A
print(listaLetras)

print("\n\n")
#----------------------------

listaNumeros = [4, 9, 5, 20, 16, 14, 12]
print(listaNumeros)
listaNumeros.sort() #sort / ordenando de A a Z
print(listaNumeros)

listaNumeros.sort(reverse=True) #sort / ordenando de Z a A
print(listaNumeros)

#--------------------------------

#Maiuscula e Minusca
listaMaiMin = ["Sofá", "tv", "carro", "Casa", "Armario"]
listaMaiMin.sort()
print(listaMaiMin)

listaMaiMin.sort(key= str.lower)
print(listaMaiMin)
