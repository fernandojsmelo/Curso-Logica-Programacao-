nome = "Cintia Alves Moreira de Souza"

print(nome)
print("Total de caracteres: " + str(len(nome)))

print(nome[0])
print(nome[0:6])
print(nome[7:12])
print(nome[13:20])
print(nome[7:])

#----------------------------------

frase = "CUrSo de LóGica DE PROGramaçÃO PYthOn"

#upper retorna todas as letras em maiúscula
print(frase.upper())

#lower retorna todas as letras em minusculas
print(frase.lower())

#---------------------------------------

notaProva = "Tirei nota cinco na prova"

print(notaProva.replace("cinco", "DOZE"))

#---------------------------------------

cpf = "123.456.789-10"

cpfPartes = cpf.split(".")

print(cpfPartes)
print(cpfPartes[0])
print(cpfPartes[1])

cpfPartes2 = cpfPartes[2].split("-")
print(cpfPartes2[0])
print(cpfPartes2[1])

print("CPF: " + cpfPartes[0] + cpfPartes[1] + cpfPartes2[0] + cpfPartes2[1])