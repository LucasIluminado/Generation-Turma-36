
public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 Cliente cliente1 = new Cliente ("Lucas B. de Sousa","PADRÃO",25);
		 
		 cliente1.imprimir();
		 System.out.println("\n\t---------------------------------");
		 System.out.println("\t\tMUDANÇA DE PLANO!!!");
		 System.out.println("\t---------------------------------");
		 cliente1.setPlano("PREMIUM");
		 cliente1.setValor(35);
		 cliente1.imprimir();
	}

}
