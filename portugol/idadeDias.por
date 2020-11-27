programa
{
	
	funcao inicio()
	{
		//  sistema que leia a idade de uma pessoa expressa em anos, 
		// meses e dias e mostre-a expressa apenas em dias. 

		inteiro dias = 365
		inteiro meses = 12
		inteiro idade, resultadodias,resultadomeses
		
		escreva ("Escreva sua idade: ") 
		leia(idade) 
		escreva ("\n")
		
		resultadomeses = idade * meses	
		escreva ("\n")	
		
		resultadodias = idade * dias
		escreva ("Você está vivo há " +resultadodias+" dias")
		escreva ("\n")
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 238; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */