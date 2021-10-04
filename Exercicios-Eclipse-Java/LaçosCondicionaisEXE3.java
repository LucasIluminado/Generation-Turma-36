import java.util.Scanner;

public class LaçosCondicionaisEXE3 {
     
	public static void main(String[] args) {
    	 
    	int idade;
    	String nome;
    	
    	Scanner leia = new Scanner (System.in);
    	
    	System.out.println("\nDigite seu nome completo: ");
    	nome = leia.next();
    	System.out.println("\nDigite sua Idade: ");
    	idade = leia.nextInt();
    	
    	if(idade>=10 && idade<=14)
    	{
    		System.out.println("\nO candidato "+nome+" se qualifica para categoria Infantil!");
    	}
    	else if(idade>=15 && idade<=17)
    	{
    		System.out.println("\nO candidato "+nome+" se qualifica para categoria Juvenil!");
    	}
    	else if(idade>=18 && idade<=25)
    	{
    		System.out.println("\nO candidato "+nome+" se qualifica para categoria Adulto!");
    	}
    	else if(idade<10 || idade>25)
    	{
    		System.out.println("\nO candidato "+nome+" não se qualifica para nenhuma das categorias!");
    	}
     }
}
