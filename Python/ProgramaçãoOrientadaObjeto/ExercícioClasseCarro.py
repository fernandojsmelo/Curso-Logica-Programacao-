class Carro:
    marca = ""
    modelo = 0
    ano = 0
    quilometragem = 0


dados = Carro()
dados.marca = "Renolt"
dados.modelo = "Logan"
dados.ano = 2013
dados.quilometragem = 0

def imprimirDados():
    print("Marca:", dados.marca,
          "Modelo:", dados.modelo,
          "Ano:", dados.ano,
          "Quilometragem:", float(dados.quilometragem),"Km")


def drive():
    dados.quilometragem = dados.quilometragem + 1


def descricao():
    print("Marca:", dados.marca,
          "Modelo:", dados.modelo,
          "Ano:", dados.ano,
          "Quilometragem:", float(dados.quilometragem),"Km")

for i in range(1000):
    # imprimirDados()
    drive()

descricao()
imprimirDados()