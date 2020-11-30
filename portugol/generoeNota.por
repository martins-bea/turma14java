programa
{
	
	funcao inicio()
	{

		//igredientes 
		
		cadeia nome
		caracter gen
		real nota

		//entradas
	
		escreva ("Insire o nome do(a) aluno(a)")
		leia (nome)
		
		escreva("Escolha o gênero: [M] Masculino, [F] Feminino e [O] Outros.")
		leia (gen)

		escreva ("Insire a nota: ")
		leia (nota)

			
		se (gen == 'M' ou gen== 'm'){

		senao se (nota >=5){
				escreva ("Aluno "+nome+" foi aprovado com nota" +nota)
				} 
			
			 se  (nota <=5){					
				escreva ("Aluno "+nome+" foi reprovado com nota "+nota)
				}
		}		

		se (gen == 'F' ou gen== 'f'){
			 
		senao se (nota >=5){
				escreva ("Aluna "+nome+" foi aprovada com nota " +nota)
				} 
	
			se (nota <=5){					
				escreva ("Aluna "+nome+" foi reprovada com nota "+nota)
				}
		}

		se (gen == 'O' ou gen== 'o'){
			 
		senao se (nota >=5){
				escreva ("Alune "+nome+" foi aprovade com nota " +nota)
				} 
	
			se (nota <=5){					
				escreva ("Alune "+nome+" foi reprovade com nota "+nota)
				}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 882; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */