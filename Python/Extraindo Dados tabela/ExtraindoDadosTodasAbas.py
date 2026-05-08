from selenium import webdriver as opcoesSelenium
from selenium.webdriver.common.by import By

import pyautogui as tempoEspera

navegador = opcoesSelenium.Chrome()

#Abrindo o site do rpachallengeocr
navegador.get("https://rpachallengeocr.azurewebsites.net/")


linha = 1

i = 1

#while = enquanto
while i < 4:

    elementoTabela = navegador.find_element(By.XPATH, '//*[@id="tableSandbox"]')

    linhas = elementoTabela.find_elements(By.TAG_NAME, "tr")
    colunas = elementoTabela.find_elements(By.TAG_NAME, "td")

    #for = para
    for linhaAtual in linhas:
        print(linhaAtual.text)

        linha = linha + 1

    i += 1

    #Para dar tempo do computador processar as informações
    tempoEspera.sleep(2)

    #Procura o XPATH do botão próximo e clica
    navegador.find_element(By.XPATH, '//*[@id="tableSandbox_next"]').click()

    # Para dar tempo do computador processar as informações
    tempoEspera.sleep(2)

else:

    print("Dados extraidos com sucesso!")
