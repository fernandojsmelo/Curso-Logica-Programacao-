# Exercício - Classificar animais como Mamífero, Ave ou Réptil

# Importando o módulo tkinter para a criação da interface
# gráfica do usuário (GUI).
import tkinter as tk

# Importando o submódulo ttk de tkinter para usar widgets
# com temas que melhoram a aparência da GUI.
from tkinter import ttk

# Importando a classe DecisionTreeClassifier do módulo tree da
# biblioteca sklearn, utilizada para criar um modelo de
# classificação baseado em árvore de decisão.
from sklearn.tree import DecisionTreeClassifier

# Lista de dados que descrevem as características de diferentes
# tipos de animais para treino do classificador.
# Cada sub-lista representa as características de um animal específico.
dados = [

    # Dados dos mamíferos:
    # Cada elemento representa um mamífero e possui três características:
    # Número de patas (4), Se pode voar (0 = não), Se tem pelos (1 = sim).
    [4, 0, 1],  # Exemplo: cachorro
    [4, 0, 1],  # Exemplo: gato
    [4, 0, 1],  # Exemplo: leão
    [4, 0, 1],  # Exemplo: urso
    [4, 0, 1],  # Exemplo: vaca

    # Dados das aves:
    # Cada elemento representa uma ave e possui três características:
    # Número de patas (2), Se pode voar (1 = sim, exceto para o
    # pinguim que é 0), Se tem pelos (0 = não).
    [2, 1, 0],  # Exemplo: papagaio
    [2, 1, 0],  # Exemplo: canário
    [2, 0, 0],  # Exemplo: pinguim
    [2, 1, 0],  # Exemplo: águia
    [2, 1, 0],  # Exemplo: falcão

    # Dados dos répteis:
    # Cada elemento representa um réptil e possui três características:
    # Número de patas (pode ser 0 para cobras ou 4 para outros répteis),
    # Se pode voar (0 = não), Se tem pelos (0 = não).
    [4, 0, 0],  # Exemplo: lagarto
    [4, 0, 0],  # Exemplo: crocodilo
    [0, 0, 0],  # Exemplo: cobra
    [4, 0, 0],  # Exemplo: tartaruga
    [4, 0, 0]  # Exemplo: iguana

]

# Lista de rótulos que correspondem a cada um dos conjuntos
# de dados definidos anteriormente.
# Esses rótulos são usados para classificar cada animal
# com base em suas características.
rotulos = [

    # Rótulos para mamíferos, cada 'Mamífero' corresponde a
    # uma entrada na lista 'dados' para mamíferos.
    "Mamífero", "Mamífero", "Mamífero", "Mamífero", "Mamífero",

    # Rótulos para aves, cada 'Ave' corresponde a uma entrada
    # na lista 'dados' para aves.
    "Ave", "Ave", "Ave", "Ave", "Ave",

    # Rótulos para répteis, cada 'Réptil' corresponde a uma
    # entrada na lista 'dados' para répteis.
    "Réptil", "Réptil", "Réptil", "Réptil", "Réptil"

]

# Criando uma instância de DecisionTreeClassifier, que é um
# modelo de aprendizado de máquina baseado em árvore de decisão.
clf = DecisionTreeClassifier()

# Treinando o classificador com os dados e rótulos fornecidos.
# O método fit ajusta o modelo aos dados fornecidos, aprendendo a
# associar as características dos animais aos seus respectivos rótulos.
clf.fit(dados, rotulos)


# Definição da função 'prever_animal' que não aceita argumentos externos.
def prever_animal():
    try:
        # Bloco de tentativa para capturar erros que podem ocorrer ao
        # converter ou ao processar os dados de entrada.

        # Obtendo os valores inseridos pelo usuário nos campos
        # da interface gráfica.
        # Convertendo o valor do campo de entrada 'entrada_patas' para inteiro.
        # 'entrada_patas.get()' acessa o conteúdo textual do campo
        # de entrada para o número de patas.
        # A função 'int()' tenta converter esse texto para um número
        # inteiro para ser usado na classificação.
        patas = int(entrada_patas.get())

        # Convertendo o valor do campo de entrada 'entrada_voar' para 1 ou 0.
        # 'entrada_voar.get().lower()' pega o texto do campo 'entrada_voar',
        # converte para letras minúsculas para padronizar a comparação.
        # A comparação '== "sim"' verifica se o usuário digitou 'sim'
        # para indicar que o animal pode voar.
        # Se verdadeiro ('sim'), atribui 1 (pode voar), caso
        # contrário atribui 0 (não pode voar).
        pode_voar = 1 if entrada_voar.get().lower() == "sim" else 0

        # Convertendo o valor do campo de entrada 'entrada_pelos'
        # da mesma forma que o campo 'pode voar'.
        # Verifica se o usuário respondeu 'sim' para indicar se o
        # animal tem pelos.
        # Isso é usado para diferenciar tipos de animais em algumas
        # classificações como entre mamíferos e répteis.
        tem_pelos = 1 if entrada_pelos.get().lower() == "sim" else 0

        # Verificando se o número de patas é válido (não pode ser negativo).
        # Número negativo de patas não faz sentido em contexto
        # biológico, então isso serve como validação de dados.
        if patas < 0:
            # Configurando o texto do rótulo de resultado para mostrar
            # uma mensagem de erro em vermelho.
            # O texto do rótulo 'rotulo_resultado' é atualizado para
            # informar o usuário sobre o erro na entrada de dados.
            # 'fg="red"' define a cor do texto para vermelho,
            # destacando o erro visualmente.
            rotulo_resultado.config(text="Número de patas não pode ser negativo.", fg="red")

            # Encerrando a função prematuramente caso a validação falhe.
            # Isso impede que o restante do código seja executado
            # com dados inválidos.
            return

        # Criando uma lista com as características do animal
        # inseridas pelo usuário.
        # Essa lista é formatada especificamente para ser compatível
        # com o método 'predict' do classificador.
        novo_animal = [[patas, pode_voar, tem_pelos]]

        # Usando o classificador para prever o tipo de animal baseado
        # nas características fornecidas.
        # 'clf.predict(novo_animal)' aplica o modelo treinado às
        # características fornecidas para determinar a categoria do animal.
        tipo_predito = clf.predict(novo_animal)

        # Configurando o texto do rótulo de resultado para mostrar o
        # tipo de animal previsto em verde.
        # O texto é atualizado para mostrar a classificação resultante,
        # como "Mamífero", "Ave" ou "Réptil".
        # 'fg="green"' define a cor do texto para verde, indicando
        # uma operação bem-sucedida.
        rotulo_resultado.config(text=f"Classificação: {tipo_predito[0]}", fg="green")


    # Capturando exceções específicas que ocorrem quando
    # as entradas não são válidas.
    except ValueError:

        # Configurando o texto do rótulo de resultado para mostrar uma
        # mensagem de erro solicitando entradas válidas em vermelho.
        rotulo_resultado.config(text="Por favor, insira valores válidos.", fg="red")


# Criando a instância principal da janela usando tkinter.
# 'Tk()' é o construtor que inicializa a janela
# principal para a aplicação.
janela = tk.Tk()

# Definindo o título da janela principal.
# 'title' é um método que define o texto a ser exibido
# na barra de título da janela.
janela.title("Exercício - Classificação de Animais")

# Configurando as dimensões da janela.
# 'geometry' é um método que define o tamanho da janela em
# pixels, formato "largura x altura".
janela.geometry("400x300")

# Definindo a cor de fundo da janela.
# 'configure' é um método usado para configurar várias opções
# de estilo da janela, 'bg' define a cor de fundo.
janela.configure(bg="#f0f0f0")

# Criando um quadro dentro da janela principal para
# conter outros widgets.
# 'Frame' é uma classe que permite agrupar e organizar
# outros widgets em um container com bordas e fundo.
# 'padding=20' define o espaçamento interno em torno dos
# elementos dentro do quadro.
# 'relief="solid"' define o estilo da borda do quadro,
# tornando-a visível como uma linha sólida ao redor do quadro.
# 'borderwidth=2' define a largura da borda do quadro em pixels.
quadro = ttk.Frame(janela, padding=20, relief="solid", borderwidth=2)

# Organizando o quadro dentro da janela.
# 'pack' é um gerenciador de geometria que adiciona o widget ao
# seu container pai e permite definir como ele deve ser exibido.
# 'pady=20' adiciona um espaçamento vertical externo de 20 pixels
# acima e abaixo do quadro para separá-lo de outros
# elementos ou das bordas da janela.
quadro.pack(pady=20)

# Criando um rótulo 'Label' dentro do quadro que foi
# definido anteriormente.
# Este rótulo é usado para exibir o título da seção ou da aplicação.
# 'text="Classificação de Animais"' define o texto que
# será exibido no rótulo.
# 'font=("Arial", 14, "bold")' especifica a fonte do texto.
# Neste caso, Arial tamanho 14 em negrito.
rotulo_titulo = ttk.Label(quadro,
                          text="Exercício - Classificação de Animais",
                          font=("Arial", 14, "bold"))

# Posicionando o rótulo 'rotulo_titulo' dentro do 'quadro'
# usando o gerenciador de geometria 'grid'.
# 'grid' é usado para posicionar os widgets em uma matriz
# baseada em linhas e colunas.
# 'row=0' coloca o rótulo na primeira linha da grade.
# Índice de linha começa em 0, portanto, 'row=0' é a linha superior.
# 'column=0' coloca o rótulo na primeira coluna.
# 'columnspan=2' faz com que o rótulo se estenda por duas colunas.
# Isso é útil quando queremos que o widget ocupe mais espaço horizontal.
# 'pady=10' adiciona um espaçamento vertical de 10 pixels acima e
# abaixo do rótulo para dar um melhor aspecto visual e
# evitar que o texto fique muito próximo de outros elementos.
rotulo_titulo.grid(row=0, column=0, columnspan=2, pady=10)

# Criando um rótulo 'Label' dentro do quadro para o campo de
# entrada do número de patas dos animais.
# 'text="Número de patas:"' define o texto que será exibido no rótulo,
# orientando os usuários sobre o que deve ser inserido no
# campo de entrada adjacente.
rotulo_patas = ttk.Label(quadro, text="Número de patas:")

# Posicionando o rótulo 'rotulo_patas' dentro do quadro usando o
# gerenciador de geometria 'grid'.
# 'row=1' coloca o rótulo na segunda linha da grade, uma vez
# que 'row=0' é usada para o título.
# 'column=0' coloca o rótulo na primeira coluna.
# 'padx=10' adiciona um espaçamento horizontal de 10 pixels ao
# lado do rótulo, evitando que ele fique muito colado
# aos elementos vizinhos.
# 'pady=5' adiciona um espaçamento vertical de 5 pixels acima e
# abaixo do rótulo, proporcionando espaço suficiente
# para uma boa visualização.
# 'sticky="e"' alinha o rótulo à direita ('e' de 'east') dentro de
# sua célula da grade, assegurando que o rótulo esteja alinhado
# perto do campo de entrada que será colocado ao lado.
rotulo_patas.grid(row=1, column=0, padx=10, pady=5, sticky="e")

# Criando um campo de entrada 'Entry' para que os usuários
# possam inserir o número de patas do animal.
# Este campo permite a digitação de texto, que será convertido
# em inteiro na função de previsão.
entrada_patas = ttk.Entry(quadro)

# Posicionando o campo de entrada 'entrada_patas' na interface.
# 'row=1' garante que o campo de entrada esteja na mesma
# linha que o rótulo 'Número de patas', facilitando a
# associação entre o rótulo e o campo de entrada.
# 'column=1' coloca o campo de entrada na segunda coluna,
# diretamente ao lado do seu rótulo correspondente.
# 'padx=10' e 'pady=5' aplicam o mesmo espaçamento usado para o
# rótulo, mantendo a consistência e a ordem visual no layout.
entrada_patas.grid(row=1, column=1, padx=10, pady=5)

# Criando um rótulo 'Label' para identificar o campo de entrada
# onde os usuários especificarão se o animal pode voar.
# 'text="Pode voar? (Sim/Não):"' fornece instruções claras sobre
# como o usuário deve responder, indicando as opções
# esperadas "Sim" ou "Não".
rotulo_voar = ttk.Label(quadro, text="Pode voar? (Sim/Não):")

# Posicionando o rótulo 'rotulo_voar' dentro do 'quadro'
# usando o gerenciador de geometria 'grid'.
# 'row=2' coloca o rótulo na terceira linha da interface,
# organizando-o verticalmente após o campo anterior.
# 'column=0' coloca o rótulo na primeira coluna, alinhando-o
# com os rótulos acima e abaixo dele.
# 'padx=10' adiciona um espaçamento horizontal de 10 pixels em
# ambos os lados do rótulo para evitar que ele fique
# muito próximo dos componentes adjacentes.
# 'pady=5' adiciona um espaçamento vertical de 5 pixels acima e
# abaixo, criando uma separação clara entre os campos de entrada.
# 'sticky="e"' garante que o rótulo esteja alinhado à direita dentro
# de sua célula na grade, orientando visualmente o usuário
# para o campo de entrada ao lado.
rotulo_voar.grid(row=2, column=0, padx=10, pady=5, sticky="e")

# Criando um campo de entrada 'Entry' onde os usuários
# poderão inserir se o animal pode voar ou não.
# Este campo aceita texto livre, mas as instruções
# pedem uma resposta simples "Sim" ou "Não".
entrada_voar = ttk.Entry(quadro)

# Posicionando o campo de entrada 'entrada_voar' na interface.
# 'row=2' assegura que o campo de entrada está alinhado
# horizontalmente com o rótulo correspondente, facilitando a
# correlação entre o rótulo e o campo.
# 'column=1' coloca o campo de entrada diretamente ao lado do
# rótulo na segunda coluna, proporcionando um fluxo
# lógico de leitura e interação.
# 'padx=10' e 'pady=5' aplicam espaçamento idêntico ao do rótulo,
# mantendo uniformidade visual e espaçamento adequado para
# uma interface organizada e acessível.
entrada_voar.grid(row=2, column=1, padx=10, pady=5)

# Criando um rótulo 'Label' dentro do quadro para identificar o
# campo de entrada que questiona se o animal tem pelos.
# 'text="Tem pelos? (Sim/Não):"' especifica claramente a pergunta e o
# formato esperado da resposta, facilitando para os usuários
# saberem como responder.
rotulo_pelos = ttk.Label(quadro, text="Tem pelos? (Sim/Não):")

# Posicionando o rótulo 'rotulo_pelos' dentro do 'quadro'
# usando o gerenciadorde ge ometria 'grid'.
# 'row=3' coloca o rótulo na quarta linha, seguindo a sequência
# lógica e visual dos campos anteriores.
# 'column=0' coloca o rótulo na primeira coluna, mantendo o
# alinhamento vertical consistente com os outros rótulos acima.
# 'padx=10' adiciona um espaçamento horizontal de 10 pixels ao
# lado do rótulo para evitar colagem aos elementos vizinhos,
# ajudando na clareza visual.
# 'pady=5' adiciona um espaçamento vertical de 5 pixels acima e
# abaixo do rótulo, proporcionando uma separação adequada
# entre os elementos da interface.
# 'sticky="e"' alinha o rótulo à direita (leste) dentro de sua
# célula na grade, direcionando a atenção do usuário
# para o campo de entrada à direita.
rotulo_pelos.grid(row=3, column=0, padx=10, pady=5, sticky="e")

# Criando um campo de entrada 'Entry' para que os usuários
# possam inserir a resposta à pergunta se o animal tem pelos.
entrada_pelos = ttk.Entry(quadro)

# Posicionando o campo de entrada 'entrada_pelos' na interface.
# 'row=3' assegura que o campo de entrada está alinhado horizontalmente
# com o rótulo correspondente, facilitando a associação entre o
# rótulo e o campo para os usuários.
# 'column=1' coloca o campo de entrada diretamente ao lado do rótulo na
# segunda coluna, mantendo a organização e a lógica de interação visual.
# 'padx=10' e 'pady=5' aplicam o mesmo espaçamento usado para o rótulo,
# mantendo uma aparência e sensação uniformes em toda a interface.
entrada_pelos.grid(row=3, column=1, padx=10, pady=5)

# Criando um botão 'Button' dentro do quadro para permitir ao usuário
# classificar o tipo de animal com base nas entradas fornecidas.
# 'text="Classificar"' define o texto exibido no botão, indicando sua função.
# 'command=prever_animal' associa este botão à função 'prever_animal'.
# Quando o botão é clicado, essa função é chamada.
# A função 'prever_animal' realiza a coleta de dados das entradas,
# processa essas informações através do modelo de
# classificação, e retorna o resultado.
botao_classificar = ttk.Button(quadro, text="Classificar", command=prever_animal)

# Posicionando o botão 'botao_classificar' na interface usando o
# gerenciador de geometria 'grid'.
# 'row=4' coloca o botão na quinta linha, posicionando-o logicamente
# após todos os campos de entrada para facilitar o fluxo de uso da interface.
# 'column=0' inicia o posicionamento do botão na primeira coluna.
# 'columnspan=2' permite que o botão se estenda por duas colunas,
# garantindo que ele seja suficientemente largo e fácil de clicar,
# além de manter um equilíbrio visual na interface.
# 'pady=10' adiciona um espaçamento vertical de 10 pixels acima e abaixo do
# botão, oferecendo espaço suficiente para interação e evitando
# uma aparência congestionada.
botao_classificar.grid(row=4, column=0, columnspan=2, pady=10)

# Criando um rótulo 'Label' dentro do quadro para exibir o
# resultado da classificação de animais.
# 'text=""' inicia o rótulo sem texto; o texto será atualizado
# dinamicamente após a classificação.
# 'font=("Arial", 12, "bold")' define a fonte do texto no rótulo
# usando Arial de tamanho 12 em negrito, tornando o
# resultado facilmente legível.
# 'bg="#f0f0f0"' configura a cor de fundo do rótulo para ser a
# mesma do fundo da janela, criando uma aparência uniforme.
rotulo_resultado = tk.Label(quadro,
                            text="",
                            font=("Arial", 12, "bold"),
                            bg="#f0f0f0")

# Posicionando o rótulo 'rotulo_resultado' dentro do 'quadro'
# usando o gerenciador de geometria 'grid'.
# 'grid' é usado para posicionar widgets em uma matriz
# baseada em linhas e colunas.
# 'row=5' coloca o rótulo na sexta linha da interface, que é
# apropriada para a exibição do resultado, posicionando-o
# logo abaixo do botão de classificação.
# 'column=0' inicia o posicionamento do rótulo na primeira coluna.
# 'columnspan=2' faz com que o rótulo ocupe duas colunas, garantindo
# que haja espaço suficiente para exibir mensagens de resultado
# potencialmente longas.
# 'pady=10' adiciona um espaçamento vertical de 10 pixels acima e
# abaixo do rótulo, contribuindo para uma separação clara entre
# os elementos da interface e enfatizando a importância do resultado.
rotulo_resultado.grid(row=5, column=0, columnspan=2, pady=10)

# Executando o loop principal do Tkinter
janela.mainloop()
