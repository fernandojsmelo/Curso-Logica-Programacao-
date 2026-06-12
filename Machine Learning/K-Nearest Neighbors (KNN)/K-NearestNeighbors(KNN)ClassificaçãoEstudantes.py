# Classificação de estudantes com base na nota e número de faltas para
# prever se o estudante será Aprovado ou Reprovado.

# Importando a biblioteca necessária para criar o modelo de
# classificação KNN (K-Nearest Neighbors)
# Essa biblioteca ajuda a realizar a classificação de dados com
# base próximo de amostras semelhantes
from sklearn.neighbors import KNeighborsClassifier

# Criando uma lista de dados onde cada sublista representa um estudante
# Cada estudante tem duas características: [nota, número de faltas]
# Os primeiros dados representam alunos aprovados, os últimos
# representam alunos reprovados.
dados = [

    # Alunos aprovados - notas acima ou iguais a 6, faltas moderadas
    [6.0, 5],  # Aluno com nota 6.0 e 5 faltas - Aprovado
    [6.5, 4],  # Aluno com nota 6.5 e 4 faltas - Aprovado
    [7.0, 2],  # Aluno com nota 7.0 e 2 faltas - Aprovado
    [7.5, 3],  # Aluno com nota 7.5 e 3 faltas - Aprovado
    [8.0, 3],  # Aluno com nota 8.0 e 3 faltas - Aprovado
    [8.5, 2],  # Aluno com nota 8.5 e 2 faltas - Aprovado
    [9.0, 1],  # Aluno com nota 9.0 e 1 falta - Aprovado
    [9.5, 0],  # Aluno com nota 9.5 e 0 faltas - Aprovado
    [10.0, 1], # Aluno com nota 10.0 e 1 falta - Aprovado

    # Alunos reprovados - notas abaixo de 6 ou alto número de faltas
    [2.5, 9],  # Aluno com nota 2.5 e 9 faltas - Reprovado
    [3.0, 10], # Aluno com nota 3.0 e 10 faltas - Reprovado
    [3.5, 9],  # Aluno com nota 3.5 e 9 faltas - Reprovado
    [4.0, 8],  # Aluno com nota 4.0 e 8 faltas - Reprovado
    [4.5, 7],  # Aluno com nota 4.5 e 7 faltas - Reprovado
    [5.0, 6],  # Aluno com nota 5.0 e 6 faltas - Reprovado
    [5.5, 5],  # Aluno com nota 5.5 e 5 faltas - Reprovado
    [5.5, 8],  # Aluno com nota 5.5 e 8 faltas - Reprovado
    [5.8, 4],  # Aluno com nota 5.8 e 4 faltas - Reprovado

]

# Lista de rótulos que correspondem a cada um dos estudantes
# do conjunto de dados
# Esses rótulos informam se o aluno foi 'Aprovado' ou 'Reprovado'
# com base nos dados fornecidos (nota e faltas)
rotulos = [

    # Aprovados
    "Aprovado", "Aprovado", "Aprovado", "Aprovado", "Aprovado", "Aprovado",
    "Aprovado", "Aprovado", "Aprovado",

    # Reprovados
    "Reprovado", "Reprovado", "Reprovado", "Reprovado", "Reprovado",
    "Reprovado", "Reprovado", "Reprovado", "Reprovado"

]

# Criando o classificador KNN com 3 vizinhos
# Inicializa um objeto da classe KNeighborsClassifier, especificando
# que o algoritmo deve considerar os 3 vizinhos mais próximos
# para realizar a classificação. Isso significa que o algoritmo
# vai olhar para os 3 estudantes mais próximos (em termos de nota e faltas)
# para decidir se um novo estudante é Aprovado ou Reprovado.
knn = KNeighborsClassifier(n_neighbors=3)

# Treinando o modelo com os dados
# O método .fit() é usado para ajustar o modelo aos dados fornecidos.
# Ele recebe dois argumentos principais:
# 1. dados: uma lista de listas onde cada sublista contém
# características de um estudante (nota e número de faltas).
# 2. rótulos: a lista de rótulos correspondentes que classificam
# cada amostra de 'dados' como 'Aprovado' ou 'Reprovado'.
# Este passo é essencial para que o modelo aprenda a relação
# entre as características dos estudantes e seus rótulos,
# permitindo que o classificador faça previsões acuradas sobre
# novos dados não vistos anteriormente.
knn.fit(dados, rotulos)


# Função para exibir o menu e permitir entrada do utilizador
def classificar_estudante():

    # Exibe uma mensagem inicial indicando a funcionalidade do menu
    print("\n--- Menu de Classificação de Estudante ---")

    # Tenta executar o bloco de código seguinte, que solicita e
    # processa as entradas do utilizador
    try:

        # solicitando a nota do aluno e convertendo a entrada
        # para um número decimal (float)
        nota = float(input("Digite a nota do aluno: "))

        # solicitando o número de faltas do aluno e convertendo a
        # entrada para um número inteiro (int)
        faltas = int(input("Digite o número de faltas do aluno: "))

        # Verifica se os valores inseridos são negativos, o que seria inválido
        if nota < 0 or faltas < 0:

            # Se algum valor for negativo, exibe uma mensagem de erro e
            # termina a função sem fazer a classificação
            print("Nota ou faltas não podem ser negativas. Tente novamente.")
            return

        # Prepara os dados do novo estudante em uma lista de listas,
        # que é o formato esperado pelo método predict()
        novo_estudante = [[nota, faltas]]

        # Faz a predição usando o modelo treinado para determinar se o
        # estudante está Aprovado ou Reprovado
        # O método predict() retorna uma lista com as classificações
        # previstas para cada entrada fornecida
        classe_predita = knn.predict(novo_estudante)

        # Exibe o resultado da classificação para o utilizador, acessando o
        # primeiro elemento da lista de resultados
        print(f"O aluno foi classificado como: {classe_predita[0]}")

    # Captura exceções relacionadas a valores de entrada inválidos, como
    # strings que não podem ser convertidas para números
    except ValueError:

        # Exibe uma mensagem pedindo ao utilizador que insira valores
        # válidos (apenas números)
        print("Por favor, insira valores válidos (números).")


# Função principal que orquestra a execução do programa
def main():

    # Um loop infinito que continua a executar até que o utilizador decida sair
    while True:

        # Chama a função 'classificar_estudante' para permitir ao
        # utilizador classificar um aluno.
        # Esta função solicita a entrada do utilizador para a nota e
        # número de faltas do aluno, realiza a classificação
        # com o modelo KNN, e exibe o resultado.
        classificar_estudante()

        # solicita ao utilizador a decisão de continuar ou não
        # classificando outros alunos.
        # A função input() captura a entrada do utilizador como uma string,
        # convertida para letras minúsculas com .lower()
        continuar = input("Deseja classificar outro aluno? (s/n): ").lower()

        # Verifica a resposta do utilizador para determinar se o
        # loop deve continuar ou não
        # Se o utilizador digitar qualquer coisa diferente de 's', o
        # loop é interrompido
        if continuar != 's':

            # Exibe uma mensagem informando que o programa
            # está a ser encerrado
            print("Encerrando o programa.")

            # O comando break é usado para sair do loop, terminando a
            # execução da função main e, por consequência, do programa
            break


# Executando a função main para iniciar o programa
main()