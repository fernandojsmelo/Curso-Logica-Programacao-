# Importa o módulo 'tkinter' e renomeia para 'tk'
# para facilitar seu uso no código.
# 'tkinter' é uma biblioteca padrão do Python para criar
# interfaces gráficas de usuário (GUI).
import tkinter as tk

# Importa especificamente o widget 'Text' e a classe 'font'
# do módulo 'tkinter'.
# 'Text' é usado para criar áreas de texto onde o usuário pode
# inserir ou exibir múltiplas linhas de texto.
# 'font' permite definir tipos de fontes que podem ser
# usadas em widgets que exibem texto.
from tkinter import font, Text

# Importa o módulo 're', que permite trabalhar com
# expressões regulares.
# Expressões regulares são usadas para busca e manipulação
# de padrões de texto.
import re

# Importa o módulo 'requests', utilizado para fazer
# requisições HTTP em Python.
# Esse módulo é usado, por exemplo, para acessar APIs
# ou páginas da web.
import requests

# Importa o módulo 'datetime', que oferece classes para
# manipular datas e horas.
# Permite realizar operações como obter a data atual, adicionar ou
# subtrair dias, e formatar datas.
import datetime

# Importa o módulo 'random', que é usado para gerar números
# aleatórios, escolher elementos aleatórios de uma
# lista, entre outros.
import random

# Importa o módulo 'string', que contém várias constantes úteis e
# classes para manipulação de strings.
# Por exemplo, 'string.ascii_letters' e 'string.digits' são
# usados para gerar senhas aleatórias no exemplo.
import string

# Importa funções específicas do módulo 'sympy', uma biblioteca
# Python para matemática simbólica.
# 'symbols' define símbolos matemáticos, 'Eq' cria equações,
# e 'solve' resolve essas equações.
from sympy import symbols, Eq, solve


# Função para somar uma lista de números.
# Argumento 'numeros': uma lista de números inteiros ou flutuantes.
def somar_numeros(numeros):
    # A função `sum` do Python soma todos os elementos
    # da lista fornecida.
    # Retorna o resultado dessa soma.
    return sum(numeros)


# Função para subtrair uma sequência de números, começando pelo
# primeiro e subtraindo os demais.
# Argumento 'numeros': uma lista de números, onde o primeiro é o
# minuendo e os seguintes são os subtraendos.
def subtrair_numeros(numeros):
    # A operação é realizada pegando o primeiro elemento da
    # lista `numeros[0]` e subtraindo a soma dos elementos
    # restantes `numeros[1:]`.
    # A função `sum` soma todos os números na lista `numeros[1:]` e
    # subtrai esse resultado de `numeros[0]`.
    return numeros[0] - sum(numeros[1:])


# Função para multiplicar uma lista de números.
# Argumento 'numeros': uma lista de números
# inteiros ou flutuantes.
def multiplicar_numeros(numeros):
    # Inicializa a variável `resultado` com 1, pois 1 é o
    # elemento neutro da multiplicação.
    resultado = 1

    # Laço `for` que percorre cada número na lista 'numeros'.
    for num in numeros:
        # Multiplica o `resultado` atual pelo número atual do
        # laço e atualiza o valor de `resultado`.
        resultado *= num

    # Após terminar o laço, retorna o produto final dos números.
    return resultado


# Função para dividir uma lista de números.
# Argumento 'numeros': uma lista de números, onde o primeiro é o
# dividendo e os seguintes são os divisores.
def dividir_numeros(numeros):
    try:

        # Inicializa a variável 'resultado' com o primeiro elemento
        # da lista, que será o dividendo inicial.
        resultado = numeros[0]

        # Um laço 'for' que percorre a lista de números a partir
        # do segundo elemento (numeros[1:]),
        # pois o primeiro já foi usado como dividendo inicial.
        for num in numeros[1:]:
            # Divide o 'resultado' atual pelo número corrente do laço.
            # O resultado é atualizado a cada iteração.
            resultado /= num

        # Após finalizar todas as divisões, retorna o resultado final.
        return resultado

    # Bloco 'except' para capturar a exceção específica 'ZeroDivisionError',
    # que ocorre quando se tenta dividir por zero.
    except ZeroDivisionError:

        # Retorna uma mensagem de erro indicando que a divisão
        # por zero não é permitida.
        return "Divisão por zero não permitida"


# Função para obter a cotação do dólar
def obter_cotacao_dolar():
    # URL da API que fornece as taxas de câmbio atuais para o
    # dólar americano (USD).
    api_url = "https://api.exchangerate-api.com/v4/latest/USD"

    try:

        # Tenta enviar uma requisição HTTP GET para a URL da API.
        # 'verify=False' desabilita a verificação do SSL, o que não é
        # recomendado para produção devido a questões de segurança.
        resposta = requests.get(api_url, verify=False)

        # Converte a resposta JSON recebida em um dicionário Python.
        dados = resposta.json()

        # Retorna o valor da cotação do dólar para o real brasileiro (BRL).
        # A chave 'rates' contém um dicionário de várias moedas e suas
        # respectivas taxas de câmbio em relação ao dólar.
        return dados['rates']['BRL']

    # Bloco 'except' para capturar e lidar com qualquer exceção que
    # possa ocorrer durante a requisição.
    # 'Exception as e' captura a exceção geral e armazena como 'e'.
    except Exception as e:

        # Se ocorrer uma exceção, retorna uma string indicando o
        # erro juntamente com a mensagem de erro associada.
        return f"Erro ao obter cotação: {e}"


# Função para gerar uma senha forte e aleatória.
# Argumento 'tamanho': um inteiro opcional que define o comprimento
# da senha gerada. O padrão é 12 caracteres.
def gerar_senha_forte(tamanho=12):
    # Combina letras maiúsculas e minúsculas, dígitos numéricos e
    # símbolos de pontuação para formar o conjunto de
    # caracteres possíveis.
    # 'string.ascii_letters' gera todas as letras do alfabeto
    # em maiúsculas e minúsculas (A-Z, a-z).
    # 'string.digits' gera todos os dígitos numéricos (0-9).
    # 'string.punctuation' gera todos os caracteres de
    # pontuação (!"#$%&'()*+,-./:;<=>?@[\]^_`{|}~).
    caracteres = string.ascii_letters + string.digits + string.punctuation

    # Gera a senha usando uma compreensão de lista que
    # itera 'tamanho' vezes.
    # 'random.choice(caracteres)' seleciona um caractere aleatório
    # do conjunto de 'caracteres' a cada iteração.
    # ''.join(...) concatena todos os caracteres escolhidos em
    # uma única string, formando a senha.
    senha = ''.join(random.choice(caracteres) for _ in range(tamanho))

    # Retorna a senha gerada.
    return senha


# Função para pesquisar perguntas e respostas em
# um arquivo chamado 'perguntas.txt'.
# Argumento 'mensagem': uma string contendo a pergunta do usuário.
def pesquisar_pergunta(mensagem):
    try:

        # Tenta abrir o arquivo 'perguntas.txt' no
        # modo de leitura ('r').
        with open("perguntas.txt", "r", encoding='latin-1') as arquivo:

            # Lê todas as linhas do arquivo e as armazena
            # em uma lista chamada 'linhas'.
            linhas = arquivo.readlines()

    except UnicodeDecodeError:

        # Caso ocorra um erro de codificação durante a leitura
        # do arquivo, tenta ler novamente.
        # Este bloco 'except' é específico para tratar erros de
        # decodificação Unicode.
        with open("perguntas.txt", "r", encoding='latin-1') as arquivo:
            linhas = arquivo.readlines()

    # Itera sobre cada linha no arquivo.
    for linha in linhas:

        # Divide a linha pelo caractere '|', assumindo que cada
        # linha contém uma pergunta e uma resposta separadas
        # por este caractere.
        # Atribui os valores divididos às variáveis 'pergunta' e 'resposta'.
        pergunta, resposta = linha.split('|')

        # Verifica se a pergunta na linha (convertida para minúsculas) está
        # contida na mensagem fornecida pelo usuário (também
        # convertida para minúsculas).
        # Isso permite uma comparação insensível a
        # maiúsculas e minúsculas.
        if pergunta.lower() in mensagem.lower():
            # Se encontrada, retorna a resposta correspondente com
            # espaços em branco removidos do final.
            return resposta.strip()

    # Se nenhuma pergunta correspondente for encontrada no arquivo,
    # retorna uma mensagem padrão indicando que não foi
    # possível encontrar uma resposta.
    return "Desculpe, não encontrei uma resposta para sua pergunta."


# Define a função 'tratar_mensagem' que processa a mensagem
# inserida pelo usuário e retorna respostas relevantes.
def tratar_mensagem(mensagem):
    # Converte toda a mensagem de entrada para letras minúsculas
    # para uniformizar a comparação.
    mensagem = mensagem.lower()

    # Usa expressões regulares para encontrar todos os
    # números na mensagem e os converte para inteiros.
    # 'mensagem': uma string que pode conter texto e números misturados.

    # A função `re.findall(r'\d+', mensagem)` é usada para encontrar
    # todas as sequências de dígitos (números) na string 'mensagem'.
    # O '\d+' é uma expressão regular que corresponde a qualquer
    # sequência de um ou mais dígitos. O '+' significa 'um ou mais'.
    # Por exemplo, na string "Eu tenho 12 maçãs e 34
    # bananas", ele encontraria ['12', '34'].
    numeros = [int(x) for x in
               re.findall(r'\d+', mensagem)]  # Compreensão de lista para iterar sobre cada elemento encontrado.

    # `int(x)` é usado para converter cada string de dígitos
    # encontrados em um inteiro.
    # Isso é necessário porque a função `re.findall` retorna uma
    # lista de strings e muitas funções matemáticas requerem inteiros.
    # A compreensão de lista cria uma nova lista onde cada
    # string de dígitos é convertida para um inteiro.
    # No exemplo anterior, isso converteria ['12', '34'] para [12, 34].

    # O resultado é armazenado na variável 'numeros', que
    # agora é uma lista de inteiros.
    # Esta lista pode ser usada para operações matemáticas
    # posteriores, como soma, subtração, etc.

    # Inicializa uma lista vazia para armazenar respostas
    # que serão dadas ao usuário.
    respostas = []

    # Verifica se a palavra "some" está presente na mensagem.
    if "some" in mensagem:

        # Se a lista 'numeros' não estiver vazia, processa a soma.
        if numeros:
            # Adiciona a resposta da soma dos números à lista de respostas.
            respostas.append(f"A soma dos números é {somar_numeros(numeros)}")

    # Verifica se a palavra "subtraia" está presente na mensagem.
    if "subtraia" in mensagem:

        # Se a lista 'numeros' não estiver vazia, processa a subtração.
        if numeros:
            # Adiciona a resposta da subtração dos números à lista de respostas.
            respostas.append(
                f"A subtração dos números é {subtrair_numeros(numeros)}")

    # Verifica se a palavra "multiplique" está presente na mensagem.
    if "multiplique" in mensagem:

        # Se a lista 'numeros' não estiver vazia, processa a multiplicação.
        if numeros:
            # Adiciona a resposta da multiplicação dos números à
            # lista de respostas.
            respostas.append(
                f"A multiplicação dos números é {multiplicar_numeros(numeros)}")

    # Verifica se a palavra "divida" está presente na mensagem.
    if "divida" in mensagem:

        # Se a lista 'numeros' não estiver vazia, processa a divisão.
        if numeros:
            # Adiciona a resposta da divisão dos números à lista de respostas.
            respostas.append(f"A divisão dos números é {dividir_numeros(numeros)}")

    # Verifica se alguma variação da palavra "dólar" está presente na
    # mensagem para buscar sua cotação.
    if "dólar" in mensagem or "dolar" in mensagem or "Dólar" in mensagem or "Dolar" in mensagem:
        # Chama a função para obter a cotação atual do dólar.
        cotacao = obter_cotacao_dolar()

        # Adiciona a resposta da cotação do dólar à lista de respostas.
        respostas.append(f"A cotação atual do dólar é {cotacao} BRL")

    # Verifica se a palavra "data" está presente na mensagem
    # para fornecer a data atual.
    if "data" in mensagem:
        # Obtém a data atual formatada como dia/mês/ano.
        hoje = datetime.datetime.now().strftime('%d/%m/%Y')

        # Adiciona a resposta com a data atual à lista de respostas.
        respostas.append(f"A data de hoje é {hoje}")

    # Verifica se a palavra "senha" está presente na mensagem
    # para gerar uma senha forte.
    if "senha" in mensagem:
        # Gera uma senha forte.
        senha_forte = gerar_senha_forte()

        # Adiciona a resposta com a senha gerada à lista de respostas.
        respostas.append(f"A sua senha forte gerada é: {senha_forte}")

    # Se a lista de respostas ainda estiver vazia após todas as verificações,
    # busca uma resposta no arquivo de perguntas.
    if not respostas:
        # Chama a função para buscar uma resposta no arquivo de
        # perguntas baseado na mensagem do usuário.
        resposta_arquivo = pesquisar_pergunta(mensagem)

        # Adiciona a resposta encontrada no arquivo à lista de respostas.
        respostas.append(resposta_arquivo)

    # Junta todas as respostas em uma única string, separadas por
    # quebras de linha, e retorna esta string.
    return "\n".join(respostas)


# Define a função 'enviar_mensagem' que é chamada quando o
# usuário deseja enviar uma mensagem.
def enviar_mensagem():
    # Obtém o texto atualmente digitado no campo de entrada ('entrada')
    # da interface gráfica.
    mensagem = entrada.get()

    # Verifica se a mensagem está vazia (não faz nada se estiver vazia).
    # Isto evita enviar mensagens vazias ou apenas com espaços.
    if not mensagem:
        return  # Sai da função se não houver mensagem para enviar.

    # Configura o widget 'text_area' para estado NORMAL para
    # permitir a edição do texto.
    text_area.config(state=tk.NORMAL)

    # Insere a mensagem do usuário no final do 'text_area',
    # prefixando com "Você: ".
    # 'tk.END' indica que a inserção deve ser feita no final
    # do conteúdo atual do widget.
    text_area.insert(tk.END, f"Você: {mensagem}\n")

    # Chama a função 'tratar_mensagem' que processa a mensagem
    # enviada e retorna uma resposta.
    resposta = tratar_mensagem(mensagem)

    # Insere a resposta do bot no 'text_area', prefixando com "Bot: ".
    text_area.insert(tk.END, f"Bot: {resposta}\n\n")

    # Configura o widget 'text_area' de volta para o estado DISABLED
    # para evitar edição direta pelo usuário.
    # Isso mantém o widget como somente leitura fora da funcionalidade
    # de inserção de mensagens.
    text_area.config(state=tk.DISABLED)

    # Limpa o campo de entrada para estar pronto
    # para uma nova mensagem.
    entrada.delete(0, tk.END)

    # Rola o 'text_area' para a parte mais recente da conversa,
    # garantindo que a última mensagem esteja visível.
    text_area.see(tk.END)


# Inicializa a janela principal do Tkinter criando um objeto 'Tk'.
janela = tk.Tk()

# Configura o título da janela que será exibido na barra de
# título do sistema operacional.
janela.title('Chatbot com Funções Adicionais')

# Cria um widget 'Text' que será usado para exibir as
# mensagens trocadas no chat.
# O primeiro parâmetro 'janela' define que este widget pertence à
# janela criada anteriormente.
# 'font=("Arial", 14)' define a fonte e o tamanho do
# texto que será exibido.
# 'wrap=tk.WORD' configura a quebra de linha para ocorrer na
# fronteira entre palavras, evitando cortar as
# palavras ao meio.
# 'width=50' e 'height=20' definem a largura e altura do
# widget em unidades de linhas e colunas de texto, respectivamente.
text_area = Text(janela, font=("Arial", 14), wrap=tk.WORD, width=50, height=20)

# Organiza o widget 'text_area' dentro da janela
# usando o método 'pack'.
# 'expand=tk.YES' permite que o widget expanda para preencher
# qualquer espaço extra na janela se ela for redimensionada.
# 'fill=tk.BOTH' faz com que o widget expanda tanto
# vertical quanto horizontalmente.
text_area.pack(expand=tk.YES, fill=tk.BOTH)

# Configura o widget 'text_area' para o estado DISABLED,
# que impede o utilizador de editar o texto diretamente.
# Isso serve para garantir que o texto só possa ser modificado
# pelo programa e não manualmente pelo utilizador.
text_area.config(state=tk.DISABLED)

# Cria um widget 'Entry' para entrada de texto, onde o utilizador
# pode digitar suas mensagens.
# 'janela' é o contêiner pai onde este widget será inserido,
# indicando que faz parte da janela principal.
# 'font=("Arial", 20)' configura a fonte do texto inserido no
# campo para Arial tamanho 20, facilitando a leitura.
# 'width=50' define a largura do campo de entrada, suficiente
# para acomodar mensagens mais longas sem necessidade
# de rolagem horizontal.
entrada = tk.Entry(janela, font=("Arial", 20), width=50)

# Posiciona o widget 'entrada' na janela usando o
# gerenciador de layout 'pack'.
# 'side=tk.LEFT' posiciona o campo de entrada no
# lado esquerdo da janela.
# 'padx=10' e 'pady=10' adicionam um preenchimento de 10 pixels
# em todas as direções em torno do widget, evitando que
# ele toque diretamente as bordas da janela.
entrada.pack(side=tk.LEFT, padx=10, pady=10)

# Cria um widget 'Button' que será usado para enviar as mensagens
# digitadas no campo de entrada.
# 'text='Enviar'' define o texto que aparece no botão, instruindo
# claramente o usuário sobre sua função.
# 'command=enviar_mensagem' associa este botão à função 'enviar_mensagem',
# que é chamada sempre que o botão é pressionado.
# Esta função é responsável por ler o texto do campo de entrada,
# processá-lo e exibir a resposta no 'text_area'.
btn_enviar = tk.Button(janela, text='Enviar', command=enviar_mensagem)

# Posiciona o botão 'btn_enviar' na janela.
# 'side=tk.RIGHT' posiciona o botão no lado direito da janela,
# complementando o campo de entrada no lado esquerdo.
# 'padx=10' e 'pady=10' adicionam um preenchimento similar ao
# do campo de entrada, mantendo a consistência
# visual e funcional.
btn_enviar.pack(side=tk.RIGHT, padx=10, pady=10)

# Iniciar o loop principal do Tkinter
janela.mainloop()
