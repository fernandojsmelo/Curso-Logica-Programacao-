import pandas as pd

loja1_DF = pd.read_excel("Vendedores_Join_Full_Loja1.xlsx")

print("\n Vendedores Loja 1 \n")
print(loja1_DF)
print("\n")

loja2_DF = pd.read_excel("Vendedores_Join_Full_Loja2.xlsx")

print("\n Vendedores Loja 2 \n")
print(loja2_DF)
print("\n")

#--------------------------------------------

#Join Full - Uniu todos os arquivos

#concat = uni os arquivos
vendasLoja1e2_DF = pd.concat([loja1_DF, loja2_DF])

print("\n Junção das duas lojas \n")
print(vendasLoja1e2_DF)
print("\n")

#--------------------------------------------

semVendedoresDuplicados = vendasLoja1e2_DF.drop_duplicates(subset="Id Vendedor")

print("\n Lojas após remoção itens duplicados \n")
print(semVendedoresDuplicados)
print("\n")
