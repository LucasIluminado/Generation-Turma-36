programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real pesoTomates, Multa = 4.00, excesso, pesoLimite = 50.0, MultaTotal
		escreva("\nDigite o peso dos tomates:")
		leia(pesoTomates)

		excesso= pesoTomates - pesoLimite
		MultaTotal= excesso * Multa

		 se (pesoTomates>50)
		 {
		 	escreva("\n ATENÇÃO!!! O Peso ultrapassou o limite exigido, com isso será aplicada uma multa de: R$", mat.arredondar(MultaTotal,2))
		 }
		 senao se (pesoTomates<=50)
		 {
		 	escreva("\n O peso está dentro do limite exigido!")
		 }
		
		 	
		
		
		
		

		

		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 537; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */