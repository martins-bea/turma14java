programa
{
	funcao menuEntrada(){
        inteiro opcao
        escreva(" \n▓▓▓▓▓▓▓▓▓▓▓▓▓ BEM VINDO AO G5 BANK ▓▓▓▓▓▓▓▓▓▓▓▓▓","\n")
        escreva("=================================================")
        escreva("\n DIGITE O NUMERO DA CONTA : ")
        leia(numeroUsuario)
        escreva("\n DIGITE O CPF : ")
        leia(cpfUser)
        limpa()

        se( numeroUsuario==numeroConta e cpfUser==cpf  )
        {

            menu()
        }
        senao
        {
        	  limpa()
            escreva(" CONTA INVALIDA ou CPF INVALIDO ! ")
            escreva("\n=================================================")

            menuEntrada()
            
        }

	}

    funcao menu()
    {
        inteiro opcao
        escreva(" \n▓▓▓▓▓▓▓▓▓▓▓▓ BEM VINDO AO G5 BANK ▓▓▓▓▓▓▓▓▓▓▓▓ ","\n")
        escreva("=================================================")
        escreva("\n ESCOLHA UMA OPERAÇÃO : ")
        escreva("\n1- SALDO ▶")
        escreva("\n2- SAQUE ▶")
        escreva("\n3- DEPOSITO▶")
        escreva("\n4- TALÃO ▶")
        escreva("\n5- SAIR ▶","\n")
        escreva("=================================================")
        leia(opcao)
        limpa()
        escolha(opcao){
        caso 1 : 
        olhaSaldo()
        pare
        caso 2:
        saque()
        pare
        caso 3:
        deposito()
        pare
        caso 4:
        contaTalao()
        pare
        caso 5:
        sair()
        caso 6:
        pare
        

        }
    }
    
	   real saldo = 0.0
        real credito = 1000.0
        real debito = 0.0
        inteiro movimento = 0 
        caracter voltar = 'V'
        inteiro numeroConta = 1
        cadeia nomeUsuario
        inteiro numeroUsuario = 0
        inteiro cpf = 111
        inteiro cpfUser = 0
        real saldoatual =0.0
        real dinheiro = 0.0
        inteiro x=0
        inteiro dia = 5
        real retirada
        real armazenadorDoSaldo
        inteiro acumuladorTalao=0
        
       
     funcao inicio()
    {
    		menuEntrada()
    		menu()
    }
     
     
     funcao contaTalao()
    {
             
        caracter tipo

        para (inteiro x=0;x<10;x++){
            escreva ("\nImpressão de Talão de Cheque (S) para Sim, (N) para Não.")
            leia(tipo)
            se (tipo =='S' ou tipo== 's')
            {
                acumuladorTalao=acumuladorTalao++
                
                escreva("\nTalão de cheque impresso com sucesso")
                escreva("\nO saldo atual é de:", saldo)
                escreva("\nTotal de talão impresso até hoje: ",acumuladorTalao)
            }
            senao se(tipo =='N' ou tipo== 'n'){
                escreva("Obrigado por usar o G5 Bank!")
            }
            
            escreva("\n","Aperte V para retornar")
            escreva("\n")
            leia(voltar)
            se(voltar == 'V' ou voltar == 'v' ){
                menu()
            }
        }
    }
	
    
     funcao olhaSaldo()
    {
            escreva("\n","Seu Saldo atual é de ",saldo," R$")
            escreva("\n=============================================================")
            escreva("\n","Você pode pedir emprestado apenas :", credito ," R$")
            escreva("\n=============================================================")
            escreva("\n","Aperte V para retornar")
            leia(voltar)

            se(voltar == 'V' ou voltar == 'v'){
            	menu()
            }
    }

     funcao sair()
            {
               menuEntrada()
            }

	funcao numeroDeMovimentos(){
		escreva("\n","Aperte V para retornar: ")
           leia(voltar)

            se(voltar == 'V'){
            	menu()
            }
		
	}

	funcao saque(){
		escreva("Quanto dinheiro você vai sacar ?")
        	leia(retirada)

        	se(saldo > 0.0){

        		saldo = saldo - retirada
        		saldoatual = saldo
        	}
        	senao{
        		escreva("Operação não permitida")
        	}
        	
		escreva("\n","Aperte V para retornar")
          leia(voltar)

          se(voltar == 'V' ou voltar == 'v'){
            	menu()
            }
	}
	funcao deposito(){

		escreva("Quanto dinheiro você quer emprestado ? ")
        	leia(dinheiro)
        	se((movimento<3) e (dinheiro >=0 e dinheiro<=credito))
        	{
        	movimento++
       	saldo = saldo + dinheiro
        	saldoatual = saldo
        	//credito = credito-saldo
        	escreva(" VOCÊ FEZ ", movimento," MOVIMENTO !!! ")
        	}
        	
      senao {
        		escreva("\n OPERAÇÃO INVALIDA ")
        	}
		escreva("\n","Aperte V para retornar")
		escreva("\n")
          leia(voltar)

          se(voltar == 'V' ou voltar == 'v' ){
            	menu()
            }
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 682; 
 * @DOBRAMENTO-CODIGO = [159];
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */