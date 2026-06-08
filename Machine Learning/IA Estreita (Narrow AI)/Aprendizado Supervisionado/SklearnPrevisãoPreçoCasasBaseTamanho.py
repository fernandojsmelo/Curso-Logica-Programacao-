# Importa o módulo tkinter para criar interfaces gráficas
import tkinter as tk

# Importa ttk de tkinter para usar widgets com estilo melhorado
from tkinter import ttk

# Importa a biblioteca pandas para manipulação de
        # dados em formato de tabela
import pandas as pd

# Importa o modelo de regressão linear da biblioteca
        # sklearn para realizar previsões
from sklearn.linear_model import LinearRegression


# Função responsável por prever o preço de uma casa com base
        # no tamanho fornecido pelo usuário
def prever_preco():
    try:

        # Obtém o valor que o usuário digitou no campo de entrada 'entry_tamanho'
        # O método .get() pega o texto da caixa de entrada, e float()
        # converte esse texto para um número decimal (float)
        # Isso é necessário porque o que o usuário digita é tratado
        # como texto (string), e precisamos de um número
        tamanho = float(entry_tamanho.get())

        # Usa o modelo de regressão linear (treinado anteriormente)
        # para prever o preço com base no tamanho fornecido
        # O tamanho é passado como uma lista de listas ([[tamanho]])
        # para funcionar com o modelo de previsão
        previsao_preco = modelo.predict([[tamanho]])

        # Exibe o resultado na tela, na label 'label_resultado'
        # A função config() altera o texto da label para mostrar o preço estimado
        # O valor é formatado para ter duas casas decimais usando {:.2f}, e '[0]'
        # acessa o primeiro (e único) valor da previsão
        label_resultado.config(text=f"O preço estimado para uma casa de {tamanho}m² é: R${previsao_preco[0]:.2f} mil")

    # Este bloco 'except' será executado se o usuário digitar algo que
    # não possa ser convertido para número (como letras)
    except ValueError:

        # Exibe uma mensagem de erro na 'label_resultado' pedindo
        # que o usuário insira um número válido
        label_resultado.config(text="Por favor, insira um valor numérico válido.")

    # Este bloco 'except' captura qualquer outro tipo de erro que possa
    # ocorrer (que não seja um erro de valor)
    except Exception as e:

        # Exibe uma mensagem de erro genérica, incluindo o
        # tipo de erro que ocorreu
        label_resultado.config(text=f"Erro ao fazer a previsão: {e}")


# Função responsável por carregar os dados do arquivo Excel e treinar o
# modelo automaticamente quando a aplicação inicia
def carregar_dados():

    try:

        # Carrega os dados do arquivo 'preco_casas.xlsx', que deve
        # estar no mesmo diretório do código
        # A função pd.read_excel() lê os dados do arquivo Excel e
        # transforma em um DataFrame (uma tabela de dados)
        dados = pd.read_excel('preco_casas.xlsx')

        # Extrai os tamanhos das casas da coluna 'Tamanho (m²)' do DataFrame
        # .values pega os dados da coluna e transforma em um array (matriz) do numpy
        # .reshape(-1, 1) ajusta os dados para o formato adequado para o
        # modelo de regressão (n linhas e 1 coluna)
        tamanhos = dados['Tamanho (m²)'].values.reshape(-1, 1)

        # Extrai os preços das casas da coluna 'Preço (mil reais)' do DataFrame
        # Aqui não precisamos usar .reshape() porque os preços já
        # estão no formato correto (array 1D)
        precos = dados['Preço (mil reais)'].values

        # Declara o modelo como global para poder ser acessado em
        # outras partes do código
        # 'global modelo' significa que a variável 'modelo' será
        # usada fora dessa função
        global modelo

        # Cria um modelo de Regressão Linear (importado da biblioteca sklearn)
        # Esse modelo é uma ferramenta que tenta "aprender" a relação
        # entre o tamanho da casa e o preço
        modelo = LinearRegression()

        # Treina o modelo usando os dados de tamanho (tamanhos) e
        # preço (precos)
        # O método fit() ajusta o modelo para encontrar a relação entre o
        # tamanho da casa e o preço
        modelo.fit(tamanhos, precos)

        # Atualiza o texto da label 'label_status' para indicar que o
        # modelo foi carregado e treinado com sucesso
        # A cor do texto é alterada para verde para indicar sucesso
        label_status.config(text="Modelo carregado e treinado com sucesso!",
                            fg='green')

    # Caso ocorra qualquer erro durante o processo (como um problema ao
    # ler o arquivo Excel), o bloco 'except' será executado
    except Exception as e:

        # Exibe uma mensagem de erro na 'label_status' informando o
        # tipo de erro que aconteceu.
        # A cor do texto é alterada para vermelho para indicar falha.
        label_status.config(text=f"Erro ao carregar os dados: {e}", fg='red')


# Criação da interface gráfica
janela = tk.Tk()  # Cria uma nova janela (janela principal da aplicação)
janela.title("Previsão de Preço de Casas")  # Define o título da janela
janela.geometry("550x350")  # Define as dimensões da janela (largura x altura)

# Configuração de estilo para definir a fonte padrão de todos os widgets da janela
janela.option_add("*Font", "Arial 12")

# Define a cor de fundo da janela para um tom claro de cinza
janela.configure(bg="#f5f5f5")

# Cria um rótulo (Label) que será o título da aplicação
# O rótulo é um texto que aparece na interface. Aqui estamos
        # criando um rótulo que dirá "Previsão de Preço de Casas"
# A propriedade 'text' define o que o rótulo vai mostrar,
        # neste caso o título da aplicação
# A propriedade 'font' define o estilo do texto: "Arial" é a
        # fonte, 16 é o tamanho, e "bold" significa negrito
# A propriedade 'bg' define a cor de fundo do rótulo, neste
        # caso um tom claro de cinza ("#f5f5f5")
titulo = tk.Label(janela,
                  text="Previsão de Preço de Casas",
                  font=("Arial", 16, "bold"),
                  bg="#f5f5f5")

# O método pack() posiciona o rótulo na janela
# O parâmetro 'pady=10' adiciona um espaçamento vertical de
        # 10 pixels acima e abaixo do rótulo, para que o texto
        # não fique colado nos outros elementos
titulo.pack(pady=10)

# Cria um frame (um contêiner invisível) para agrupar e
        # organizar elementos dentro dele
# Um frame é uma área onde podemos colocar outros widgets,
        # neste caso ele vai agrupar o status do modelo (carregado ou não)
# A propriedade 'bg' define a cor de fundo do frame, igual à
        # cor de fundo da janela principal, para manter o design consistente
frame_status = tk.Frame(janela,
                        bg="#f5f5f5")

# O método pack() posiciona o frame na janela
# O parâmetro 'fill="x"' faz com que o frame preencha
        # toda a largura da janela
# O parâmetro 'padx=20' adiciona um espaçamento horizontal
        # de 20 pixels nas laterais do frame, criando
        # uma margem nas bordas
frame_status.pack(fill="x", padx=20)

# Cria um rótulo (Label) dentro do frame 'frame_status' para
        # exibir o status do carregamento e treinamento do modelo
# 'text="Carregando modelo..."' define o texto inicial que será
        # exibido enquanto o modelo está sendo carregado
# 'font=("Arial", 10, "italic")' define a fonte do texto como Arial,
        # tamanho 10, e o estilo como itálico
# 'bg="#f5f5f5"' define a cor de fundo do rótulo (mesma cor do
        # fundo da janela, para manter o visual consistente)
# 'fg="blue"' define a cor do texto como azul, para
        # dar um destaque visual
label_status = tk.Label(frame_status,
                        text="Carregando modelo...",
                        font=("Arial", 10, "italic"),
                        bg="#f5f5f5",
                        fg="blue")

# O método pack() posiciona o rótulo dentro do frame 'frame_status'
# Aqui não estamos usando parâmetros adicionais, então o
        # rótulo será centralizado dentro do frame
label_status.pack()

# Cria um novo frame chamado 'frame_input', que será usado
        # para organizar os campos de entrada de dados
# Esse frame também usa o mesmo fundo '#f5f5f5' para manter o
        # estilo da interface consistente
frame_input = tk.Frame(janela, bg="#f5f5f5")

# Posiciona o frame 'frame_input' na janela principal
# O parâmetro 'pady=20' adiciona um espaçamento vertical de 20 pixels
        # acima e abaixo do frame, criando um espaço entre os elementos
frame_input.pack(pady=20)

# Cria um rótulo (Label) dentro do frame 'frame_input' que informa ao
        # usuário que ele deve inserir o tamanho da casa
# O parâmetro 'text="Tamanho da Casa (m²):"' define o texto que
        # será exibido ao lado do campo de entrada
# 'bg="#f5f5f5"' define a cor de fundo do rótulo para combinar
        # com o resto da interface
rotulo_tamanho = tk.Label(frame_input,
                          text="Tamanho da Casa (m²):",
                          bg="#f5f5f5")

# O método 'grid()' posiciona o rótulo em uma grade (grid) dentro do frame
# 'row=0' significa que o rótulo será colocado na primeira linha da grid
# 'column=0' significa que o rótulo será colocado na primeira coluna da grid
# 'padx=10' e 'pady=10' adicionam um espaçamento de 10 pixels ao
        # redor do rótulo, tanto na horizontal (padx) quanto na vertical (pady)
rotulo_tamanho.grid(row=0, column=0, padx=10, pady=10)

# Cria um campo de entrada de texto (Entry) onde o usuário
        # poderá digitar o tamanho da casa
# Esse campo de entrada faz parte do frame 'frame_input'
# 'width=15' define a largura do campo, ou seja, o número de
        # caracteres visíveis que o campo de texto pode exibir
entry_tamanho = ttk.Entry(frame_input, width=15)

# O método 'grid()' também posiciona o campo de entrada na
        # mesma grade do rótulo
# 'row=0' e 'column=1' colocam o campo de entrada na primeira
        # linha e na segunda coluna, ao lado do rótulo
# Assim, o rótulo "Tamanho da Casa (m²):" fica ao lado
        # esquerdo do campo de entrada
# 'padx=10' e 'pady=10' adicionam o mesmo espaçamento de 10
        # pixels ao redor do campo de entrada
entry_tamanho.grid(row=0, column=1, padx=10, pady=10)

# Cria um botão que o usuário pode clicar para
        # realizar a previsão do preço
# 'text="Prever Preço"' define o texto que será exibido no botão
# 'command=prever_preco' faz com que, quando o botão for
        # clicado, a função 'prever_preco' seja executada
# O botão está sendo criado dentro da janela principal ('janela')
botao_prever = ttk.Button(janela,
                          text="Prever Preço",
                          command=prever_preco)

# O método 'pack()' exibe o botão na janela, e o parâmetro 'pady=10'
        # adiciona um espaçamento vertical de 10 pixels
# Isso evita que o botão fique colado em outros elementos da interface
botao_prever.pack(pady=10)

# Cria um rótulo (label) vazio onde será exibido o resultado da
        # previsão depois que o cálculo for feito
# 'text=""' significa que, inicialmente, o rótulo não vai mostrar
        # nenhum texto (vai ficar vazio até o resultado aparecer)
# 'font=("Arial", 12, "bold")' define que o texto do rótulo será
        # exibido com a fonte Arial, tamanho 12, e em negrito
# 'bg="#f5f5f5"' define a cor de fundo do rótulo, mantendo o
        # visual consistente com o resto da interface
# 'fg="black"' define que a cor do texto será preta
label_resultado = tk.Label(janela,
                           text="",
                           font=("Arial", 12, "bold"),
                           bg="#f5f5f5",
                           fg="black")

# O método 'pack()' posiciona o rótulo na janela principal
# 'pady=20' adiciona um espaçamento vertical de 20 pixels,
        # para que o rótulo fique bem separado dos outros elementos
label_resultado.pack(pady=20)


# Carrega e treina o modelo automaticamente ao iniciar a aplicação
carregar_dados()  # Chama a função para carregar os
                  # dados e treinar o modelo

# Mantém a janela aberta para interações (loop principal
        # da interface gráfica)
janela.mainloop()