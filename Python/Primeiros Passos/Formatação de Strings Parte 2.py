palavraComEspaco = "        Curso de Python        "

print(palavraComEspaco)
print(palavraComEspaco.strip()) #Remover os espaços

#-------------------------------------

gostoPorFrutas = "Eu gosto de Laranja"
print("Maça" in gostoPorFrutas)

resultado = gostoPorFrutas.find("o")

print(resultado)

#-----------------------------

ganhadorCopa = "Brasil ganhou a copa do mundo"

campeao = "Brasil" not in ganhadorCopa

print(campeao)

#--------------------------------

aluno = "Rebeca Martins"
nota1 = 9.523
nota2 = 6.2
media = (nota1 + nota2) / 2

print("Aluna: " + aluno + " - Média: " + str(media))

print(f"Aluna: {aluno} - Média: {media:.2f}")

ajusteTexto = "Aluna: {} - Média: {:.2f}"
print(ajusteTexto.format(aluno, media))