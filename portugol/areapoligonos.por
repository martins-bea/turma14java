programa
{
	
	inclua biblioteca Matematica --> mat

	funcao circulo() 
	{	
		cadeia tipo
		real area=0.0, raio=0.0

		escreva("---- Cálculo da área do circulo ---- ")
		escreva("\n")
		
		escreva("Digite o raio do circulo (em cm): ")
		leia (raio)

		area= mat.PI * (mat.potencia(raio, 2)) // mesma coisa que: area = pi*(raio*raio)

		escreva("A área do circulo é: " + mat.arredondar(area,2)+" cm²")
		
	}


	
	funcao inicio()
	
	{
		caracter tipo
		real base=0.0, altura=0.0, area=0.0, raio=0.0
			 

		escreva("---- Cálculando área ---- ")
		escreva ("\n")

		escreva ("1 para circulo")
		escreva ("\n")

		escreva ("2 para triângulo")
		escreva ("\n")

		escreva ("3 para retângulo")
		escreva ("\n")
		leia(tipo)
		
		escolha (tipo){
			
				caso '1': //circulo
				
					circulo()
					
				pare

				caso '2': //triângulo

					escreva("---- Cálculo da área do triângulo ---- ")

					escreva("\n")
				
					escreva("Digite a base do triângulo (em cm): ")
					leia (base)
					escreva("\n")
				
					escreva("Digite a altura do triângulo (em cm): ")
					leia (altura)
					escreva("\n")
				
					area= base*altura / 2
												
					escreva("A área do triângulo é: " + mat.arredondar(area,2)+" cm²")
					escreva("\n") 					
					
						
				pare

				caso '3': //retângulo
				
					escreva("---- Cálculo da área do retângulo ---- ")
					escreva("\n")
			
					escreva("Digite o valor da base do retângulo (em cm): ")
					leia(base)
					escreva("\n")
					
					escreva("Digite o valor da altura do retângulo (em cm): ")
					leia(altura)
					escreva("\n")
			
					area = (base * altura)
			
					escreva("A área do retângulo é: " + mat.arredondar(area,2) + " cm²")
					escreva("\n")

			
				pare
			
					}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 405; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */