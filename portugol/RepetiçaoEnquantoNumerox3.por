programa
{
	
	funcao inicio()
	{
		/*Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por três  
		 * (imprimindo o novo valor) até que ele seja maior do que 100.
		Ex.: se o usuário digita 5,  deveremos observa r na tela a seguinte sequência: 5 15 45 135*/

		inteiro num, x=0

		escreva("Digite o numero: ")
		leia (num)

		enquanto (num < 100){

			escreva (num*3)
			escreva("\n")
			num=num*3
			
		}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 442; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */