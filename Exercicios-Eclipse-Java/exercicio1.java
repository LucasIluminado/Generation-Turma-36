import java.util.Scanner;

public class exercicio1 {
	
	public static void main(String[] args){
		
		int anos, meses, dias, MultAnos, MultMeses, TotalDias;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nDigite sua idade em anos: ");
		anos = leia.nextInt();
		System.out.println("\nDigite os meses: ");
		meses = leia.nextInt();
		System.out.println("\nDigite os dias: ");
		dias = leia.nextInt();
		
		MultAnos = anos * 365;
		MultMeses = meses * 30;
		TotalDias = MultAnos + MultMeses + dias;
		
		System.out.println("\nSua Idade em dias é de: " + TotalDias);
		
		
		
		
	}
	
	

}
