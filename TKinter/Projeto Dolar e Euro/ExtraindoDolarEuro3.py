from tkinter import *
from tkinter import messagebox
from tkinter import ttk

#tk - Biblioteca do tkinter
#Tk - Janela / Tela
janela = Tk()

#Altemos o titulo da tela
janela.title("Cotação")

#Criando o Label na linha 0, Coluna 0
Label(janela, text="Moeda: ",
      font=("Arial 20")).grid(row=0, column=0)


moedaSelecionada = ttk.Combobox(janela, font=("Arial 20"))

moedaSelecionada["values"] = ("Dolar",
                            "Euro",
                            "Peso")

#Colocando a Combobox no grid na linha 0, coluna 1
moedaSelecionada.grid(row=0, column=1)

#Selecionando como padrão o primeiro item
moedaSelecionada.current(0)

#Função para Pesquisar o valor da moeda selecionada
def pesquisarItem():

    from selenium import webdriver
    from selenium.webdriver.chrome.service import Service
    from webdriver_manager.chrome import ChromeDriverManager
    from selenium.webdriver.common.keys import Keys
    from selenium.webdriver.common.by import By
    from selenium.webdriver.support.select import Select

    # import pyautogui as tempoPausaComputador
    import time as tempoPausaComputador

    # Service - Verifica a versão do Chrome e informa ao
    # Selenium para que o ChromeDriverManager baixe o arquivo correspondente
    servico = Service(ChromeDriverManager().install())
    meuNavegador = webdriver.Chrome(service=servico)

    #Abre o google
    meuNavegador.get("https://www.google.com.br/")

    #Aguarda 3 segundo para dar tempo do computador processar as informações
    tempoPausaComputador.sleep(3)

    #Procurando pelo elemento NAME e quando encontrar vai escrever Dolar hoje
    meuNavegador.find_element(By.NAME, "q").send_keys("Dolar hoje")

    #Aguarda 2 segundo para dar tempo do computador processar as informações
    tempoPausaComputador.sleep(2)

    #Faz a busca pelo valor que está digitado
    meuNavegador.find_element(By.NAME, "q").send_keys(Keys.RETURN)

    #Aguarda 4 segundo para dar tempo do computador processar as informações
    tempoPausaComputador.sleep(4)

    valorDolarPeloGoogle = meuNavegador.find_elements(By.XPATH, '//*[@id="knowledge-currency__updatable-data-column"]/div[1]/div[2]/span[1]')[0].text

    #Aguarda 2 segundo para dar tempo do computador processar as informações
    tempoPausaComputador.sleep(2)

    print(valorDolarPeloGoogle)

    # Aguarda 2 segundo para dar tempo do computador processar as informações
    tempoPausaComputador.sleep(2)

    #if - se
    if str(moedaSelecionada.get()) == "Euro":

        # Aguarda 2 segundo para dar tempo do computador processar as informações
        tempoPausaComputador.sleep(2)

        #zuzy3c l84FKc
        selecionaCombobox = Select(meuNavegador.find_element(By.CLASS_NAME,
                                                             "l84FKc"))

        linha = 0

        #for - para
        for opcao in selecionaCombobox.options:

            print(opcao.text)

            if opcao.text == "Euro":

                # Aguarda 1 segundo para dar tempo do computador processar as informações
                tempoPausaComputador.sleep(1)

                # zuzy3c l84FKc
                pegaDropdown = meuNavegador.find_element(By.CLASS_NAME, "l84FKc")

                # Aguarda 1 segundo para dar tempo do computador processar as informações
                tempoPausaComputador.sleep(1)

                #Pego todas as informações do Dropdown
                itemSelecionado = Select(pegaDropdown)

                #Seleciona no Dropdown a posição que o Euro está
                itemSelecionado.select_by_index(linha)

                # Aguarda 3 segundo para dar tempo do computador processar as informações
                tempoPausaComputador.sleep(3)

                valorDolarPeloGoogle = meuNavegador.find_elements(By.XPATH, '//*[@id="knowledge-currency__updatable-data-column"]/div[1]/div[2]/span[1]')[0].text

                # Aguarda 1 segundo para dar tempo do computador processar as informações
                tempoPausaComputador.sleep(1)

                #Interrompo o laço for assim que encontrar o Euro
                break

            linha = linha + 1

        # Aguarda 2 segundo para dar tempo do computador processar as informações
        tempoPausaComputador.sleep(2)

        # Significa que a moeda selecionada não é o Euro
        # str - Converte o valor para texto
        # Pego e imprimo o tipo da moeda e o valor da moeda no Label
        valorMoeda.config(text=str(moedaSelecionada.get()) + ":" + valorDolarPeloGoogle)


    else:
        # Significa que a moeda selecionada não é o Euro
        # str - Converte o valor para texto
        # Pego e imprimo o tipo da moeda e o valor da moeda no Label
        valorMoeda.config(text=str(moedaSelecionada.get()) + ":" + valorDolarPeloGoogle)

#Botão que vai pesquisar
#grid - Divide a tela em grades / partes
#row - Linha
#column - Coluna
#columnspan - Colocamos para dizer quantas colunas do grid o item vai oculpar
#sticky - Usamos para preencher os espaços em bracos
#sticky - NSEW (Norte, Sul, Leste e Oeste)
botaoPesquisar = Button(text="Pesquisar",
                        font=("Arial 20"),
                        command=pesquisarItem)
botaoPesquisar.grid(row=1, column=0, columnspan=2, sticky="NSEW")

#Criando o label que vai receber o valor da moeda
valorMoeda = Label(janela, text="Valor: 0",
                   font=("Arial 20"))
valorMoeda.grid(row=2, column=0, columnspan=2, sticky="W")

#mainloop - No tkinter é uma janela em funcionamento como um loop
#A janela que o python mostra na verdade é um programa em funcionamento
janela.mainloop()