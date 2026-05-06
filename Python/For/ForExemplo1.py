listaLetras = ["A", "B", "C", "D", "E"]

#for = para
for posicao in listaLetras:
    print( "Letra: ", posicao )

print("\n")

for posicaoLetra, letra in enumerate(listaLetras):
    print(posicaoLetra, letra)

print("\n")


for posicaoLetraFrase in "Curso de Lógica de Programação Python":
    print(posicaoLetraFrase)

print("\n")

listaCores = ["amarelo", "vermelho", "laranja", "rosa"]

for posicaoCor in listaCores:
    if posicaoCor == "rosa":
        print("Cor rosa encontrada com sucesso!")
        break #pause / pare / interrompa

