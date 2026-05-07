import Supermercado as sp

sp.SupermercadoDoPovo()

print(sp.produtos["Macarrão"])

#------------------------------------------

from Supermercado import produtos

print(produtos["Feijão"])
print("\n")

#Imprimindo o nome de todos os produtos
for item in produtos:
    print(item)

#Imprimindo o preço de todos os produtos
for i in produtos:
    print(produtos[i])

print("\n")

#Imprimindo o produto e preço
for prod, prec in produtos.items():
    print(prod, "-", prec)

print("\n\n")

#----------------------------------------------

from Supermercado import departamento

for produto, preco in departamento.items():
    print(produto)
    for produto, preco in preco.items():
        print("Produto:", produto, "R$", preco)

