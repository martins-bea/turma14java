programa
{
	
	funcao inicio()
	{
		//um sistema que leia o tempo de duração de 
		//um evento em uma fábrica expressa em segundos 
		// expresso em horas, minutos e segundos.
 

		inteiro segundos = 1
		inteiro hora = 3600
	 	inteiro minuto = 60
		inteiro tempoSegundos, tempoHora, tempoMinutos
		
		escreva ("Escreva o tempo de duração em segundos: ") 
		leia(tempoSegundos)
		escreva ("\n")
		
		tempoHora = (tempoSegundos / hora)
		escreva ("O tempo de duração é de: ", tempoHora, " horas")

		tempoMinutos = ((tempoSegundos % hora) / minuto)
		escreva (", ", tempoMinutos, " minutos")

		tempoSegundos = ((tempoSegundos % hora) % minuto)
		escreva (" e ", tempoSegundos, " segundos.")
		escreva ("\n")
		
	}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 177; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */