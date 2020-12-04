programa
{

    funcao inicio()
    {
        inteiro talao = 0, saldo = 0
        caracter tipo
        caracter voltar

        para (inteiro x=0;x<10;x++){
            escreva ("\n Impressão de Talão de Cheque (S) para Sim, (N) para Não.")
            leia(tipo)
            se (tipo =='S' ou tipo== 's')
            {
                talao++
                escreva("\nTalão de cheque impresso com sucesso")
                escreva("\nO saldo atual é de:", saldo)
                escreva("\nTotal de talão impresso até hoje: ",talao)
            }
            senao se(tipo =='N' ou tipo== 'n'){
                escreva("Obrigado por usar o G5 Bank!")
            }
            escreva("\n","Aperte V para retornar")
            escreva("\n")
            leia(voltar)
            se(voltar == 'V' ou voltar == 'v' ){
                escreva(1)
            }
        }
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 307; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */