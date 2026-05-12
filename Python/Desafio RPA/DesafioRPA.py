from selenium import webdriver as opcoesSelenium
from selenium.webdriver.common.keys import Keys
import pyautogui as tempoEspera

from selenium.webdriver.common.by import By

navegador = opcoesSelenium.Chrome()
navegador.get("https://rpachallenge.com/")

#Aguarda 3 segundos para dar tempo do computador processar as informações
tempoEspera.sleep(3)

#Localiza o campo FirstName e envia o texto
#//*[@] - Localizar o campo
navegador.find_element(By.XPATH, '//*[@ng-reflect-name="labelFirstName"]').send_keys("Amanda")

#Aguarda 2 segundos para dar tempo do computador processar as informações
tempoEspera.sleep(2)

#Localiza o campo LastName e envia o texto
navegador.find_element(By.XPATH, '//*[@ng-reflect-name="labelLastName"]').send_keys("Alves")

#Aguarda 2 segundos para dar tempo do computador processar as informações
tempoEspera.sleep(2)

#Localiza o campo FirstName e envia o texto
navegador.find_element(By.XPATH, '//*[@ng-reflect-name="labelCompanyName"]').send_keys("Cursos Python")

#Aguarda 2 segundos para dar tempo do computador processar as informações
tempoEspera.sleep(2)

#Localiza o campo Role / Função e envia o texto
navegador.find_element(By.XPATH, '//*[@ng-reflect-name="labelRole"]').send_keys("Diretor(a)")

#Aguarda 2 segundos para dar tempo do computador processar as informações
tempoEspera.sleep(2)

#Localiza o campo Address e envia o texto
navegador.find_element(By.XPATH, '//*[@ng-reflect-name="labelAddress"]').send_keys("Rua Alvarez Centro, 400")

#Aguarda 2 segundos para dar tempo do computador processar as informações
tempoEspera.sleep(2)

#Localiza o campo Email e envia o texto
navegador.find_element(By.XPATH, '//*[@ng-reflect-name="labelEmail"]').send_keys("amanda@gmail.com")

#Aguarda 2 segundos para dar tempo do computador processar as informações
tempoEspera.sleep(2)

#Localiza o campo Phone e envia o texto
navegador.find_element(By.XPATH, '//*[@ng-reflect-name="labelPhone"]').send_keys("99999-9999")

#Aguarda 2 segundos para dar tempo do computador processar as informações
tempoEspera.sleep(2)

#Clicando no botão para enviar as informações preenchidas
navegador.find_element(By.XPATH, "/html/body/app-root/div[2]/app-rpa1/div/div[2]/form/input").click()

print("Dados enviados com sucesso!")