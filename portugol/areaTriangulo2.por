programa
{
	inclua biblioteca Matematica -->mat
	
	funcao inicio()
	{
	
		real A, h, b 

		escreva("---- Cálculo da área do triângulo ---- ")
		escreva("\n")

		escreva("Digite a base do triângulo: ")
		leia (b)
		escreva("\n")

		escreva("Digite a altura do triângulo ")
		leia (h)
		escreva("\n")

		A= b*h / 2
		
		
		escreva("A área do triângulo é: " + mat.arredondar(A,2))
		escreva("\n") 
	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 91; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */