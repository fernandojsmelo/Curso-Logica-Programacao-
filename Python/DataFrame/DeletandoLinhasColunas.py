import pandas as pd

dataFrameDados = pd.read_excel("Deletar_Linhas_Colunas.xlsx")
print(dataFrameDados)
print("\n")
print(type(dataFrameDados))
print("\n")

#dropna = Deleta linhas que tenham pelo menos 1 valor vazio
deletandoLinhasEmBranco = dataFrameDados.dropna()

print("\ndropna = Deleta linhas que tenham pelo menos 1 valor vazio\n")
print(deletandoLinhasEmBranco)
print("\n")


del deletandoLinhasEmBranco["Produto"]

print("\ndel = Deletou a coluna de Produto\n")
print(deletandoLinhasEmBranco)
print("\n")

#drop = Usamos para deletar as colunas
deletarDuasColunas = deletandoLinhasEmBranco.drop(
    columns=["Data Venda", "Total Vendas"]
)

print("\ndrop = Usamos para deletar as colunas Data Venda e Total Vendas\n")
print(deletarDuasColunas)
print("\n")

#axis = eixo(1 - Coluna, 0 - Linha)
excluirLinha3 = deletarDuasColunas.drop(2, axis=0)

print("\nExcluindo a linha 3\n")
print(excluirLinha3)
print("\n")

#axis = eixo(1 - Coluna, 0 - Linha)
excluirMaisLinhas = excluirLinha3.drop([0,1])

print("\nExcluindo linhas 0 e 1 \n")
print(excluirMaisLinhas)
print("\n")