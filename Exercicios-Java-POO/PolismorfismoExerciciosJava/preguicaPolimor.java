public class preguicaPolimor extends AnimalPoli{

	String cientifico;
	
	public preguicaPolimor (String nome, int idade, String especie, String habitat, String cientifico)
	{
		super(nome, idade, especie, habitat);
		this.cientifico = cientifico;
	}
	

	@Override
	public void Imprimir() 
	{
		System.out.print(" \n##### INFORMA��ES DA PREGUI�A #####\n");
		System.out.print("\n Nome: "+getNome());
		System.out.print("\n Idade: "+getIdade());
		System.out.print("\n Esp�cie: "+getEspecie());
		System.out.print("\n Habitat: "+getHabitat());
		System.out.print("\n Nome cientifico: "+cientifico);
	}
	
	@Override
	public void som(String som) 
	{
		System.out.print("\n O som da Pregui�a!!\n "+som);
	}
	
	@Override
	public void correr(int correr) {
		System.out.print("\n A pregui�a est� descansando");
	}
	
	public void subir() {
		System.out.print("\n A pregui�a est� chegando no topo!!");
	}


	public String getCientifico() {
		return cientifico;
	}

	public void setCientifico(String cientifico) {
		this.cientifico = cientifico;
	}
	
}

	
	