import pandas as pd
import matplotlib.pyplot as grafico

frutas_DF = pd.read_excel("Base_Grafico.xlsx")

print("\n DataFrame Frutas \n")
print(frutas_DF)
print("\n")

#plot = grafico de linhas
grafico.plot(frutas_DF["Frutas"], frutas_DF["Total Vendas"])
grafico.title("Vendas Frutas")    #Título
grafico.xlabel("Nome das Frutas") #Descrição eixo x
grafico.ylabel("Total de Vendas") #Descrição eixo y

#Cria e aprensenta o gráfico
grafico.show()
