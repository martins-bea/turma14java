programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		//celsius pra fahrenheit
		
		real TemperaturaC // Valor em celsius inserido
		real TemperaturaF // valor de retorno convertido
		
		escreva("Digite a temperatura em C: ")
		leia(TemperaturaC)
		TemperaturaF = (TemperaturaC *1.8) +32
		escreva("A temperatura em Fahrenheit é:"+Matematica.arredondar (TemperaturaF, 2))
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 388; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */