import pandas as pd
import matplotlib.pyplot as grafico

frutas_DF = pd.read_excel("Base_Grafico.xlsx")

print("\n DataFrame Frutas \n")
print(frutas_DF)
print("\n")

#Tamanho da figura podemos aumentar ou diminuir
figura = grafico.figure(figsize=(40,20))

frutas = frutas_DF["Frutas"]
total = frutas_DF["Total Vendas"]

#2 = linha, 3 = colunas, 1 = posição do grafico
#add_subplot = Adiciona um gráfico na parte de uma figura
figura.add_subplot(231)
grafico.plot(frutas, total, label="plot")
grafico.legend()
grafico.title("Gráfico 1")
grafico.annotate(frutas[0], (frutas[0], total[0]))
grafico.annotate(frutas[1], (frutas[1], total[1]))
grafico.annotate(frutas[2], (frutas[2], total[2]))
grafico.annotate(frutas[3], (frutas[3], total[3]))
grafico.annotate(frutas[4], (frutas[4], total[4]))
grafico.xticks([])

#----------------------------------------

#2 = linha, 3 = colunas, 2 = posição do grafico
#add_subplot = Adiciona um gráfico na parte de uma figura
figura.add_subplot(232)
grafico.bar(frutas, total, label="bar")
grafico.legend()
grafico.title("Gráfico 2")
grafico.annotate(frutas[0], (frutas[0], total[0]))
grafico.annotate(frutas[1], (frutas[1], total[1]))
grafico.annotate(frutas[2], (frutas[2], total[2]))
grafico.annotate(frutas[3], (frutas[3], total[3]))
grafico.annotate(frutas[4], (frutas[4], total[4]))
grafico.xticks([])

#----------------------------------------

#1 = linha, 3 = colunas, 3 = posição do grafico
#add_subplot = Adiciona um gráfico na parte de uma figura
figura.add_subplot(233)
grafico.pie(total, labels = frutas)
grafico.title("Gráfico 3")

#----------------------------------------

#2 = linha, 3 = colunas, 5 = posição do grafico
#add_subplot = Adiciona um gráfico na parte de uma figura
figura.add_subplot(235)
grafico.stem(frutas, total, label="stem")
grafico.legend()
grafico.title("Gráfico 4")
grafico.annotate(frutas[0], (frutas[0], total[0]))
grafico.annotate(frutas[1], (frutas[1], total[1]))
grafico.annotate(frutas[2], (frutas[2], total[2]))
grafico.annotate(frutas[3], (frutas[3], total[3]))
grafico.annotate(frutas[4], (frutas[4], total[4]))
grafico.xticks([])

grafico.savefig("figuraGrafico.png")

grafico.show()
