
public class Cachorro extends Animal {
	
	private String problema;
	
	public Cachorro (String nome, int idade, String som, String corre, String problema)
	{
		super(nome, idade, som, corre);
		this.problema = problema;
	}
	public void imprimirInfo() 
	{
		System.out.println("Nome do PET: "+getNome()+" \t\tIdade do Animal: "+getIdade()+" \t\t\tSom que emite: "+getSom()+
		"\nAtividade no momento do problema?: "+getCorre()+"       Qual o problema?: "+problema);
	}
	public String getProblema() {
		return problema;
	}
	public void setProblema(String problema) {
		this.problema = problema;
	}
	
}
