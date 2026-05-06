listaMinMax = [52, 10, 20, 100, 50, 300, 5]

print(min(listaMinMax))
print(max(listaMinMax))

#-------------------------------------

#Lista de 0 ate 10
listaNumeros1ate10 = [posicao for posicao in range(101) if posicao <= 10]

print(listaNumeros1ate10)

print("\n\n")

#------------------------------------------

listaDoisEmDois = list(range(1,100,2))
print(listaDoisEmDois)

print("\n\n")
#------------------------------------------

listaOriginal = ["Carro", "Moto", "Bicicleta", "lancha"]
listaCopiada = listaOriginal.copy() #copiando a lista

print(listaCopiada)

print("\n\n")
#-----------------------------------------

lista1Letras = ["A", "B", "C"]
lista2Numeros = [1, 2, 3]

#Join unindo listas
listaJoin = lista1Letras + lista2Numeros
print(listaJoin)

print("\n\n")
#--------------------------------

l1 = ["a1", "b1", "c1"]
l2 = [11, 12, 13]

for item in l2:
    l1.append(item)

print(l1)

