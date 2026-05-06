"""
add                         - Adiciona itens

union                       - unir sets

intersetion                 - retorna itens existentes em ambos os conjustos

summetric_difference_update - mantém apenas os itens que
                              não estão presentes em ambos os conjuntos

summetric_differente        - retorna apenas os itens que não
                              estão presentes em ambos os conjuntos
"""

#add - Adiciona itens
setExemploNumeros = set()
setExemploNumeros.add(1)
setExemploNumeros.add(2)
setExemploNumeros.add(3)
setExemploNumeros.add(4)
setExemploNumeros.add(5)
setExemploNumeros.add("Amanda")

print(setExemploNumeros)
print("\n")

#add - Adiciona itens exemplo
setLetras = {"A", "B", "C"}
print(setLetras)

#----------------------------------

print("\n")
#union - unir sets

set1 = {"Allan", "Berenice", "Roger"}
set2 = {39, 21, 45}

uniaoSets = set1.union(set2)
print(uniaoSets)

#---------------------------------

#intersetion - retorna itens existentes em ambos os conjustos

listaSet1 = {"Python", "C++", "Java"}
listaSet2 = {"VisualG", "Lógica", "Python"}

print("\n")
imprimindoOsDoisParaConferir = listaSet1.union(listaSet2)
print(imprimindoOsDoisParaConferir)

valorQueEstaEmAmbosOsSets = listaSet1.intersection(listaSet2)
print(valorQueEstaEmAmbosOsSets)

#symmetric_difference_update - mantém apenas os itens que
#                              não estão presentes em ambos os conjuntos

listaSet1.symmetric_difference_update(listaSet2)
print(listaSet1)

#symmetric_differente - retorna apenas os itens que não
#                       estão presentes em ambos os conjuntos

listaS1 = {"Python", "C++", "Java"}
listaS2 = {"VisualG", "Lógica", "Python"}

print("\n\n")
naoEstaoEmAmbos = listaS1.symmetric_difference(listaS2)
print(naoEstaoEmAmbos)

#------------------------------------------

print("\n\n")

#Sets não aceitam valores repetidos
setNumero = {1, 2, 3, 4, 5, 6, 6, 7, 8}
print(setNumero)
print(len(setNumero))

setExemplo1 = {"A", "B", "C"}
setExemplo2 = {1, 2, 3}
setExemplo3 = {True, False, True}
setExemplo4 = {"Maça", 12, True}
setExemplo2.update(setExemplo1) #Unindo os sets

print("\n\n")
print(setExemplo1)
print(setExemplo2)
print(setExemplo3)
print(setExemplo4)

#--------------------------------

listaObjetos = {"Casa", "Moto", "Bicicleta", "Lancha"}

#Imprimindo os itens do set com o for
for item in listaObjetos:
    print(item)

#Adicionamos um item no set
listaObjetos.add("Carro")
print(listaObjetos)

#Removendo o item no set
listaObjetos.remove("Moto")
print(listaObjetos)

#Removendo o último item do set
listaObjetos.pop()
print(listaObjetos)

#Verifica se existe um item no set
print("Bicicleta" in listaObjetos)


