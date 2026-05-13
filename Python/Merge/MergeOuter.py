import pandas as pd

vendasLoja1_DF = pd.read_excel("Outer_Vendas_Loja1.xlsx")

print("\n Vendas Loja 1 \n")
print(vendasLoja1_DF)
print("\n")

vendasLoja2_DF = pd.read_excel("Outer_Vendas_Loja2.xlsx")

print("\n Vendas Loja 2 \n")
print(vendasLoja2_DF)
print("\n")

#how = como
#on = coluna
verificandoVendas_DF = pd.merge(vendasLoja1_DF, vendasLoja2_DF,
                                on=["Id Vendedor"],
                                how="outer", suffixes=(" Loja 1", " Loja 2"))

print("\n Juntando dados com o outer e verificando os vendedores que venderam em ambas as lojas  \n")
print(verificandoVendas_DF)
print("\n")

#dropna = Deleta as linhas que tem pelo menos 1 valor vazio
tratandoDados_DF = verificandoVendas_DF.dropna()

print("\n Removendo linhas com NaN \n")
print(tratandoDados_DF)
print("\n")

del tratandoDados_DF["Vendedor Loja 2"]

print("\n Após remover coluna de Vendedor Loja 2 \n")
print(tratandoDados_DF)
print("\n")