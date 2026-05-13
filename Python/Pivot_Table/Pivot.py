import pandas as pd

#Pivot - Está função não suporta agregação de valores repetitos

baseLanchonete_DF = pd.read_excel("Vendas_Lanchonete_Pivot.xlsx")

print("\n Imprimindo dados \n")
print(baseLanchonete_DF)
print("\n")

#index = linhas
#columns = As colunas
pivotExemplo1 = baseLanchonete_DF.pivot(
    index="Data Venda", columns="Cliente", values="Preço com Desconto")

print("\n Imprimindo clientes / Preço com Desconto \n")
print(pivotExemplo1)
print("\n")

#--------------------------------------------

#index = linhas
#columns = As colunas
pivotExemplo2 = baseLanchonete_DF.pivot(
    index="Cliente", columns="Data Venda", values="Preço com Desconto")

print("\n Imprimindo clientes / Preço com Desconto \n")
print(pivotExemplo2)
print("\n")