import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op;
		Scanner ler = new Scanner (System.in);
		
		ArrayList<String> mercadoria = new ArrayList();
		
		do 
		{
			System.out.println("\n\t###### DADOS DO ESTOQUE DE MERCADORIAS ######\n");
			System.out.println("\n[1] Adicionar um novo produto ao estoque?");
			System.out.println("\n[2] Remover um produto do estoque?");
			System.out.println("\n[3] Atualizar um produto do estoque?");
			System.out.println("\n[4] Apresentar os produtos do estoque?");
			System.out.println("\n[0] Deseja finalizar o Programa de Estoque?");
			System.out.println("\nDigite a Opção Desejada: ");
			op = ler.nextInt();
			
			switch(op) 
			{ 
				case 1:
					ler.nextLine();
					System.out.println("\nDescrição do Produto que deseja adicionar ao estoque: ");
					String produto = ler.nextLine();
					mercadoria.add(produto);
					break;
				
				case 2:
					ler.nextLine();
					System.out.println("\nDescrição do Produto que deseja remover do estoque: ");
					String mercadoriaRemove = ler.nextLine();
					
					if(mercadoria.contains(mercadoriaRemove))
					{
						mercadoria.remove(mercadoriaRemove);
					}
					else 
					{
						System.out.println("\nEste Produto já não existe no estoque!!!");
					}
					break;
				
				case 3:
					ler.nextLine();
					System.out.println("\nDescrição do Produto que deseja substituir: ");
					String check = ler.nextLine();
					System.out.println("\nDescrição do Produto que substituirá "+check+" --> ");
					String novoProduto = ler.nextLine();
					
					if(mercadoria.contains(check)) 
					{
						mercadoria.remove(check);
						mercadoria.add(novoProduto);
					}
					else 
					{
						System.out.println("\n Produto não localizado no estoque!!!");
					}
					break;
				
				case 4:
					ler.nextLine();
					System.out.println("\nProdutos do estoque: ");
					System.out.println("\n---------------\n");
					System.out.println(mercadoria);
					System.out.println("\n---------------\n");
					break;
					
					default:
						
						System.err.print("\nPROGRAMA FINALIZADO!!!\n");
			}
			
		}
		while(op!=0);
			
	}

}
