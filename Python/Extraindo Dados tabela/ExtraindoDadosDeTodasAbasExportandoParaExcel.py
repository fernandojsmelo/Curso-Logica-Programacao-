from selenium import webdriver as opcoesSelenium
from selenium.webdriver.common.by import By

#Controlar teclas computador e tempo / pausa
import pyautogui as tempoEspera

#Para trabalharmos com o Excel
import pandas as pd

navegador = opcoesSelenium.Chrome()

#Abrindo o site do rpachallengeocr
navegador.get("https://rpachallengeocr.azurewebsites.net/")

#Novo Dataframe
listaDataFrame = []

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

        #Populamos os dados no DataFrame
        listaDataFrame.append(linhaAtual.text)

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

arquivoExcel = pd.ExcelWriter('dadosAbasSite.xlsx', engine='xlsxwriter')
arquivoExcel.save()

dataFrame = pd.DataFrame(listaDataFrame, columns=['#;ID;Due Date'])

#Prepara o arquivo do Excel usando xlsxwriter como mecanismo
arquivoExcel = pd.ExcelWriter('dadosAbasSite.xlsx', engine='xlsxwriter')

dataFrame.to_excel(arquivoExcel, sheet_name='Dados', index=False)

#Salva as informações no arquivo de Excel
arquivoExcel.save()
