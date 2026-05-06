linha = 0

#while = enquanto
while linha < 3:
    coluna = 0
    while coluna < 3:
        print("Linha:", linha, " - Coluna:", coluna)
        coluna += 1 #coluna = coluna + 1
    linha += 1

#-------------------------

print("\n")

numeroInicial = 1
numeroFinal = int(input("Digite um número maior que 1: "))

while numeroInicial <= numeroFinal:
    print("Escolhi: ",numeroInicial)
    numeroInicial += 1

#-------------------------

print("\n")

numero = 1
numeroPar = int(input("Digite um número maior que 1: "))

while numero <= numeroPar:
    #Verifica se o número é PAR
    if numero % 2 == 0:
        print(numero, end=" ")
    numero += 1
