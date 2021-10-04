import java.util.Scanner;

public class exercicio2 {

       public static void main(String[] args) {
    	   
    	   int dia, dias, anos, meses, somaAnos, somaMeses, somaDia;
    	   
    	   Scanner leia = new Scanner (System.in);
    	   
    	   System.out.println("\nDigite sua idade em dias: ");
    	   dias = leia.nextInt();
    	   
    	   somaAnos = dias / 365;
    	   somaMeses = (dias % 365)/30;
    	   somaDia	= (dias % 365)%30;   
    	   
    	   System.out.println("\nSua idade em anos é de: "+ somaAnos +"\nSua idade em Meses é de: "+ somaMeses+"\nSua idade em dias é de: "+somaDia);

       }
}
