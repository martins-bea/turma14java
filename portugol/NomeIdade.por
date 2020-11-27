programa
{
	
	funcao inicio()
	{
		inteiro anoNascimento, idade
		inteiro anoAtual = 2020
		cadeia nomePessoa // nome da pessoa que vai aparecer
		
		escreva("Digite o nome da pessoa: ")
		leia(nomePessoa)
		escreva("\n")
		escreva("Digite o ano de nascimento  [aaaa]: ")
		leia(anoNascimento)
		escreva ("\n")
		idade = anoAtual - anoNascimento // 0=2020-1995 = idade = 25 calculo da idade
		escreva("Oi "+nomePessoa+" você tem aproximadamente "+idade+" anos!")
		//clean code

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 481; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */