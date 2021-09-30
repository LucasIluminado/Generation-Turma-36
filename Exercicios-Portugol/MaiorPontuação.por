programa
{
	
	funcao inicio()
	{
	     real maiorpont =0.0,pontuacao
		inteiro pont[5],x=0
         
	    para(x=0;x<5;x++)
         {
         escreva("\nDigite o valor das pontuações de 0 á 10: ")
         leia(pont[x])
         se(pont[x] > maiorpont)
         {
         maiorpont = pont[x]
          } 
          
         }
         para(x=0;x<5;x++)
        {
        escreva("\nO valor da Pontuação ",x+1," foi de: ",pont[x])
        }
       
        escreva("\nMaior Pontuação foi de: ", maiorpont)
     
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 269; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */