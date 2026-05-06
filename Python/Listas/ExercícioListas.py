listaFrutas = ["maçã", "banana", "manga", "abacate", "laranja"]

listaFrutas.append("kiwi")
print(listaFrutas)

print("\n")
print("-------------------------------------------")
print("Remova a string 'banana' da lista frutas")
listaFrutas.remove("banana")
print(listaFrutas)
print("\n")
print("-------------------------------------------")
if "abacaxi" in listaFrutas:
    print("Abacaxi está na lista")
else:
    print("Abacaxi não está na lista")

print("\n")
print("-------------------------------------------")
print("Use a função len() para imprimir o número de frutas na lista frutas")
print(len(listaFrutas))
print("\n")
print("-------------------------------------------")
print("Imprima o nome da primeira fruta")
print(listaFrutas[0])
print("\n")
print("-------------------------------------------")
print("Imprima o nome da última fruta")
print(listaFrutas[4])