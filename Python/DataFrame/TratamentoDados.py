import pandas as pd

#Abrindo arquivo excel
dadosDataFrame = pd.read_excel("Tratamento_Dados.xlsx")
print(dadosDataFrame)
print("\n")

#fillna - Preenche os valores vazios com a média
#dadosDataFrame["Total Vendas"] =
# dadosDataFrame["Total Vendas"].fillna(dadosDataFrame["Total Vendas"].mean())

#Preenche com o valor padrão
#dadosDataFrame["Total Vendas"] = dadosDataFrame["Total Vendas"].fillna(5)

#ffill - Preenche com o último registro valido encontrado
dadosDataFrame["Total Vendas"] = dadosDataFrame["Total Vendas"].ffill()

print("\n ffill - Preenche com o último registro valido encontrado \n")
print(dadosDataFrame)
print("\n")

#value_counts - Conta quantas linhas / vendas foram feitas
qtdVendas = dadosDataFrame["Vendedor"].value_counts()

print("\n value_counts - Conta quantas linhas / vendas foram feitas \n")
print(qtdVendas)
print("\n")

vendaVendedor = dadosDataFrame.groupby("Vendedor").sum()

print("\n groupby - Agrupa as informações \n")
print(vendaVendedor)
print("\n")