programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		

		real raio, area
		const real pi =3.14 
		
		escreva("---- Cálculo da área do circulo ---- ")
		escreva("\n")
		
		escreva("Digite o raio do circulo: ")
		leia (raio)
	
		area= mat.PI * (mat.potencia(raio, 2)) 
		
		//area = pi*(raio*raio)

		escreva("A área do circulo é: " + mat.arredondar(area,2))
		

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 115; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */