programa
{
	//que pegue um número do teclado e calcule a soma de todos os números 
	//de 1 até ele. Ex.: o usuário entra 7, o programa vai mostrar 28, 
	//pois  1+2+3+4+5+6+7=28.

	funcao inicio()
	{

		inteiro numTecla=0, somaTeclas=0, Acm=0 //Acumulador
		
		escreva("Insira um número de 1 á 9: ")
		leia(numTecla)

		faca{					
			
			Acm=Acm + 1 //Acm ++ é a mesma coisa que Acm + 1 
			
			somaTeclas=somaTeclas+Acm
			
			}enquanto (Acm < numTecla )
			escreva ("A soma é de: ", somaTeclas) 

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 199; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */