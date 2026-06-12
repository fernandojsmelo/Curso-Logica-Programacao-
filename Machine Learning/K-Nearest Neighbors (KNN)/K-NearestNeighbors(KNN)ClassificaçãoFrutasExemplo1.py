# Importando a classe KNeighborsClassifier da biblioteca sklearn.neighbors
# Esta classe é usada para realizar classificação utilizando o 
# algoritmo dos k-vizinhos mais próximos (K-NN)
from sklearn.neighbors import KNeighborsClassifier

# Definindo um conjunto de dados que representa diferentes 
# frutas com base em peso e textura
# Cada sublista contém duas características: peso em 
# gramas e textura (0 = lisa, 1 = irregular)
dados = [
    [145, 0],  # Maçã
    [150, 0],  # Maçã
    [155, 0],  # Maçã
    [160, 0],  # Maçã
    [165, 0],  # Maçã
    [170, 0],  # Maçã
    [175, 0],  # Maçã
    [180, 0],  # Maçã
    [185, 0],  # Maçã
    [190, 0],  # Maçã
    [195, 0],  # Maçã
    [200, 0],  # Maçã
    [205, 0],  # Maçã
    [210, 0],  # Maçã

    # Agora as Laranjas
    [145, 1],  # Laranja
    [150, 1],  # Laranja
    [155, 1],  # Laranja
    [160, 1],  # Laranja
    [165, 1],  # Laranja
    [170, 1],  # Laranja
    [175, 1],  # Laranja
    [180, 1],  # Laranja
    [185, 1],  # Laranja
    [190, 1],  # Laranja
    [195, 1],  # Laranja
    [200, 1],  # Laranja
    [205, 1],  # Laranja
    [210, 1]   # Laranja
]

# Definindo os rótulos para cada uma das amostras 
# definidas na lista 'dados'
# Esses rótulos são usados para informar ao modelo o 
# tipo de fruta correspondente a cada amostra
rotulos = [
    "Maçã", "Maçã", "Maçã", "Maçã", "Maçã", "Maçã", "Maçã", "Maçã", "Maçã",
    "Maçã", "Maçã", "Maçã", "Maçã", "Maçã",
    "Laranja", "Laranja", "Laranja", "Laranja", "Laranja", "Laranja", "Laranja",
    "Laranja", "Laranja", "Laranja", "Laranja", "Laranja", "Laranja", "Laranja"
]

# Criando uma instância do classificador KNN com 3 vizinhos
# O parâmetro n_neighbors=3 define que o modelo deve considerar 
# os 3 vizinhos mais próximos para fazer a classificação
knn = KNeighborsClassifier(n_neighbors=3)

# Treinando o modelo KNN com os dados de frutas e 
# seus respectivos rótulos
# O método .fit() ajusta o modelo aos dados fornecidos, 
# aprendendo a classificação
knn.fit(dados, rotulos)

# Definindo uma nova amostra para classificação, 
# representando uma nova fruta
# Neste caso, é uma fruta com 162 gramas e 
# textura irregular (1)
nova_fruta = [[162, 1]]

# Usando o modelo treinado para prever a classe da nova fruta
# O método .predict() é usado para determinar a 
# classificação de novas amostras
classe_predita = knn.predict(nova_fruta)

# Imprimindo o resultado da classificação
# Exibe a classe predita para a nova fruta, que pode 
# ser 'Maçã' ou 'Laranja' dependendo da
# proximidade com os vizinhos
print(f"A nova fruta é classificada como: {classe_predita[0]}")