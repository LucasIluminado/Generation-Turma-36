import java.util.Scanner;

public class exercicio3 {
	
	public static void main(String[] args)

	{
	
    int seg, Horas, Min, Segs;
	
	Scanner leia = new Scanner (System.in);
	
	System.out.println("\nQuantos segundos dura o evento: ");
      seg = leia.nextInt();
		
      Horas = seg / 3600;
      Min = ((seg % 3600)/60);
      Segs = ((seg % 3600)%60);
      
      System.out.println("\nO Total de Horas equivalem a: " + Horas+ "\nO Total de Minutos equivalem a: " + Min + "\nO Total de Segundos equivalem a: " + Segs);
      
      
	}
	
	
	
	
	
	

}
