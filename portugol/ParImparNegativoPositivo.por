programa
{
	
	funcao inicio()
	{
		//dizer se o numero é par ou impar e se positivo e negativo
		
		inteiro num

		escreva ("Digite um numero inteiro: ")
		leia(num)

			
		se (num ==0){
			escreva("Você digitou zero, digite outro numero.")
		}

		senao se (num < 0 ){
			escreva("O numero é negativo")
			se ((num %2) ==0){
				escreva (" e par")
			}
			senao{
				escreva(" e impar.")
			}
		}
		

		senao se (num > 0){
			escreva("O numero é positivo")
			se ((num %2) ==0){
				escreva (" e par")
			}
			senao{
				escreva(" e impar.")
			}
		
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 546; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */