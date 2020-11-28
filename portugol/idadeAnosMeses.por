programa
{

		funcao inicio()
	{
		// sistema que leia a idade de uma pessoa expressa em dias e
		//mostre-a expressa em anos, meses e dias.ias. 

		const inteiro meses = 12
		const inteiro dias = 365
		inteiro resultadoAnos,resultadoMeses,idadeDias
		
		escreva ("Escreva sua idade em dias: ") 
		leia(idadeDias) 
		escreva ("\n")
		
		resultadoAnos = idadeDias / dias	
		escreva ("Você está vivo há " +resultadoAnos+" anos")
		escreva ("\n")	
		
		resultadoMeses = resultadoAnos * meses 
		escreva ("O total de " +resultadoMeses+" meses.")
		escreva ("\n")	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 444; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */