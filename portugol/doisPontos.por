programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real x1, x2, y1, y2, p1, p2, d

		escreva("Insira o valor de x1 ")
		leia (x1)
		escreva ("\n")

		escreva("Insira o valor de x2 ")
		leia (x2)
		escreva ("\n")

		escreva("Insira o valor de y1 ")
		leia (y1)
		escreva ("\n")

		escreva("Insira o valor de y2 ")
		leia (y2)
		escreva ("\n")

		
		p1= Matematica.potencia((x2-x1),2)
		p2= Matematica.potencia((y2-y1),2)
		
		d=Matematica.arredondar((Matematica.raiz((p1+p2),2)), 2)
		escreva ("O valor de distancia(d) é: "+d)
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 426; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */