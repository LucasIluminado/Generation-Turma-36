import java.text.NumberFormat;

public class Cliente {
	
	private String nomeSobrenome;
	private String Plano;
	private double valor;
	
	public Cliente(String nomeSobrenome, String Plano, double valor) 
	{
		this.nomeSobrenome = nomeSobrenome;
		this.Plano = Plano;
		this.valor = valor;
	}

	public String getNomeSobrenome() {
		return nomeSobrenome;
	}

	public void setNomeSobrenome(String nomeSobrenome) {
		this.nomeSobrenome = nomeSobrenome;
	}

	public String getPlano() {
		return Plano;
	}

	public void setPlano(String plano) {
		Plano = plano;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	public String formatarMoeda() 
	{
			NumberFormat nf = NumberFormat.getCurrencyInstance();
			nf.setMinimumIntegerDigits(2);
			String formatoMoeda = nf.format(valor);
			return formatoMoeda;
	}
	public void imprimir() 
	{
		System.out.println("\n"+nomeSobrenome+"\t\tPlano: "+Plano+"\t\tvalor: "+this.formatarMoeda());
	}
}
