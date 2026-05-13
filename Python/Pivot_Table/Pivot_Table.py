import pandas as pd

baseLanchonete_DF = pd.read_excel("Vendas_Lanchonete_Pivot_Table.xlsx")

print("\n Imprimindo Dados \n")
print(baseLanchonete_DF)
print("\n")

#index = Linhas
#columns = Colunas
#values = Soma
#aggfunc = Tipo de calculo (sum - soma)
pivotExemplo1 = baseLanchonete_DF.pivot_table(
                index="Data Venda",
                columns="Cliente",
                values="Preço com Desconto",
                aggfunc="sum"
)

print("\n Imprimindo Data / Cliente / Preço com Desconto / Média \n")
print(pivotExemplo1)
print("\n")

#-------------------------------------------------

#index = Linhas
#columns = Colunas
#values = Soma
#aggfunc = Tipo de calculo (sum - soma)
pivotExemplo2 = baseLanchonete_DF.pivot_table(
    index="Cliente",
    columns="Data Venda",
    values="Preço com Desconto",
    aggfunc="sum"
)

print("\n Imprimindo Cliente / Data Venda / Preço com Desconto / Média \n")
print(pivotExemplo2)
print("\n")

#---------------------------------------------

#index = Linhas
#columns = Colunas
#values = Soma
#aggfunc = Tipo de calculo (sum - soma)
pivotExemplo3 = baseLanchonete_DF.pivot_table(
    index="Data Venda",
    columns="Cliente",
    values=["Preço Total", "Preço com Desconto"],
    aggfunc="sum"
)

print("\n Imprimindo com Cliente / Preço Total e Preço com Desconto \n")
print(pivotExemplo3)
print("\n")

#-------------------------------------------------

#index = Linhas
#columns = Colunas
#values = Soma
#aggfunc = Tipo de calculo (sum - soma)
pivotExemplo4 = baseLanchonete_DF.pivot_table(
    index="Data Venda",
    columns=["Cliente", "Produto"],
    values=["Preço Total", "Preço com Desconto"],
    aggfunc="sum"
)

print("\n Imprimindo com Cliente, Produto e Preço com Desconto \n")
print(pivotExemplo4)
print("\n")

#-------------------------------------------------

#index = Linhas
#columns = Colunas
#values = Soma
#aggfunc = Tipo de calculo (sum - soma)

#fillna - Preenche os valores vazios com algum valor
pivotExemplo4["Preço com Desconto"] = pivotExemplo4["Preço com Desconto"].fillna(0)
pivotExemplo4["Preço Total"] = pivotExemplo4["Preço Total"].fillna(0)



print("\n Trata NaN por ZERO \n")
print(pivotExemplo4)
print("\n")