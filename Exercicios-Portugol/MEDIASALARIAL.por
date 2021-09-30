programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
	real filhos = 0.00, salario = 0.00, mediaSal = 0.00, maiorSal = 0.00, perAte100 = 0.00, totalSal = 0.00, mediaFilhos = 0.00, total100 = 0.00, totalFilhos= 0.00
	inteiro x=5
    
     para (x=1;x<=5;x++)
	{
     escreva("\nDigite o valor de seu Salário : ")
	leia(salario)
     escreva("\nDigite a quantidade de filhos que possui : ")
	leia(filhos)
	limpa()
	
	totalSal = totalSal + salario
	totalFilhos = totalFilhos + filhos
	}
	
	
	se(salario > maiorSal)
	{
     maiorSal = salario
		
	se (salario <= 100)
	    total100 += 1
	}
	
     mediaSal = totalSal / 5
	mediaFilhos = totalFilhos / 5
	perAte100 = (total100 / 5)* 100
	
	
	escreva("\n\nA Média salarial desta região é de: R$ ",mediaSal)
     escreva("\n\nA Média de filhos desta região é de: ",mat.arredondar (mediaFilhos,2))
     escreva("\n\nMaior Salário informado é de : R$ ",mat.arredondar  (maiorSal,2))
     escreva("\n\nO Percentual de pessoas que recebem até R$100 é de :",mat.arredondar (perAte100,2))
	
	
	}
}
	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 613; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */