import pandas as pd

#PROCV - Puchar uma informação de outra tabela

vendas_DF = pd.read_excel("Vendas_LEFT_JOIN.xlsx")

print("\n Vendas Loja \n")
print(vendas_DF)
print("\n")

vendedores_DF = pd.read_excel("Vendedores_LEFT_JOIN.xlsx")

print("\n Vendedores Loja \n")
print(vendedores_DF)
print("\n")

#----------------------------------------------

#how = como
#left = trazer os pela esquerda
verificandoVendas_DF = pd.merge(
    vendas_DF, vendedores_DF, on="Id Vendedor", how="left")

print("\n Merge LEFT JOIN \n")
print(verificandoVendas_DF)
print("\n")

#----------------------------------------------

#how = como
#left = trazer os pela esquerda
verificandoVendas_DF_2 = pd.merge(
    vendas_DF, vendedores_DF, on="Id Vendedor", how="left",
    suffixes=(" Vendas", " Checagem"))

print("\n Merge LEFT JOIN \n")
print(verificandoVendas_DF_2)
print("\n")

#----------------------------------------------

tratamentoDados_DF = pd.merge(
    vendas_DF, vendedores_DF, on="Id Vendedor", how="left",
    suffixes=(" Vendas", " Checagem"))

#dropna = Deleta linhas que tem pelo menos 1 valor vazio
tratamentoDados_DF = tratamentoDados_DF.dropna()

print("\n Removendo linhas com NaN \n")
print(tratamentoDados_DF)
print("\n")

#--------------------------------------------------

del tratamentoDados_DF["Vendedor Checagem"]

print("\n Após remover coluna Vendedor Checagem \n")
print(tratamentoDados_DF)
print("\n")