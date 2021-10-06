import java.util.Scanner;

public class MatrizesJavaEXE3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matriz[][]= new int[3][3], cont=0,linha, coluna;
		
		Scanner leia = new Scanner (System.in);
		
		for(linha=0;linha<3;linha++) 
		    {
				for(coluna=0;coluna<3;coluna++) 
			{
					System.out.println("Digite o valor referente á linha "+linha+1+" coluna "+coluna+1+":");
					matriz[linha][coluna]=leia.nextInt();
				
				if(matriz[coluna][coluna]>10) 
				{
					cont++;
				}
				
			}
		}
		System.out.println("\n A Quantidade de números maior que 10 é de: "+cont);
	}


		 
	}
	



	

