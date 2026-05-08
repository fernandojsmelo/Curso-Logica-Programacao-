import pyautogui as escolha_opcao

opcao = escolha_opcao.confirm('Clique no botão desejado',
            buttons=['Excel', 'Word', 'Notepad'])

#if = se
if opcao == "Excel":

    #Estamos apertando as teclas Windows + R
    escolha_opcao.hotkey('win', 'r')

    #Aguarda 2 segundos para o computador processar
    escolha_opcao.sleep(2)

    #Digitando a palavra Excel
    escolha_opcao.typewrite('Excel')

    #Aguarda 2 segundos para o computador processar
    escolha_opcao.sleep(2)

    #Apertando a tecla do teclado enter para abrir o programa
    escolha_opcao.press('Enter')

    #Aguarda 5 segundos para o computador processar
    escolha_opcao.sleep(5)

    #Clicando na opção Pasta de Trabalho em Branco
    escolha_opcao.click(x=322, y=256)

    # Aguarda 3 segundos para o computador processar
    escolha_opcao.sleep(3)

    #Digitando no Excel
    escolha_opcao.typewrite('Escolhi abrir o Excel')

    print("Você escolher abrir o Excel")

elif opcao == "Word":

    #Estamos apertando as teclas Windows + R
    escolha_opcao.hotkey('win', 'r')

    # Aguarda 2 segundos para o computador processar
    escolha_opcao.sleep(2)

    # Digitando a palavra Winword
    escolha_opcao.typewrite('winword')

    # Aguarda 2 segundos para o computador processar
    escolha_opcao.sleep(2)

    #Apertando a tecla do teclado enter para abrir o programa
    escolha_opcao.press('Enter')

    # Aguarda 5 segundos para o computador processar
    escolha_opcao.sleep(5)

    #Apertando a tecla do teclado enter para confirmar a abertura do programa
    escolha_opcao.press('Enter')

    # Aguarda 3 segundos para o computador processar
    escolha_opcao.sleep(3)

    # Digitando no Excel
    escolha_opcao.typewrite('Escolhi abrir o Word')

    print("Você escolher abrir o Word")

else:

    # Estamos apertando as teclas Windows + R
    escolha_opcao.hotkey('win', 'r')

    # Aguarda 2 segundos para o computador processar
    escolha_opcao.sleep(2)

    # Digitando a palavra notepad
    escolha_opcao.typewrite('notepad')

    # Aguarda 2 segundos para o computador processar
    escolha_opcao.sleep(2)

    # Apertando a tecla do teclado enter para abrir o programa
    escolha_opcao.press('Enter')

    # Aguarda 5 segundos para o computador processar
    escolha_opcao.sleep(5)

    # Apertando a tecla do teclado enter para confirmar a abertura do programa
    escolha_opcao.press('Enter')

    # Aguarda 3 segundos para o computador processar
    escolha_opcao.sleep(3)

    # Digitando no Excel
    escolha_opcao.typewrite('Escolhi abrir o Bloco de Notas')

    print("Você escolher abrir o Bloco de notas")