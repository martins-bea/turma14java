programa
{
	inclua biblioteca Matematica -->mat
	
	funcao inicio()
	{
		//um sistema que leia três números inteiros e positivos (A, B, C)  

		 real a,b,c,d,r,s

		 escreva("Digite valor de A: ")
		 leia(a)
		 
		 escreva("Digite valor de B: ")
		 leia(b)

		 escreva("Digite valor de C: ")
		 leia(c)

		 r=mat.potencia((a+b),2)
		 s=mat.potencia((b+c),2)

		 
		 
		 d=mat.arredondar(((r+s)/2), 2)
		 
		 escreva("O valor de D é: ",d)
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 361; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */