programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		//variaveis - vetores e matrizes
		const inteiro LINHA=4, COLUNA=6
		inteiro N1[LINHA][COLUNA],N2[LINHA][COLUNA]  
		inteiro M1[LINHA][COLUNA],M2[LINHA][COLUNA]
		
		escreva("Matriz N1\n")
		para (inteiro linha=0;linha<LINHA; linha++)// laço
		{
			para (inteiro coluna=0; coluna<COLUNA; coluna++) //laço
			{
				//magica processamentos
				N1[linha][coluna]=Util.sorteia(1,3)
				escreva(N1[linha][coluna]," ")
				
			}
			escreva("\n")
		}
		escreva("\n")
		escreva("Matriz N2\n")
		para (inteiro linha=0;linha<LINHA; linha++) // laço
		{
			para (inteiro coluna=0; coluna<COLUNA; coluna++) //laço
			{
				//magica processamentos
				N2[linha][coluna]=Util.sorteia(4, 6)
				escreva(N2[linha][coluna]," ")
				
			}
			escreva("\n")
		}
		escreva("\n")
		escreva("Matriz M1 (Soma N1 + N2) \n")
		para (inteiro linha=0;linha<LINHA; linha++) // laço 
		{
			para (inteiro coluna=0; coluna<COLUNA; coluna++) //laço
			{
				//magica
				
				M1[linha][coluna]=N1[linha][coluna]+N2[linha][coluna]
				escreva(M1[linha][coluna]," ")
				
			}
			escreva("\n")
		}
		escreva("\n")
		escreva("Matriz M2 (Diferença entre N1 e N2)\n")
		para (inteiro linha=0;linha<LINHA; linha++)
		{
			para (inteiro coluna=0; coluna<COLUNA; coluna++)
			{
				//magica
				
				M2[linha][coluna]=N1[linha][coluna]-N2[linha][coluna]
				escreva(M2[linha][coluna]," ")
				
			}
			escreva("\n")
		}
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 91; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */