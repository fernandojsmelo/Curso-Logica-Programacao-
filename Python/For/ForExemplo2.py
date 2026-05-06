listaNomes = ["Bia", "Raquel", "Allan", "Mafalda"]

#for = para
for posicao in listaNomes:
    if posicao == "Allan":
        continue
    print(posicao)

#--------------------------

print("\n")

#Contando de 0 até 10
for i in range(11):
    print(i)

print("\n")

#range(start, stop e step)
#range(start = 1, stop = 10, step = 1)

#contar de 1 até 10
for posicao in range(1, 11, 2):
    print("Número: ", posicao)

print("\n")

#Contar do 20 até 10
for i in range(20, 9, -2):
    print("Posição: ",i)