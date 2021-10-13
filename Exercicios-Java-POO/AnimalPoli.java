public abstract class AnimalPoli {

	private String nome;
	private int idade;
	private String especie;
	private String habitat;
	
	public AnimalPoli (String nome, int idade, String especie, String habitat) 
	{
		super();
		this.nome = nome;
		this.idade = idade;
		this.especie = especie;
		this.habitat = habitat;
	}

	abstract public void Imprimir();
	abstract public void som(String som);
	abstract public void correr(int correr);
	

	public String getNome() 
	{return nome; }

	public void setNome(String nome)
	{this.nome = nome;}

	public int getIdade()
	{ return idade; }

	public void setIdade(int idade)
	{ this.idade = idade; }

	public String getEspecie() 
	{ return especie; }

	public void setEspecie(String especie) 
	{ this.especie = especie; }

	public String getHabitat() 
	{ return habitat; }

	public void setHabitat(String habitat)
	{ this.habitat = habitat; }
	
}
