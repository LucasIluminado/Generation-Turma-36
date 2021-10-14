
public class Preguica extends Animal {

	private String habitat;

	public Preguica (String nome, int idade, String som, String sobeArvore, String habitat)
	{
		super(nome, idade, som, sobeArvore);
		this.habitat = habitat;
	}
	public void imprimirInfo() 
	{
		System.out.println("Nome Cientifico: "+getNome()+" \t\tIdade M�dia do Animal: "+getIdade()+" \t\t\tSom que emite: "+getSom()+
				"\nPrincipal Caracteristica?: "+getSobeArvore()+"               Qual Habitat natural de uma Pregui�a?: "+habitat);
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
}
