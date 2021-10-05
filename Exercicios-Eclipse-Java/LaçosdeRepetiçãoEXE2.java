import java.util.Scanner;

public class LaçosdeRepetiçãoEXE2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		int num,par=0, impar=0, cont;
		
		
		
		for(cont=1;cont<=10;cont++) {
	    System.out.println("\nDigite o número para calculo: ");
		num= leia.nextInt();
			
		if(num % 2 == 0)
		{
		
			par = par + 1; 
		
		}
		else
		{
		
			impar = impar + 1;
		
		}
		
		}
			
		System.out.printf("\nA quantidade de números pares são de : %d",par);
		System.out.printf("\nA quantidade de números Impares são de : %d",impar);
			
		

	}

}
