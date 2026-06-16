# Importa o módulo tkinter e o nomeia como 'tk', facilitando sua
# utilização no código para criar ‘interfaces’ gráficas.
import tkinter as tk

# Importa o componente 'messagebox' do módulo tkinter, que é
# utilizado paraa mostrar caixas de mensagem (como alertas e confirmações).
from tkinter import messagebox

# Define uma variável global 'vitorias_jogador' para contar as
# vitórias do jogador, iniciando-a em 0.
vitorias_jogador = 0

# Define uma variável global 'vitorias_ia' para contar as vitórias
# da inteligência artificial (IA), iniciando-a em 0.
vitorias_ia = 0

# Define uma variável global 'empates' para contar o número de
# jogos que terminaram em empate, iniciando-a em 0.
empates = 0


# Define a função 'verificar_vencedor' para checar se há
# um vencedor no jogo da velha.
def verificar_vencedor():
    # Declara que as variáveis 'vitorias_jogador', 'vitorias_ia', e
    # 'empates' são globais, permitindo que a função modifique seus valores.
    global vitorias_jogador, vitorias_ia, empates

    # Lista contendo todas as possíveis combinações de índices
    # que representam vitórias no jogo da velha.
    # Cada sublista representa uma linha, coluna ou diagonal
    # completa com o mesmo símbolo ('X' ou 'O').
    combinacoes = [
        [0, 1, 2], [3, 4, 5], [6, 7, 8],  # Linhas horizontais que podem ser completadas para ganhar.
        [0, 3, 6], [1, 4, 7], [2, 5, 8],  # Colunas verticais que podem ser completadas para ganhar.
        [0, 4, 8], [2, 4, 6]  # Diagonais que podem ser completadas para ganhar.
    ]

    # Inicia um loop para verificar cada combinação possível de
    # vitória listada na variável 'combinações'.
    # 'combinacoes' contém listas com três índices cada, representando
    # linhas, colunas ou diagonais do tabuleiro.
    for combinacao in combinacoes:

        # Checa se os três botões correspondentes aos índices na
        # lista 'combinação' têm o mesmo símbolo ('X' ou 'O')
        # e que nenhum dos botões está vazio. Isso é feito a acessar o
        # texto de cada botão e comparando-os.
        if botoes[combinacao[0]]['text'] == botoes[combinacao[1]]['text'] == botoes[combinacao[2]]['text'] != "":

            # Se os três botões têm o mesmo texto e não estão vazios,
            # significa que alguém completou uma linha,
            # coluna ou diagonal, portanto temos um vencedor.
            # O texto do primeiro botão da combinação é armazenado
            # na variável 'vencedor'. Este texto pode ser 'X' ou 'O',
            # dependendo de quem fez a jogada vencedora.
            vencedor = botoes[combinacao[0]]['text']

            # Verifica se o vencedor é o jogador humano,
            #  representado pelo símbolo 'X'.
            if vencedor == "X":

                # Se o jogador humano é o vencedor, o contador de suas
                # vitórias é incrementado em 1.
                vitorias_jogador += 1

                # A função 'atualizar_placar' é chamada para atualizar o placar
                # visual na interface do usuário.
                # Esta função modifica o texto de um label para refletir o
                # número atualizado de vitórias, derrotas e empates.
                atualizar_placar()

                # Uma caixa de diálogo é mostrada informando que o jogador
                # venceu a partida, dando feedback imediato.
                messagebox.showinfo("Resultado", "Você venceu!")

            else:

                # Se o vencedor é a IA, representada pelo símbolo 'O', o
                # contador de vitórias da IA é incrementado em 1.
                vitorias_ia += 1

                # Similarmente ao caso do jogador humano, a função 'atualizar_placar' é
                # chamada para atualizar o placar.
                atualizar_placar()

                # Uma caixa de diálogo é mostrada informando que a IA venceu a partida.
                messagebox.showinfo("Resultado", "A IA venceu!")

            # Independente de quem venceu, a função 'reiniciar_jogo' é
            # chamada para limpar o tabuleiro, permitindo que uma
            # nova partida seja iniciada sem necessidade de reiniciar o programa.
            reiniciar_jogo()

            # Retorna True para indicar que um vencedor foi encontrado, o
            # que pode ser útil para controlar o fluxo do jogo.
            return True

    # Verificar empate
    # Inicia a verificação para determinar se o jogo terminou em empate.
    # Um empate acontece quando todos os botões estão preenchidos ('X' ou 'O'),
    # mas nenhuma das condições de vitória foi satisfeita.

    # A função 'all' é usada aqui para verificar todos os botões
    # em uma única operação.
    # O código dentro dos parênteses gera uma sequência de valores
    # booleanos (True ou False), um para cada botão no tabuleiro.
    if all(botao['text'] != "" for botao in botoes):
        # Se todos os botões contêm texto (não estão vazios), isso indica
        # que não há espaços vazios restantes no tabuleiro.

        # Incrementa o contador de empates, pois todos os espaços estão
        # preenchidos e nenhuma linha, coluna ou diagonal
        # completa foi formada.
        empates += 1

        # Chama a função 'atualizar_placar' para refletir o novo número de
        # empates no placar visual exibido na interface do usuário.
        atualizar_placar()

        # Exibe uma mensagem de diálogo informando aos jogadores que o
        # jogo terminou em empate.
        messagebox.showinfo("Resultado", "Empate!")

        # Chama a função 'reiniciar_jogo' para limpar todos os botões do
        # tabuleiro e permitir que uma nova partida seja iniciada.
        reiniciar_jogo()

        # Retorna True para indicar que o jogo terminou em empate.
        return True

    # Se o jogo não terminou (nem vitória, nem empate), a
    # função retorna False.
    # Isso indica que o jogo ainda está em andamento e
    # mais jogadas podem ser feitas.
    return False


# Define a função 'minimax', que é um algoritmo de otimização utilizado
# para encontrar o melhor movimento em jogos de soma
# zero (como o jogo da velha).
# Recebe como parâmetros o estado atual do tabuleiro, o jogador
# atual ('X' ou 'O'), e a profundidade da recursão.
def minimax(tabuleiro, jogador, profundidade):
    # Determina quem é o adversário do jogador atual. Se o jogador
    # atual é 'O', o adversário será 'X', e vice-versa.
    # Isso é necessário porque o MiniMax simula jogadas para
    # ambos os jogadores alternadamente.
    adversario = "X" if jogador == "O" else "O"

    # Inicia um loop para verificar se há uma combinação
    # vencedora no tabuleiro atual.
    # Esta seção avalia todas as linhas, colunas e diagonais para
    # ver se alguma está completa com o mesmo símbolo.
    for combinacao in [
        [0, 1, 2], [3, 4, 5], [6, 7, 8],  # Verifica linhas horizontais
        [0, 3, 6], [1, 4, 7], [2, 5, 8],  # Verifica colunas verticais
        [0, 4, 8], [2, 4, 6]]:  # Verifica diagonais

        # Checa se os símbolos em uma das combinações possíveis são
        # iguais e não vazios, indicando uma vitória.
        if tabuleiro[combinacao[0]] == tabuleiro[combinacao[1]] == tabuleiro[combinacao[2]] != "":
            # Retorna um valor numérico representando o resultado
            # do jogo nesse ponto:
            # 1 multiplicado por (10 menos a profundidade) se 'O' (IA)
            # vence, ou -1 multiplicado por (10 menos a profundidade)
            # se 'X' (adversário) vence.
            # Isso significa que quanto mais rápido a vitória ou derrota é
            # alcançada, maior ou mais negativo é o valor retornado.
            # A profundidade é subtraída de 10 para dar maior valor às
            # vitórias rápidas ou às derrotas lentas.
            return (1 if tabuleiro[combinacao[0]] == "O" else -1) * (10 - profundidade), None

    # Verifica se o tabuleiro está completamente preenchido, o que
    # indica um empate se não houver vencedor anterior.
    # Isso é feito verificando se não existe mais nenhum espaço
    # vazio (representado por "") no tabuleiro.
    if "" not in tabuleiro:
        # Retorna 0 e None. O retorno 0 indica que o jogo terminou em
        # empate (nenhum jogador tem vantagem),
        # e None é usado para indicar que não há movimento
        # recomendado associado a este estado (já que o jogo terminou).
        return 0, None

    # Inicializa uma lista para armazenar os movimentos possíveis e os
    # resultados correspondentes do MiniMax.
    # 'movimentos' armazenará tuplas contendo o resultado do MiniMax e
    # o índice do movimento feito.
    movimentos = []

    # Itera sobre cada posição do tabuleiro (que tem 9 posições
    # em um jogo da velha).
    for i in range(9):

        # Verifica se a posição atual está vazia, o que indica que
        # um movimento é possível nessa posição.
        if tabuleiro[i] == "":
            # Cria uma cópia do tabuleiro atual para simular o movimento
            # sem alterar o tabuleiro original.
            novo_tabuleiro = tabuleiro[:]

            # Simula o movimento do jogador atual na posição vazia.
            novo_tabuleiro[i] = jogador

            # Recursivamente chama a função MiniMax no novo tabuleiro,
            # passando o adversário como o próximo jogador
            # e aumentando a profundidade por 1, para avaliar as
            # consequências desse movimento.
            resultado, _ = minimax(novo_tabuleiro, adversario, profundidade + 1)

            # Adiciona o resultado da avaliação e o índice do
            # movimento à lista de movimentos,
            # armazenando a eficácia do movimento e onde
            # ele ocorreu no tabuleiro.
            movimentos.append((resultado, i))

    # Esta condição verifica qual jogador está realizando a jogada atualmente.
    # Se o jogador for "O", que é a IA neste caso, ela tentará
    # maximizar sua pontuação.
    if jogador == "O":

        # A função 'max' é usada para selecionar o movimento que
        # maximiza o resultado para a IA.
        # 'movimentos' é uma lista de tuplas, onde cada tupla contém o
        # resultado do MiniMax e o índice do movimento correspondente.
        # 'key=lambda x: x[0]' é uma função que ajuda a 'max' a decidir
        # qual tupla tem o maior valor de MiniMax,
        # indicando assim o melhor movimento para a IA com base
        # na maximização de sua vantagem.
        melhor_movimento = max(movimentos, key=lambda x: x[0])

    else:

        # Se o jogador for "X", a IA simula a jogada do adversário e
        # tentará minimizar a pontuação do adversário.
        # Isso é feito para prever e bloquear os movimentos que seriam
        # mais vantajosos para o adversário.
        # A função 'min' seleciona a jogada que resulta na menor pontuação
        # possível para o adversário, minimizando assim suas chances de vencer.
        melhor_movimento = min(movimentos, key=lambda x: x[0])

    # Retorna a tupla contendo o melhor resultado do MiniMax e o
    # índice do movimento.
    # Esta tupla é usada para fazer o movimento no tabuleiro
    # principal e para avaliar jogadas futuras.
    return melhor_movimento


# Define a função 'jogada_ia', que é responsável por executar a
# jogada da inteligência artificial no jogo.
def jogada_ia():
    # Primeiro, converte o estado atual do tabuleiro de jogo (representado
    # pelos botões na interface gráfica) em uma lista simples.
    # Esta lista 'tabuleiro' contém os textos ('', 'X', ou 'O') de cada botão,
    # representando o estado de cada célula do tabuleiro.
    tabuleiro = [botao['text'] for botao in botoes]

    # Chama a função 'minimax' para determinar o melhor movimento para a IA.
    # 'minimax' é chamada com o tabuleiro atual, o jogador atual 'O' (IA), e
    # o nível de profundidade inicial 0.
    # O retorno de 'minimax' é uma tupla, onde o primeiro elemento é
    # ignorado (_) e o segundo é o índice do melhor movimento.
    _, melhor_movimento = minimax(tabuleiro, "O", 0)

    # Configura o botão no índice determinado pelo 'melhor_movimento'
    # para ter o texto 'O'.
    # Isso atualiza o tabuleiro de jogo na interface, colocando a
    # marca da IA ('O') na posição calculada como a mais vantajosa.
    botoes[melhor_movimento].config(text="O")

    # Após a IA fazer sua jogada, a função 'verificar_vencedor' é
    # chamada para verificar se a jogada resultou em uma vitória,
    # empate ou se o jogo deve continuar. Esta função também pode
    # tratar de reiniciar o jogo se necessário.
    verificar_vencedor()


# Define a função 'jogada_jogador', que é responsável por
# processar as jogadas feitas pelo jogador humano.
def jogada_jogador(botao):
    # Primeiro, verifica se o botão (célula do tabuleiro) clicado está vazio.
    # Isso é feito verificando se o texto do botão é igual a "".
    # Se estiver vazio, o jogador pode fazer sua jogada nessa célula.
    if botao['text'] == "":

        # Define o texto do botão para "X", que é o símbolo usado
        # pelo jogador humano no jogo.
        botao['text'] = "X"

        # Após o jogador fazer sua jogada, chama a função 'verificar_vencedor'
        # para checar se essa jogada resultou em uma vitória.
        # Se 'verificar_vencedor' retornar False, significa que a jogada
        # não resultou em vitória nem em empate, e o jogo continua.
        if not verificar_vencedor():
            # Se não houve vencedor ou empate, chama a função 'jogada_ia'
            # para que a IA faça sua jogada.
            # Isso só acontece se o jogo ainda estiver em andamento
            # após a jogada do jogador.
            jogada_ia()


# Define a função 'reiniciar_jogo', que é chamada quando é
# necessário iniciar uma nova partida.
def reiniciar_jogo():
    # Inicia um loop que percorre cada 'botao' na lista de botões
    # que compõem o tabuleiro do jogo.
    for botao in botoes:
        # Define o texto de cada botão para uma string vazia "",
        # efetivamente limpando o tabuleiro.
        # Isso remove todas as marcas 'X' e 'O', preparando o
        # tabuleiro para uma nova partida.
        botao['text'] = ""


# Define a função 'atualizar_placar', que atualiza o texto do
# placar na interface gráfica.
def atualizar_placar():
    # Configura o texto do 'label_placar' para mostrar o número atual
    # de vitórias do jogador, da IA e de empates.
    # 'f' antes das aspas permite a inserção de variáveis diretamente no
    # texto, que é uma funcionalidade do Python chamada f-string.
    # 'vitorias_jogador', 'vitorias_ia', e 'empates' são substituídos
    # pelos seus valores atuais.
    label_placar.config(text=f"Jogador: {vitorias_jogador} | IA: {vitorias_ia} | Empates: {empates}")


# Inicializa a janela principal do Tkinter para a interface
# gráfica do usuário.
janela = tk.Tk()

# Define o título da janela que aparecerá na barra de
# título da janela do aplicativo.
janela.title("Jogo da Velha com IA")

# Define as dimensões da janela, neste caso, 550 pixels de
# largura por 500 pixels de altura.
janela.geometry("550x500")  # Ajuste no tamanho da janela

# Configura a janela para que não seja redimensionável, o que
# significa que o usuário não pode alterar seu tamanho.
janela.resizable(False, False)

# Cria um widget de texto (Label) que serve como o título do jogo dentro da interface.
# 'tk.Label' cria um componente de texto que pode ser adicionado à janela.
# 'janela' é o contêiner pai onde este label será colocado.
# 'text' define o texto a ser exibido, neste caso, "Jogo da Velha".
# 'font' define a fonte do texto, aqui usando "Arial" tamanho 24.
# 'fg' é uma abreviação de 'foreground', que define a cor do texto, neste caso, azul.
titulo = tk.Label(janela,
                  text="Jogo da Velha",
                  font=("Arial", 24),
                  fg="blue")

# 'pack' é um gerenciador de geometria em Tkinter que
# posiciona o widget dentro da janela.
# 'pady' é uma opção que adiciona espaço vertical acima e
# abaixo do widget, neste caso, 10 pixels.
titulo.pack(pady=10)

# Inicializa uma lista vazia chamada 'botoes'. Esta lista será
# preenchida com os botões que representam as células
# do tabuleiro de jogo.
botoes = []

# Cria um Frame em Tkinter, que é um contêiner usado para
# agrupar outros widgets.
# 'tk.Frame' cria o frame e 'janela' especifica que este frame
# será colocado dentro da janela principal.
frame_jogo = tk.Frame(janela)

# Posiciona o frame na janela usando o gerenciador de geometria 'pack',
# que o coloca de forma padrão no centro da área disponível.
frame_jogo.pack()

# Inicia um loop que irá iterar 9 vezes, uma para cada célula do
# tabuleiro do jogo da velha.
for i in range(9):
    # Cria um botão utilizando a classe Button do Tkinter.
    # 'frame_jogo' é o contêiner pai onde este botão será adicionado.
    # 'text' inicialmente é uma string vazia, indicando que o botão
    # não tem marcação inicial.
    # 'width' e 'height' definem a largura e altura do botão, respectivamente.
    # Aqui, cada botão tem largura 10 e altura 3.
    # 'font' define a fonte e tamanho do texto do botão, neste caso,
    # Arial tamanho 20, o que ajuda a garantir que as marcações ('X' ou 'O')
    # sejam claramente visíveis.
    # 'command' é uma função que é chamada quando o botão é clicado.
    # Neste caso, uma função lambda é usada para passar o índice
    # do botão para a função 'jogada_jogador'.
    # A função lambda é necessária aqui para corretamente associar
    # cada botão com seu índice 'i' dentro do loop.
    botao = tk.Button(frame_jogo,
                      text="",
                      width=10,
                      height=3,
                      font=("Arial", 20),
                      command=lambda i=i: jogada_jogador(botoes[i]))

    # Usa o gerenciador de geometria 'grid' para posicionar
    # cada botão em uma grade 3x3.
    # 'row=i//3' e 'column=i%3' calculam, respectivamente, a
    # linha e a coluna baseadas no índice 'i'.
    # 'i//3' realiza uma divisão inteira de 'i' por 3,
    # resultando na linha do botão (0, 1, ou 2).
    # 'i%3' realiza uma operação de módulo, resultando
    # na coluna do botão (0, 1, ou 2).
    botao.grid(row=i // 3, column=i % 3)

    # Adiciona o botão criado à lista 'botoes'. Esta lista é
    # usada para acessar os botões posteriormente,
    # por exemplo, para verificar o estado do jogo ou
    # para modificar o texto de um botão específico.
    botoes.append(botao)

# Cria um rótulo (Label) para exibir o placar atual do jogo.
# 'tk.Label' cria um componente de texto que é adicionado à janela principal.
# 'janela' especifica que este rótulo será posicionado na
# janela do aplicativo.
# 'text' inicialmente mostra o placar como "Jogador: 0 | IA: 0 | Empates: 0",
# refletindo o estado inicial do jogo.
# 'font' define a fonte e o tamanho do texto do rótulo,
# usando "Arial" tamanho 14.
# 'fg' (foreground) define a cor do texto, neste caso, verde,
# para destacar o placar na interface do usuário.
label_placar = tk.Label(janela,
                        text="Jogador: 0 | IA: 0 | Empates: 0",
                        font=("Arial", 14),
                        fg="green")

# 'pack' é usado para adicionar o rótulo à janela. 'pady=20'
# adiciona 20 pixels de espaço vertical acima e
# abaixo do rótulo, para separação visual.
label_placar.pack(pady=20)

# Cria um botão para permitir aos jogadores reiniciar o
# jogo a qualquer momento.
# 'tk.Button' cria um componente de botão que é adicionado à janela principal.
# 'text' define o rótulo do botão como "Reiniciar Jogo",
# que descreve sua função.
# 'font' define a fonte e o tamanho do texto no botão, usando "Arial"
# tamanho 14, para consistência visual com o rótulo do placar.
# 'command' é associado à função 'reiniciar_jogo', que é chamada
# quando o botão é clicado, reiniciando o jogo.
botao_reiniciar = tk.Button(janela,
                            text="Reiniciar Jogo",
                            font=("Arial", 14),
                            command=reiniciar_jogo)

# 'pack' é usado para adicionar o botão à janela.
# 'pady=10' adiciona 10 pixels de espaço vertical acima e abaixo do botão.
botao_reiniciar.pack(pady=10)

# Iniciar a interface
janela.mainloop()