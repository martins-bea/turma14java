programa
{
	
	funcao inicio()
	{
		//um sistema que le as 3 notas de um aluno 
		//calcule a média final deste aluno
		//Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. 

		inteiro n1, n2, n3 //notas
		inteiro resp1, resp2, resp3
		inteiro media
		inteiro p1 = 2, p2=3, p3=5, pesoTotal

	
		escreva("Insira aqui a primeira nota: ")
		leia(n1)
		//multiplica a nota (n1,n2,n3 pelo peso 2,3,5)
		resp1=n1*p1

		escreva("Insira aqui a segunda nota: ")
		leia(n2)
		resp2=n2*p2

		escreva("Insira aqui a terceira nota:" )
		leia(n3)
		resp3=n3*p3
		
		//soma das notas dividido pela soma dos pesos
		
		pesoTotal=(p1+p2+p3)
		
		media= (resp1+resp2+resp3) / pesoTotal
		escreva("\nA média do alunoe é:"+media+".") 
		
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 268; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */