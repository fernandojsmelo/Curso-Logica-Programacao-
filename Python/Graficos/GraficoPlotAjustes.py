import pandas as pd
import matplotlib.pyplot as grafico

frutas_DF = pd.read_excel("Base_Grafico.xlsx")

print("\n DataFrame Frutas \n")
print(frutas_DF)
print("\n")

frutas = frutas_DF["Frutas"]
total = frutas_DF["Total Vendas"]

#plot = grafico de linhas
#label = Legenda
#linestyle = Estilo da linha -
#   https://matplotlib.org/stable/gallery/lines_bars_and_markers/linestyles.html
#lw = Largura da linha
grafico.plot(frutas_DF["Frutas"], frutas_DF["Total Vendas"],
             label="Total Vendas", linestyle="-", lw="2", color="g")
grafico.legend()                                 #Exibe a legenda
grafico.title("Vendas Frutas")                   #Título
grafico.xlabel("Nome das Frutas", size=20) #Descrição eixo x
grafico.ylabel("Total de Vendas", size=20) #Descrição eixo y
grafico.xticks([0,1,2,3,4])                      #Escala de números eixo x
grafico.yticks([0,20,40,60,80,100])              #Escala de números eixo y
grafico.axis(xmin=0, xmax=4, ymin=0, ymax=80)    #Define o minimo e maximo para
                                                 # o eixo x e y
grafico.axis("auto")                             #Ajusta o eixo x e y de forma automática
#grafico.annotate("Abacate", (0,10))             #Anotação
#grafico.annotate("Banana", (1,52))              #Anotação
grafico.annotate(total[0], (frutas[0],total[0]))
grafico.annotate(total[1], (frutas[1],total[1]))
grafico.annotate(total[2], (frutas[2],total[2]))
grafico.annotate(total[3], (frutas[3],total[3]))
grafico.annotate(total[4], (frutas[4],total[4]))
grafico.savefig("imagemGrafico.png")

#Cria e aprensenta o gráfico
grafico.show()
