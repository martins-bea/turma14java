programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		//fahrenheit para celsius
		
		real TemperaturaF // Valor em celsius inserido
		real TemperaturaC // valor de retorno convertido
		
		escreva("Digite a temperatura em F: ")
		leia(TemperaturaF)
		TemperaturaC = (TemperaturaF -32) / 1.8
		escreva("A temperatura em Celsius é:"+Matematica.arredondar(TemperaturaC, 2)+" C")


	// f= C x 1,8 + 32
	//C= F / 1,8 -32 
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 90; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */