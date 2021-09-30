programa
{
	
	funcao inicio()
	{
	inteiro idade
	cadeia nome

	escreva("\n Digite seu Nome: ")
	leia(nome)
	limpa()
	escreva("\n Digite sua Idade: ")
	leia(idade)
	limpa()

	se (idade>=0 e idade<=4) 
	{
		escreva("\n a Idade informada não se qualifica para nenhumma categoria!")
	}
	senao se(idade>=5 e idade<=7)
	{
		escreva("\n o participante ", nome, " se qualifica para a categoria Infantil B")
	}
     senao se(idade>=8 e idade<=11)
	{ 
		escreva("\n o participante ", nome, " se qualifica para a categoria Infantil B")
	}
	senao se(idade>=12 e idade<=13)
	{
		escreva("\n o participante ", nome, " se qualifica para a categoria Juvenil A")
	}
	senao se(idade>=14 e idade<=17)
	{
		escreva("\n o participante ", nome, " se qualifica para a categoria Juvenil B")
	}
	senao
	{
		escreva("\n a Idade informada não se qualifica para nenhuma categoria!")
	}


	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 845; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */