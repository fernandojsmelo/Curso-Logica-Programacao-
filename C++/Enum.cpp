#include <iostream> //Entrada e saída de dados
#include <locale.h> //Para trabalhar com acentos

//Organização de pastas e poder usar o cout, cin e endl
using namespace std;


int main(){
	
	//Biblioteca responsável pelos acentos nas letras e palavras
	setlocale(LC_ALL, "Portuguese");
	
	//Enum só retorna número inteiro
	//Podemos inserir textos, mas o que o Enum representa são os números inteiros
	enum Roupas{meia, camisa, jaqueta, pijama};
	
	Roupas roupaSelecionada;
			
			
	roupaSelecionada = camisa;
	
	cout << "--------- Exemplo 1 -------------\n\n";
	cout << roupaSelecionada << endl;
	
	//-------------------------------------------------------
	
	enum Calcados{tenis=10,	sapato,	chinelo, sandalha};
	
	Calcados calcadoSelecionado;
	
	calcadoSelecionado = sandalha;
	
	cout << "\n\n\n--------- Exemplo 2 -------------\n\n";
	cout << calcadoSelecionado << endl;
	
	//-------------------------------------------------------
	
	enum Alimentos{pacoteArroz=5, pacoteFeijao, pacoteAcucar=2, pacoteCafe=5, pacoteBolacha	};
	
	Alimentos alimentoSelecionado;
	
	alimentoSelecionado = pacoteBolacha;
	
	cout << "\n\n\n--------- Exemplo 3 -------------\n\n";
	cout << alimentoSelecionado << endl;
			
	//Impede o fechamento da tela após execução do código para dar tempo de testarmos e ver o resultado
	system("pause");
	
	//Tipo de retorno da função main que é um inteiro
	return 0;
}


