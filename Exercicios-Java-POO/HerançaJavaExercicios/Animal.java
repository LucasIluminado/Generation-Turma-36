
public class Animal {

	private String nome;
	private int idade;
	private String som;
	private String corre;
	private String sobeArvore;
	
	public Animal (String nome, int idade, String som, String corre, String sobeArvore)
	{
		this.nome = nome;
		this.idade = idade;
		this.som = som;
		this.corre = corre;
		this.sobeArvore = sobeArvore;
	}	
	public Animal (String nome, int idade, String som, String sobeArvore)
	{
		this.nome = nome;
		this.idade = idade;
		this.som = som;
		this.sobeArvore = sobeArvore;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	public String getCorre() {
		return corre;
	}
	public void setCorre(String corre) {
		this.corre = corre;
	}
	public String getSobeArvore() {
		return sobeArvore;
	}
	public void setSobeArvore(String sobeArvore) {
		this.sobeArvore = sobeArvore;
	}
	

}