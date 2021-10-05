import java.util.Scanner;

public class LaçosdeRepetiçãoEXE4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade, menos21=0, mais50=0; 
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nGigite sua Idade (PARA FINALIZA O PROGRAMA DIGITE -99): ");
		idade = leia.nextInt();
		
		while(idade!=-99)
		{
			if (idade<21)
			{
				menos21 = menos21 + 1;
			}
			if (idade>50)
			{
			    mais50 = mais50 + 1;	
			}
			System.out.println("\nDigite sua Idade (PARA FINALIZAR O PROGRAMA DIGITE-99): ");
			idade = leia.nextInt();
		 }
		{
		   System.out.println("\nO total de pessoas com menos de 21 anos é de: "+menos21);
		   System.out.println("\nO total de pessoas com mais de 50 anos é de: "+mais50);
		
			
		}
		
		
		
		

	}

}
