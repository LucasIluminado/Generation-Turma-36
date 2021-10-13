public class CavaloPoli extends AnimalPoli{

	String categoria;
	
	public CavaloPoli (String nome, int idade, String especie,String habitat, String categoria) 
	{
		super(nome, idade, especie, habitat);
		this.categoria = categoria;
	}
	
	@Override
	public void Imprimir() 
	{
		System.out.print("\n##### INFORMAÇÕES DO CAVALO #####\n");
		System.out.print("\n 1-Nome: "+getNome());
		System.out.print("\n 2-Idade: "+getIdade());
		System.out.print("\n 3-Espécie: "+getEspecie());
		System.out.print("\n 4-Habitat: "+getHabitat());
		System.out.print("\n 5-Categoria: "+categoria);
	}
	
	@Override
	public void som(String som) 
	{
		System.out.print("\n O cavalo Relicha !!\n "+som);
	}
	
	@Override
	public void correr(int correr) 
	{
		System.out.print("\n O ponto forte do cavalo é !!! "+correr);
	}

	public String getCategoria() 
	{ return categoria; }

	public void setCategoria(String categoria)
	{ this.categoria = categoria;}
	
}