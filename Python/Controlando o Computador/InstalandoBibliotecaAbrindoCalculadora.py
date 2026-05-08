import pyautogui as posicaoMouse
import pyautogui as tempoEspera

#Tempo de espera para que o computador possa pensar
tempoEspera.sleep(2)

#Movendo o mouse até o botão iniciar
posicaoMouse.moveTo(36, 1056)

#Tempo de espera para que o computador possa pensar
tempoEspera.sleep(2)

#Clicando na posição
posicaoMouse.click(36, 1056)

#Tempo de espera para que o computador possa pensar
tempoEspera.sleep(2)

#Escrevendo a palavra calc / calculadora
posicaoMouse.typewrite('calc')

#Tempo de espera para que o computador possa pensar
tempoEspera.sleep(1)

#Movendo o mouse até o aplicativo da calculadora
posicaoMouse.moveTo(x=242, y=377)

#Tempo de espera para que o computador possa pensar
tempoEspera.sleep(2)

#Clico na calculadora
posicaoMouse.click(x=242, y=377)

#Tempo de espera para que o computador possa pensar
tempoEspera.sleep(2)

#print(posicaoMouse.position())
