#Calcule a média dos números e retorne o resultado
def calcula_media(numeros):
    numeros = list(numeros)
    media = sum(numeros) / len(numeros)
    return media

numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

#Imprime Media dos Números
print(calcula_media(numeros))
#Imprime Soma dos Números
print(sum(numeros))
#imprime a Quantidade dos Números
print(len(numeros))