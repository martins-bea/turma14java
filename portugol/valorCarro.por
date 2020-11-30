programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real custoFabrica, custoConsumidor, custoDistribuidor, imposto,
		real valorImposto = 0.45 //45%, 
		real valorDistribuidor=0.28 //28%
		
		//entrada
		escreva("Custo de fábrica do carro: ")
		leia(custoFabrica)
		
		//processamento
		
		custoDistribuidor= custoFabrica * valorDistribuidor
		imposto = custoFabrica * valorImposto
		custoConsumidor = custoFabrica + imposto + custoDistribuidor

		//saida
		escreva("O custo do carro para o consumidor é de R$", Matematica.arredondar(custoConsumidor,2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 279; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */