# Importa o módulo tkinter e o renomeia como 'tk' para 
# simplificar seu uso no restante do código.
import tkinter as tk

# Importa o módulo messagebox de tkinter para 
# exibir caixas de diálogo.
from tkinter import messagebox

# Importa o módulo string, que contém várias constantes e 
# funções úteis para manipulação de strings.
import string

# Define duas listas de palavras que expressam sentimentos 
# positivos e negativos em português.
palavras_positivas = [
    "feliz", "alegria", "bom", "ótimo", "excelente", "fantástico", "maravilhoso",
    "adoro", "gosto", "amor", "satisfeito", "parabéns", "sucesso", "incrível",
    "perfeito", "sensacional", "formidável", "maravilha", "espetacular",
    "extraordinário"
]
palavras_negativas = [
    "triste", "chateado", "ruim", "péssimo", "horrível", "terrível", "detesto",
    "ódio", "raiva", "insatisfeito", "problema", "lamentável", "fracasso", "odeio",
    "desgosto", "decepção", "horrendo", "repugnante", "irritante", "frustrante"
]

# Lista de palavras usadas para negar ou
# inverter o sentido da frase.
negacoes = ["não", "nunca", "jamais"]


# Define a função 'remover_pontuacao', que aceita um
# parâmetro chamado 'texto'.
def remover_pontuacao(texto):
    # Utiliza o método 'translate' do objeto string para alterar o texto.
    # 'str.maketrans("", "", string.punctuation)' cria uma tabela de tradução
    # que será usada pelo método 'translate'.
    # Os dois primeiros argumentos de str.maketrans (ambos strings
    # vazias neste caso) definem quais caracteres
    # deveriam ser substituídos por outros caracteres. Como ambos
    # são strings vazias, nenhuma substituição é feita.
    # O terceiro argumento lista todos os caracteres que
    # devem ser removidos do texto.
    # 'string.punctuation' contém todos os caracteres de
    # pontuação considerados pela biblioteca string,
    # como pontos, vírgulas, pontos de interrogação, etc.
    return texto.translate(str.maketrans("", "", string.punctuation))


# Define a função que analisa o sentimento de um texto.
def analisar_sentimento(texto):
    # Remove a pontuação e converte todo o texto para
    # minúsculas para uniformizar o processamento.
    texto = remover_pontuacao(texto.lower())

    # Divide o texto em uma lista de palavras para
    # facilitar a análise individual.
    palavras_texto = texto.split()

    # Inicializa contadores para palavras que indicam
    # sentimentos positivos e negativos.
    positivo = 0
    negativo = 0

    # Variável que indica se uma negação foi encontrada
    # antes de uma palavra de sentimento.
    inversor = False

    # Itera sobre cada palavra no texto, usando 'enumerate' para
    # também ter acesso ao índice da palavra.
    for i, palavra in enumerate(palavras_texto):

        # Verifica se a palavra atual é uma palavra de negação.
        if palavra in negacoes:
            inversor = True  # Ativa o inversor de sentimento.
            continue  # Pula para a próxima palavra no loop.

        # Se a palavra for identificada como positiva.
        if palavra in palavras_positivas:
            if inversor:
                negativo += 1  # Se inversor está ativo,
                # incrementa o contador de negativo.
            else:
                positivo += 1  # Se não, incrementa o contador de positivo.
            inversor = False  # Reseta o inversor após seu uso.

        # Se a palavra for identificada como negativa.
        elif palavra in palavras_negativas:
            if inversor:
                positivo += 1  # Se inversor está ativo, incrementa o contador de positivo.
            else:
                negativo += 1  # Se não, incrementa o contador de negativo.
            inversor = False  # Reseta o inversor após seu uso.

        # Trata casos específicos de combinações de negação
        # diretamente seguidas por certas palavras.
        if i > 0 and palavras_texto[i - 1] == "não" and palavra in ["gostei", "gosto"]:
            negativo += 1  # Trata a combinação como negativa.
            inversor = False  # Reseta o inversor.

    # Compara os contadores para determinar o sentimento geral do texto.
    if positivo > negativo:
        return "Positivo"  # Mais palavras positivas do que negativas.
    elif negativo > positivo:
        return "Negativo"  # Mais palavras negativas do que positivas.
    else:
        return "Neutro"  # Números iguais ou nenhuma palavra de
        # sentimento clara foi encontrada.


# Define a função 'analisar' que é chamada quando o usuário
# clica no botão para analisar o sentimento do texto inserido.
def analisar():
    # Obtém o texto da área de entrada 'entry'. "1.0" refere-se à
    # primeira linha e à primeira coluna (o início do texto),
    # 'tk.END' refere-se ao fim do texto, garantindo que
    # todo o conteúdo seja capturado.
    # O método 'strip()' é usado para remover espaços em
    # branco e quebras de linha extras no início e
    # no fim do texto capturado.
    texto = entry.get("1.0", tk.END).strip()

    # Verifica se algum texto foi realmente inserido.
    if texto:

        # Chama a função 'analisar_sentimento' para determinar o
        # sentimento do texto inserido.
        sentimento = analisar_sentimento(texto)

        # Verifica o resultado da análise de sentimento.
        if sentimento == "Positivo":

            # Configura o 'resultado_label' para exibir o sentimento
            # como "Positivo" e muda a cor do texto para verde.
            resultado_label.config(text=f"Sentimento: {sentimento}", fg="green")

        elif sentimento == "Negativo":

            # Configura o 'resultado_label' para exibir o sentimento
            # como "Negativo" e muda a cor do texto para vermelho.
            resultado_label.config(text=f"Sentimento: {sentimento}", fg="red")

        else:

            # Configura o 'resultado_label' para exibir o sentimento
            # como "Neutro" e muda a cor do texto para preto.
            resultado_label.config(text=f"Sentimento: {sentimento}", fg="black")

    else:

        # Caso não haja texto inserido e o usuário tenha tentado
        # analisar, exibe uma mensagem de erro solicitando a
        # inserção de texto.
        messagebox.showerror("Erro", "Por favor, insira um texto.")


# Cria uma nova janela utilizando Tkinter. A variável 'janela'
# se torna a instância principal da interface gráfica.
janela = tk.Tk()

# Define o título da janela, que aparece na barra de título da janela.
# O título ajuda os usuários a identificar a função da
# janela aberta no sistema operacional.
janela.title("Análise de Sentimento de Textos")

# Configura as dimensões iniciais da janela. '700x400' define a
# largura como 700 pixels e a altura como 400 pixels.
# Essas dimensões são suficientes para acomodar os elementos da
# interface sem ficarem muito apertados.
janela.geometry("700x400")

# Cria um widget de texto (Label) que serve como
# instrução para o usuário.
# O texto "Digite um texto para analisar o sentimento:" orienta o
# usuário sobre o que a janela se propõe a fazer.
# 'font=("Arial", 20)' define a fonte do texto como Arial
# com tamanho 20, garantindo que a instrução
# seja facilmente legível.
instrucao = tk.Label(janela,
                     text="Digite um texto para analisar o sentimento:",
                     font=("Arial", 20))

# Posiciona o widget 'instrucao' dentro da janela
# usando o método 'pack'.
# 'pack' é um gerenciador de geometria que organiza widgets em
# blocos antes de colocá-los na janela.
# 'pady=10' adiciona um preenchimento vertical de 10 pixels
# acima e abaixo do label para separá-lo visualmente
# de outros widgets.
instrucao.pack(pady=10)

# Cria um widget 'Text', que é uma caixa de texto onde os
# usuários podem inserir texto de múltiplas linhas.
# 'janela' é o contêiner pai onde este widget será inserido,
# indicando que faz parte da janela principal.
# 'height=5' define a altura da caixa de texto como 5
# linhas de texto.
# 'width=50' define a largura da caixa de texto, suficiente
# para acomodar 50 caracteres em uma linha.
# 'font=("Arial", 20)' especifica que o texto digitado na
# caixa usará a fonte Arial tamanho 20, tornando-o facilmente legível.
entry = tk.Text(janela, height=5, width=50, font=("Arial", 20))

# Posiciona o widget 'entry' na janela usando o
# gerenciador de layout 'pack'.
# 'pack' é simples e prático para adicionar widgets à
# janela quando a precisão do layout não é crítica.
# 'pady=10' adiciona um preenchimento vertical de 10 pixels
# acima e abaixo do widget para evitar que os elementos
# da interface fiquem visualmente comprimidos.
entry.pack(pady=10)

# Cria um widget 'Button' que os usuários podem clicar
# para submeter o texto inserido para análise.
# 'text="Analisar Sentimento"' define o texto exibido
# no botão, dando uma indicação clara de sua função.
# 'command=analisar' vincula o botão à função 'analisar',
# que será chamada quando o botão for pressionado.
# Esta função captura o texto da 'entry', processa o
# sentimento e atualiza a interface com o resultado.
# 'font=("Arial", 20)' garante que o texto no botão seja
# grande o suficiente para ser facilmente legível.
botao_analisar = tk.Button(janela,
                           text="Analisar Sentimento",
                           command=analisar,
                           font=("Arial", 20))

# Posiciona o botão 'botao_analisar' na janela.
# A configuração 'pady=10' é usada novamente
# para manter a consistência visual.
botao_analisar.pack(pady=10)

# Cria um widget 'Label' que é usado para exibir o
# resultado da análise de sentimento.
# 'text="Sentimento: "' serve como texto inicial no
# label, preparando o espaço para mostrar o
# resultado da análise.
# 'font=("Arial", 20)' assegura que o texto no label
# seja grande e claro o suficiente para ser
# lido facilmente.
resultado_label = tk.Label(janela, text="Sentimento: ", font=("Arial", 20))

# Posiciona o widget 'resultado_label' na janela
# usando 'pack' com 'pady=10', mantendo o
# layout organizado e espaçoso.
resultado_label.pack(pady=10)

# Rodar a interface
janela.mainloop()
