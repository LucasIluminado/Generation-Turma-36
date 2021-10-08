
public class Cavalo extends Animal {
	
	private String categoria;
	
	public Cavalo (String nome, int idade, String som, String corre, String categoria)
	{
		super(nome, idade, som, corre);
		this.categoria = categoria;
	}
	public void imprimirInfo() 
	{
		System.out.println("Nome do Animal Competidor: "+getNome()+" \t\tIdade do Animal: "+getIdade()+" \t\t\tSom que emite: "+getSom()+
				"\nQual o ponto forte do Animal?: "+getCorre()+"             Qual Categoria se encaixa?: "+categoria);
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
}
