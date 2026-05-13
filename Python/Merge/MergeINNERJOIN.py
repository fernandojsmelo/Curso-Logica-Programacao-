import pandas as pd

loja1_DF = pd.read_excel("Vendas_INNER_JOIN_Loja1.xlsx")

print("\n Vendas Loja 1 \n")
print(loja1_DF)
print("\n")

loja2_DF = pd.read_excel("Vendas_INNER_JOIN_Loja2.xlsx")

print("\n Vendas Loja 2 \n")
print(loja2_DF)
print("\n")

#---------------------------------------------

#Inner = Faz o merge, entre as duas tabelas
#on = qual coluna
#how = como
vendedoresAmbasAsLojas_DF = pd.merge(loja1_DF, loja2_DF,
                                     on=["Vendedor"], how="inner")

#_x = Loja 1
#_y = Loja 2
print("\n Vendedores que venderam em ambas as lojas \n")
print(vendedoresAmbasAsLojas_DF)
print("\n")

#Exibiu o nome de todas as colunas
print(vendedoresAmbasAsLojas_DF.columns.values.tolist())

#------------------------------------------------------

#Inner = Faz o merge, entre as duas tabelas
#on = qual coluna
#how = como
#suffixes = Nome das colunas
vendedoresLojasResumo = pd.merge(loja1_DF, loja2_DF[["Vendedor", "Total Vendas"]],
                    on=["Vendedor"], how="inner", suffixes=(" Loja 1", " Loja 2"))

print("\n Vendedores que venderam em ambas as lojas Resumo\n")
print(vendedoresLojasResumo)
print("\n")

#------------------------------------------------------

#Inner = Faz o merge, entre as duas tabelas
#on = qual coluna
#how = como
#suffixes = Nome das colunas
resumo = vendedoresLojasResumo[["Vendedor",
                                "Total Vendas Loja 1", "Total Vendas Loja 2"]]

print("\n Vendedores que venderam em ambas as lojas Resumo\n")
print(resumo)
print("\n")