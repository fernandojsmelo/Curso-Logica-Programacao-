import pandas as pd

vendas_DF = pd.read_excel("Groupby.xlsx")

print("\n DataFrame Vendas \n")
print(vendas_DF)
print("\n")

#groupby - Agrupas pela coluna de Vendedor e usando o mean para calcula a média
mediaVendedor = vendas_DF.groupby(["Vendedor"]).mean()

print("\n groupby - Agrupas pela coluna de Vendedor e usando o mean para calcula a média \n")
print(mediaVendedor)
print("\n")

#---------------------------------------------

somaVendedor = vendas_DF.groupby(["Vendedor"]).sum()

print("\n groupby - Agrupa pela coluna de Vendedor e usa o sum para calculas a soma \n")
print(somaVendedor)
print("\n")

#--------------------------------------------

#groupby = Agrupa pela coluna
#dropna = deleta as linhas que tem pelo menos um valor em brano
#by = usar a coluna como critério para fazer o groupby
#sum = soma
deixandoValoresEmBranco = vendas_DF.groupby(by=["Vendedor"], dropna=False).sum()

print("\n Agrupa pela coluna vendedor e considera valores em branco \n")
print(deixandoValoresEmBranco)
print("\n")

#---------------------------------------------

removendoValoresEmBranco = vendas_DF.groupby(by=["Vendedor"], dropna=True).sum()

print("\n Agrupa pela coluna vendedor e remove valores em branco \n")
print(removendoValoresEmBranco)
print("\n")

#--------------------------------------------

agrupaDuasColunas = vendas_DF.groupby(["Vendedor", "Produto"]).sum()

print("\n Agrupa pelas colunas de Vendedor e Produto e faz uma soma dos valores \n")
print(agrupaDuasColunas)
print("\n")

#--------------------------------------------

agrupaFrutasVendedor = vendas_DF.groupby(["Produto", "Vendedor"]).sum()

print("\n Agrupa pelas colunas de Produto e Vendedor e faz uma soma dos valores \n")
print(agrupaFrutasVendedor)
print("\n")

#--------------------------------------------

agrupaDataVendedor = vendas_DF.groupby(["Data Venda", "Vendedor"]).sum()

print("\n Agrupa pelas colunas de Data Venda e Vendedor e faz uma soma dos valores \n")
print(agrupaDataVendedor)
print("\n")