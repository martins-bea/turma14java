programa

{
		/* Faça um programa que crie um vetor por leitura com 5 
		 *  valores de pontuação de uma atividade e o escreva em seguida. 
		 * Encontre após a maior pontuação e a apresente. */

   
    funcao inicio(){
      inteiro valores[5] //Guarda nas posições do vetor 
      inteiro maior = 0

      para(inteiro i=0; i<5; i++){
          escreva("Digite o ",i+1,"º valor: ")
          leia(valores[i])
      }


      para(inteiro i=0; i<5; i++){
          se(valores[i] > maior){
              maior = valores[i]
          }
      }
    escreva("\n")
    escreva("\n O maior número é de:",maior)

    }

}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 14; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */