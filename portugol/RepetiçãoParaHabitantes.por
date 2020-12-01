programa
{
	inclua biblioteca Matematica -->mat
	
	funcao inicio()
	{
		/* A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
		a) média do salário da população; 
		b) média do número de filhos; 
		c) maior salário; 
		d) percentual de pessoas com salário até R$100,00. */

		const inteiro HABITANTES =2  
		real salario=0.0, 
		real mediaSalarios=0.0, mediaNumfilhos=0.0,, totalFilhos=0.0
		real maiorSalario=0.0, pessoaSalario100=0.0, totalSalarios=0.0
		real numFilhos, conta100=0.0


		para(inteiro hab =1; hab <= HABITANTES; hab++) 
		{
			escreva ("Insira o salario do habitante: ")
			leia (salario)
			escreva("Insira o numero de filhos do habitante: ")
			leia(numFilhos)

			//processamentos

			totalSalarios= totalSalarios + salario
			totalFilhos= totalFilhos + numFilhos
		}

		
		se (maiorSalario < salario)
			{
				maiorSalario = salario
			}
		se (salario <= 100) {
			
			conta100++
			
			} 

		mediaSalarios=mat.arredondar ((totalSalarios / HABITANTES), 2)
		mediaNumfilhos= totalFilhos / HABITANTES
		pessoaSalario100= (conta100/ HABITANTES) * 100
		

		escreva("Media de Salarios é: ", mediaSalarios)
		escreva("\n")
		escreva("Media de Filhos é: ", mediaNumfilhos)
		escreva("\n")
		escreva("Maior salário é: ", maiorSalario)
		escreva("\n")
		escreva("Percentual de pessoas com salario ate R$ 100") 
		

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 320; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */