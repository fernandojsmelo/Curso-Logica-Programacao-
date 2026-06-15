# Importando os módulos necessários para construir a interface
# gráfica e para realizar classificação usando um modelo de floresta aleatória.

# Tkinter para a interface gráfica do usuário.
import tkinter as tk

# Themed Tkinter para widgets com temas.
from tkinter import ttk

# Importando RandomForestClassifier de sklearn para modelagem preditiva.
from sklearn.ensemble import RandomForestClassifier

# Definindo os dados de plantas, com cada lista representando
# características específicas de diferentes tipos de plantas.
# As características incluem Altura em metros, presença de
# folhas (1 para sim, 0 para não), e se precisa de
# muita água (1 para sim, 0 para não).
# Altura, Folhas, Agua
dados = [

    # Dados para flores, geralmente menores em altura e
    # necessitando de folhas e muita água.
    [0.5, 1, 1], [0.6, 1, 1], [0.7, 1, 1], [0.8, 1, 1], [0.9, 1, 1],

    # Dados para árvores, caracterizadas por alturas maiores,
    # presença de folhas, e variável necessidade de água.
    [10, 1, 1], [12, 1, 1], [15, 1, 1], [20, 1, 0], [25, 1, 0],

    # Dados para cactos, que tendem a ser mais baixos, sem
    # folhas e com baixa necessidade de água.
    [1.0, 0, 0], [1.2, 0, 0], [0.8, 0, 0], [0.9, 0, 0], [1.5, 0, 0]

]

# Definindo os rótulos correspondentes a cada conjunto
# de dados de plantas.
# Cada rótulo descreve o tipo da planta, associando cada
# conjunto de características definidas anteriormente
# com uma categoria específica.
rotulos = [

    # Rótulos para Flores, onde cada 'Flor' corresponde a uma
    # entrada na lista 'dados' para flores.
    "Flor", "Flor", "Flor", "Flor", "Flor",

    # Rótulos para Árvores, onde cada 'Árvore' corresponde a
    # uma entrada na lista 'dados' para árvores.
    "Árvore", "Árvore", "Árvore", "Árvore", "Árvore",

    # Rótulos para Cactos, onde cada 'Cacto' corresponde a
    # uma entrada na lista 'dados' para cactos.
    "Cacto", "Cacto", "Cacto", "Cacto", "Cacto"

]

# Criando um classificador usando o modelo de Random
# Forest (Floresta Aleatória).
# Random Forest é um método de aprendizado de máquina que opera
# construindo uma multiplicidade de árvores de decisão durante o
# treinamento e produzindo a classe que é a moda das
# classes (classificação) das árvores individuais.
# 'n_estimators=10' especifica o número de árvores na floresta.
clf = RandomForestClassifier(n_estimators=10)

# Treinando o classificador com os dados e rótulos fornecidos.
clf.fit(dados, rotulos)


# Definindo a função que será chamada quando o usuário clicar
# no botão "Classificar" na interface.
def prever_planta():
    try:
        # Tentativa de executar o código a seguir, que pode lançar
        # um ValueError se a conversão de tipos falhar.

        # Obtendo os valores inseridos pelo usuário através dos
        # campos de entrada na interface gráfica.
        # Convertendo o valor do campo 'entrada_altura' para um
        # número flutuante, pois a altura pode ser um número decimal.
        altura = float(entrada_altura.get())

        # Convertendo a resposta textual do campo 'entrada_folhas'
        # para um valor binário.
        # A expressão condicional verifica se a entrada é "sim",
        # considerando qualquer capitalização, e
        # atribui 1 se verdadeiro, 0 se falso.
        tem_folhas = 1 if entrada_folhas.get().lower() == "sim" else 0

        # Similarmente, convertendo a entrada de 'entrada_agua'
        # para um valor binário com base em se a resposta é "sim".
        muita_agua = 1 if entrada_agua.get().lower() == "sim" else 0

        # Verificando a validade dos valores inseridos. No caso
        # da altura, ela não pode ser negativa.
        if altura < 0:
            # Configurando o rótulo de resultado para mostrar uma
            # mensagem de erro em vermelho, indicando o problema.
            rotulo_resultado.config(text="Altura não pode ser negativa.", fg="red")

            # Interrompendo a execução da função para evitar que a
            # previsão seja feita com dados inválidos.
            return

        # Preparando a lista de características da planta para a
        # previsão usando o modelo treinado.
        nova_planta = [[altura, tem_folhas, muita_agua]]

        # Usando o modelo de floresta aleatória para prever o tipo
        # de planta com base nas características fornecidas.
        tipo_predito = clf.predict(nova_planta)

        # Atualizando o rótulo de resultado para exibir o tipo de planta
        # previsto, em verde, indicando uma operação bem-sucedida.
        rotulo_resultado.config(text=f"Classificação: {tipo_predito[0]}", fg="green")

    except ValueError:

        # Caso ocorra um ValueError durante a conversão dos valores
        # de entrada, exibir uma mensagem de erro.
        rotulo_resultado.config(text="Por favor, insira valores numéricos válidos.", fg="red")


# Inicializando a janela principal da aplicação
# usando a biblioteca tkinter.
janela = tk.Tk()

# Definindo o título da janela, que aparece na barra de
# título da janela do aplicativo.
janela.title("Classificação de Plantas - Random Forest")

# Configurando o tamanho da janela principal. A função 'geometry'
# permite especificar a largura e a altura da janela em pixels.
janela.geometry("450x300")  # Define a janela para ter 400 pixels de largura e 300 pixels de altura.

# Configurando a cor de fundo da janela principal.
# O argumento 'bg' é usado para definir a cor do fundo.
# Aqui, '#f0f0f0' é uma cor cinza claro, que é suave para os
# olhos e proporciona um fundo neutro para os widgets.
janela.configure(bg="#f0f0f0")

# Criando um quadro (Frame) dentro da janela principal que
# ajudará a organizar visualmente os widgets (como rótulos,
# campos de entrada e botões).
# Um quadro pode conter múltiplos widgets e é útil para agrupar
# elementos relacionados na interface.
quadro = ttk.Frame(janela, padding=20, relief="solid", borderwidth=2)
# O argumento 'padding=20' adiciona espaço interno de 20 pixels em
# torno de todos os lados dentro do quadro, evitando que os
# widgets fiquem muito apertados.
# O argumento 'relief="solid"' define o estilo da borda do quadro,
# neste caso, uma borda sólida que dá uma delimitação
# clara para o quadro.
# O argumento 'borderwidth=2' define a largura da borda do quadro,
# tornando-o mais visível e distinto dentro da janela.

# Posicionando o quadro dentro da janela principal. O método 'pack' é
# um gerenciador de geometria que organiza widgets em blocos
# antes de colocá-los na janela.
# O argumento 'pady=20' adiciona espaço vertical de 20 pixels acima e
# abaixo do quadro para separá-lo de outros elementos
# presentes na janela.
quadro.pack(pady=20)

# Criando um rótulo 'Label' dentro do quadro que foi
# definido na janela principal.
# Este rótulo é usado para exibir o título da seção ou da aplicação.
# 'text="Classificação de Plantas"' define o texto que será exibido
# no rótulo, informando aos usuários sobre o propósito da interface.
rotulo_titulo = ttk.Label(quadro, text="Classificação de Plantas",
                          font=("Arial", 14, "bold"))
# O parâmetro 'font' configura a fonte do texto, usando Arial de
# tamanho 14 em negrito para dar destaque e clareza visual ao título.

# Posicionando o rótulo 'rotulo_titulo' dentro do 'quadro' usando o
# gerenciador de geometria 'grid'.
# O método 'grid' é utilizado para posicionar widgets em uma matriz
# baseada em linhas e colunas.
# 'row=0' coloca o rótulo na primeira linha da grade, tornando-o o
# elemento superior dentro do quadro.
# 'column=0' inicia o posicionamento do rótulo na primeira coluna.
# 'columnspan=2' permite que o rótulo se estenda por duas colunas,
# garantindo que ele seja centralizado e ocupe uma largura
# adequada dentro do quadro.
# 'pady=10' adiciona um espaçamento vertical de 10 pixels acima e
# abaixo do rótulo. Este espaçamento ajuda a separar visualmente o
# título dos outros elementos na interface, evitando que o texto
# fique muito próximo dos widgets abaixo dele.
rotulo_titulo.grid(row=0, column=0, columnspan=2, pady=10)

# Criando um rótulo 'Label' dentro do quadro para identificar o
# campo de entrada onde os usuários especificarão a altura da planta.
# 'text="Altura da planta (em metros):"' fornece instruções claras
# sobre como o usuário deve responder, indicando a unidade
# de medida esperada (metros).
rotulo_altura = ttk.Label(quadro, text="Altura da planta (em metros):")

# Posicionando o rótulo 'rotulo_altura' dentro do 'quadro'
# usando o gerenciador de geometria 'grid'.
# 'row=1' coloca o rótulo na segunda linha da interface,
# organizando-o verticalmente após o título.
# 'column=0' coloca o rótulo na primeira coluna.
# 'padx=10' adiciona um espaçamento horizontal de 10 pixels ao
# lado do rótulo para evitar que ele fique muito próximo
# dos componentes adjacentes.
# 'pady=5' adiciona um espaçamento vertical de 5 pixels acima e
# abaixo do rótulo, proporcionando uma separação clara
# entre os elementos da interface.
# 'sticky="e"' garante que o rótulo esteja alinhado à direita (leste)
# dentro de sua célula na grade, direcionando a atenção
# do usuário para o campo de entrada ao lado.
rotulo_altura.grid(row=1, column=0, padx=10, pady=5, sticky="e")

# Criando um campo de entrada 'Entry' para que os usuários
# possam inserir a altura da planta.
# Este campo permite a digitação de texto, que será interpretado em
# outra parte do código para determinar a altura em metros.
entrada_altura = ttk.Entry(quadro)

# Posicionando o campo de entrada 'entrada_altura' na interface.
# 'row=1' assegura que o campo de entrada está alinhado horizontalmente
# com o rótulo correspondente, facilitando a associação entre o
# rótulo e o campo para os usuários.
# 'column=1' coloca o campo de entrada diretamente ao lado do rótulo na
# segunda coluna, mantendo a organização e a lógica de
# interação visual.
# 'padx=10' e 'pady=5' aplicam o mesmo espaçamento usado para o rótulo,
# mantendo uma aparência e sensação uniformes em toda a interface.
entrada_altura.grid(row=1, column=1, padx=10, pady=5)

# Criando um rótulo 'Label' dentro do quadro para identificar o campo de
# entrada onde os usuários especificarão se a planta possui folhas.
# 'text="Tem folhas? (Sim/Não):"' fornece instruções claras sobre como o
# usuário deve responder, indicando as opções esperadas "Sim" ou "Não".
rotulo_folhas = ttk.Label(quadro, text="Tem folhas? (Sim/Não):")

# Posicionando o rótulo 'rotulo_folhas' dentro do 'quadro' usando o
# gerenciador de geometria 'grid'.
# 'row=2' coloca o rótulo na terceira linha, seguindo a sequência
# lógica e visual dos campos anteriores.
# 'column=0' coloca o rótulo na primeira coluna.
# 'padx=10' adiciona um espaçamento horizontal de 10 pixels ao
# lado do rótulo para evitar que ele fique muito colado aos
# elementos vizinhos, ajudando na clareza visual.
# 'pady=5' adiciona um espaçamento vertical de 5 pixels acima e
# abaixo do rótulo, proporcionando uma separação adequada
# entre os elementos da interface.
# 'sticky="e"' alinha o rótulo à direita (leste) dentro de sua
# célula na grade, direcionando a atenção do usuário
# para o campo de entrada ao lado.
rotulo_folhas.grid(row=2, column=0, padx=10, pady=5, sticky="e")

# Criando um campo de entrada 'Entry' para que os usuários
# possam inserir a resposta à pergunta se a planta tem folhas.
# Este campo permite a digitação de texto, que será interpretado
# em outra parte do código para determinar se a
# resposta é "Sim" ou "Não".
entrada_folhas = ttk.Entry(quadro)

# Posicionando o campo de entrada 'entrada_folhas' na interface.
# 'row=2' assegura que o campo de entrada está alinhado
# horizontalmente com o rótulo correspondente, facilitando a
# associação entre o rótulo e o campo para os usuários.
# 'column=1' coloca o campo de entrada diretamente ao lado do
# rótulo na segunda coluna, mantendo a organização e a
# lógica de interação visual.
# 'padx=10' e 'pady=5' aplicam o mesmo espaçamento usado para o
# rótulo, mantendo uma aparência e sensação uniformes
# em toda a interface.
entrada_folhas.grid(row=2, column=1,padx=10, pady=5)

# Criando um rótulo 'Label' dentro do quadro que identifica o campo de
# entrada onde os usuários especificarão se a planta
# necessita de muita água.
# 'text="Precisa de muita água? (Sim/Não):"' fornece instruções
# claras sobre como o usuário deve responder, sugerindo as
# opções esperadas "Sim" ou "Não".
rotulo_agua = ttk.Label(quadro, text="Precisa de muita água? (Sim/Não):")

# Posicionando o rótulo 'rotulo_agua' no quadro usando o
# gerenciador de geometria 'grid'.
# 'row=3' coloca o rótulo na quarta linha da interface,
# mantendo a sequência lógica de campos, um abaixo do outro.
# 'column=0' posiciona o rótulo na primeira coluna.
# 'padx=10' adiciona um espaçamento horizontal de 10 pixels ao
# lado do rótulo para evitar que ele fique muito próximo
# aos componentes adjacentes, auxiliando na clareza visual.
# 'pady=5' adiciona um espaçamento vertical de 5 pixels acima e
# abaixo do rótulo, garantindo uma separação adequada
# entre os elementos da interface.
# 'sticky="e"' alinha o rótulo à direita dentro de sua célula
# na grade (leste), direcionando a atenção do usuário
# para o campo de entrada ao lado.
rotulo_agua.grid(row=3, column=0,padx=10, pady=5, sticky="e")

# Criando um campo de entrada 'Entry' para que os usuários
# possam inserir sua resposta à pergunta sobre a
# necessidade de água da planta.
# Este campo aceita texto, permitindo aos usuários
# digitar diretamente suas respostas.
entrada_agua = ttk.Entry(quadro)

# Posicionando o campo de entrada 'entrada_agua' na interface.
# 'row=3' assegura que o campo de entrada está alinhado
# horizontalmente com o rótulo correspondente, facilitando a
# associação clara entre o rótulo e o campo para os usuários.
# 'column=1' coloca o campo de entrada diretamente ao lado do
# rótulo na segunda coluna, mantendo a organização e a
# lógica de interação visual.
# 'padx=10' e 'pady=5' aplicam o mesmo espaçamento usado para o
# rótulo, mantendo uma aparência e sensação uniformes
# em toda a interface.
entrada_agua.grid(row=3, column=1, padx=10, pady=5)

# Criando um botão 'Button' dentro do quadro para
# permitir ao usuário classificar o tipo de planta
# com base nas entradas fornecidas.
# 'text="Classificar"' define o texto exibido no botão,
# indicando sua função claramente.
# 'command=prever_planta' associa este botão à função 'prever_planta'.
# Quando o botão é clicado, essa função é chamada.
# A função 'prever_planta' realiza a coleta de dados das
# entradas, processa essas informações através do
# modelo de classificação, e retorna o resultado.
botao_classificar = ttk.Button(quadro, text="Classificar", command=prever_planta)

# Posicionando o botão 'botao_classificar' na interface
# usando o gerenciador de geometria 'grid'.
# 'row=4' coloca o botão na quinta linha, posicionando-o
# após todos os campos de entrada para facilitar o fluxo de uso da interface.
# 'column=0' inicia o posicionamento do botão na primeira coluna.
# 'columnspan=2' faz com que o botão se estenda por duas colunas,
# garantindo que ele seja suficientemente largo e fácil de
# clicar, além de manter um equilíbrio visual na interface.
# 'pady=10' adiciona um espaçamento vertical de 10 pixels acima e
# abaixo do botão, oferecendo espaço suficiente para
# interação e evitando uma aparência congestionada.
botao_classificar.grid(row=4, column=0, columnspan=2, pady=10)

# Criando um rótulo 'Label' dentro do quadro para
# exibir o resultado da classificação de plantas.
# 'text=""' inicia o rótulo sem texto; o texto será
# atualizado dinamicamente após a classificação.
# 'font=("Arial", 12, "bold")' define a fonte do texto no
# rótulo usando Arial de tamanho 12 em negrito,
# tornando o resultado facilmente legível.
# 'bg="#f0f0f0"' configura a cor de fundo do rótulo para
# ser a mesma do fundo da janela, criando uma aparência uniforme.
rotulo_resultado = tk.Label(quadro,
                            text="",
                            font=("Arial", 12, "bold"),
                            bg="#f0f0f0")

# Posicionando o rótulo 'rotulo_resultado' dentro do 'quadro'
# usando o gerenciador de geometria 'grid'.
# 'grid' é usado para posicionar widgets em uma matriz
# baseada em linhas e colunas.
# 'row=5' coloca o rótulo na sexta linha da interface,
# apropriada para a exibição do resultado, posicionando-o
# logo abaixo do botão de classificação.
# 'column=0' inicia o posicionamento do rótulo na primeira coluna.
# 'columnspan=2' faz com que o rótulo ocupe duas colunas, garantindo
# que haja espaço suficiente para exibir mensagens de resultado
# potencialmente longas.
# 'pady=10' adiciona um espaçamento vertical de 10 pixels acima e abaixo
# do rótulo, contribuindo para uma separação clara entre os
# elementos da interface e enfatizando a importância do resultado.
rotulo_resultado.grid(row=5, column=0, columnspan=2, pady=10)

# Executando o loop principal do Tkinter
janela.mainloop()
