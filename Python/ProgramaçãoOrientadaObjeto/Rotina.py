class Rotina:

    def __init__(self, nome, dormindo=False, dirigindo=False):
        self.nome = nome
        self.dormindo = dormindo
        self.dormindo = self.dormindo
        self.dirigindo = dirigindo

    def dormir(self):

        if self.dirigindo:
            print(self.nome + " não pode dormir enquanto dirige")
            return

        if self.dormindo:
            print(self.nome + " já está dormindo")
            return

        print("O " + self.nome + " está dormindo")
        self.dormindo = True

    def acordar(self):

        if not self.dormindo:
            print(self.nome + " já está acordado!")
            return

        print("O " + self.nome + " acordou")
        self.dormindo = False

    def dirigir(self):

        if self.dormindo:
            print(self.nome + " não pode dirigir enquanto está dormindo")
            return

        if self.dirigindo:
            print(self.nome + " já está dirigindo")
            return

        print("O " + self.nome + " está dirigindo")
        self.dirigindo = True

    def pararDeDigirir(self):

        if not self.dirigindo:
            print(self.nome + " já parou de dirigir")
            return

        print("O " + self.nome + " parou de dirigir")
        self.dirigindo = False