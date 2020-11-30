programa
{
	
	funcao inicio()
	{
		//dizer se o numero é par ou impar
		
		inteiro num, divisao

		escreva ("Digite um numero positivo inteiro: ")
		leia(num)

		divisao= num/2 

		se (num < 0  ) {
			escreva("Numero não aceito. Digite um numero inteiro.")
		}

		senao se (num ==0){
			escreva("Você digitou zero, digite outro numero.")
		}
		senao {
			
			se ((num %2) == 0){
				escreva("O numero é par.")
			}
			
			senao {
				escreva ("O numero é impar")
			}
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 367; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */