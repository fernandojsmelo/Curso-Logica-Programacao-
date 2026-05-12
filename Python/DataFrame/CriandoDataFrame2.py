import pandas as opcoesPandas
import numpy as opcoesNumpy

#date_range = criamos uma lista
#periods = quantos dias
#20221201 = Ano/Mes/Dia
dataDrame_Datas = opcoesPandas.date_range("20221201", periods=31)
print(dataDrame_Datas)


print("\n------- DataDrame 12 meses com a freq M ------")
dataDrame_Meses = opcoesPandas.date_range("20221231", periods=12, freq="M")
print(dataDrame_Meses)
print("\n")

#--------------------------------------

numerosAleatorios = opcoesPandas.DataFrame(opcoesNumpy.random.rand(5, 1))
print("\n----- DataFrame Números Aleatórios 5 linhas e 1 coluna -----\n")
print(numerosAleatorios)
print("\n")

numerosAleatorios = opcoesPandas.DataFrame(opcoesNumpy.random.rand(15, 10)*100)
print("\n----- DataFrame Números Aleatórios 15 linhas e 10 colunas -----\n")
print(numerosAleatorios)
print("\n")


#columns = renomeamos os nomes das colunas
numerosAleatorios = opcoesPandas.DataFrame(opcoesNumpy.random.rand(15, 10)*100,
                    columns=["A", "B", "C", "D", "E", "F", "G", "H", "I", "J"])
print("\n----- DataFrame Números Aleatórios 15 linhas e 10 colunas -----\n")
print(numerosAleatorios)
print("\n")

#Exibe o nome de todas as colunas
print(numerosAleatorios.columns)

#Criando um DataFrame a partir de um dicionário
notasAlunos_DataFrame = opcoesPandas.DataFrame(
    {
        "Nome": ["Ana", "Pedro", "João", "Marta", "Allan"],
        "Média": [9, 7, 10, 8, 9]
    })
#\n = Quebra de linha (mesma que dar um enter para deixar um espaço)
print("\n------- DataFrame Dicionário Notas Alunos\n")
print(notasAlunos_DataFrame)




