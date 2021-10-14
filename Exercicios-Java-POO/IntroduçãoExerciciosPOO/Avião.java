import java.text.NumberFormat;

public class Avião {
	
	private String companhiaAerea;
	private String nomeAviao;
	private String modelo;
	private String estado;
	private String utilizado;
	private int ano;
	private double valorEstimado;
	
	public Avião(String companhiaAerea, String nomeAviao, String modelo, String estado, int ano, double valorEstimado,String utilizado) 
	{
		this.companhiaAerea = companhiaAerea;
		this.nomeAviao = nomeAviao;
		this.modelo = modelo;
		this.estado = estado;
		this.ano = ano;
		this.valorEstimado = valorEstimado;
	}

	public String getCompanhiaAerea() {
		return companhiaAerea;
	}

	public void setCompanhiaAerea(String companhiaAerea) {
		this.companhiaAerea = companhiaAerea;
	}

	public String getNomeAviao() {
		return nomeAviao;
	}

	public void setNomeAviao(String nomeAviao) {
		this.nomeAviao = nomeAviao;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getValorEstimado() {
		return valorEstimado;
	}

	public void setValorEstimado(double valorEstimado) {
		this.valorEstimado = valorEstimado;
	}
	public String formatarMoeda() 
	{
			NumberFormat nf = NumberFormat.getCurrencyInstance();
			nf.setMinimumIntegerDigits(2);
			String formatoMoeda = nf.format(valorEstimado);
			return formatoMoeda;
	}
	public void imprimir()
	{
		System.out.println("Companhia Aérea: "+companhiaAerea+"\t\tNome: "+nomeAviao+"\t\tModelo da Aeronave: "+modelo+
		"\n\nEstado: "+estado+"\t\t\tAno do Fabricação: "+ano+"\t\tValor Estimado: "+this.formatarMoeda());
		

	}

}
