programa
{
	
	funcao inicio()
	{
		inteiro i =1 // o numero que inicia a contagem // i nao tem valor nenhum para o resto do rpograma so para este laço

		enquanto (i <= 100){
			escreva (i+", ")  //enquanto 1 for menor que 100 vai escrever i, so que i sempre vai ser menor
			i++ /* isso siginifica que i= i+1 então sempre que o laço for executado o i vai receber + 1 
			/daqui o i vai retornar pro começo do laço valendo 2 e vai rodar novamente +1 valendo 3 e vai rodar novamente  +1 valendo 4 etc			
			/ isso é o efeito laço.
			/usado quando nao se sabe quantos dados, tem ou esta buscando no banco de dados, o q o vai ser inserido etc
			*/


		}
		escreva ("\nFim do laço enquanto.\n\n")
		
		para(inteiro j =100; /* variável*/ j>=0; /*condição*/ j-- /*incremento de variavel*/){
			escreva (j+", ")
		
		}   // aqui temos o tripé definido completo e é + usado em vetor e matriz
		
		escreva ("\nFim do laço para.\n")
	}
}     
			/*nesse caso podemos fazer a mesma coisa de formas diferentes, o para economiza codigo e fica mais coeso, entao mesmo que contou diminuindo e aumentando,
			/poderia ser os dois com a mesma coisa, invertando a condição e o i/j 


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 646; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */