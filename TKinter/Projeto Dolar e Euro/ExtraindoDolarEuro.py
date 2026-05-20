from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from webdriver_manager.chrome import ChromeDriverManager

import pyautogui as tempoPausaComputador

#Service - Verifica a versão do Chrome e informa ao
#Selenium para que o ChromeDriverManager baixe o arquivo correspondente
servico = Service(ChromeDriverManager().install())
meuNavegador = webdriver.Chrome(service=servico)

meuNavegador.get("https://www.google.com.br/")

#Aguarda 10 segundo para dar tempo do computador processar as informações
tempoPausaComputador.sleep(10)