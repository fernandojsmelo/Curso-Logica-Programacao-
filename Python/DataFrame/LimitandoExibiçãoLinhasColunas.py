import pandas as opcoesPandas

#Abrindo o arquivo do Excel
vendas_DataFrame = opcoesPandas.read_excel("Vendas_Jan.xlsx")
print(vendas_DataFrame)
print("\n")


print("\nIndex exibe apenas informações sobre as linhas do DataFrame\n")
print(vendas_DataFrame.index)
print("\n")

print("\ncolumns exibe o nome de todas as colunas do DataFrame\n")
print(vendas_DataFrame.columns)
print("\n")

print("\nhead exibe apenas as 5 primeiras linhas por padrão\n")
print(vendas_DataFrame.head())
print("\n")

print("\nhead exibe apenas as 10 primeiras linhas\n")
print(vendas_DataFrame.head(10))
print("\n")

print("\ntail exibe apenas as últimas linhas\n")
print(vendas_DataFrame.tail(3))
print("\n")

print("\nImprimindo somente a coluna de vendedor\n")
print(vendas_DataFrame["Vendedor"])
print("\n")



