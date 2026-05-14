import pandas as pd

#https://docs.google.com/spreadsheets/d/1uxYa8NKhoPQVAO_LNqNWxyn30qn5S_qD/edit?usp=sharing&ouid=103286032416998039927&rtpof=true&sd=true

planilha_id = "1uxYa8NKhoPQVAO_LNqNWxyn30qn5S_qD"


dados_DF = pd.read_csv(f"https://docs.google.com/spreadsheets/d/{planilha_id}/export?format=csv")

print("\n DataFrame Google Sheets \n")
print(dados_DF)
print("\n")

"""
Exercicio

1 - Após carregar os dados, deixe somente as colunas de Vendedor e Total Vendas
2 - Com o groupby use a coluna de vendedor para criar um resumo do vendedor e a soma total das vendas
3 - Salve o dataFrame como um arquivo de Excel csv

Parece fácil, mas não é! Boa sorte!

"""

#drop = deletar
deletarDuasColunas = dados_DF.drop(columns=["Produto", "Data Venda"])

print("\n 1 - Após carregar os dados, deixe somente as colunas de Vendedor e Total Vendas \n")
print(deletarDuasColunas)
print("\n")

#2 - Com o groupby use a coluna de vendedor para criar um resumo do vendedor e a soma total das vendas

#Substituindo na coluna Total Vendas tudo que é vígula por ponto
deletarDuasColunas["Total Vendas"] = deletarDuasColunas["Total Vendas"].str.replace(",", ".")

#Convertendo a coluna de Total Vendas de Texo para Float
deletarDuasColunas["Total Vendas"] = deletarDuasColunas["Total Vendas"].astype(float)

groupbyVendedores = deletarDuasColunas.groupby(["Vendedor"]).sum()

print("\n 2 - Com o groupby use a coluna de vendedor para criar um resumo do vendedor e a soma total das vendas \n")
print(groupbyVendedores)
print("\n")

#3 - Salve o dataFrame como um arquivo de Excel csv

groupbyVendedores.to_csv("Resposta_Exercicio.csv")