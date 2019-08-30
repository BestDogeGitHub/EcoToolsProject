package veicolo;

public class MezzoSuRuote 
{
	private String modello , marca;          // modello e marca del mezzo
	private double peso , altezza;           // peso e altezza del mezzo

	public MezzoSuRuote(String modello, String marca, double peso, double altezza) 
	{
		this.modello = modello;
		this.marca = marca;
		this.peso = peso;
		this.altezza = altezza;
	}
	
	public String getModello() { return modello; }
	public void setModello(String modello) { this.modello = modello; }
	public String getMarca() { return marca; }
	public void setMarca(String marca) { this.marca = marca; }
	public double getPeso() { return peso; }
	public void setPeso(double peso) { this.peso = peso; }
	public double getAltezza() { return altezza; }
	public void setAltezza(double altezza) { this.altezza = altezza; }
	
}
