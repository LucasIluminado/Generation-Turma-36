import java.util.Scanner;

public class La�osdeRepeti��oEXE5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, soma=0;
		Scanner leia = new Scanner (System.in);
		
		
		do
		{
			System.out.println("\nDigite o valor desejado: ");
			num = leia.nextInt();
			
			soma+=num;
		}
		while(num!=0);
		
		System.out.printf("\nA soma dos valores informados � igual a: %d",soma);

	}

}
