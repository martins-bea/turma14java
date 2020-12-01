programa
{
	 inclua biblioteca Matematica -->mat
	 
	funcao inicio()
	{
		real  base, altura, area
		
		escreva("---- Cálculo da área do retângulo ---- ")
		escreva("\n")
		
		
		escreva("Digite o valor da base do retângulo: ")
		leia(base)
		escreva("\n")

		escreva("Digite o valor da altura do retângulo: ")
		leia(altura)
		escreva("\n")

		area = (base * altura)

		escreva("A área do retângulo é: " + mat.arredondar(area,2))
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 227; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */