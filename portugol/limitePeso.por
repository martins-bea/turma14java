programa
{
	
	funcao inicio()
	{
		/*oão Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. 
		 * Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do 
		 * estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente. 
		 * João precisa que você faça um sistema que leia a variável P (peso de tomates) e verifique se há excesso. 
		 * Se houver, gravar na variável E (Excesso) 
		 * e na variável M o valor da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo ZERO.
		 * 
		 */

		 real p, E, m = 4.00, multaTotal
		 const inteiro LIMITEPESO= 50 

		 escreva ("Insira o peso: ")
		 leia (p)

		 
		 se (p <= LIMITEPESO){

			escreva("Não há excesso de peso.")
			
			}

		 senao { E = p - LIMITEPESO // calculo peso extra 
			multaTotal= (E * m) 
					
			escreva("A multa por excesso de peso é de R$"+ multaTotal)
			}

	}
}
	


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 810; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */