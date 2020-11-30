programa  
{  
    funcao inicio()  
    { 

    		// um sistema que dada a idade de um nadador classi
		//fique-o em uma das seguintes categorias: Infantil A = 5 a 7 anos
		// Infantil B = 8 a 11 anos Juvenil A = 12 a 13 anos Juvenil B = 14 a 17 anos
		// Adultos = Maiores de 18 anos
		
    		inteiro idade
    		
	    	escreva("Informe a idade do nadador maior que 5 anos: ")
	    	leia(idade)
	    	
		se (idade <=4){

		escreva ("A idade deve ser maior que 5.")
		
		}
	    		
	    		senao se (idade <= 5 ou idade <=7){
	    		
	    		escreva("A categoria é Infantil A")
	    		
			}
			
	   		senao se (idade <= 8 ou idade <=11){  
	   						
	   			escreva("A categoria é Infantil B")
	   			
	   		}
	   		
	   		senao se (idade <= 12 ou idade <=13){
	   			
	   			escreva("A categoria é Juvenil A")
	   			
	   		}
	   		
	   		senao se (idade <= 14 ou idade <=17){
	   			escreva ("A categoria é Juvenil B")
	   		}
	   		
	   		senao {
	   			escreva ("A categoria é Adulto")
	   		 }	
	   		
	   		
  	}  
}  
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 315; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */