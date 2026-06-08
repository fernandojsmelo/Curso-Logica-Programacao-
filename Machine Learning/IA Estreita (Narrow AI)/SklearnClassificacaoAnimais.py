# Importar a biblioteca de árvore de decisão
from sklearn import tree

# Características dos animais: [peso, altura]
caracteristicas = [

    [20, 50],  # Animal 1: Pesa 20kg, tem 50cm de altura (cachorro)
    [5, 25],   # Animal 2: Pesa 5kg, tem 25cm de altura (gato)
    [30, 60],  # Animal 3: Pesa 30kg, tem 60cm de altura (cachorro)
    [4, 20],   # Animal 4: Pesa 4kg, tem 20cm de altura (gato)
    [35, 70],  # Animal 5: Pesa 35kg, tem 70cm de altura (cachorro)
    [3, 18],   # Animal 6: Pesa 3kg, tem 18cm de altura (gato)
    [28, 55],  # Animal 7: Pesa 28kg, tem 55cm de altura (cachorro)
    [6, 30],   # Animal 8: Pesa 6kg, tem 30cm de altura (gato)

]

# Rótulos dos animais: 0 = Gato, 1 = Cachorro
rotulos = [

    1,  # Animal 1 é um Cachorro
    0,  # Animal 2 é um Gato
    1,  # Animal 3 é um Cachorro
    0,  # Animal 4 é um Gato
    1,  # Animal 5 é um Cachorro
    0,  # Animal 6 é um Gato
    1,  # Animal 7 é um Cachorro
    0   # Animal 8 é um Gato

]

# Criar uma instância do classificador de árvore de decisão
# usando a biblioteca tree do sklearn
classificador = tree.DecisionTreeClassifier()

# Treinar o classificador usando os dados fornecidos.
# O método `fit` ajusta o modelo aos dados de entrada (características)
# e rótulos (rótulos)
# características: Lista de listas onde cada sublista contém
# peso e altura de um animal
# rótulos: Lista contendo a classificação de cada
# animal (0 para gato, 1 para cachorro)
classificador = classificador.fit(caracteristicas, rotulos)

# Prever a categoria de um novo animal usando o modelo treinado
# O método `predict` é usado para determinar a
# classificação de novas observações
# Aqui estamos prevendo para um animal com 21kg de
# peso e 50cm de altura
previsao = classificador.predict([[5, 20]])

# Imprimir o resultado da previsão
# A função `print` mostrará o resultado na tela, onde `previsão` é
# uma lista de resultados preditos
print(previsao)

# Condicional para verificar o resultado da previsão e imprimir
# uma mensagem correspondente
# Se o resultado da previsão for 1 (o valor predito), indica
# que o animal é um cachorro
if previsao == 1:

    print("Este animal é um Cachorro!")

# Se o resultado da previsão for diferente de 1, neste caso será 0,
# indica que o animal é um gato
else:

    print("Este animal é um Gato!")