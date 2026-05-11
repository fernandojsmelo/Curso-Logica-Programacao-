from selenium import webdriver as opcoesSelenium
from selenium.webdriver.common.by import By
import pyautogui as tempoEspera
import pandas as pd

navegador = opcoesSelenium.Chrome()
navegador.get("https://buscacepinter.correios.com.br/app/endereco/index.php")

#Tempo para o computador processar as informações
tempoEspera.sleep(4)

#Dicionário
dicionarioCEPS = {
    "CEP 1": "05892387",
    "CEP 2": "23548057",
    "CEP 3": "01153000"
}

#DataFrame
listaDataFrame = []

#Inserindo um CEP na caixa de CEP do busca CEP
navegador.find_element(By.NAME, "endereco").send_keys("05892387")

#Tempo para o computador processar as informações
tempoEspera.sleep(2)

#Clica no botão de Pesquisar
navegador.find_element(By.NAME, "btn_pesquisar").click()




#for = para
for contador in dicionarioCEPS.values():

    #Tempo para o computador processar as informações
    tempoEspera.sleep(4)

    #Voltando para a página inicial para pesquisar um novo CEP
    navegador.find_element(By.NAME, 'btn_voltar').click()

    # Tempo para o computador processar as informações
    tempoEspera.sleep(3)

    # Inserindo um CEP na caixa de CEP do busca CEP
    navegador.find_element(By.NAME, "endereco").send_keys(contador)

    # Tempo para o computador processar as informações
    tempoEspera.sleep(2)

    # Clica no botão de Pesquisar
    navegador.find_element(By.NAME, "btn_pesquisar").click()

    # Tempo para o computador processar as informações
    tempoEspera.sleep(4)

    #Estamos pegando o XPATH da tabela onde estão as informações
    elementoTabela = navegador.find_element(By.XPATH, '//*[@id="resultado-DNEC"]')

    endereco = ""
    for linhaTabela in elementoTabela.find_elements(By.TAG_NAME, "tr"):

        for colunaTabela in linhaTabela.find_elements(By.TAG_NAME, "td"):

            endereco = endereco + ";" + colunaTabela.text

    listaDataFrame.append(endereco)

arquivoExcel = pd.ExcelWriter('enderecosBuscaCEP.xlsx', engine='xlsxwriter')
arquivoExcel.save()

dataFrame = pd.DataFrame(listaDataFrame, columns = [';Rua;Bairro;Cidade;CEP'])

#Preparando a arquivo usando o mecanismo xlsxwriter
arquivoExcel = pd.ExcelWriter('enderecosBuscaCEP.xlsx', engine='xlsxwriter')

#Convertendo o DataFrame em um objeto Excel
dataFrame.to_excel(arquivoExcel, sheet_name='Dados', index=False)

#Salvando o arquivo com as alterações
arquivoExcel.save()



