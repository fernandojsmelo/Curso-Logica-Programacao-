# Cenário: Controle de Temperatura

# Importa a biblioteca numpy para manipulação e cálculo com arrays e matrizes
import numpy as np

# Importa a biblioteca tkinter para criação de interfaces gráficas
import tkinter as tk

# Importa a biblioteca random para geração de números aleatórios
import random

# Importa a biblioteca time para manipulação de tempo (pausas, etc.)
import time

# Define a taxa de aprendizado, influenciando a rapidez com que o
# modelo se ajusta a novos dados
alpha = 0.1

# Define o fator de desconto, que pondera a importância das
# recompensas futuras no aprendizado
gamma = 0.9

# Define a probabilidade de escolher uma ação aleatória, promovendo a
# exploração do espaço de ações
epsilon = 0.1

# Estabelece o número total de episódios que o modelo
# passará treinando
num_episodios = 5000

# Define a temperatura mínima que pode ser ajustada no sistema
temp_min = 15

# Define a temperatura máxima que pode ser ajustada no sistema
temp_max = 30

# Estabelece o intervalo de temperatura considerado ideal para o sistema
intervalo_ideal = (20, 25)

# Inicializa a variável que controla se a janela da interface
# gráfica está aberta
janela_aberta = True

# Cria uma lista para armazenar o histórico de
# temperaturas e ações tomadas
historico_temperaturas = []


# Função que utiliza a tabela Q treinada para controlar a
# temperatura automaticamente.
def controlar_temperatura():
    # Declaração para acessar e modificar as variáveis
    # globais dentro da função.
    global temperatura_atual, janela_aberta, historico_temperaturas

    # Calcula o estado inicial subtraindo a temperatura mínima
    # da temperatura atual.
    estado = temperatura_atual - temp_min

    # Loop que continua executando enquanto a janela da interface
    # gráfica estiver aberta.
    while janela_aberta:

        # Atualiza a janela da interface gráfica para processar eventos,
        # como cliques de botão.
        janela.update()

        # Pausa a execução do loop por 1 segundo para tornar as mudanças
        # de temperatura observáveis pelo usuário.
        time.sleep(1)

        # Escolhe a ação ótima de acordo com a tabela Q para o estado atual.
        # np.argmax(q_table[estado]) encontra o índice da ação com a
        # maior estimativa de recompensa no estado atual.
        acao = np.argmax(q_table[estado])

        # Executa a ação escolhida e obtém a nova temperatura e a
        # descrição da ação tomada.
        nova_temperatura, acao_tomada = executar_acao(temperatura_atual, acao)

        # Adiciona um registro ao histórico de temperaturas e ações tomadas.
        historico_temperaturas.append(f"Temperatura: {temperatura_atual}°C -> {acao_tomada} -> {nova_temperatura}°C")

        # Chama a função para atualizar a interface gráfica com o
        # histórico atualizado.
        atualizar_historico()

        # Atualiza a temperatura atual para a nova temperatura
        # após a execução da ação.
        temperatura_atual = nova_temperatura

        # Verifica se a janela ainda está aberta antes de atualizar a exibição.
        if janela_aberta:

            # Atualiza o texto do rótulo que exibe a temperatura atual na interface gráfica.
            label_temp.config(text=f"Temperatura Atual: {temperatura_atual}°C")

            # Verifica se a nova temperatura está dentro do intervalo ideal.
            if intervalo_ideal[0] <= temperatura_atual <= intervalo_ideal[1]:

                # Se estiver no intervalo ideal, atualiza o rótulo de status
                # com uma mensagem positiva.
                label_status.config(text="Temperatura está no intervalo ideal!", fg="green")

            else:

                # Se não estiver no intervalo ideal, atualiza o rótulo de
                # status com uma mensagem de alerta.
                label_status.config(text="Temperatura fora do intervalo ideal!", fg="red")

        # Recalcula o estado com a nova temperatura atual.
        estado = temperatura_atual - temp_min


# Função dedicada a atualizar o widget de texto na interface gráfica
# com o histórico das mudanças de temperatura.
def atualizar_historico():
    # Primeiro, limpa todo o conteúdo atual no widget de texto.
    # O parâmetro '1.0' indica o início do texto.
    # 'tk.END' indica o final do texto no widget, garantindo
    # que todo o conteúdo seja removido.
    texto_historico.delete(1.0, tk.END)

    # Itera sobre cada item no array 'historico_temperaturas', que
    # armazena strings descrevendo cada ação tomada
    # e suas consequências (mudança de temperatura).
    for item in historico_temperaturas:
        # Insere cada item no widget de texto, adicionando uma
        # nova linha após cada inserção para manter
        # cada entrada em uma linha separada.
        # 'tk.END' assegura que cada novo item seja adicionado
        # no final do texto existente, evitando a sobreposição
        # ou inserção no início do widget.
        texto_historico.insert(tk.END, item + "\n")


# Definição da função que calcula a recompensa com
# base na temperatura atual.
# A recompensa é um valor numérico que indica quão
# boa foi uma ação tomada.
def calcular_recompensa(temperatura):
    # Verifica se a temperatura está dentro do intervalo ideal
    # definido (20 a 25 graus).
    # Se estiver dentro desse intervalo, a função retorna uma
    # recompensa alta.
    if intervalo_ideal[0] <= temperatura <= intervalo_ideal[1]:

        # Recompensa de 10 pontos porque a temperatura está ideal.
        return 10

    else:

        # Se a temperatura não está no intervalo ideal, calcula
        # uma penalidade.
        # A penalidade é calculada como o valor negativo da diferença
        # absoluta entre a temperatura atual e o ponto médio do
        # intervalo ideal (22.5 graus neste caso, que é a média de 20 e 25).
        # Isso significa que quanto mais distante a temperatura estiver
        # do ponto médio, maior será a penalidade.
        return -abs(temperatura - sum(intervalo_ideal) / 2)


# Definição da função que escolhe a próxima ação baseada no
# estado atual e na tabela Q.
# A tabela Q é uma matriz onde cada linha representa um estado
# possível e cada coluna uma ação possível,
# e os valores na tabela são estimativas de recompensas
# futuras esperadas para cada ação em cada estado.
def escolher_acao(estado, q_table):
    # Gera um número aleatório entre 0 e 1. Se este número for menor
    # que a probabilidade de exploração (epsilon, 0.1),
    # então uma ação aleatória é escolhida. Isso ajuda a explorar
    # novas ações além das já conhecidas.
    if np.random.rand() < epsilon:

        # Escolhe uma entre três ações possíveis (0, 1, ou 2) aleatoriamente.
        return np.random.choice(3)

    else:

        # Se o número gerado for maior ou igual a epsilon, a ação
        # escolhida é aquela que tem a maior estimativa de
        # recompensa futura no estado atual, conforme registrado na tabela Q.
        # np.argmax(q_table[estado]) retorna o índice da ação com a
        # maior recompensa na linha 'estado'.
        return np.argmax(q_table[estado])


# Função para executar a ação selecionada sobre a temperatura atual.
# Esta função modifica a temperatura com base na ação escolhida e
# retorna a nova temperatura e a descrição da ação.
def executar_acao(temperatura, acao):
    # Verifica se a ação escolhida é 0, o que significa
    # 'Aumentar a temperatura'.
    if acao == 0:

        # Aumenta a temperatura em 1 grau, mas garante que não
        # ultrapasse a temperatura máxima permitida (temp_max).
        # A função `min()` é utilizada para escolher o menor valor
        # entre a temperatura atual + 1 e a temperatura máxima,
        # evitando que a temperatura exceda o limite superior.
        return min(temperatura + 1, temp_max), "Aumentar"

    # Verifica se a ação escolhida é 1, o que significa 'Diminuir a temperatura'.
    elif acao == 1:

        # Diminui a temperatura em 1 grau, mas garante que não caia
        # abaixo da temperatura mínima permitida (temp_min).
        # A função `max()` é utilizada para escolher o maior valor entre a
        # temperatura atual - 1 e a temperatura mínima,
        # evitando que a temperatura caia abaixo do limite inferior.
        return max(temperatura - 1, temp_min), "Diminuir"

    # Caso a ação escolhida seja qualquer outra coisa (neste
    # caso, seria 2), 'Manter a temperatura'.
    else:

        # Retorna a temperatura atual sem alterações, junto
        # com a descrição "Manter".
        # Isso significa que não há mudança na temperatura.
        return temperatura, "Manter"


# Definição da função de aprendizado Q-Learning para treinar o
# modelo de controle de temperatura.
def q_learning():
    # Inicializa a tabela Q com zeros. Esta tabela é essencial para o
    # aprendizado por reforço, onde cada linha representa um
    # estado possível (diferença entre a temperatura máxima e mínima + 1,
    # que representa todos os estados possíveis de temperatura de
    # temp_min a temp_max) e cada coluna representa
    # uma possível ação (aumentar, diminuir, manter), totalizando três ações.
    q_table = np.zeros((temp_max - temp_min + 1, 3))

    # Loop principal que itera sobre um número definido de episódios.
    # Cada episódio é uma simulação independente
    # do processo de tomada de decisão de ajuste da temperatura.
    for episodio in range(num_episodios):

        # Inicializa cada episódio selecionando uma temperatura aleatória
        # dentro do intervalo permitido.
        # Esta temperatura serve como ponto de partida para o episódio.
        temperatura = random.randint(temp_min, temp_max)

        # Este loop interno continua até que a condição de término
        # seja atendida, o que ocorre quando a temperatura
        # alcança o intervalo ideal.
        while True:

            # Calcula o estado atual como um índice base zero, subtraindo a
            # temperatura mínima da temperatura atual.
            # Isso transforma a gama de temperaturas possíveis em um índice
            # simplificado que pode ser usado diretamente
            # para acessar as linhas correspondentes na tabela Q.
            estado = temperatura - temp_min

            # Chama a função para escolher a próxima ação com base no
            # estado atual e na tabela Q.
            # A decisão de qual ação tomar pode ser aleatória (exploração) ou a
            # melhor ação conhecida (exploração), dependendo de um número
            # aleatório gerado em comparação com o valor de epsilon.
            acao = escolher_acao(estado, q_table)

                        
            # Executa a ação escolhida, resultando em uma nova temperatura e
            # descarta a descrição textual da ação.
            nova_temperatura, _ = executar_acao(temperatura, acao)

            # Calcula a recompensa com base no novo estado de temperatura
            # após a ação ser tomada.
            # Isso avalia o quão boa foi a decisão com base na proximidade
            # com o intervalo ideal de temperatura.
            recompensa = calcular_recompensa(nova_temperatura)

            # Atualiza o estado para refletir a nova temperatura, novamente
            # como um índice base zero.
            novo_estado = nova_temperatura - temp_min

            # Atualiza a tabela Q usando a equação de Q-Learning. Este passo é
            # fundamental para que o algoritmo aprenda a partir das experiências.
            # A tabela Q armazena as estimativas das recompensas futuras esperadas
            # para cada ação em cada estado.
            # O valor na tabela Q para o estado atual e a ação tomada é ajustado
            # com base no seguinte cálculo:

            # O valor Q atual (q_table[estado, acao]) é primeiramente ponderado
            # pelo fator (1 - alpha).
            # O valor 'alpha', conhecido como taxa de aprendizado, define a rapidez
            # com que o algoritmo aprende.
            # Um valor de alpha alto faz com que o algoritmo ajuste os valores Q mais
            # rapidamente em resposta a novas informações,
            # enquanto um valor baixo faz com que o algoritmo aprenda mais
            # lentamente, dando mais peso às informações anteriores.

            # O segundo termo do cálculo é 'alpha' multiplicado pela soma da recompensa
            # recebida pela ação tomada mais o valor descontado
            # da melhor estimativa futura. Esse valor futuro é o máximo valor Q
            # para o novo estado (np.max(q_table[novo_estado])),
            # que representa a melhor ação que pode ser tomada a partir
            # do novo estado seguindo a política atual.

            # O fator 'gamma', conhecido como fator de desconto, pondera a
            # importância das recompensas futuras.
            # Um valor de gamma próximo de 1 dá maior importância às recompensas
            # futuras, permitindo que o algoritmo seja mais estratégico,
            # buscando recompensas maiores a longo prazo. Um valor de gamma mais
            # baixo faz com que o algoritmo valorize mais as recompensas imediatas,
            # sendo potencialmente mais míope em relação ao futuro.

            # A nova estimativa Q é então calculada pela combinação desses dois
            # termos. Este cálculo permite que o algoritmo atualize
            # sua estimativa da utilidade (ou valor Q) de tomar a ação atual no
            # estado atual, considerando tanto a recompensa imediata
            # quanto as melhores recompensas futuras esperadas.

            q_table[estado, acao] = (1 - alpha) * q_table[estado, acao] + alpha * (
                    recompensa + gamma * np.max(q_table[novo_estado])
            )

            # Atualiza a variável de temperatura para o novo valor,
            # refletindo o resultado da ação executada.
            temperatura = nova_temperatura

            # Verifica se a nova temperatura está dentro do intervalo
            # ideal de temperatura.
            # Se estiver, o episódio é terminado, e o loop interno é quebrado,
            # começando um novo episódio ou terminando o treinamento.
            if intervalo_ideal[0] <= temperatura <= intervalo_ideal[1]:
                break

    # Após completar todos os episódios, retorna a tabela Q treinada.
    return q_table


# Inicializa a janela principal da aplicação
# usando a biblioteca Tkinter.
janela = tk.Tk()

# Define o título da janela, que aparece na barra de título da janela.
janela.title("Controle de Temperatura com Q-Learning")

# Define a temperatura inicial do sistema escolhendo um
# valor aleatório dentro do intervalo permitido.
# A função random.randint é usada para garantir que a
# temperatura inicial seja escolhida de forma aleatória
# dentro dos limites definidos por temp_min e temp_max.
temperatura_atual = random.randint(temp_min, temp_max)

# Chama a função q_learning para treinar o modelo de Q-Learning.
# Esta função ajusta a tabela Q baseada em um número pré-definido de
# episódios de aprendizado, utilizando as interações de
# ações e recompensas para aprender a política ótima de
# controle de temperatura.
q_table = q_learning()

# Cria um rótulo na janela principal que mostra a temperatura atual.
# Este rótulo é atualizado dinamicamente à medida que a temperatura é
# ajustada pelo sistema de controle.
# O texto inicial mostra a temperatura atual seguida
# da unidade "°C".
# O parâmetro 'font' define a fonte e o tamanho do
# texto para torná-lo claramente legível.
label_temp = tk.Label(janela,
                      text=f"Temperatura Atual: {temperatura_atual}°C",
                      font=("Arial", 14))

# Adiciona o rótulo à janela principal e ajusta o espaçamento
# vertical (pady) para 10 pixels para melhorar a
# estética da interface.
label_temp.pack(pady=10)

# Cria um rótulo na janela do Tkinter para exibir o
# status da temperatura.
# O texto inicial do rótulo é vazio, pois será atualizado
# dinamicamente durante a operação do programa.
# A fonte "Arial" com tamanho 14 é usada para garantir que o
# texto seja claramente legível.
label_status = tk.Label(janela, text="", font=("Arial", 14))

# Adiciona o rótulo à janela, posicionando-o abaixo do
# rótulo da temperatura atual.
# 'pady=10' adiciona um espaçamento vertical de 10 pixels acima e
# abaixo do rótulo para evitar que os elementos da
# interface gráfica fiquem muito juntos.
label_status.pack(pady=10)

# Cria um widget de texto que serve como um registro ou
# histórico de todas as mudanças de temperatura e ações tomadas.
# 'height=10' define a altura do widget para conter 10 linhas de texto.
# 'width=50' define a largura do widget para conter 50
# caracteres por linha.
# Este widget permite ao usuário visualizar o histórico de
# ações e suas consequências durante a execução do programa.
texto_historico = tk.Text(janela, height=10, width=50)

# Adiciona o widget de texto à janela, com um espaçamento
# vertical de 10 pixels para manter uma boa separação visual
# dos outros elementos da interface gráfica.
texto_historico.pack(pady=10)

# Criação de um botão na interface gráfica do usuário (GUI)
# que permite iniciar o processo de controle de temperatura.
# O texto no botão é "Iniciar Controle de Temperatura",
# indicando claramente sua função.
# A fonte "Arial" com tamanho 14 é escolhida para
# garantir legibilidade.
# O parâmetro 'command' vincula este botão à função 'controlar_temperatura',
# que é chamada quando o botão é clicado.
# Isso inicia o loop de controle de temperatura que ajusta a
# temperatura com base na política aprendida pelo Q-Learning.
botao_iniciar = tk.Button(janela,
                          text="Iniciar Controle de Temperatura",
                          command=controlar_temperatura,
                          font=("Arial", 14))

# Adiciona o botão à janela principal e ajusta o espaçamento
# vertical (pady) para 10 pixels.
# Isso ajuda a separar visualmente o botão de outros elementos
# na interface, evitando um layout congestionado.
botao_iniciar.pack(pady=10)

# Criação de um botão para fechar o programa.
# O texto no botão é "Fechar", oferecendo uma forma clara e
# direta para o usuário encerrar a aplicação.
# O botão também utiliza a fonte "Arial" tamanho 14 para manter a
# consistência visual com outros elementos da interface.
# O parâmetro 'command' está vinculado ao método 'destroy' do objeto 'janela'.
# Quando clicado, este botão chama 'janela.destroy', que
# encerra a aplicação fechando a janela principal.
botao_fechar = tk.Button(janela,
                         text="Fechar",
                         command=janela.destroy,
                         font=("Arial", 14))

# O botão é adicionado à janela com um espaçamento vertical (pady) de 10 pixels,
# mantendo a consistência no design e na
# experiência do usuário.
botao_fechar.pack(pady=10)

# Executar a janela Tkinter
janela.mainloop()
