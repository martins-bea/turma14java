programa
{
	
	funcao inicio()
	{
		//leia as variáveis C e N, respectivamente código e número de horas trabalhadas de um operário. 
		//E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. 
		//Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o na variável 
		//E, caso contrário zerar tal variável. 
		//A hora excedente de trabalho vale R$ 20,00. 
		//No final do processamento imprimir o salário total e o salário excedente.

		//variáveis-igredientes	
		
		cadeia c
		inteiro n=0, E=0  // c= codigo do operario  n= horas trabalhadas
		real salarioTotal 
		
		const real SALARIOHORA=10.0, SALARIOEXTRA= 20.0 
		const inteiro LIMITEHORAS= 50

		//entradas

		escreva ("Digite aqui o código do operário: ")
		escreva ("\n")
		leia (c)
		
		escreva ("Digite aqui as horas trabalhadas: ")
		leia (n)
		escreva ("\n")

		//processamentos
		
		se (n <= LIMITEHORAS){
			
			salarioTotal= (n * SALARIOHORA)

		
			escreva("O funcionário "+c+" trabalhou por " +n+" horas, sem hora extra e receceu R$ "+salarioTotal+".")
		}

		senao se (n > LIMITEHORAS){

			E = n - LIMITEHORAS // calculo hora extra 
			salarioTotal= ((n - E ) * SALARIOHORA) + (E * SALARIOEXTRA) 
		
		
			escreva("O funcionário "+c+" trabalhou por "+n+" horas, sendo "+E+" horas extras resultando em adicional de R$: "+ (E * SALARIOEXTRA) +
			" somando total de: R$ " +salarioTotal )
		}
 

		
		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1392; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */