import pandas as pd

baseVendas_DF = pd.read_excel("Base_Vendas.xlsx")

print("\n Imprimindo os dados \n")
print(baseVendas_DF)
print("\n")

#nunique = resumo dos itens, conta quando valores únicos
resumoValoresUnicos = baseVendas_DF.nunique()

print("\n Resumo valores unicos com o nunique \n")
print(resumoValoresUnicos)
print("\n")

#subset = indentifíca a coluna que queremos verificar a duplicidade
#keep = Controla como considerar o valor da duplicidade
#Primeiro, último ou o False
#first, last, False
confereDuplicidades = baseVendas_DF.duplicated(subset="Vendedor", keep="first")

print("\n Resumo valores únicos com o duplicated \n")
print(confereDuplicidades)
print("\n")


baseVendas_DF["Confere Duplicidade"] = baseVendas_DF.duplicated(
                                        subset="Vendedor", keep="first")
print("\n Com nova coluna com informação duplicada \n")
print(baseVendas_DF)
print("\n")

#drop_duplicates = removendo valores duplicados
removerDuplicidade = baseVendas_DF.drop_duplicates(
                                        subset="Vendedor", keep="first")
print("\n Após remover as duplicidades \n")
print(removerDuplicidade)
print("\n")
