import java.util.Scanner;

public class TesteAnimalPoli {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		int op;
		
		
		CachorroPoli cachorro = new CachorroPoli ("Bob",12,"Canis lupus familiaris","Nossos Corações e Casas","PitBull");
		CavaloPoli cavalo = new CavaloPoli("Spirit",11,"equus cabalus","Regiões mais frias e desérticas","Peso leve");
		preguicaPolimor preguica = new preguicaPolimor("Marley",4,"folivora","Florestas","Bradypus varriegatus");
		AnimalPoli animal = null;
		
		do {	
		System.out.println("\n ##### DIGITE O QUE DESEJA #####");
		System.out.printf("\n 1 - CACHORRO");	
		System.out.printf("\n 2 - CAVALO");
		System.out.printf("\n 3 - PREGUIÇA");
		System.out.printf("\n Opção: ");
		op = ler.nextInt();
		
		switch (op) {
		
		case 1:
		animal = cachorro; 
		cachorro.Imprimir();	
		System.out.print("\n\n 1 - Latir");
		System.out.print("\n 2 - Correr");
		System.out.print("\n Opção: ");
		op = ler.nextInt();
		
		while (op >=1 || op <= 2) {	
			if (op == 1)
			{ 
			System.out.print("\n Qual som tipico de um Cachorro faz??? ");
			String som = ler.next();
			cachorro.som(som);	
			break; 
			}
			if (op == 2)
			{
				System.out.print("\n O que seu Cachorro gosta de fazer??? "); 
				int correr = ler.nextInt();
				cachorro.correr(correr);	
				break;
			}
		}
		break;
		
		case 2:
		animal = cavalo;
		cavalo.Imprimir();
	    System.out.print("\n 1 - Rinchar");
		System.out.print("\n 2 - Correr");
		System.out.print("\n Opção: ");
		op = ler.nextInt();
		
		while (op >=1 || op <= 2)
		{	
			if (op == 1)
			{
				System.out.print("\n Qual som tipico de um Cavalo??? ");
				String som = ler.next(); 
				cavalo.som(som);
				break; 
			} 
			if (op == 2) 
			{
				System.out.print("\n Qual o ponte forte do Cavalo??? ");
				int correr = ler.nextInt();
				cavalo.correr(correr);	
				break;
			}
		}
		break;
		
		case 3: 
		animal = preguica;
		preguica.Imprimir();	
		System.out.print("\n 1 - Emitir Som");
		System.out.print("\n 2 - Correr");
		System.out.print("\n 3 - Subir Árvore");
		System.out.print("\n Opção: ");
		op = ler.nextInt();
		
		while (op >=1 || op <= 3)
		{	
			if (op == 1) 
			{
				System.out.print("\n Qual SOM a sua PREGUIÇA faz? ");
				String som = ler.next();
				preguica.som(som);	
				break;
			}
			if (op == 2) 
			{
				int correr = 0; preguica.correr(correr); break;}
				if (op == 3)
				{preguica.subir(); break; }
		}
		break;
		
		default: System.out.println("\n ESTÁ NÃO OPÇÃO INVALIDA"); break;
			}
		} while (op != 0);
	}
}