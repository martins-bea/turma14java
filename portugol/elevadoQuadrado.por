programa
{
	
	funcao inicio()
	{
		/*Desenvolva um sistema em que:
       	/Leia 4 (quatro) números;
   		/Calcule o quadrado de cada um;
		/Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
		/Caso contrário, imprima os valores lidos e seus respectivos quadrados. */

		real a,b,c,d, valorA, valorB,valorC, valorD

		escreva ("Digite 4 números para o calcular seus respectivos quadrados começando pelo 1º: ")
		leia (a)

		escreva ("Agora o 2º: ")
		leia (b)

		escreva("o 3º: ")
		leia (c)

		escreva("e por último o 4º: ")
		leia (d)

		valorA = a*a
		valorB = b*b
		valorC = c*c
		valorD = d*d

		se(valorC >= 1000) {
			escreva ("O valor do 3º número ao ² é: " +valorC)
		}

		senao {
			escreva ("1º número elevado ao ²: "+valorA+"\n2º número elevado ao ²: " +valorB+ "\n3º número elevado ao ²: "+ valorC+ "\n4º número elevado ao ²: "+valorD)
		}
		
	

	}
		
		

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 628; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */