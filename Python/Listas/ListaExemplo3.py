lista1 = ["A", "B", "C"]
lista2 = ["D", "E", "F"]

lista1.extend(lista2) #Com extend unimos duas listas

print(lista1)

lista1.remove("E") #Removendo a letra da lista
print(lista1)

lista1.pop(2) #Removendo com o pop o segundo elemento da lista
print(lista1)

lista1.pop() #Removendo o último elemento da lista
print(lista1)

#Removendo o primeiro elemento da lista
del lista1[0]
print(lista1)

lista1.clear() #Removendo todos os itens da lista
print(lista1)

lista1.append("Maça") #Adicionando itens na lista
print(lista1)

lista1.insert(1, "Goiaba") #Adicionando item na segunda posição
print(lista1)

lista1.insert(1, "Laranja") #Adicionando item na segunda posição
print(lista1)

#if = se
if "Laranja" in lista1:
    print("Sim, a Laranja existe na lista")
else:
    print("Não encontramos a fruta")

lista1[2] = "Banana"

print(lista1)

lista1[1:3] = ["A", "b"]

print(lista1)

