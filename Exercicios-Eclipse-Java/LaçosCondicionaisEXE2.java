import java.util.Scanner;

public class LaçosCondicionaisEXE2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner leia = new Scanner (System.in);
         
         int n1, n2, n3;
         
         System.out.println("\nDigite o primeiro valor inteiro desejado: ");
         n1 = leia.nextInt ();
         System.out.println("\nDigite o segundo valor inteiro desejado: ");
         n2 = leia.nextInt ();
         System.out.println("\nDigite o terceiro valor inteiro desejado: ");
         n3 = leia.nextInt ();
    
         if (n1 <= n2 && n2 <= n3)
         {
        	 System.out.println("A ordem crescente: \n"+ n1+"\n"+ n2+"\n"+n3);
         }
       else if (n1 <= n3 && n3 <= n2)
         {
    	   System.out.println("A ordem crescente: \n"+n1+"\n" +n3+"\n"+n2);
         }
       else if (n2 <= n1 && n1 <= n3)
         {
    	   System.out.println("A ordem crescente: \n"+n2+ "\n" +n1 +"\n"+n3);
         }
       else if (n2 <= n3 && n3 <= n1) 
         {
    	   System.out.println("A ordem crescente: \n"+n2+ "\n" +n3+"\n"+n1);
         }
       else if (n3 <= n1 && n1 <= n2) 
         {
    	   System.out.println("A ordem crescente: \n" +n3+"\n"+n1+"\n"+n2);
         }
       else 
         {
           System.out.println("A ordem crescente: \n"+n3+"\n"+n2+"\n"+n1);
         }
	}
	

}
