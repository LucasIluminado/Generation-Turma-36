programa
{
	
	funcao inicio()
	{
	inteiro matriz[3][3],L,C, somatotal=0, somadiagonal=0

	para(L=0;L<3;L++)
	{
		para(C=0;C<3;C++)
	{
		escreva("\nDigite os valores desejado: ")
		leia(matriz[L][C])
	     somatotal += matriz[L][C]
	}

	}
	      escreva("\nA soma TOTAL é de: ",somatotal)

	      somadiagonal = matriz[0][0] + matriz[1][1] + matriz[2][2]
	      escreva("\nA soma da DIAGONAL PRINCIPAL é de: ", somadiagonal)

	
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 428; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 6, 9, 6}-{L, 6, 22, 1}-{C, 6, 24, 1}-{somatotal, 6, 27, 9}-{somadiagonal, 6, 40, 12};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */