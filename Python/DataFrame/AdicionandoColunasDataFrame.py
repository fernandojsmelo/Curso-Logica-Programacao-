import pandas as opcoesPandas

notasAlunos_DF = opcoesPandas.DataFrame({
    "Nome" : ["Ana", "Pedro", "João"],
    "Nota 1" : [9, 7, 10],
    "Nota 2" : [6, 9, 8],
    "Nota 3" : [7, 5, 10],
    "Nota 4" : [10, 10, 6]
})

print("\n-------- DataFrame Dicionário Notas Alunos -------\n")
print(notasAlunos_DF)
print("\n")

notasAlunos_DF["Média"] = (notasAlunos_DF["Nota 1"] + notasAlunos_DF["Nota 2"] + notasAlunos_DF["Nota 3"] + notasAlunos_DF["Nota 4"]) / 4
print("\nDataFrame com uma nova coluna (Média)\n")
print(notasAlunos_DF)
print("\n")

#--------------------------------------------------

notasAlunos_DF["Faltas"] = 5
print("\nDataFrame com uma nova coluna (Falta com valor padrão)\n")
print(notasAlunos_DF)
print("\n")

novasFaltas = [2, 5, 3]
print(type(novasFaltas))

notasAlunos_DF["Faltas"] = novasFaltas
print("\nDataFrame substituindo valores na coluna de Faltas através de uma lista\n")
print(notasAlunos_DF)
print("\n")

#-------------------------------------------

#loc = Localizar
notasAlunos_DF.loc[1, "Nota 2"] = 50
print("\nAlterando a nota 2 do aluno Pedro\n")
print(notasAlunos_DF)
print("\n")


notasAlunos_DF["Média"] = (notasAlunos_DF["Nota 1"] + notasAlunos_DF["Nota 2"] + notasAlunos_DF["Nota 3"] + notasAlunos_DF["Nota 4"]) / 4
print("\nRecalculando a Média\n")
print(notasAlunos_DF)
print("\n")

