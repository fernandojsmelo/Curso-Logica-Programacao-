import pandas as opcoesPandas
import numpy as opcoesNumpy

#date_range = criamos uma lista
#periods = quantos dias
#20221201 = Ano/Mes/Dia
dataDrame_Datas = opcoesPandas.date_range("20221201", periods=31)
print(dataDrame_Datas)


print("\n------- DataFrame 12 meses com a freq M ------")
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

