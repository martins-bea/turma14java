programa
{
	
	funcao inicio()
	{
		//uma escola quer um algoritmo pra saber se o aluno foi aprovaado ou nao:
		//reprovado= 0-40 recuperação 40-60 aprovado 60-80 destaque 80-100
	
		real nota
		escreva("Digite a nota(use ponto ao invés de vírgula): ")
		leia(nota)

		se (nota < 0 ou nota > 100 ){
			escreva ("Insira uma nota válida entre 0 e 100.")					
		}senao se(nota<=40) {
			escreva("O aluno foi reprovado.")// aqui finaliza se ele teve menos que 40
			
		}senao se (nota < 60){ //se o aluno teve menos q quarenta nem chega aqui nesse bloco, nesse caso a nota é maior que 40 pois se não, nem entraria nesse bloco
			escreva("O aluno esta de recuperação.")
			
		}senao se (nota > 80) {
			escreva ("O aluno foi aprovado e é destaque.")
			
		}senao se (nota >=60) //esse >= 60 poderia ser removido do algoritmo é so pra msotrar o operador ><= . 
		{// o aluno nao teve mais que 80 então ele foi aprovado porem nao é destaque.
			escreva ("O aluno foi aprovado")
			
		}

		escreva ("\n")
	
	
}

}
	

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 347; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */