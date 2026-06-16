# Importa o módulo tkinter como 'tk', usado para criar e
# gerenciar a interface gráfica do usuário.
import tkinter as tk

# Importa o módulo random, que contém funções para gerar
# números aleatórios, utilizado para posicionar o
# alimento na tela de forma aleatória.
import random

# Importa o módulo heapq, uma biblioteca de fila de prioridade
# que será usada para implementar o algoritmo de
# busca A* na lógica da IA.
import heapq

# Importa a sub biblioteca messagebox de tkinter, usada para exibir
# mensagens em caixas de diálogo, como avisos de fim de jogo.
from tkinter import messagebox

# Configurações estáticas do jogo:
# Define a largura da janela do jogo em pixels.
LARGURA_TELA = 400

# Define a altura da janela do jogo em pixels.
ALTURA_TELA = 400

# Define o tamanho de cada célula do grid na tela,
# que corresponde ao tamanho de cada segmento da
# cobra e das frutas.
TAMANHO_CELULA = 20

# Define o intervalo em milissegundos entre cada movimento
# da cobra, controlando a velocidade do jogo.
VELOCIDADE = 100

# Variáveis de estado do jogo:
# Inicializa a pontuação do jogador como 0. Esta variável é
# incrementada cada vez que a cobra come uma fruta.
pontuacao = 0

# Contador de quantas frutas a cobra comeu durante o jogo, usado
# para rastrear o progresso e, potencialmente, dificuldades incrementais.
frutas_comidas = 0

# Modo de jogo inicialmente definido para que a IA
# controle a cobra por padrão.
# Se True, permite ao jogador controlar a cobra;
# se False, a IA controla a cobra.
modo_jogador = False


# Define uma função chamada 'centralizar_janela' que
# aceita três parâmetros: janela, largura e altura.
# Esta função é utilizada para posicionar centralmente a
# janela da aplicação na tela do utilizador.
def centralizar_janela(janela,
                       largura, altura):

    # Obtém a largura total da tela do dispositivo onde a
    # aplicação está sendo executada.
    # 'winfo_screenwidth()' é um método do Tkinter que
    # retorna a largura da tela em pixels.
    largura_tela = janela.winfo_screenwidth()

    # Obtém a altura total da tela do dispositivo.
    # 'winfo_screenheight()' é um método do Tkinter que
    # retorna a altura da tela em pixels.
    altura_tela = janela.winfo_screenheight()

    # Calcula a posição 'x' (horizontal) para a janela.
    # A posição 'x' é calculada pegando a metade da largura da
    # tela e subtraindo metade da largura da janela.
    # Isso coloca a janela exatamente no meio da tela horizontalmente.
    x = (largura_tela // 2) - (largura // 2)

    # Calcula a posição 'y' (vertical) para a janela.
    # A posição 'y' é calculada pegando a metade da altura da
    # tela e subtraindo metade da altura da janela.
    # Isso coloca a janela exatamente no meio da tela verticalmente.
    y = (altura_tela // 2) - (altura // 2)

    # Define a geometria da janela usando uma string formatada que
    # especifica largura, altura e posições 'x' e 'y'.
    # O método 'geometry' é utilizado para definir essas dimensões e
    # posição da janela na tela.
    # A string de geometria é formada concatenando a largura e a
    # altura da janela com as posições 'x' e 'y' calculadas.
    janela.geometry(f"{largura}x{altura}+{x}+{y}")


# Define uma função chamada 'reiniciar_variaveis' que não
# aceita parâmetros externos.
# Esta função é responsável por redefinir todas as variáveis de
# estado usadas no jogo para seus valores iniciais.
def reiniciar_variaveis():

    # Declaração de 'global' permite que a função modifique
    # variáveis que foram definidas fora da função, no escopo global.
    global direcao, cobra, alimento, jogando, pontuacao, frutas_comidas

    # Inicializa a direção do movimento da cobra como 'direita'.
    # Isso define o movimento inicial da cobra quando o jogo começa.
    direcao = "direita"

    # Cria uma lista contendo uma única tupla, que define a
    # posição inicial da cobra no centro do campo de jogo.
    # O cálculo usa a largura e altura da tela para
    # posicionar a cobra no meio.
    cobra = [(LARGURA_TELA // 2, ALTURA_TELA // 2)]

    # Chama a função 'gerar_primeiro_alimento' para posicionar o
    # primeiro alimento no jogo.
    # Esta função é projetada para colocar o primeiro alimento de
    # forma previsível e próxima da posição inicial da cobra.
    alimento = gerar_primeiro_alimento()

    # Define a variável 'jogando' como True, o que indica que o
    # jogo está ativo e que a lógica do jogo deve continuar a executar.
    jogando = True

    # Redefine a pontuação do jogador para 0, garantindo que cada
    # novo jogo comece sem pontuação anterior.
    pontuacao = 0

    # Redefine o contador de frutas comidas para 0, essencial
    # para rastrear quantas frutas foram comidas em um novo jogo.
    frutas_comidas = 0


# Define a função 'gerar_primeiro_alimento', responsável por
# colocar a primeira fruta no jogo.
def gerar_primeiro_alimento():

    # Extrai a posição inicial da cabeça da cobra do primeiro
    # elemento da lista 'cobra'.
    # A variável 'cobra' é uma lista de tuplas, cada tupla
    # representando uma parte da cobra no tabuleiro.
    x_cobra, y_cobra = cobra[0]

    # Calcula a posição horizontal 'x' para a primeira fruta.
    # A fruta é posicionada três células à direita da cabeça
    # da cobra, mantendo-a na mesma linha 'y'.
    # 'TAMANHO_CELULA * 3' calcula o deslocamento em pixels
    # baseado no tamanho definido para cada célula do jogo.
    x = x_cobra + TAMANHO_CELULA * 3  # A uma distância de 3 células à direita

    # Verifica se a posição calculada para 'x' não ultrapassa
    # os limites da tela do jogo.
    # 'LARGURA_TELA' é a largura total da área de jogo.
    # Se 'x' for maior ou igual a 'LARGURA_TELA', isso
    # significaria que a fruta estaria fora da tela.
    if x >= LARGURA_TELA:  # Garante que a fruta não seja criada fora da tela

        # Ajusta 'x' para que a fruta apareça na última célula
        # permitida da tela, evitando que fique invisível.
        x = LARGURA_TELA - TAMANHO_CELULA

    # Retorna a posição da fruta como uma tupla (x, y_cobra),
    # onde 'y_cobra' é a linha onde a cobra começou.
    return (x, y_cobra)


# Define a função 'iniciar_jogo', responsável por
# configurar e iniciar cada nova sessão de jogo.
def iniciar_jogo():

    # Chama a função 'reiniciar_variaveis' para redefinir todas as
    # variáveis de estado do jogo para seus valores iniciais.
    # Isso inclui a posição da cobra, direção, pontuação, entre
    # outros, garantindo que cada jogo comece de forma limpa.
    reiniciar_variaveis()  # Reiniciar variáveis sempre que o jogo começar

    # Verifica se o modo de jogo está configurado para controle
    # pelo jogador (modo_jogador = True).
    if modo_jogador:

        # Se o jogador estiver controlando, vincula o evento de
        # pressionamento de teclas à função 'controle_teclas'.
        # 'janela.bind("<KeyPress>", controle_teclas)' permite que o
        # jogador use o teclado para controlar a cobra.
        janela.bind("<KeyPress>", controle_teclas)

    else:

        # Se estiver no modo automático (IA controlando), desvincula
        # qualquer controle manual anterior.
        # 'janela.unbind("<KeyPress>")' remove a vinculação de teclas,
        # fazendo com que o jogador não possa controlar a cobra.
        # Isso garante que a IA funcione sem interferência manual.
        janela.unbind("<KeyPress>")  # Desvincular controle manual se IA estiver ativa

    # Chama a função 'mover', que inicia o movimento
    # da cobra no jogo.
    # Esta função contém a lógica para o movimento contínuo
    # da cobra e será chamada repetidamente.
    mover()


# Define a função 'mover', responsável por atualizar a
# posição da cobra a cada ciclo do jogo.
def mover():

    # Declara variáveis globais que serão modificadas
    # dentro desta função.
    global jogando, cobra, alimento, pontuacao, frutas_comidas

    # Verifica se o jogo está ativo. Se 'jogando' for False, a
    # função retorna e não realiza movimentos, efetivamente
    # pausando o jogo.
    if jogando:

        # Verifica se o modo jogador está desativado, o que
        # indica que a IA está controlando a cobra.
        if not modo_jogador:  # IA ativa se o jogador não estiver controlando

            # Chama a função 'IA_busca_astar' para determinar a
            # próxima direção de movimento baseada na lógica da IA.
            nova_direcao = IA_busca_astar()

            # Atualiza a direção da cobra com a nova
            # direção retornada pela IA.
            mudar_direcao(nova_direcao)

        # Obtém a posição atual da cabeça da cobra (primeiro segmento).
        x, y = cobra[0]

        # Atualiza a posição da cobra baseada na direção
        # atual do movimento.
        # 'TAMANHO_CELULA' é usado como o incremento para mover a
        # cobra pelo tamanho de uma célula na direção especificada.
        if direcao == "cima":
            y -= TAMANHO_CELULA  # Move a cobra para cima, diminuindo o valor de 'y'.
        elif direcao == "baixo":
            y += TAMANHO_CELULA  # Move a cobra para baixo, aumentando o valor de 'y'.
        elif direcao == "esquerda":
            x -= TAMANHO_CELULA  # Move a cobra para a esquerda, diminuindo o valor de 'x'.
        elif direcao == "direita":
            x += TAMANHO_CELULA  # Move a cobra para a direita, aumentando o valor de 'x'.

        # Cria uma nova posição para a cabeça da cobra,
        # com base nos cálculos anteriores.
        nova_posicao = (x, y)

        # Verifica se a nova posição da cabeça da cobra
        # resulta em uma colisão.
        # Colisões podem ocorrer se a cobra bater nas
        # paredes do tabuleiro ou em seu próprio corpo.
        if (x < 0 or x >= LARGURA_TELA or y < 0 or y >= ALTURA_TELA or nova_posicao in cobra):

            # Se qualquer condição de colisão for verdadeira, o jogo termina.
            jogando = False  # Define a variável 'jogando' como False para parar o jogo.

            # Exibe uma mensagem informando que o jogo acabou.
            # A mensagem especifica que a IA perdeu por colisão,
            # que é relevante quando a IA está controlando a cobra.
            messagebox.showinfo("Fim de Jogo", "A IA perdeu ao se colidir!")

            # Destroi a janela principal do jogo, encerrando
            # efetivamente a aplicação.
            janela.destroy()

            # Retorna da função para evitar a execução de
            # mais código após o fim do jogo.
            return

        # Atualiza a lista que representa a cobra no jogo.
        # A nova posição da cabeça é adicionada ao início da lista 'cobra'.
        # O último segmento da cobra (representado por 'cobra[:-1]') é
        # removido, a menos que a cobra tenha comido uma fruta,
        # o que é tratado em outro ponto da função 'mover'.
        cobra = [nova_posicao] + cobra[:-1]

        # Verifica se a cabeça da cobra (primeiro elemento da
        # lista 'cobra') está na mesma posição do alimento.
        if cobra[0] == alimento:

            # Se a cobra come o alimento, o último segmento da
            # cobra é duplicado, efetivamente aumentando o
            # tamanho da cobra por não remover o último segmento
            # no próximo movimento.
            cobra.append(cobra[-1])

            # Gera uma nova posição para o próximo alimento,
            # chamando a função 'gerar_alimento'.
            alimento = gerar_alimento()

            # Incrementa a pontuação do jogador em 10
            # pontos por cada fruta comida.
            pontuacao += 10

            # Incrementa o contador de frutas comidas.
            frutas_comidas += 1

            # Verifica se o jogador (ou IA, dependendo do modo)
            # atingiu o objetivo de comer 50 frutas.
            if frutas_comidas >= 50:

                # Exibe uma mensagem de parabéns informando que o
                # jogador comeu 50 frutas e o jogo será encerrado.
                messagebox.showinfo("Parabéns!", "Você comeu 50 frutas! Jogo encerrado.")

                # Destroi a janela principal, encerrando o aplicativo.
                janela.destroy()

                # Retorna da função para evitar mais execuções,
                # já que o jogo terminou.
                return

        # Chama a função 'desenhar' para atualizar a visualização
        # da cobra e do alimento no tabuleiro.
        desenhar()

        # Agenda a próxima execução da função 'mover' após um
        # intervalo definido pela constante 'VELOCIDADE'.
        # Isso cria um loop de animação que continua
        # enquanto o jogo estiver ativo.
        janela.after(VELOCIDADE, mover)


# Define a função 'IA_busca_astar', que é usada pela inteligência artificial
# para encontrar um caminho seguro até o alimento.
def IA_busca_astar():

    # Define uma função interna chamada 'heuristica', que é uma função
    # heurística para o algoritmo A*.
    # A função heurística é usada para estimar o custo do caminho
    # mais barato entre dois pontos no grid.
    # Neste caso, ela calcula a distância de Manhattan, que é uma
    # medida de distância em sistemas de grade onde você só pode se mover
    # verticalmente ou horizontalmente (não diagonalmente).
    def heuristica(a, b):

        # Recebe dois pontos 'a' e 'b', onde cada ponto é uma tupla
        # contendo coordenadas x e y (x1, y1) para 'a' e (x2, y2) para 'b'.
        (x1, y1) = a
        (x2, y2) = b

        # Calcula a distância de Manhattan entre os dois pontos: a soma
        # das diferenças absolutas de suas coordenadas x e y.
        # 'abs' é usado para obter o valor absoluto da diferença,
        # garantindo um número não negativo.
        return abs(x1 - x2) + abs(y1 - y2)

    # Define uma função interna 'astar' dentro de 'IA_busca_astar'
    # que implementa o algoritmo de busca A*.
    def astar(cobra, alimento):

        # Inicializa o ponto de partida do algoritmo como a posição
        # atual da cabeça da cobra.
        inicio = cobra[0]

        # Cria uma lista de prioridade 'fila', onde serão armazenados os
        # nós a serem explorados, juntamente com suas prioridades calculadas.
        fila = []

        # 'heapq.heappush' é usado para adicionar o ponto de
        # partida à fila com prioridade 0.
        # A prioridade é baseada no custo estimado para alcançar o
        # alimento, começando de zero.
        heapq.heappush(fila, (0, inicio))

        # Dicionário 'veio_de' usado para rastrear o caminho de
        # volta ao ponto de partida.
        # Armazena qual ponto veio antes de outro, criando um
        # caminho reverso até a origem.
        veio_de = {}

        # 'custo_ate_agora' é um dicionário que mantém o custo
        # acumulado para alcançar cada ponto no grid.
        custo_ate_agora = {}

        # Inicializa o ponto de partida no dicionário 'veio_de'
        # como None, indicando que não tem ponto anterior.
        veio_de[inicio] = None

        # O custo para alcançar o ponto de partida é obviamente
        # zero, pois é o início do caminho.
        custo_ate_agora[inicio] = 0

        # Continua o loop enquanto houver elementos na fila de prioridade.
        while fila:

            # Remove e retorna o item com a menor prioridade na fila,
            # que é uma combinação de custo atual e heurística.
            # O underscore (_) é usado para descartar o primeiro valor da
            # tupla, que é a prioridade usada apenas internamente pelo heapq.
            _, atual = heapq.heappop(fila)

            # Verifica se o ponto atual é o alimento. Se sim, encerra o
            # loop pois o objetivo foi alcançado.
            if atual == alimento:
                break

            # Itera sobre as possíveis direções de movimento da cobra.
            for dx, dy, direcao_nova in [(-TAMANHO_CELULA, 0, "esquerda"),
                                         (TAMANHO_CELULA, 0, "direita"),
                                         (0, -TAMANHO_CELULA, "cima"),
                                         (0, TAMANHO_CELULA, "baixo")]:

                # Calcula as novas coordenadas x e y ajustando o ponto
                # atual com os deltas das direções.
                novo_x, novo_y = atual[0] + dx, atual[1] + dy

                # Cria uma nova posição com as coordenadas atualizadas.
                nova_posicao = (novo_x, novo_y)

                # Verifica se a nova posição é válida dentro dos limites
                # da tela e não está ocupada pela própria cobra.
                if (0 <= novo_x < LARGURA_TELA and 0 <= novo_y < ALTURA_TELA and
                        nova_posicao not in cobra):

                    # Calcula o novo custo para chegar à nova posição, assumindo
                    # um custo constante de 1 por movimento.
                    novo_custo = custo_ate_agora[atual] + 1

                    # Verifica se a nova posição ainda não foi explorada ou se um
                    # caminho mais barato para ela foi encontrado.
                    if nova_posicao not in custo_ate_agora or novo_custo < custo_ate_agora[nova_posicao]:

                        # Atualiza o custo para alcançar a nova posição.
                        custo_ate_agora[nova_posicao] = novo_custo

                        # Calcula a prioridade combinando o novo custo e a heurística
                        # para a posição em relação ao alimento.
                        prioridade = novo_custo + heuristica(alimento, nova_posicao)

                        # Adiciona a nova posição à fila com a prioridade calculada.
                        heapq.heappush(fila, (prioridade, nova_posicao))

                        # Atualiza o caminho de onde veio cada posição.
                        veio_de[nova_posicao] = (atual, direcao_nova)

        # Reconstrução do caminho
        # Inicia o processo de reconstrução do caminho que foi
        # encontrado pelo algoritmo A*.
        caminho = []  # Cria uma lista vazia para armazenar o
                      # caminho da cobra até o alimento.

        # Define a variável 'atual' inicialmente como a posição do alimento,
        # que é o ponto de destino final no caminho encontrado.
        atual = alimento

        # Verifica se a posição do alimento está presente no
        # dicionário 'veio_de'.
        # Se não estiver, significa que não há caminho disponível
        # para o alimento a partir da posição inicial,
        # devido a obstruções ou configuração inicial do jogo.
        if atual not in veio_de:

            # Retorna a direção atual como um mecanismo de fallback, permitindo
            # que a cobra continue se movendo na direção anterior.
            return direcao

        # Entra em um loop que continuará até que a posição inicial da
        # cobra seja alcançada.
        while atual != inicio:

            # Usa o dicionário 'veio_de' para rastrear para trás a partir do
            # alimento até o ponto de início.
            # 'veio_de[atual]' retorna uma tupla contendo a posição
            # anterior e a direção tomada para chegar à posição 'atual'.
            atual, direcao_nova = veio_de[atual]

            # Adiciona a direção para chegar à posição 'atual' a partir da
            # posição anterior ao início da lista 'caminho'.
            caminho.append(direcao_nova)

        # Após construir o caminho completo desde o alimento até a
        # posição inicial, inverte a lista 'caminho'.
        # A inversão é necessária porque o caminho foi construído
        # de trás para frente, do alimento até a posição inicial.
        # A inversão (usando [::-1]) coloca o caminho na ordem
        # correta, do início ao alimento.
        return caminho[::-1]

    # Chama a função 'astar', passando a lista atual da cobra e a
    # posição do alimento como argumentos.
    # A função 'astar' retorna o caminho ideal encontrado do
    # início (cabeça da cobra) até o alimento.
    caminho = astar(cobra, alimento)

    # Verifica se um caminho foi encontrado pela função 'astar'.
    if caminho:

        # Se um caminho foi encontrado, retorna o primeiro
        # passo desse caminho.
        # Isso direciona a cobra para começar a seguir o
        # caminho calculado para chegar ao alimento.
        return caminho[0]  # Move na primeira direção do caminho encontrado

    else:

        # Se nenhum caminho for encontrado (caminho é uma lista vazia), a
        # cobra continua na direção atual.
        # Isso pode acontecer se não houver caminho viável até o alimento
        # devido a bloqueios ou a própria configuração da cobra.
        return direcao  # Se não houver caminho, continua na mesma direção


# Define a função 'gerar_alimento' que não aceita parâmetros
# e é responsável por criar novas localizações de frutas no jogo.
def gerar_alimento():

    # Inicia um loop infinito que só será quebrado internamente.
    # Este loop permite tentar várias posições até
    # encontrar uma válida.
    while True:

        # Gera uma posição aleatória 'x' para a fruta.
        # 'random.randint(0, (LARGURA_TELA // TAMANHO_CELULA) - 1)' gera um
        # número inteiro aleatório dentro do número de células
        # horizontais disponíveis.
        # Multiplicar por 'TAMANHO_CELULA' converte essa posição de
        # célula de volta para coordenadas de pixels.
        x = random.randint(0, (LARGURA_TELA // TAMANHO_CELULA) - 1) * TAMANHO_CELULA

        # Gera uma posição aleatória 'y' para a fruta de maneira similar à 'x',
        # mas usando a dimensão vertical 'ALTURA_TELA'.
        y = random.randint(0, (ALTURA_TELA // TAMANHO_CELULA) - 1) * TAMANHO_CELULA

        # Verifica se a posição aleatória (x, y) não está ocupada por
        # qualquer segmento da cobra.
        # 'cobra' é uma lista de tuplas, cada tupla representando a
        # posição de um segmento da cobra.
        if (x, y) not in cobra:

            # Se a posição gerada não estiver ocupada pela cobra,
            # retorna essa posição como uma tupla (x, y).
            return (x, y)


# Define a função 'desenhar' que é responsável por atualizar a
# interface gráfica do jogo no canvas.
def desenhar():

    # Limpa todo o conteúdo anterior do canvas para que o novo
    # estado do jogo possa ser desenhado sem sobreposição.
    canvas.delete(tk.ALL)

    # Loop que percorre cada segmento da cobra, onde cada segmento é
    # representado por uma tupla (x, y).
    for x, y in cobra:

        # Desenha um retângulo para cada segmento da cobra no canvas.
        # 'x' e 'y' são as coordenadas do canto superior esquerdo do segmento,
        # e 'x + TAMANHO_CELULA' e 'y + TAMANHO_CELULA' são as
        # coordenadas do canto inferior direito.
        # 'fill="green"' define a cor do retângulo como verde,
        # representando visualmente a cobra.
        canvas.create_rectangle(x, y, x + TAMANHO_CELULA, y + TAMANHO_CELULA, fill="green")

    # Obtém as coordenadas do alimento atual.
    x, y = alimento

    # Desenha um oval no local do alimento usando as coordenadas.
    # O oval é desenhado de maneira similar ao retângulo, mas sua
    # forma arredondada é representativa de frutas ou comida.
    # 'fill="red"' define a cor do oval como vermelha, diferenciando
    # claramente o alimento da cobra.
    canvas.create_oval(x, y, x + TAMANHO_CELULA, y + TAMANHO_CELULA, fill="red")

    # Exibe a pontuação atual e a quantidade de frutas comidas no topo do canvas.
    # 'LARGURA_TELA//2' posiciona o texto no centro do canvas horizontalmente.
    # '10' é a posição vertical do texto, colocando-o perto do topo do canvas.
    # 'text=f"Pontuação: {pontuacao}   Frutas: {frutas_comidas}/50"' constrói
    # uma string que mostra a pontuação e as frutas comidas.
    # 'fill="white"' define a cor do texto como branca para
    # contraste com o fundo.
    # 'font=("Arial", 14)' define a fonte do texto como Arial tamanho 14,
    # tornando-o claramente legível.
    # 'anchor="n"' especifica que o texto deve ser ancorado pelo seu
    # lado norte (topo), alinhando-o verticalmente.
    canvas.create_text(LARGURA_TELA // 2, 10, text=f"Pontuação: {pontuacao}   Frutas: {frutas_comidas}/50",
                       fill="white", font=("Arial", 14), anchor="n")


# Define a função 'mudar_direcao', que é responsável por
# alterar a direção do movimento da cobra.
def mudar_direcao(nova_direcao):

    # Declara a variável 'direcao' como global, permitindo que
    # esta função modifique o valor dessa variável
    # que é usada em todo o programa para determinar a
    # direção atual de movimento da cobra.
    global direcao

    # Verifica se a nova direção é válida. Uma nova direção é
    # considerada válida se não for diretamente oposta à direção atual.
    # Isso evita que a cobra 'vire sobre si mesma' e morra, o
    # que é uma regra comum em jogos de Snake.
    # Cada condição na instrução verifica um par de direções opostas:
    # - "cima" é oposto a "baixo",
    # - "baixo" é oposto a "cima",
    # - "esquerda" é oposto a "direita",
    # - "direita" é oposto a "esquerda".
    # Se a nova direção não for oposta à direção atual, a direção da
    # cobra é atualizada para a nova direção.
    if (nova_direcao == "cima" and direcao != "baixo") or \
            (nova_direcao == "baixo" and direcao != "cima") or \
            (nova_direcao == "esquerda" and direcao != "direita") or \
            (nova_direcao == "direita" and direcao != "esquerda"):
        direcao = nova_direcao


# Define a função 'controle_teclas' que é chamada sempre
# que uma tecla é pressionada.
# O parâmetro 'event' contém informações sobre o evento do
# teclado, incluindo qual tecla foi pressionada.
def controle_teclas(event):

    # Primeiro verifica se o modo de jogo atual permite controle pelo jogador.
    # Se 'modo_jogador' for True, o jogador pode controlar a cobra com o teclado.
    if modo_jogador:

        # Verifica se a tecla pressionada está entre as teclas de
        # direção permitidas: "Up", "Down", "Left", "Right".
        if event.keysym in ["Up", "Down", "Left", "Right"]:

            # Cria um dicionário chamado 'direcoes' que mapeia as teclas
            # de direção para as direções correspondentes no jogo.
            # Isso converte o 'keysym' (símbolo da tecla) para uma
            # string que representa a direção no jogo.
            direcoes = {"Up": "cima", "Down": "baixo", "Left": "esquerda", "Right": "direita"}

            # Chama a função 'mudar_direcao' com a direção
            # correspondente à tecla pressionada.
            # 'direcoes[event.keysym]' acessa a direção associada à tecla
            # pressionada no dicionário 'direcoes'.
            mudar_direcao(direcoes[event.keysym])


# Define a função 'escolher_modo', responsável por apresentar a
# escolha do modo de jogo ao usuário quando o jogo é iniciado.
def escolher_modo():

    # Cria uma nova janela Tkinter, que será usada como a
    # janela inicial para a seleção do modo de jogo.
    janela_inicial = tk.Tk()

    # Define o título da janela para informar ao usuário
    # sobre a ação esperada.
    janela_inicial.title("Escolha o Modo de Jogo")

    # Utiliza a função 'centralizar_janela' para centralizar a
    # janela inicial no meio da tela do usuário.
    # Os parâmetros '300' e '200' definem a largura e
    # altura da janela, respectivamente.
    centralizar_janela(janela_inicial, 300, 200)

    # Define uma subfunção 'jogar_com_IA' que é chamada quando o
    # usuário opta por jogar com a IA controlando a cobra.
    def jogar_com_IA():

        # Acessa a variável global 'modo_jogador' e define como False
        # para ativar o modo de jogo controlado pela IA.
        global modo_jogador
        modo_jogador = False

        # Destroi a janela inicial, removendo-a da tela e
        # liberando os recursos associados.
        janela_inicial.destroy()

        # Chama a função 'iniciar_janela_jogo' para iniciar a
        # janela principal do jogo com a IA controlando a cobra.
        iniciar_janela_jogo()

    # Define a função 'jogar_sozinho' que é ativada quando o usuário
    # escolhe jogar sem a intervenção da IA.
    def jogar_sozinho():

        # Acessa a variável global 'modo_jogador' para mudar o modo de jogo.
        global modo_jogador

        # Configura 'modo_jogador' como True, permitindo que o
        # jogador controle a cobra com o teclado.
        modo_jogador = True

        # Destroi a janela inicial, fechando a tela de seleção de
        # modo e liberando os recursos.
        janela_inicial.destroy()

        # Chama 'iniciar_janela_jogo' para abrir a janela principal do
        # jogo, onde o usuário poderá controlar a cobra.
        iniciar_janela_jogo()

    # Cria um rótulo (Label) no topo da janela inicial para
    # orientar o usuário.
    # Este rótulo serve como um cabeçalho ou título que informa ao
    # usuário sobre a ação esperada naquela tela.
    tk.Label(janela_inicial,

             # Define o texto do rótulo, que é exibido para o usuário.
             text="Escolha o modo de jogo:",

             # Define o tipo de fonte e tamanho do texto. Arial
             # tamanho 14 é escolhido para clareza e legibilidade.
             font=("Arial", 14)

             # Adiciona o rótulo à janela e usa 'pack' para
             # organizar automaticamente o layout.
             # 'pady=10' adiciona um espaço vertical de 10 pixels acima e
             # abaixo do rótulo para evitar um visual congestionado.
             ).pack(pady=10)

    # Cria um botão que permite ao usuário iniciar o jogo no
    # modo controlado pela IA.
    tk.Button(janela_inicial,

              # Texto no botão que indica a ação que ele realiza.
              text="Jogar com IA",

              # Define o tipo de fonte e tamanho, garantindo consistência
              # visual com o rótulo.
              font=("Arial", 12),

              # Associa este botão à função 'jogar_com_IA', que é
              # chamada quando o botão é clicado.
              command=jogar_com_IA

              # Usa 'pack' para adicionar o botão à janela. 'pady=5' adiciona
              # espaço vertical para separar este botão do rótulo
              # acima e do próximo botão abaixo.
              ).pack(pady=5)

    # Cria um segundo botão que permite ao usuário escolher jogar
    # manualmente, controlando a cobra diretamente.
    tk.Button(janela_inicial,

              # Texto no botão que claramente comunica sua função.
              text="Jogar sozinho",

              # Mantém a mesma fonte e tamanho do botão anterior
              # para consistência visual.
              font=("Arial", 12),

              # Liga este botão à função 'jogar_sozinho', ativada
              # ao clicar no botão.
              command=jogar_sozinho

              # Organiza o botão na janela com espaço vertical adequado para
              # uma interface limpa e acessível.
              ).pack(pady=5)

    # Inicia o loop principal da janela Tkinter, que mantém a
    # janela aberta e responsiva a eventos do usuário.
    janela_inicial.mainloop()


# Define a função 'iniciar_janela_jogo' que prepara e exibe a
# janela principal onde o jogo será jogado.
def iniciar_janela_jogo():

    # Declara 'janela' e 'canvas' como variáveis globais para que
    # possam ser acessadas em outras partes do código,
    # como nas funções de desenho e movimento.
    global janela, canvas

    # Cria uma nova janela Tkinter que servirá como a
    # interface principal do jogo.
    janela = tk.Tk()

    # Define o título da janela, que aparece na barra de
    # título da janela do aplicativo.
    janela.title("Jogo Snake")

    # Cria um objeto Canvas dentro da janela, que será usado
    # para desenhar os elementos gráficos do jogo,
    # como a cobra e o alimento.
    # 'width=LARGURA_TELA' e 'height=ALTURA_TELA' definem as
    # dimensões do canvas, baseadas nas configurações
    # globais do jogo.
    # 'bg="black"' define a cor de fundo do canvas como preta, o
    # que ajuda a destacar os elementos coloridos do jogo.
    canvas = tk.Canvas(janela, width=LARGURA_TELA, height=ALTURA_TELA, bg="black")

    # Adiciona o canvas à janela usando o método 'pack', que
    # organiza o canvas dentro da janela.
    # 'pack' é um gerenciador de geometria que posiciona o canvas
    # para preencher o espaço disponível.
    canvas.pack()

    # Chama a função 'centralizar_janela' para posicionar a
    # janela do jogo no centro da tela do usuário.
    # Isso melhora a acessibilidade e a visibilidade, garantindo
    # que a janela apareça onde o usuário espera.
    centralizar_janela(janela, LARGURA_TELA, ALTURA_TELA)

    # Inicia a lógica do jogo chamando a função 'iniciar_jogo',
    # que prepara tudo necessário para começar a jogar,
    # como posicionar a cobra e o alimento inicialmente e
    # iniciar o loop de movimento.
    iniciar_jogo()

    # Inicia o loop principal da janela Tkinter.
    # Esse loop mantém a janela aberta, processando eventos
    # como cliques e movimentos de tecla,
    # e é essencial para que a interface gráfica responda
    # continuamente às interações do usuário.
    janela.mainloop()


# Iniciar o menu de seleção de modo
escolher_modo()