import java.util.Scanner;


public class VetoresJavaEXE1 {

    public static void main(String[] args) {

    	int numero[]=new int[6];
        int num, x, somapar=0, contimpar=0, contpar=0, quantimpar=0;

        Scanner leia = new Scanner(System.in);

        for (x=0; x<6; x++)
        {
            System.out.println("\n Insira o n�mero desejado: ");
            numero[x]  = leia.nextInt();
        }
        
            System.out.println("os numeros pares");
        
        for(x=0;x<6;x++) 
           {
                if(numero[x]%2==0)
                { 
                somapar+=numero[x];
                System.out.print(" " +numero[x]+" / ");
                }
        }
        System.out.println("\nOs numeros impares");
        
        for(x=0;x<6;x++) 
        {
          
        	if(numero[x]%2!=0)
            {
                quantimpar++;
                System.out.printf(" "+numero[x]+ " / ");
            }
        }

        System.out.println ("\nA soma dos n�meros pares foi de: " +somapar );
        System.out.println ("\nA quantidade de n�meros �mpares foi de : "+quantimpar );

     }

}