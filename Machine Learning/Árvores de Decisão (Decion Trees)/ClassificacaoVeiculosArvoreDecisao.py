# Classificar veículos como Carro, Caminhão ou Moto 

# Importando a biblioteca 'tkinter' com o alias 'tk'.
# 'tkinter' é uma biblioteca padrão do Python para criar 
# interfaces gráficas de usuário (GUIs).
import tkinter as tk

# Importando o módulo 'ttk' da biblioteca 'tkinter'.
# 'ttk' é usado para acessar widgets temáticos do Tkinter que fornecem 
# uma aparência mais moderna e funcionalidades adicionais em
# comparação aos widgets padrão do Tkinter.
from tkinter import ttk

# Importando 'DecisionTreeClassifier' da biblioteca 'sklearn.tree'.
# 'DecisionTreeClassifier' é um tipo de modelo de aprendizado de 
# máquina que usa uma árvore de decisão para classificação.
# Árvores de decisão são usadas para tomar decisões sequenciais 
# sobre os dados de entrada para prever a saída.
from sklearn.tree import DecisionTreeClassifier

# Lista chamada 'dados' contendo sub-listas que representam diferentes 
# tipos de veículos com suas características específicas:
# Cada sub-lista contém três elementos: Peso (em toneladas), Número 
# de Rodas, e Capacidade de Passageiros.
dados = [

    # Sub-listas para Carros
    [1.5, 4, 5],  # Carro com 1.5 toneladas, 4 rodas e capacidade para 5 passageiros
    [1.3, 4, 5],  # Carro com 1.3 toneladas, 4 rodas e capacidade para 5 passageiros
    [1.8, 4, 4],  # Carro com 1.8 toneladas, 4 rodas e capacidade para 4 passageiros
    [1.6, 4, 4],  # Carro com 1.6 toneladas, 4 rodas e capacidade para 4 passageiros
    [2.0, 4, 7],  # Carro com 2.0 toneladas, 4 rodas e capacidade para 7 passageiros

    # Sub-listas para Caminhões
    [5.0, 6, 2],  # Caminhão com 5.0 toneladas, 6 rodas e capacidade para 2 passageiros
    [7.0, 6, 2],  # Caminhão com 7.0 toneladas, 6 rodas e capacidade para 2 passageiros
    [4.5, 6, 3],  # Caminhão com 4.5 toneladas, 6 rodas e capacidade para 3 passageiros
    [8.0, 8, 2],  # Caminhão com 8.0 toneladas, 8 rodas e capacidade para 2 passageiros
    [6.0, 8, 3],  # Caminhão com 6.0 toneladas, 8 rodas e capacidade para 3 passageiros

    # Sub-listas para Motos
    [0.2, 2, 2],  # Moto com 0.2 toneladas,  2 rodas e capacidade para 2 passageiros
    [0.25, 2, 2],  # Moto com 0.25 toneladas, 2 rodas e capacidade para 2 passageiros
    [0.3, 2, 2],  # Moto com 0.3 toneladas,  2 rodas e capacidade para 2 passageiros
    [0.35, 2, 2],  # Moto com 0.35 toneladas, 2 rodas e capacidade para 2 passageiros
    [0.4, 2, 2]  # Moto com 0.4 toneladas,  2 rodas e capacidade para 2 passageiros

]

# Lista chamada 'rotulos' contendo rótulos para cada
# conjunto de dados em 'dados'.
# Esses rótulos são usados para identificar a categoria 
# de cada veículo (Carro, Caminhão, Moto).
rotulos = [

    # Cada 'Carro' corresponde a uma sub-lista em 'dados' que 
    # define as características de um carro.
    "Carro", "Carro", "Carro", "Carro", "Carro",

    # Cada 'Caminhão' corresponde a uma sub-lista em 'dados' que 
    # define as características de um caminhão.
    "Caminhão", "Caminhão", "Caminhão", "Caminhão", "Caminhão",

    # Cada 'Moto' corresponde a uma sub-lista em 'dados' que 
    # define as características de uma moto.
    "Moto", "Moto", "Moto", "Moto", "Moto"

]

# Criando uma instância da classe 'DecisionTreeClassifier' do sklearn.
# 'DecisionTreeClassifier' é um modelo de aprendizado de máquina 
# que aprende a tomar decisões com base nos dados fornecidos.
clf = DecisionTreeClassifier()

# Treinando o classificador com os dados e rótulos fornecidos.
# O método 'fit' ajusta o modelo aos dados fornecidos, permitindo 
# que ele aprenda as relações entre os atributos dos
# veículos (peso, número de rodas, capacidade de passageiros) e
# seus rótulos (Carro, Caminhão, Moto).
clf.fit(dados, rotulos)


# Definição da função 'prever_veiculo', que não recebe argumentos.
def prever_veiculo():
    try:
        # Tentativa de executar um bloco de código que pode gerar erros.

        # Obtenção dos valores inseridos pelo usuário nos campos
        # de entrada da interface gráfica.
        # 'entrada_peso.get()' recupera o texto do campo 'entrada_peso' e
        # converte para float (número com casas decimais).
        peso = float(entrada_peso.get())

        # 'entrada_rodas.get()' recupera o texto do campo 'entrada_rodas' e
        # converte para int (número inteiro).
        rodas = int(entrada_rodas.get())

        # 'entrada_passageiros.get()' recupera o texto do
        # campo 'entrada_passageiros' e converte para int.
        passageiros = int(entrada_passageiros.get())

        # Verificação de valores negativos para peso, rodas ou passageiros.
        # Se qualquer um desses valores for negativo, o código
        # dentro do bloco 'if' será executado.
        if peso < 0 or rodas < 0 or passageiros < 0:
            # Configurando o texto do 'rotulo_resultado' para mostrar uma
            # mensagem de erro e mudando a cor do texto para vermelho.
            rotulo_resultado.config(text="Valores negativos não são permitidos.", fg="red")

            # O 'return' interrompe a execução da função, impedindo que o
            # restante do código seja executado.
            return

        # Criação de uma lista contendo uma sub-lista com os valores
        # de peso, rodas e passageiros.
        # Esta lista será usada para fazer a previsão com o
        # classificador treinado.
        novo_veiculo = [[peso, rodas, passageiros]]

        # Uso do método 'predict' do classificador 'clf' para prever o
        # tipo de veículo baseado nas características fornecidas.
        tipo_predito = clf.predict(novo_veiculo)

        # Configurando o texto do 'rotulo_resultado' para mostrar o tipo
        # de veículo predito e mudando a cor do texto para verde.
        rotulo_resultado.config(text=f"Classificação: {tipo_predito[0]}", fg="green")

    # Bloco 'except' que captura erros de valor, executado se um erro do
    # tipo 'ValueError' for levantado durante a tentativa.
    except ValueError:

        # Configurando o texto do 'rotulo_resultado' para instruir o
        # usuário a inserir valores numéricos válidos e mudando a
        # cor do texto para vermelho.
        rotulo_resultado.config(text="Por favor, insira valores numéricos válidos.", fg="red")


# Criando uma instância da classe 'Tk', que será a
# janela principal da nossa aplicação.
# Esta janela servirá como a superfície principal onde todos os
# widgets (como botões, entradas de texto, etc.) serão adicionados.
janela = tk.Tk()

# Definindo o título da janela. O título aparece na barra superior da
# janela e ajuda os usuários a identificar o propósito da aplicação.
janela.title("Classificação de Veículos - Árvore de Decisão")

# Configurando as dimensões da janela. '400x300' define a
# largura de 400 pixels e altura de 300 pixels.
janela.geometry("400x300")

# Configurando a cor de fundo da janela. O valor '#f0f0f0' é
# uma cor cinza claro, que será usada como plano de fundo da janela.
janela.configure(bg="#f0f0f0")

# Criando um 'Frame' (quadro) dentro da janela principal, que
# ajudará a organizar visualmente os widgets dentro da janela.
# 'padding=20' adiciona um espaçamento interno de 20 pixels em
# todos os lados dentro do quadro.
# 'relief="solid"' define o estilo da borda do quadro como
# sólido, o que dá uma indicação visual clara dos limites do quadro.
# 'borderwidth=2' define a largura da borda do quadro em 2 pixels.
quadro = ttk.Frame(janela, padding=20, relief="solid", borderwidth=2)

# 'pack()' é um método de gerenciamento de geometria no Tkinter.
# Ele é usado para adicionar o quadro à janela.
# 'pady=20' adiciona um espaçamento vertical de 20 pixels acima e
# abaixo do quadro para separá-lo de outros elementos
# presentes na janela.
quadro.pack(pady=20)

# Criando um rótulo 'Label' usando a classe 'Label' do módulo 'ttk'.
# Este rótulo será utilizado para mostrar o título da aplicação.
# 'quadro' é o widget pai onde este rótulo será colocado, o que
# significa que o rótulo será exibido dentro do quadro que
# já foi adicionado à janela principal.
rotulo_titulo = ttk.Label(quadro,

                          # 'text' define o conteúdo textual do rótulo,
                          # que neste caso é "Classificação de Veículos".
                          text="Classificação de Veículos",

                          # 'font' define a fonte do texto, usando Arial de
                          # tamanho 14 e em negrito.
                          font=("Arial", 14, "bold"))

# Usando o método 'grid' para posicionar o rótulo dentro do quadro.
# 'grid' é um método de gerenciamento de geometria que
# posiciona widgets em uma grade.
# 'row=0' coloca o rótulo na primeira linha (linhas são
# contadas a partir de 0).
# 'column=0' coloca o rótulo na primeira coluna (colunas também
# são contadas a partir de 0).
# 'columnspan=2' faz com que o rótulo ocupe o espaço de duas
# colunas, o que é útil quando o rótulo precisa ser mais
# largo que os outros widgets na mesma linha.
# 'pady=10' adiciona um espaçamento vertical de 10 pixels acima e
# abaixo do rótulo, ajudando a separá-lo visualmente de
# outros elementos na interface.
rotulo_titulo.grid(row=0, column=0, columnspan=2, pady=10)

# Criando um rótulo 'Label' para identificar o campo onde o
# usuário deverá inserir o peso do veículo.
# 'rotulo_peso' é a variável que armazena o widget de rótulo.
# 'text="Peso do veículo (toneladas):"' define o texto que aparece no
# rótulo, informando ao usuário que ele deve inserir o
# peso do veículo em toneladas.
rotulo_peso = ttk.Label(quadro, text="Peso do veículo (toneladas):")

# Posicionando o rótulo 'rotulo_peso' dentro do 'quadro'
# usando o gerenciador de geometria 'grid'.
# 'row=1' coloca o rótulo na segunda linha da interface (o índice
# começa em 0, então 1 é a segunda linha).
# 'column=0' coloca o rótulo na primeira coluna.
# 'padx=10' adiciona um espaçamento horizontal de 10 pixels em
# ambos os lados do rótulo, ajudando a separá-lo visualmente dos outros elementos.
# 'pady=5' adiciona um espaçamento vertical de 5 pixels
# acima e abaixo do rótulo.
# 'sticky="e"' faz com que o rótulo alinhe à direita dentro de
# sua célula na grade. 'e' significa 'east' (leste).
rotulo_peso.grid(row=1, column=0, padx=10, pady=5, sticky="e")

# Criando um campo de entrada 'Entry' onde o
# usuário pode digitar o peso do veículo.
# 'entrada_peso' é a variável que armazena o widget de entrada.
entrada_peso = ttk.Entry(quadro)

# Posicionando o campo de entrada 'entrada_peso' na interface.
# 'row=1' especifica que está na mesma linha
# que o rótulo do peso.
# 'column=1' coloca o campo de entrada na segunda
# coluna, ao lado do rótulo.
# 'padx=10' e 'pady=5' aplicam o mesmo espaçamento usado
# para o rótulo, mantendo a consistência visual.
entrada_peso.grid(row=1, column=1, padx=10, pady=5)

# Criando um rótulo 'Label' para o campo de entrada
# do número de rodas do veículo.
# 'rotulo_rodas' é a variável que armazena o widget de rótulo.
# 'text="Número de rodas:"' define o texto que aparece no
# rótulo, instruindo o usuário a inserir o número de rodas do veículo.
rotulo_rodas = ttk.Label(quadro, text="Número de rodas:")

# Posicionando o rótulo 'rotulo_rodas' dentro do 'quadro'
# usando o gerenciador de geometria 'grid'.
# 'row=2' coloca o rótulo na terceira linha da interface (índice começa em 0).
# 'column=0' coloca o rótulo na primeira coluna.
# 'padx=10' adiciona um espaçamento horizontal de 10 pixels em
# ambos os lados do rótulo, ajudando na organização visual.
# 'pady=5' adiciona um espaçamento vertical de 5 pixels acima e abaixo do rótulo.
# 'sticky="e"' faz com que o rótulo alinhe à direita dentro de
# sua célula na grade. 'e' significa 'east' (leste), garantindo que o
# texto fique alinhado próximo ao campo de entrada ao lado.
rotulo_rodas.grid(row=2, column=0, padx=10, pady=5, sticky="e")

# Criando um campo de entrada 'Entry' onde o usuário pode
# digitar o número de rodas do veículo.
# 'entrada_rodas' é a variável que armazena o widget de entrada.
entrada_rodas = ttk.Entry(quadro)

# Posicionando o campo de entrada 'entrada_rodas' na interface.
# 'row=2' especifica que está na mesma linha que o rótulo de rodas.
# 'column=1' coloca o campo de entrada na segunda
# coluna, ao lado do rótulo.
# 'padx=10' e 'pady=5' aplicam espaçamentos idênticos aos
# usados para o rótulo, mantendo uma aparência
# consistente e organizada.
entrada_rodas.grid(row=2, column=1, padx=10, pady=5)

# Criando um rótulo 'Label' para o campo de entrada da
# capacidade de passageiros do veículo.
# 'rotulo_passageiros' é a variável que armazena o widget de rótulo.
# 'text="Capacidade de passageiros:"' define o texto que aparece
# no rótulo, informando ao usuário que ele deve inserir a
# capacidade de passageiros do veículo.
rotulo_passageiros = ttk.Label(quadro, text="Capacidade de passageiros:")

# Posicionando o rótulo 'rotulo_passageiros' dentro do 'quadro'
# usando o gerenciador de geometria 'grid'.
# 'row=3' coloca o rótulo na quarta linha da interface (as
# linhas são contadas a partir de 0).
# 'column=0' coloca o rótulo na primeira coluna.
# 'padx=10' adiciona um espaçamento horizontal de 10 pixels em
# ambos os lados do rótulo, proporcionando uma margem e
# ajudando a separá-lo de outros elementos.
# 'pady=5' adiciona um espaçamento vertical de 5 pixels
# acima e abaixo do rótulo.
# 'sticky="e"' faz com que o rótulo alinhe à direita dentro de sua
# célula na grade. A opção 'e' (leste) alinha o texto à borda
# direita da célula, mantendo-o próximo ao campo de entrada ao lado.
rotulo_passageiros.grid(row=3, column=0, padx=10, pady=5, sticky="e")

# Criando um campo de entrada 'Entry' onde o usuário pode
# digitar a capacidade de passageiros do veículo.
# 'entrada_passageiros' é a variável que armazena o widget de entrada.
entrada_passageiros = ttk.Entry(quadro)

# Posicionando o campo de entrada 'entrada_passageiros' na interface.
# 'row=3' especifica que está na mesma linha que o rótulo
# de capacidade de passageiros.
# 'column=1' coloca o campo de entrada na segunda coluna,
# diretamente ao lado do rótulo.
# 'padx=10' e 'pady=5' aplicam o mesmo espaçamento horizontal e
# vertical usado para o rótulo, assegurando uniformidade e organização visual.
entrada_passageiros.grid(row=3, column=1, padx=10, pady=5)

# Criando um botão 'Button' usando a classe 'Button' do módulo 'ttk'.
# 'botao_classificar' é a variável que armazena o widget do botão.
# 'text="Classificar"' define o texto que aparece no
# botão, que é "Classificar". Esse texto instrui
# claramente o usuário sobre o que o botão faz.
# 'command=prever_veiculo' associa este botão à função 'prever_veiculo'.
# Quando o botão é pressionado, a função 'prever_veiculo' é chamada.
# Essa função é responsável por coletar os dados inseridos,
# processá-los com o modelo de classificação e exibir o resultado.
botao_classificar = ttk.Button(quadro, text="Classificar", command=prever_veiculo)

# Posicionando o botão 'botao_classificar' dentro do 'quadro'
# usando o gerenciador de geometria 'grid'.
# 'row=4' coloca o botão na quinta linha da interface (as
# linhas são contadas a partir de 0).
# 'column=0' coloca o botão na primeira coluna.
# 'columnspan=2' faz com que o botão ocupe o espaço de duas colunas.
# Isso é útil para garantir que o botão seja largo o suficiente
# para ser facilmente clicável e visualmente equilibrado na interface.
# 'pady=10' adiciona um espaçamento vertical de 10 pixels acima e
# abaixo do botão, ajudando a separá-lo de outros elementos
# na interface e tornando-o mais acessível.
botao_classificar.grid(row=4, column=0, columnspan=2, pady=10)

# Criando um rótulo 'Label' usando a classe 'Label' do módulo 'tk'.
# 'rotulo_resultado' é a variável que armazena o widget de rótulo.
# 'text=""' inicia o rótulo sem texto. O texto será atualizado
# dinamicamente para mostrar o resultado da classificação
# após o usuário pressionar o botão "Classificar".
# 'font=("Arial", 12, "bold")' define a fonte do texto no rótulo.
# Aqui, 'Arial' tamanho 12 em negrito é usado para dar
# destaque ao texto do resultado.
# 'bg="#f0f0f0"' configura a cor de fundo do rótulo para ser a
# mesma do fundo da janela, garantindo uma aparência uniforme e limpa.
rotulo_resultado = tk.Label(quadro, text="", font=("Arial", 12, "bold"), bg="#f0f0f0")

# Posicionando o rótulo 'rotulo_resultado' dentro do 'quadro'
# usando o gerenciador de geometria 'grid'.
# 'row=5' coloca o rótulo na sexta linha da interface, que é reservada
# para mostrar o resultado da classificação.
# 'column=0' coloca o rótulo na primeira coluna.
# 'columnspan=2' faz com que o rótulo ocupe o espaço de duas colunas, garantindo
# que haja espaço suficiente para exibir o resultado sem restrições.
# 'pady=10' adiciona um espaçamento vertical de 10 pixels acima e abaixo
# do rótulo.
# Esse espaçamento não apenas separa visualmente o rótulo de outros
# elementos mas também melhora a legibilidade ao dar espaço
# ao redor do texto do resultado.
rotulo_resultado.grid(row=5, column=0, columnspan=2, pady=10)

# Executando o loop principal do Tkinter
janela.mainloop()
