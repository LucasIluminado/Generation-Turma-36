import java.util.Scanner;

public class LaçosCondicionaisEXE1 {
	
	  public static void main(String[] args) 
	  {
		  int val1, val2, val3;
		  
		  Scanner leia = new Scanner (System.in);
		  
		  System.out.println("\nDigite o primeiro valor inteiro desejado: ");
		  val1 = leia.nextInt();
		  System.out.println("\nDigite o segundo valor inteiro desejado: ");
		  val2 = leia.nextInt();
		  System.out.println("\nDigite o terceiro valor inteiro desejado: ");
		  val3 = leia.nextInt();
	  
	     
	
		  if(val1>val2 && val1>val3)
		  {
			  System.out.println("\nO maior valor digitado foi: "+val1);  
		  }
		  else if(val2>val1 && val2>val3)
		  {
		  System.out.println("\nO maior valor digitado foi: "+val2);
		  }
		  else if(val3>val1 && val3>val2)
		  {
		  System.out.println("\nO maior valor digitado foi: "+val3);
		  }  
	  }

}
