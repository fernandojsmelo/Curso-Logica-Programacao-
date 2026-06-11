# Importação da biblioteca NumPy, utilizada para manipulação
# avançada de arrays e operações matemáticas.
import numpy as np

# Importação da biblioteca matplotlib.pyplot, utilizada
# para criar gráficos visuais dos dados.
import matplotlib.pyplot as plt

# Importação do módulo LinearRegression da biblioteca sklea1rn,
# usado para realizar regressões lineares.
from sklearn.linear_model import LinearRegression


# Define uma função chamada 'exibir_menu' que não recebe argumentos.
def exibir_menu():
    # Imprime uma linha em branco seguida de "Menu de Opções:"
    # para clareza visual no console.
    print("\nMenu de Opções:")

    # Imprime as opções disponíveis para o usuário, cada uma em
    # uma nova linha, com uma breve descrição:
    print("1 - Exibir os dados reais (metragem e preço)")
    print("2 - Exibir o gráfico de regressão linear")
    print("3 - Prever preço de uma casa com base na metragem")
    print("4 - Alterar os dados de metragem e preço")
    print("5 - Sair")

    # Solicita ao usuário que insira sua escolha com base
    # nas opções listadas acima.
    opcao = input("Escolha uma opção: ")

    # Retorna a opção escolhida pelo usuário como resultado da função.
    return opcao


# Define a função 'exibir_dados_reais' que aceita dois
# argumentos: 'metros_quadrados' e 'precos_casas'.
# Esses argumentos são esperados como arrays ou listas onde
# 'metros_quadrados' contém as áreas das casas
# e 'precos_casas' contém os preços correspondentes.
def exibir_dados_reais(metros_quadrados, precos_casas):
    # Imprime um cabeçalho para indicar que os dados exibidos a
    # seguir são os dados reais de metragem e preço das casas.
    print("\nDados Reais (Metragem e Preço):")

    # Inicia um loop que percorre cada elemento nos arrays
    # 'metros_quadrados' e 'precos_casas'.
    # A função 'len(metros_quadrados)' determina quantos elementos
    # existem na lista de metragens,
    # assumindo que o número de preços corresponde ao
    # número de metragens.
    for i in range(len(metros_quadrados)):
        # Imprime os detalhes de cada casa em uma nova linha. 'i + 1' é usado
        # para numerar as casas começando de 1 ao invés de 0.
        # 'metros_quadrados[i][0]' acessa o primeiro elemento do subarray no
        # índice 'i', assumindo que cada metragem
        # pode estar encapsulada dentro de um array ou uma lista.
        # '{precos_casas[i]:,.2f}' formata o preço da casa no índice 'i'
        # como um número flutuante com duas casas decimais,
        # incluindo separadores de milhar, para facilitar a leitura.
        print(f"Casa {i + 1}: {metros_quadrados[i][0]} m² - R$ {precos_casas[i]:,.2f}")


# Define a função 'exibir_grafico' que aceita os parâmetros
# 'metros_quadrados', 'precos_casas', 'modelo',
# e opcionalmente 'metros_prever' e 'previsao_preco'
# para adicionar pontos de previsão no gráfico.
def exibir_grafico(metros_quadrados,
                   precos_casas,
                   modelo,
                   metros_prever=None,
                   previsao_preco=None):
    # Configura as dimensões do gráfico (largura e altura em polegadas)
    # para garantir que o gráfico seja grande o suficiente
    # para ser legível.
    plt.figure(figsize=(10, 6))

    # Utiliza a função 'scatter' do matplotlib para criar
    # um gráfico de dispersão.
    # Este gráfico visualiza os pares de dados de metragem e
    # preço das casas.
    plt.scatter(

        # Eixo X: Representa a metragem das casas.
        metros_quadrados,

        # Eixo Y: Representa os preços correspondentes a cada metragem.
        precos_casas,

        # Define a cor azul para os pontos no gráfico.
        color='blue',

        # Legenda que descreve os pontos como dados reais de metragem vs preço.
        label='Dados Reais (Metragem vs Preço)',

        # Define o tamanho dos pontos no gráfico para 100 para
        # torná-los claramente visíveis.
        s=100

    )

    # Utiliza a função 'plot' para traçar a linha de regressão
    # linear sobre o gráfico de dispersão.
    # Esta linha representa a relação modelada entre a
    # metragem e o preço das casas.
    plt.plot(

        # Eixo X: Metragem das casas, os mesmos dados usados no gráfico de dispersão.
        metros_quadrados,

        # Eixo Y: Utiliza o modelo de regressão linear para prever os
        # preços baseados nas metragens.
        modelo.predict(metros_quadrados),

        # Define a cor vermelha para a linha, destacando-a sobre os pontos azuis.
        color='red',

        # Legenda que identifica a linha como representante das previsões do modelo.
        label='Linha de Regressão (Previsão)',

        # Ajusta a espessura da linha para 3, garantindo que seja facilmente distinta.
        linewidth=3

    )

    # Verifica se há dados específicos de metragem para previsão e o
    # preço previsto correspondente fornecidos como argumentos.
    if metros_prever is not None and previsao_preco is not None:
        # Adiciona um ponto de dispersão adicional para indicar a
        # previsão de preço para uma metragem específica.
        plt.scatter(

            # Eixo X: Metragem específica para a qual o preço foi previsto.
            metros_prever,

            # Eixo Y: Preço previsto pelo modelo para a metragem fornecida.
            previsao_preco,

            # Define a cor verde para o ponto, tornando-o distinto
            # dos pontos azuis de dados reais.
            color='green',

            # Legenda dinâmica mostrando a metragem e o preço previsto.
            label=f'Previsão para {metros_prever[0][0]} m²: R$ {previsao_preco[0]:,.2f}',

            # Utiliza um marcador em forma de 'x' para diferenciar este ponto.
            marker='x',

            # Define um tamanho maior para o marcador (200), garantindo
            # que ele se destaque no gráfico.
            s=200

        )

    # Configurações adicionais do gráfico para
    # melhorar a apresentação.
    # Define o título do gráfico.
    plt.title('Previsão de Preço de Casas pela Metragem usando Regressão Linear', fontsize=16)

    # Define o rótulo do eixo X.
    plt.xlabel('Metragem da Casa (m²)', fontsize=14)

    # Define o rótulo do eixo Y.
    plt.ylabel('Preço da Casa (R$)', fontsize=14)

    # Ativa a grade no gráfico para facilitar a
    # leitura dos valores.
    plt.grid(True)

    # Adiciona uma legenda no canto superior esquerdo e
    # ajusta seu tamanho.
    plt.legend(loc='upper left', fontsize=12)

    # Ajusta o layout para evitar sobreposições
    # de elementos gráficos.
    plt.tight_layout()

    # Exibe o gráfico configurado.
    plt.show()


# Define a função 'prever_preco' que aceita como parâmetro um
# modelo de regressão linear já treinado.
def prever_preco(modelo):
    # Solicita ao usuário que insira a metragem da casa para a
    # qual deseja prever o preço.
    # A entrada é convertida diretamente para um float, que é o
    # formato esperado pelo modelo para realizar previsões.
    metros_prever = float(input("Digite a metragem da casa para prever o preço: "))

    # Transforma a metragem inserida em um array numpy no
    # formato esperado pelo modelo.
    # O formato [[x]] é usado porque o modelo espera um array de
    # features (neste caso, metragem), onde cada
    # feature pode ter múltiplas amostras.
    metros_prever = np.array([[metros_prever]])

    # Utiliza o modelo para prever o preço com base na
    # metragem inserida.
    # 'modelo.predict()' é a função que aplica o modelo
    # treinado para gerar previsões.
    # Neste caso, gera uma previsão de preço para a
    # metragem fornecida.
    previsao_preco = modelo.predict(metros_prever)

    # Imprime o resultado da previsão, formatando o preço para
    # ter duas casas decimais e incluir separadores de milhar.
    # Isso melhora a legibilidade do preço previsto, especialmente
    # se os valores forem altos.
    print(f"\nPreço previsto para uma casa de {metros_prever[0][0]} metros quadrados: R$ {previsao_preco[0]:,.2f}")

    # Retorna os dados de metragem e o preço previsto.
    # Isso pode ser útil se esses dados precisarem ser usados
    # posteriormente no programa, por exemplo, para
    # serem plotados em um gráfico.
    return metros_prever, previsao_preco


# Define uma função chamada 'alterar_dados' que não recebe argumentos e
# permite ao usuário adicionar novas casas ao dataset.
def alterar_dados():
    # Solicita ao usuário o número de casas que deseja adicionar ao
    # dataset e converte a entrada em um inteiro.
    num_casas = int(input("Quantas casas você deseja adicionar? "))

    # Cria duas listas vazias: uma para armazenar as metragens das
    # casas e outra para os preços.
    metros_quadrados = []
    precos_casas = []

    # Um loop que itera com base no número de casas que o
    # usuário deseja adicionar.
    for i in range(num_casas):
        # Solicita ao usuário a metragem da casa atual no loop e
        # converte a entrada em um float.
        metros = float(input(f"Digite a metragem da casa {i + 1}: "))

        # Solicita ao usuário o preço da casa atual no loop e
        # converte a entrada em um float.
        preco = float(input(f"Digite o preço da casa {i + 1}: "))

        # Adiciona a metragem à lista 'metros_quadrados'. Note que a
        # metragem é armazenada como uma lista [metros],
        # isso é feito para compatibilidade com a entrada esperada por
        # muitos modelos de machine learning que requerem uma matriz bidimensional.
        metros_quadrados.append([metros])

        # Adiciona o preço à lista 'precos_casas'.
        precos_casas.append(preco)

    # Converte as listas 'metros_quadrados' e 'precos_casas' para arrays do numpy.
    # Isso é feito para facilitar manipulações matemáticas e operações
    # que podem ser realizadas pelo modelo de machine learning.
    return np.array(metros_quadrados), np.array(precos_casas)


# Dados iniciais (simulação)
# Esta seção define os arrays iniciais que contêm os dados de metragem e
# preço das casas. Esses dados são usados para treinar o
# modelo de regressão linear.

# Cria um array numpy para metragem das casas. Cada metragem está em um
# subarray, permitindo que a matriz seja usada diretamente em
# operações matemáticas e modelagem.
# A estrutura [[x], [y], ...] é adequada para uso em funções que esperam
# múltiplas amostras como entrada, cada uma com uma ou mais features.
metros_quadrados = np.array([

    [50],  # Metragem da primeira casa em metros quadrados.
    [60],  # Metragem da segunda casa.
    [75],  # Metragem da terceira casa.
    [100], # Metragem da quarta casa.
    [120], # Metragem da quinta casa.
    [150], # Metragem da sexta casa.
    [200], # Metragem da sétima casa.
    [220], # Metragem da oitava casa.
    [250], # Metragem da nona casa.
    [300]  # Metragem da décima casa.

])

# Cria um array numpy para os preços das casas correspondentes
# às metragens definidas no array 'metros_quadrados'.
# Os preços estão formatados como números inteiros simples,
# refletindo o valor de cada casa em reais.
precos_casas = np.array([

    150000,  # Preço da casa com 50 m².
    180000,  # Preço da casa com 60 m².
    225000,  # Preço da casa com 75 m².
    300000,  # Preço da casa com 100 m².
    360000,  # Preço da casa com 120 m².
    450000,  # Preço da casa com 150 m².
    600000,  # Preço da casa com 200 m².
    660000,  # Preço da casa com 220 m².
    750000,  # Preço da casa com 250 m².
    900000   # Preço da casa com 300 m².

])

# Cria uma instância do modelo de regressão linear usando a
# classe LinearRegression do scikit-learn.
# Esta classe fornece uma implementação eficiente de regressão
# linear que pode ser facilmente usada com dados em arrays numpy.
modelo = LinearRegression()

# Treina o modelo usando os dados de metragem quadrada e os
# preços das casas.
# O método 'fit' ajusta o modelo linear aos dados fornecidos,
# encontrando os coeficientes (inclinação e interceptação)
# que minimizam o erro quadrático.
modelo.fit(metros_quadrados, precos_casas)

# Inicia um loop infinito que continuará até que o usuário decida sair.
while True:

    # Chama a função 'exibir_menu' que imprime as opções do menu e
    # solicita ao usuário que escolha uma.
    opcao = exibir_menu()

    # Estrutura condicional que verifica a opção escolhida pelo
    # usuário e executa o bloco de código correspondente.
    if opcao == '1':

        # Se a opção 1 for escolhida, exibe os dados reais de
        # metragem e preços das casas.
        exibir_dados_reais(metros_quadrados, precos_casas)

    elif opcao == '2':

        # Se a opção 2 for escolhida, exibe um gráfico que mostra os
        # dados reais e a linha de regressão linear.
        exibir_grafico(metros_quadrados, precos_casas, modelo)

    elif opcao == '3':

        # Se a opção 3 for escolhida, solicita ao usuário que
        # forneça uma metragem para previsão de preço,
        # faz a previsão e exibe os dados junto com a
        # previsão em um gráfico.
        metros_prever, previsao_preco = prever_preco(modelo)
        exibir_grafico(metros_quadrados, precos_casas, modelo, metros_prever, previsao_preco)

    elif opcao == '4':

        # Se a opção 4 for escolhida, permite ao usuário alterar os
        # dados de metragem e preço das casas,
        # e então retreina o modelo com os novos dados.
        metros_quadrados, precos_casas = alterar_dados()
        modelo.fit(metros_quadrados, precos_casas)
        print("\nDados atualizados e modelo treinado com os novos dados.")

    elif opcao == '5':

        # Se a opção 5 for escolhida, imprime uma mensagem de
        # encerramento e termina o loop, encerrando o programa.
        print("Encerrando o programa.")
        break

    else:

        # Se nenhuma das opções válidas for escolhida, informa ao
        # usuário que a opção é inválida e repete o menu.
        print("Opção inválida! Por favor, escolha uma opção válida.")
