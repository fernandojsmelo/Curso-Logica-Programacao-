# Importando a biblioteca 'numpy' com o apelido 'np'.
# Numpy é uma biblioteca usada para operações matemáticas em
# larga escala, especialmente com arrays e matrizes.
# A abreviação 'np' é usada para tornar o código mais
# curto e rápido de escrever.
import numpy as np

# Importando a biblioteca 'tkinter' com o apelido 'tk'.
# Tkinter é uma biblioteca padrão do Python para criar
# interfaces gráficas de usuário (GUI).
# Ela fornece widgets como botões, entradas de texto, rótulos,
# etc., que podem ser usados para construir
# aplicativos de desktop.
import tkinter as tk

# Importando o módulo 'messagebox' da biblioteca 'tkinter'.
# 'messagebox' é usado para exibir caixas de diálogo de alerta,
# erro, confirmação e informação, facilitando a
# interação com o usuário.
from tkinter import messagebox

# Importando a classe 'LinearRegression' do módulo 'linear_model'
# da biblioteca 'sklearn'.
# 'LinearRegression' é um modelo estatístico usado para prever valores
# de uma variável dependente, baseado em uma ou mais variáveis
# independentes, assumindo uma relação linear entre essas variáveis.
# É amplamente utilizado em análises preditivas e estatísticas.
from sklearn.linear_model import LinearRegression

# Importando a biblioteca 'matplotlib.pyplot' com o apelido 'plt'.
# 'matplotlib.pyplot' é uma coleção de funções que fazem com que o
# Matplotlib funcione como o MATLAB, facilitando a criação de
# visualizações de dados como gráficos e plotagens.
# A abreviação 'plt' é usada para simplificar e agilizar a escrita do código.
import matplotlib.pyplot as plt


# Função 'mostrar_tela' é usada para alternar a exibição entre
# diferentes frames (telas) em uma aplicação Tkinter.
def mostrar_tela(tela):
    # 'tela_principal.pack_forget()' remove o layout da tela
    # principal do gerenciador de geometria.
    # Isso faz com que a tela principal seja ocultada (não será
    # mais visível na janela da aplicação).
    tela_principal.pack_forget()

    # 'tela.pack()' adiciona o frame especificado pelo parâmetro 'tela'
    # ao gerenciador de geometria.
    # Isso torna a tela especificada visível ao usuário. O layout e
    # os widgets da tela especificada serão mostrados.
    tela.pack()


# Esta função define 'exibir_grafico', que tem como objetivo
# visualizar os dados e as previsões de lucro de funcionários,
# levando em consideração o tempo de operação das empresas.
def exibir_grafico(funcionarios, tempo_operacao, lucros, modelo, entrada_prever=None, previsao_lucro=None):
    # Cria uma nova figura (ou janela de gráfico) com tamanho 10
    # polegadas de largura por 6 polegadas de altura.
    plt.figure(figsize=(10, 6))

    # Plota no gráfico os pontos dos dados reais, onde cada ponto
    # representa o número de funcionários de uma empresa e
    # seu correspondente lucro.
    # 'color' define a cor dos pontos, 'label' fornece uma etiqueta
    # para a legenda e 's' define o tamanho dos pontos no gráfico.
    plt.scatter(funcionarios,
                lucros,
                color='blue',
                label='Funcionários vs Lucro', s=100)

    # Adiciona uma linha de regressão ao gráfico, que é uma representação
    # visual do modelo matemático que relaciona o número de
    # funcionários e o tempo de operação com o lucro da empresa.
    # Esta linha é traçada usando os valores previstos pelo modelo
    # de regressão linear para os dados de funcionários e
    # tempo de operação.
    # A função 'modelo.predict()' é usada para calcular os lucros previstos a
    # partir das entradas fornecidas (número de funcionários e
    # tempo de operação).
    # 'np.hstack((funcionarios, tempo_operacao))' combina as duas matrizes de
    # entrada horizontalmente, o que é necessário porque o modelo
    # espera receber os dados nesse formato.
    # 'color' define a cor da linha, 'label' é o texto que descreve a
    # linha na legenda, e 'linewidth' é a espessura da linha no gráfico.
    plt.plot(funcionarios, modelo.predict(np.hstack((funcionarios, tempo_operacao))),
             color='red',
             label='Linha de Regressão',
             linewidth=3)

    # Este bloco verifica a presença de dados de previsão e
    # valores de lucro previstos.
    if entrada_prever is not None and previsao_lucro is not None:
        # 'plt.scatter' adiciona pontos ao gráfico.
        # 'entrada_prever[:, 0]' acessa todos os elementos da primeira
        # coluna da matriz 'entrada_prever',
        # que representa o número de funcionários para os
        # quais o lucro está sendo previsto.
        plt.scatter(

            # Acessa a primeira coluna de 'entrada_prever', que são os
            # valores de funcionários previstos.
            entrada_prever[:, 0],

            # Os valores de lucro que o modelo previu para os dados de entrada.
            previsao_lucro,

            # Define a cor dos pontos no gráfico como verde.
            color='green',

            # Texto para a legenda, mostrando o número de funcionários e o
            # lucro previsto formatado como moeda.
            label=f'Previsão: {entrada_prever[0][0]} funcionários, Lucro: R$ {previsao_lucro[0]:,.2f}',

            # O formato dos marcadores é 'x', distinguindo-os visualmente
            # de outros pontos no gráfico.
            marker='x',

            # Define o tamanho dos pontos. Aqui, '200' é um valor
            # maior para fazer esses pontos se destacarem.
            s=200

        )

    # Configurações adicionais para tornar o gráfico mais legível e informativo:
    # 'title' adiciona um título ao gráfico, 'xlabel' e 'ylabel' adicionam
    # rótulos aos eixos X e Y, respectivamente.
    # 'fontsize' ajusta o tamanho da fonte para título e rótulos.
    # 'grid(True)' habilita uma grade no gráfico para facilitar a
    # leitura dos dados.
    # 'legend' adiciona uma legenda ao gráfico, e 'loc' especifica a
    # localização da legenda.
    plt.title('Previsão de Lucro com base no Número de Funcionários e Tempo de Operação', fontsize=16)
    plt.xlabel('Número de Funcionários', fontsize=14)
    plt.ylabel('Lucro (R$)', fontsize=14)
    plt.grid(True)
    plt.legend(loc='upper left', fontsize=12)

    # Ajusta automaticamente os subplots para dar espaço às
    # margens do gráfico e evitar sobreposições.
    plt.tight_layout()

    # Exibe o gráfico na tela.
    plt.show()


# Esta função é responsável por mostrar os dados reais das empresas em
# termos de número de funcionários, tempo de operação e lucro.
def exibir_dados_reais():
    # Inicializa uma string que servirá para acumular os dados de
    # cada empresa para exibição.
    # A string começa com um cabeçalho explicando os dados que
    # serão listados abaixo.
    dados_texto = "\nDados Reais (Número de Funcionários, Tempo de Operação e Lucro):\n"

    # Um loop que itera sobre a lista de funcionários. O uso de 'len(funcionarios)'
    # indica que iremos percorrer toda a lista de funcionários.
    for i in range(len(funcionarios)):
        # Concatena informações de cada empresa à string 'dados_texto'. 'i' é
        # o índice atual do loop, começando de 0.
        # 'funcionarios[i][0]' acessa o número de funcionários da i-ésima
        # empresa (nota: assumimos que 'funcionarios' é uma lista de listas).
        # 'tempo_operacao[i][0]' acessa o tempo de operação da i-ésima empresa.
        # 'lucros[i]' acessa o lucro da i-ésima empresa, formatado como
        # valor monetário com duas casas decimais e separadores de milhar.
        # A cada iteração, uma nova linha com os dados da empresa é
        # adicionada a 'dados_texto'.
        dados_texto += f"Empresa {i + 1}: {funcionarios[i][0]} funcionários, {tempo_operacao[i][0]} anos - Lucro: R$ {lucros[i]:,.2f}\n"

    # Configura o texto do widget 'mensagem_dados' para mostrar a
    # string 'dados_texto' que foi construída no loop.
    # 'mensagem_dados.config' é um método para configurar propriedades
    # de um widget no tkinter, neste caso, atualizando o texto exibido.
    mensagem_dados.config(text=dados_texto)


# Função para prever lucro com base no número de funcionários e no
# tempo de operação de uma empresa.
def prever_lucro():
    # Tenta executar o bloco de código a seguir. Se algum erro de
    # valor ocorrer, será tratado pelo bloco 'except'.
    try:

        # Obtém o número de funcionários a partir de um campo de
        # entrada e converte para float.
        # 'entrada_funcionarios_prever.get()' recupera o texto do campo de
        # entrada no GUI e 'float()' tenta converter este texto
        # para um número decimal.
        num_funcionarios = float(entrada_funcionarios_prever.get())

        # Obtém o tempo de operação a partir de outro campo de entrada e
        # também converte para float.
        # Assim como para os funcionários, 'entrada_tempo_operacao_prever.get()'
        # recupera o texto e 'float()' converte para decimal.
        tempo_op = float(entrada_tempo_operacao_prever.get())

        # Cria uma matriz NumPy com os valores obtidos, que será usada como
        # entrada para o modelo de previsão.
        # 'np.array([[num_funcionarios, tempo_op]])' cria uma matriz
        # bidimensional com uma linha contendo os dois valores.
        entrada_prever = np.array([[num_funcionarios, tempo_op]])

        # Usa o modelo de regressão linear previamente treinado para
        # prever o lucro com base nos dados de entrada.
        # 'modelo.predict(entrada_prever)' realiza a previsão usando o
        # modelo, que espera receber uma matriz com as variáveis de entrada.
        previsao_lucro = modelo.predict(entrada_prever)

        # Exibe uma caixa de mensagem informando o lucro previsto.
        # 'messagebox.showinfo' cria uma janela de diálogo informativa com o
        # título 'Previsão de Lucro' e a mensagem formatada com o lucro previsto.
        messagebox.showinfo("Previsão de Lucro", f"Lucro previsto: R$ {previsao_lucro[0]:,.2f}")

        # Chama a função 'exibir_grafico' para mostrar o gráfico com os
        # dados reais e a previsão recém-calculada.
        # Esta chamada passa os dados necessários para plotar o gráfico,
        # incluindo os dados de previsão e lucro previsto.
        exibir_grafico(funcionarios, tempo_operacao, lucros, modelo, entrada_prever, previsao_lucro)


    # Caso haja um erro na conversão para float, por inserção de dados não
    # numéricos, captura o erro e exibe uma mensagem.
    except ValueError:

        # 'messagebox.showerror' cria uma janela de diálogo de erro com o
        # título 'Erro' e uma mensagem pedindo a inserção de valores numéricos válidos.
        messagebox.showerror("Erro", "Por favor, insira valores numéricos válidos.")


# Função 'voltar' é usada para retornar à tela principal a
# partir de qualquer outra tela.
def voltar():
    # 'janela_principal.winfo_children()' obtém uma lista de
    # todos os widgets filhos da janela principal.
    # Esse método é útil para manipular ou verificar todos os
    # widgets contidos em um widget pai, neste caso, 'janela_principal'.
    for widget in janela_principal.winfo_children():
        # 'widget.pack_forget()' remove cada widget filho do
        # gerenciador de geometria 'pack'.
        # Isso efetivamente limpa a janela principal de quaisquer
        # telas ou widgets que foram adicionados anteriormente.
        widget.pack_forget()

    # 'tela_principal.pack()' adiciona novamente a tela
    # principal ao gerenciador de geometria.
    # Isso torna a tela principal visível novamente após
    # outros widgets terem sido removidos.
    tela_principal.pack()


# Dados iniciais (simulação)
# Estes são dados simulados para representar números de
# funcionários, tempo de operação e lucro de várias empresas.
# Cada lista contém dados específicos que serão utilizados
# para análise e visualização no programa.

# Lista de listas contendo o número de funcionários em várias empresas.
# Cada sublista contém um único elemento que representa o
# número de funcionários em uma empresa específica.
funcionarios = [[10], [20], [30], [40], [50], [60], [70], [80], [90], [100]]

# Lista de listas contendo o tempo de operação em anos
# de várias empresas.
# Cada sublista contém um único elemento que representa o
# tempo de operação de uma empresa específica.
tempo_operacao = [[2], [3], [4], [5], [6], [7], [8], [9], [10], [11]]

# Lista contendo os lucros de várias empresas.
# Cada elemento da lista é um número que representa o
# lucro total anual de uma empresa em reais.
lucros = [100000, 150000, 200000, 250000, 300000, 350000, 400000, 450000, 500000, 550000]

# Transformar listas em arrays para manipulação no numpy
# As listas de funcionários e tempo de operação são
# transformadas em arrays do Numpy.
# Numpy é uma biblioteca que facilita a realização de operações
# matemáticas e científicas em grandes quantidades de dados.
# A conversão para arrays do Numpy permite a utilização
# eficiente desses dados em cálculos e modelagens estatísticas.

# Convertendo a lista 'funcionarios' em um array Numpy
# para permitir operações matemáticas eficientes.
funcionarios = np.array(funcionarios)

# Convertendo a lista 'tempo_operacao' em um array Numpy
# para permitir operações matemáticas eficientes.
tempo_operacao = np.array(tempo_operacao)

# Convertendo a lista 'lucros' em um array Numpy para
# permitir operações matemáticas eficientes.
lucros = np.array(lucros)

# Criar e treinar o modelo de regressão linear
# 'LinearRegression()' cria uma instância de um modelo de
# regressão linear da biblioteca sklearn.
modelo = LinearRegression()

# 'np.hstack()' combina os arrays de funcionários e tempo de
# operação horizontalmente.
# Isso cria uma única matriz de entrada para o modelo, onde
# cada linha contém o número de funcionários e o
# tempo de operação de uma empresa.
entradas = np.hstack((funcionarios, tempo_operacao))

# 'modelo.fit()' treina o modelo de regressão linear com as
# entradas fornecidas e os lucros correspondentes.
# Este método ajusta o modelo para encontrar a melhor
# linha de regressão que relaciona as entradas com os lucros.
modelo.fit(entradas, lucros)

# Interface Tkinter
# Cria uma nova janela Tkinter que servirá como a
# janela principal do aplicativo.
janela_principal = tk.Tk()

# Define o título da janela principal, que aparecerá na
# barra de título da janela.
janela_principal.title("Previsão de Lucro de Empresas")

# Tela principal (menu)
# Cria um frame (container) dentro da janela principal que
# servirá como a tela principal do aplicativo.
tela_principal = tk.Frame(janela_principal)

# 'pack()' é um gerenciador de geometria do Tkinter que organiza
# widgets em blocos antes de colocá-los na janela pai.
# Aqui, ele é usado para adicionar o frame 'tela_principal' à
# janela 'janela_principal', tornando-o visível.
tela_principal.pack()

# Criação de um rótulo (label) dentro da tela principal.
# 'tk.Label' é uma função do Tkinter que cria um widget de texto.
# Este widget será usado para mostrar um rótulo estático na GUI.
label_menu = tk.Label(tela_principal,
                      text="Menu de Opções",
                      font=("Arial", 20))
# 'tela_principal' é o contêiner onde o rótulo será colocado.
# 'text' define o texto que aparecerá no rótulo, neste caso, "Menu de Opções".
# 'font' define a fonte e o tamanho do texto, aqui usamos "Arial" tamanho 20.

# 'pack()' é usado para organizar e mostrar o widget na interface.
# 'pady=10' adiciona um espaçamento vertical de 10 pixels acima e
# abaixo do rótulo para separá-lo visualmente de outros widgets.
label_menu.pack(pady=10)

# Criação de um botão dentro da tela principal.
# 'tk.Button' cria um botão que os usuários podem clicar
# para executar uma ação.
btn_exibir_dados = tk.Button(tela_principal,
                             text="1 - Exibir Dados Reais",
                             font=("Arial", 20),
                             width=30, command=lambda:
    mostrar_tela(tela_dados))

# 'text' define o texto que aparecerá no botão, neste
# caso, "1 - Exibir Dados Reais".
# 'command=lambda: mostrar_tela(tela_dados)' define a ação
# que será executada quando o botão for clicado.
# Aqui, ele usa uma função lambda para chamar 'mostrar_tela' com
# 'tela_dados' como argumento, permitindo a troca
# para a tela de dados reais.

# Organiza e mostra o botão na interface usando 'pack()'.
# 'pady=5' adiciona um espaçamento vertical de 5 pixels
# acima e abaixo do botão.
btn_exibir_dados.pack(pady=5)

# Criação de um botão para prever lucros.
# 'tk.Button' cria um botão na tela principal.
btn_prever = tk.Button(tela_principal,
                       text="2 - Prever Lucro",
                       font=("Arial", 20),
                       width=30,
                       command=lambda: mostrar_tela(tela_previsao))
# 'text' define o texto que aparecerá no botão, neste caso, "2 - Prever Lucro".
# 'width=30' especifica a largura do botão, garantindo que o
# texto caiba confortavelmente.
# 'command=lambda: mostrar_tela(tela_previsao)' associa uma
# função que será chamada quando o botão for clicado.
# Neste caso, o botão muda a exibição para 'tela_previsao',
# onde os usuários podem inserir dados para prever o lucro.

# Usa 'pack()' para organizar e mostrar o botão na tela.
# 'pady=5' adiciona um espaçamento vertical de 5 pixels acima e
# abaixo do botão, ajudando a separar visualmente os botões na interface.
btn_prever.pack(pady=5)

# Criação de um botão para exibir o gráfico de regressão.
# 'tk.Button' novamente cria outro botão na tela principal.
btn_grafico = tk.Button(tela_principal,
                        text="3 - Exibir Gráfico de Regressão",
                        font=("Arial", 20),
                        width=30,
                        command=lambda: exibir_grafico(funcionarios, tempo_operacao, lucros, modelo))
# 'text' define o texto do botão, "3 - Exibir Gráfico de Regressão".
# 'command=lambda: exibir_grafico(funcionarios, tempo_operacao, lucros, modelo)'
# associa o botão à função que plota o gráfico de regressão.
# A função 'exibir_grafico' é chamada com os dados de funcionários,
# tempo de operação, lucros e o modelo de regressão como argumentos.

# Usa 'pack()' para organizar e exibir o botão na tela.
# 'pady=5' adiciona espaçamento vertical semelhante ao anterior
# para manter a consistência visual entre os botões.
btn_grafico.pack(pady=5)

# Criação de um botão "Sair" que permitirá ao usuário fechar a aplicação.
# 'tk.Button' cria um novo botão na tela principal.
btn_sair = tk.Button(tela_principal,
                     text="4 - Sair",
                     font=("Arial", 20),
                     width=30,
                     command=janela_principal.destroy)
# 'text="4 - Sair"' define o rótulo do botão que
# aparecerá na interface gráfica.
# 'command=janela_principal.destroy' associa o botão à
# função 'destroy', que fechará a janela principal e
# encerrará o aplicativo.

# Organiza e exibe o botão na tela usando o método 'pack()'.
# 'pady=5' adiciona um espaçamento vertical de 5 pixels acima e
# abaixo do botão, ajudando a separar os botões visualmente.
btn_sair.pack(pady=5)

# Criação de um frame adicional chamado 'tela_dados' que
# servirá como a tela para exibição dos dados reais.
# 'tk.Frame' cria um novo frame dentro da janela principal.
tela_dados = tk.Frame(janela_principal)

# Criação de um botão "Voltar" que permite ao usuário
# retornar à tela principal do aplicativo.
# 'tk.Button' cria um novo botão dentro do frame 'tela_dados'.
btn_voltar_dados = tk.Button(tela_dados,
                             text="Voltar",
                             font=("Arial", 20),
                             command=voltar)
# 'text="Voltar"' define o rótulo do botão, que indica a
# ação de retornar à tela anterior.
# 'command=voltar' associa o botão à função 'voltar', que
# quando acionada, ocultará a tela atual e mostrará a
# tela principal novamente.

# Organiza e exibe o botão "Voltar" no frame 'tela_dados'
# usando o método 'pack()'.
# 'pady=10' adiciona um espaçamento vertical de 10 pixels acima
# do botão para um alinhamento visual apropriado e para
# separá-lo de outros elementos na tela.
btn_voltar_dados.pack(pady=10)

# Criação de um widget Label no Tkinter para exibir os
# dados reais das empresas.
mensagem_dados = tk.Label(tela_dados, text="", font=("Arial", 20))
# Aqui, 'tk.Label' é usado para criar um rótulo na tela
# de dados reais ('tela_dados').
# 'text=""' inicializa o Label sem nenhum texto, pois
# ele será preenchido dinamicamente.
# 'font=("Arial", 20)' define a fonte do texto como Arial e
# o tamanho da fonte como 20, tornando o texto
# claramente legível.

# Método 'pack()' é utilizado para adicionar o Label ao layout
# da tela de dados. Este método organiza o Label
# dentro do frame 'tela_dados'.
mensagem_dados.pack()
# 'pack()' sem argumentos adicionais coloca o Label no
# centro do espaço disponível.
# O Label agora está pronto para mostrar os dados que serão
# carregados pela função 'exibir_dados_reais'.

# Chama a função 'exibir_dados_reais' que atualiza o texto do
# Label 'mensagem_dados' com os dados reais formatados de
# funcionários, tempo de operação e lucros.
exibir_dados_reais()
# Esta função acessa variáveis globais ou externas que contêm os
# dados reais e formata essas informações em uma string,
# que então é exibida pelo Label.


# Criação de um Frame dentro da janela principal para conter os
# componentes relacionados à previsão de lucro.
tela_previsao = tk.Frame(janela_principal)
# 'tk.Frame(janela_principal)' cria um novo container dentro da
# janela principal. Este frame será usado para agrupar
# elementos relacionados à previsão de lucro.

# Criação de um Label dentro do frame 'tela_previsao' para
# indicar a funcionalidade desta parte da interface.
label_previsao = tk.Label(tela_previsao,
                          text="Prever Lucro",
                          font=("Arial", 20))
# 'text="Prever Lucro"' define o texto do Label, que informa o
# usuário sobre o propósito desta seção da interface.
# 'font=("Arial", 20)' escolhe a fonte Arial no tamanho 20,
# garantindo que o texto seja grande e claro o suficiente
# para ser facilmente lido.

# Método 'pack()' é usado para organizar o Label dentro do
# frame 'tela_previsao' e adicioná-lo ao layout.
label_previsao.pack(pady=10)
# 'pady=10' adiciona um espaçamento vertical de 10 pixels acima e
# abaixo do Label, ajudando a separar visualmente este
# Label de outros elementos na tela.


# Criação de um Label dentro do frame 'tela_previsao' que serve
# para indicar ao usuário onde ele deve inserir o número de funcionários.
label_funcionarios_prever = tk.Label(tela_previsao,
                                     font=("Arial", 20),
                                     text="Número de Funcionários:")
# 'tk.Label' é o construtor que cria um widget de rótulo.
# 'tela_previsao' é o contêiner onde este Label será colocado.
# 'text="Número de Funcionários:"' define o texto que será
# exibido, orientando o usuário sobre o que é esperado nesse campo.

# Utilização do método 'pack()' para adicionar o Label ao
# layout do frame 'tela_previsao'.
label_funcionarios_prever.pack()
# O método 'pack()' é chamado sem parâmetros adicionais, o que
# significa que o Label será centrado e ajustado ao tamanho do texto.
# Este método automaticamente aloca espaço na tela para o
# Label dentro de seu contêiner.

# Criação de um campo de entrada (Entry) para que o usuário
# possa digitar o número de funcionários.
entrada_funcionarios_prever = tk.Entry(tela_previsao, font=("Arial", 20))
# 'tk.Entry' é o construtor que cria um widget de
# campo de entrada de texto.
# 'tela_previsao' indica que este campo de entrada será
# posicionado dentro do frame da tela de previsão.

# Utilização do método 'pack()' para adicionar o campo de
# entrada ao layout.
entrada_funcionarios_prever.pack()
# Assim como o Label, o método 'pack()' sem parâmetros
# adicionais centra o campo de entrada e o ajusta ao conteúdo.
# Isso facilita a entrada de dados pelo usuário, mantendo o
# layout organizado e intuitivo.

# Criação de um Label no frame 'tela_previsao' para indicar onde os
# usuários devem inserir o tempo de operação da empresa em anos.
label_tempo_operacao_prever = tk.Label(tela_previsao,
                                       font=("Arial", 20),
                                       text="Tempo de Operação (anos):")
# 'tk.Label' cria um widget de rótulo.
# 'tela_previsao' é o contêiner parente onde este Label será exibido.
# 'text="Tempo de Operação (anos):"' define claramente o texto que
# orienta o usuário sobre que dado deve ser inserido nesse campo.

# Organização do Label no frame utilizando o método 'pack()'.
label_tempo_operacao_prever.pack()
# Chamar 'pack()' sem parâmetros adicionais posiciona o Label no
# centro e ajusta seu tamanho ao conteúdo, mantendo o
# design da interface limpo e organizado.

# Criação de um campo de entrada (Entry) dentro de 'tela_previsao'
# para que o usuário possa digitar o tempo de operação da empresa.
entrada_tempo_operacao_prever = tk.Entry(tela_previsao, font=("Arial", 20))
# 'tk.Entry' é utilizado para criar um widget que permite a
# entrada de texto linha única.
# Associar este campo ao frame 'tela_previsao' insere-o
# na tela de previsão de lucro.

# Adição do campo de entrada ao layout usando o método 'pack()'.
entrada_tempo_operacao_prever.pack()
# Similar ao Label, usar 'pack()' sem especificar parâmetros
# centra o campo de entrada e ajusta automaticamente seu
# tamanho, facilitando a entrada de dados pelo usuário.

# Criação de um botão "Prever" que o usuário pode clicar para
# iniciar o processo de previsão de lucro.
btn_prever_lucro = tk.Button(tela_previsao,
                             text="Prever",
                             font=("Arial", 20),
                             command=prever_lucro)
# 'tk.Button' cria um botão no frame 'tela_previsao'.
# 'text="Prever"' define o rótulo do botão, que é o que o
# usuário vê. O texto "Prever" indica claramente a
# ação que o botão realizará.
# 'command=prever_lucro' associa este botão à função 'prever_lucro',
# que será chamada quando o botão for clicado. Essa função é
# responsável por coletar os dados inseridos, calcular a
# previsão e exibir o resultado.

# Posicionamento do botão "Prever" no layout usando 'pack()',
# que o adiciona ao frame.
btn_prever_lucro.pack(pady=10)
# 'pady=10' adiciona um espaçamento vertical de 10 pixels acima e
# abaixo do botão, ajudando a separar este botão de outros
# elementos na tela para uma melhor apresentação visual.


# Criação de um botão "Voltar" que permite ao usuário retornar à
# tela principal do aplicativo.
btn_voltar_previsao = tk.Button(tela_previsao,
                                text="Voltar",
                                font=("Arial", 20),
                                command=voltar)
# 'tk.Button' cria um botão dentro do frame 'tela_previsao'.
# 'text="Voltar"' é o rótulo do botão, indicando sua função de
# levar o usuário de volta à tela anterior ou principal.
# 'command=voltar' conecta o botão à função 'voltar', que oculta a
# tela atual e mostra novamente a tela principal
# quando o botão é clicado.

# Organização do botão "Voltar" usando o método 'pack()'.
btn_voltar_previsao.pack(pady=10)
# O uso de 'pady=10' garante um espaçamento vertical consistente
# como o do botão "Prever", mantendo o design uniforme e organizado.

# Início do loop principal do Tkinter, que mantém a janela aberta e
# responde a eventos como cliques de botão.
janela_principal.mainloop()
