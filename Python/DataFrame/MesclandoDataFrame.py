import pandas as opcoesPandas

vendasJaneiro_DataFrame = opcoesPandas.read_excel("Vendas_Jan2.xlsx")

print("\n DataFrame vendas Janeiro \n")
print(vendasJaneiro_DataFrame)
print("\n")

vendasFevereiro_DataFrame = opcoesPandas.read_excel("Vendas_Fev.xlsx")

print("\n DataFrame vendas Fevereiro \n")
print(vendasFevereiro_DataFrame)
print("\n")

#--------------------------------------------

#append - Unindo os dois arquivos
#append / concat
vendasJaneiro_DataFrame = vendasJaneiro_DataFrame.append(vendasFevereiro_DataFrame)


print("\n DataFrame Jan e Fev unidos \n")
print(vendasJaneiro_DataFrame)
print("\n")

#-----------------------------------------------------

vendasMarco_DataFrame = opcoesPandas.read_excel("Vendas_Mar.xlsx")

print("\n DataFrame vendas Março \n")
print(vendasMarco_DataFrame)
print("\n")

#----------------------------------------------------

#append - Unindo os dois arquivos
#append / concat
vendasGeral_DataFrame = opcoesPandas.concat([vendasJaneiro_DataFrame, vendasFevereiro_DataFrame, vendasMarco_DataFrame])

print("\n DataFrames vendas Jan, Fev e Mar unidos \n")
print(vendasGeral_DataFrame)
print("\n")

#---------------------------------------------------

resumindoDataFrameGeral = vendasGeral_DataFrame[["Vendedor", "Data Venda", "Total Vendas"]]

print("\n Imprimindo 3 colunas do DF Geral \n")
print(resumindoDataFrameGeral)
print("\n")

#---------------------------------------------------

#Criando grupos
vendasGeralComGrupos = opcoesPandas.concat(
    [vendasJaneiro_DataFrame,
          vendasFevereiro_DataFrame,
          vendasMarco_DataFrame],
     keys=["Janeiro", "Fevereiro", "Março"])

print("\n DataFrame geral com Grupos \n")
print(vendasGeralComGrupos)
print("\n")

#----------------------------------------------------

extraindoFevereiro = vendasGeralComGrupos.loc["Fevereiro"]

print("\n Imprimindo mês de Feveiro \n")
print(extraindoFevereiro)
print("\n")
