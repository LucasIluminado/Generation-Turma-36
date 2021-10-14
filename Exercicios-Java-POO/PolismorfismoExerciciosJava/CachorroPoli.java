public class CachorroPoli extends AnimalPoli{
	
	private String raca;
	
	public CachorroPoli(String nome, int idade, String especie,String habitat, String raca ) 
	{
		super(nome, idade, especie, habitat);
		this.raca = raca;
	}
	
	@Override
	public void Imprimir() {
		System.out.print("\n##### INFORMACÃO DO CACHORRO #####\n");
		System.out.print("\n 1-Nome: "+getNome());
		System.out.print("\n 2-Idade: "+getIdade());
		System.out.print("\n 3-Espécie: "+getEspecie());
		System.out.print("\n 4-Habitat: "+getHabitat());
		System.out.print("\n 5-Raça: "+raca);
	}
	
	@Override
	public void som(String som) 
	{
		System.out.print("\n O SOM QUE O CACHORRO NORMALMENTE EMITE É !!!\n "+som);
	}
	
	@Override
	public void correr(int correr) 
	{
		System.out.print("\n O cachorro está correndo!!"+correr);
	}
	
	public String getRaca() 
	{return raca; }

	public void setRaca(String porte) 
	{ this.raca = raca;}
	
}