programa
{
	
	funcao inicio()
	{
		/* Receber valores de base e altura de um triângulo e 
		verificar se são valores válidos (positivos maiores que zero). 
		Em caso afirmativo, calcular a área do triângulo.
		*/

		real A, h, b 

		escreva("Digite a base do triângulo: ")
		leia (b)

		escreva("Digite a altura do triângulo ")
		leia (h)

		se (b < 0 ou h < 0 ) {
			escreva ("\nDigite números maiores do que zero. ") 
			
			} 

		senao {
			A= b*h / 2
			escreva("\nA área do triângulo é de: " +A) 
		}
		

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 505; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */