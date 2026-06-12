# Importa a biblioteca tkinter, que é usada para criar
# ‘interfaces’ gráficas de utilizador (GUI) em Python.
import tkinter as tk

# Importa o módulo ttk da biblioteca tkinter que fornece
# acesso a estilos de widgets temáticos para Tk.
from tkinter import ttk

# Importa a classe KNeighborsClassifier da biblioteca sklearn.neighbors,
# que implementa o algoritmo dos k-vizinhos mais próximos.
from sklearn.neighbors import KNeighborsClassifier

# Dados organizados em ordem crescente de nota e faltas,
# separando alunos aprovados e reprovados.
dados = [

    # Aprovados
    [6.0, 5],  # Aluno aprovado com nota 6.0 e 5 faltas
    [6.5, 4],  # Aluno aprovado com nota 6.5 e 4 faltas
    [7.0, 2],  # Aluno aprovado com nota 7.0 e 2 faltas
    [7.5, 3],  # Aluno aprovado com nota 7.5 e 3 faltas
    [8.0, 3],  # Aluno aprovado com nota 8.0 e 3 faltas
    [8.5, 2],  # Aluno aprovado com nota 8.5 e 2 faltas
    [9.0, 1],  # Aluno aprovado com nota 9.0 e 1 falta
    [9.5, 0],  # Aluno aprovado com nota 9.5 e sem faltas
    [10.0, 1], # Aluno aprovado com nota 10.0 e 1 falta

    # Reprovados
    [2.5, 9],  # Aluno reprovado com nota 2.5 e 9 faltas
    [3.0, 10], # Aluno reprovado com nota 3.0 e 10 faltas
    [3.5, 9],  # Aluno reprovado com nota 3.5 e 9 faltas
    [4.0, 8],  # Aluno reprovado com nota 4.0 e 8 faltas
    [4.5, 7],  # Aluno reprovado com nota 4.5 e 7 faltas
    [5.0, 6],  # Aluno reprovado com nota 5.0 e 6 faltas
    [5.5, 5],  # Aluno reprovado com nota 5.5 e 5 faltas
    [5.5, 8],  # Aluno reprovado com nota 5.5 e 8 faltas
    [5.8, 4]   # Aluno reprovado com nota 5.8 e 4 faltas

]

# Lista de rótulos correspondendo aos dados, cada rótulo
# descreve se o aluno está Aprovado ou Reprovado.
rotulos = [

    # Aprovados
    "Aprovado", "Aprovado", "Aprovado", "Aprovado", "Aprovado",
    "Aprovado", "Aprovado", "Aprovado", "Aprovado",

    # Reprovados
    "Reprovado", "Reprovado", "Reprovado", "Reprovado", "Reprovado",
    "Reprovado", "Reprovado", "Reprovado", "Reprovado"

]

# Criando o classificador KNN com 3 vizinhos
# A linha abaixo inicializa uma instância do classificador
# KNeighborsClassifier do módulo sklearn.neighbors.
# O parâmetro `n_neighbors=3` especifica que o algoritmo deve
# considerar os três vizinhos mais próximos de um ponto de dados
# quando for realizar a classificação. Esse número de
# vizinhos é uma escolha que pode afetar significativamente
# a precisão do modelo, sendo um parâmetro que pode ser
# ajustado conforme a necessidade de se obter melhores resultados.
knn = KNeighborsClassifier(n_neighbors=3)

# Treinando o modelo com os dados e rótulos fornecidos
# O método `fit` é usado para treinar o modelo utilizando
# os `dados` e `rotulos` especificados anteriormente.
# `dados` consiste em uma lista de listas onde cada sublista
# contém duas características de um aluno: sua nota e o
# número de faltas.
# `rotulos` contém a classificação correspondente para cada aluno,
# indicando se ele foi 'Aprovado' ou 'Reprovado'.
# O treinamento envolve o algoritmo aprendendo a partir desses
# dados para que possa fazer previsões precisas
# sobre novos dados não vistos.
knn.fit(dados, rotulos)


# Definição da função que será chamada ao pressionar o botão
# de classificação na ‘interface’ gráfica
def prever_classificacao():
    try:
        # Tentativa de obter os valores inseridos pelo utilizador nas
        # caixas de entrada da ‘interface’ gráfica.

        # A função `get()` recupera o texto atual do widget de
        # entrada como uma string.
        # Converte a entrada de texto para um float (nota).
        nota = float(entrada_nota.get())

        # Converte a entrada de texto para um int (número de faltas).
        faltas = int(entrada_faltas.get())

        # Verifica se os valores são menores que zero, o que
        # seria inválido para nota ou número de faltas.
        if nota < 0 or faltas < 0:
            # Configura o texto do rótulo de resultado para mostrar
            # uma mensagem de erro com vermelho.
            rotulo_resultado.config(text="Nota ou faltas não podem ser negativas.", fg="red")

            # Sai da função sem fazer a previsão, pois os
            # dados são inválidos.
            return

        # Preparação dos dados do novo estudante para a previsão.
        # Coloca a nota e faltas em uma lista aninhada para
        # compatibilidade com o modelo.
        novo_estudante = [[nota, faltas]]

        # Realiza a previsão usando o modelo KNN.
        # `predict()` retorna a classe prevista para os dados fornecidos.
        classe_predita = knn.predict(novo_estudante)

        # Configura o texto do rótulo de resultado para mostrar a
        # classificação prevista com a cor correspondente.
        # Se a previsão for "Aprovado", o texto será verde, se
        # for "Reprovado", será vermelho.
        rotulo_resultado.config(text=f"Classificação: {classe_predita[0]}",
                                fg="green" if classe_predita[0] == "Aprovado" else "red")

    # Captura a exceção ValueError que ocorre se as entradas
    # não puderem ser convertidas para números.
    except ValueError:

        # Configura o rótulo de resultado para indicar que as
        # entradas devem ser numéricas, com vermelho.
        rotulo_resultado.config(text="Por favor, insira valores numéricos válidos.", fg="red")


# Cria uma nova instância da janela principal para a aplicação.
janela = tk.Tk()

# Define o título da janela, que é exibido na barra de título.
janela.title("Exercício Classificação de Alunos - KNN")

# Estabelece as dimensões da janela principal: 450 pixels
# de largura por 350 pixels de altura.
janela.geometry("550x350")

# Configura a cor de fundo da janela principal utilizando um
# código de cor hexadecimal para cinza claro.
janela.configure(bg="#f0f0f0")

# Cria um objeto de estilo que será usado para modificar os
# widgets ttk dentro da aplicação.
estilo = ttk.Style()

# Define o estilo para todos os rótulos (TLabel) na aplicação,
# configurando a fonte como Arial tamanho 16 e o fundo cinza claro.
estilo.configure("TLabel",
                 font=("Arial", 16),
                 background="#f0f0f0")

# Define o estilo para todos os botões (TButton) na aplicação,
# especificando a fonte Arial tamanho 16 e um padding
# de 5 pixels para espaço interno.
estilo.configure("TButton",
                 font=("Arial", 16),
                 padding=5)

# Configura o estilo para todas as caixas de entrada (TEntry),
# definindo a fonte como Arial tamanho 16.
estilo.configure("TEntry",
                 font=("Arial", 16))

# Criando um 'Frame', que é um contêiner dentro da janela
# principal para agrupar e organizar visualmente outros widgets.
# 'padding=20' adiciona espaço interno de 20 pixels para
# separar o conteúdo das bordas do quadro.
# 'relief="solid"' define o estilo da borda do quadro como
# sólida, dando um contorno mais definido.
# 'borderwidth=2' define a largura da borda do quadro como 2 pixels.
quadro = ttk.Frame(janela,
                   padding=20,
                   relief="solid",
                   borderwidth=2)

# Posiciona o quadro dentro da janela principal.
# 'pady=20' adiciona espaço vertical de 20 pixels acima e abaixo
# do quadro para separá-lo de outros elementos.
quadro.pack(pady=20)

# Cria um rótulo dentro do quadro, usado para exibir texto ou imagens.
# 'text="Classificação de Alunos"' define o texto que será exibido no rótulo.
# 'font=("Arial", 16, "bold")' define a fonte do texto como Arial,
# tamanho 16 e em negrito, tornando-o mais visível.
rotulo_titulo = ttk.Label(quadro,
                          text="Classificação de Alunos",
                          font=("Arial", 16, "bold"))

# Organiza o rótulo dentro do quadro utilizando o método grid, que
# permite um posicionamento preciso em linhas e colunas.
# 'row=0' e 'column=0' posicionam o rótulo na primeira linha e
# primeira coluna do grid dentro do quadro.
# 'columnspan=2' faz com que o rótulo se estenda por duas
# colunas do grid, permitindo que ocupe mais espaço horizontalmente.
# 'pady=10' adiciona espaço vertical de 10 pixels acima e
# abaixo do rótulo para separá-lo de outros elementos.
rotulo_titulo.grid(row=0,
                   column=0,
                   columnspan=2, pady=10)

# Cria um rótulo dentro do quadro para indicar onde o utilizador
# deve inserir a nota do aluno.
# 'text="Nota do aluno:"' define o texto que erá exibido,
# orientando o utilizador sobre o que aquele campo representa.
rotulo_nota = ttk.Label(quadro, text="Nota do aluno:")

# Organiza o rótulo dentro do quadro usando o método grid.
# 'row=1' posiciona o rótulo na segunda linha do grid (a contagem começa em 0).
# 'column=0' posiciona o rótulo na primeira coluna do grid.
# 'padx=10' adiciona um espaço horizontal de 10 pixels à
# esquerda e à direita do rótulo.
# 'pady=5' adiciona um espaço vertical de 5 pixels acima e
# abaixo do rótulo.
# 'sticky="e"' faz com que o rótulo alinhe à direita dentro de
# sua célula no grid, 'e' significa 'east' (leste).
rotulo_nota.grid(row=1,
                 column=0,
                 padx=10,
                 pady=5,
                 sticky="e")

# Cria uma caixa de entrada para que o utilizador possa
# digitar a nota do aluno.
# Esta caixa de entrada será usada para capturar a
# nota digitada pelo utilizador.
entrada_nota = ttk.Entry(quadro, font=("Arial", 16))

# Organiza a caixa de entrada dentro do quadro usando o método grid.
# 'row=1' posiciona a caixa na segunda linha do grid,
# alinhando-a horizontalmente com o rótulo da nota.
# 'column=1' posiciona a caixa na segunda coluna do grid,
# ao lado do rótulo da nota.
# 'padx=10' adiciona um espaço horizontal de 10 pixels à
# esquerda e à direita da caixa de entrada.
# 'pady=5' adiciona um espaço vertical de 5 pixels acima e
# abaixo da caixa de entrada.
entrada_nota.grid(row=1,
                  column=1,
                  padx=10,
                  pady=5)

# Cria um rótulo dentro do quadro para indicar onde o utilizador
# deve inserir o número de faltas do aluno.
# 'text="Número de faltas:"' define o texto que será exibido,
# orientando o utilizador sobre o que aquele campo representa.
rotulo_faltas = ttk.Label(quadro,
                          text="Número de faltas:")

# Organiza o rótulo dentro do quadro usando o método grid.
# 'row=2' posiciona o rótulo na terceira linha do grid (a contagem
# começa em 0), garantindo que ele esteja alinhado verticalmente
# abaixo do rótulo da nota.
# 'column=0' posiciona o rótulo na primeira coluna do grid.
# 'padx=10' adiciona um espaço horizontal de 10 pixels à esquerda e à
# direita do rótulo, ajudando a manter um espaçamento uniforme
# entre os widgets.
# 'pady=5' adiciona um espaço vertical de 5 pixels acima e abaixo do
# rótulo, mantendo a interface visualmente organizada.
# 'sticky="e"' faz com que o rótulo alinhe à direita dentro de sua
# célula no grid, 'e' significa 'east' (leste), o que ajuda a
# manter uma aparência alinhada com outros rótulos.
rotulo_faltas.grid(row=2,
                   column=0,
                   padx=10,
                   pady=5,
                   sticky="e")

# Cria uma caixa de entrada para que o utilizador possa
# digitar o número de faltas do aluno.
# Esta caixa será usada para capturar a quantidade de faltas
# digitadas pelo utilizador.
entrada_faltas = ttk.Entry(quadro, font=("Arial", 16))

# Organiza a caixa de entrada dentro do quadro usando o método grid.
# 'row=2' posiciona a caixa na terceira linha do grid, alinhando-a
# horizontalmente com o rótulo de faltas e verticalmente
# abaixo da caixa de entrada da nota.
# 'column=1' posiciona a caixa na segunda coluna do grid, ao
# lado do rótulo de faltas.
# 'padx=10' adiciona um espaço horizontal de 10 pixels à esquerda e à
# direita da caixa de entrada, contribuindo para uma separação
# clara entre os campos de entrada.
# 'pady=5' adiciona um espaço vertical de 5 pixels acima e abaixo da
# caixa de entrada, ajudando a separar visualmente os campos
# de entrada para diferentes dados.
entrada_faltas.grid(row=2,
                    column=1,
                    padx=10,
                    pady=5)

# Cria um botão dentro do quadro que permitirá ao utilizador
# executar a classificação do aluno.
# 'text="Classificar"' define o texto que aparecerá no botão,
# orientando o utilizador sobre sua função.
# 'command=prever_classificacao' associa este botão à função
# 'prever_classificacao', que será chamada quando o
# botão for pressionado.
# Esta função é responsável por coletar as entradas, processar a
# classificação usando o modelo KNN, e exibir o resultado.
botao_classificar = ttk.Button(quadro,
                               text="Classificar",
                               command=prever_classificacao)

# Posiciona o botão dentro do quadro usando o método grid.
# 'row=3' posiciona o botão na quarta linha do grid, garantindo que
# ele esteja alinhado verticalmente abaixo das caixas de entrada.
# 'column=0' posiciona o botão começando na primeira coluna.
# 'columnspan=2' faz com que o botão se estenda por duas colunas,
# ocupando todo o espaço horizontal disponível sob as caixas
# de entrada, o que centraliza visualmente o botão.
# 'pady=10' adiciona espaço vertical de 10 pixels acima e abaixo do
# botão, criando um espaçamento adequado entre o botão e
# outros elementos, facilitando a interação.
botao_classificar.grid(row=3,
                       column=0,
                       columnspan=2,
                       pady=10)

# Cria um rótulo (Label) dentro do quadro para exibir o
# resultado da classificação do aluno.
# 'text=""' inicialmente o texto do rótulo é vazio porque será
# atualizado dinamicamente após a classificação.
# 'font=("Arial", 16, "bold")' define a fonte do texto no rótulo
# como Arial, tamanho 16, em negrito para destacar o resultado.
# 'bg="#f0f0f0"' define a cor de fundo do rótulo para combinar com o
# fundo do quadro, mantendo a consistência visual da ‘interface’.
rotulo_resultado = tk.Label(quadro,
                            text="",
                            font=("Arial", 16, "bold"),
                            bg="#f0f0f0")

# Posiciona o rótulo dentro do quadro usando o método grid, que
# permite um controle preciso sobre a localização dos widgets.
# 'row=4' posiciona o rótulo na quinta linha do grid, garantindo que ele
# esteja alinhado verticalmente abaixo do botão de classificação.
# 'column=0' posiciona o rótulo começando na primeira coluna.
# 'columnspan=2' faz com que o rótulo se estenda por duas colunas,
# ocupando todo o espaço horizontal disponível sob o botão, o
# que ajuda na centralização do texto do resultado.
# 'pady=10' adiciona um espaço vertical de 10 pixels acima e abaixo do
# rótulo, separando-o visualmente de outros elementos e
# facilitando a leitura do resultado.
rotulo_resultado.grid(row=4,
                      column=0,
                      columnspan=2,
                      pady=10)

# Executando o loop principal do Tkinter
janela.mainloop()
