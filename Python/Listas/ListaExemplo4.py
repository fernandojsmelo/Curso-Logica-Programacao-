listaNome = ["Bryan", "Leticia", "Bruna", "Clarice", "Carla"]

#Imprimindo os itens de uma lista
for posicao in listaNome:
    print(posicao)

print("\n\n")

#Exemplo impressão com for 2
[print(item) for item in listaNome]

print("\n\n")

contador = 0
#while = enquanto
while contador < len(listaNome):
    print(listaNome[contador])
    contador = contador + 1

print("\n\n")
#-----------------------------------
listaNomeC = []

for item in listaNome:
    if "n" in item:
        listaNomeC.append(item)

print(listaNomeC)

print("\n\n")
#----------------------------------

listaMaiscula = [item.upper() for intem in listaNome]
print(listaNome)
print(listaMaiscula)

listaMinuscula = [item.lower() for intem in listaNome]
print(listaMinuscula)
