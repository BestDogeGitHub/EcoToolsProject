package veicolo;

import utility.TipiEnum.ClasseVeicolo;

public abstract class Veicolo
{
	private String modello , marca;          // modello e marca del mezzo
	private double peso , altezza;   
	private String targa;                    // la targa del veicolo
	private int numAssi;                     // numero degli assi del veicolo
	private int inquinamentoAcustico;
	private ClasseVeicolo classeVeicolo;
	private String classeAmbientale;
	
	// costruttore per i veicoli pesanti fino al 2021 e per i veicoli leggeri fino al 2026
	Veicolo(String modello, String marca, String targa, int numAssi, double peso, double altezza,ClasseVeicolo classeVeicolo) 
	{
		this.modello = modello;
		this.marca = marca;
		this.peso = peso;
		this.altezza = altezza;
		this.targa = targa;
		this.numAssi = numAssi;	
	}
	
	
	// costruttore per i veicoli pesanti dal 2021 e per i veicoli leggeri dal 2026
	Veicolo( String modello, String marca, double peso, double altezza, String targa,
			int numAssi, int inquinamentoAcustico, ClasseVeicolo classeVeicolo, String classeAmbientale) 
	{
		this.modello = modello;
		this.marca = marca;
		this.peso = peso;
		this.altezza = altezza;
		this.targa = targa;
		this.numAssi = numAssi;
		this.inquinamentoAcustico = inquinamentoAcustico;
		this.classeVeicolo = classeVeicolo;
		this.classeAmbientale = classeAmbientale;
	}



	public String getModello() { return modello; }
	public void setModello(String modello) { this.modello = modello; }
	public String getMarca() { return marca; }
	public void setMarca(String marca) { this.marca = marca; }
	public double getPeso() { return peso; }
	public void setPeso(double peso) { this.peso = peso; }
	public double getAltezza() { return altezza; }
	public void setAltezza(double altezza) { this.altezza = altezza; }
	public String getTarga() { return targa; }
	public void setTarga(String targa) { this.targa = targa; }
	public int getNumAssi() { return numAssi; }
	public void setNumAssi(int numAssi) { this.numAssi = numAssi; }
	public int getInquinamentoAcustico() { return inquinamentoAcustico;}
	public void setInquinamentoAcustico(int inquinamentoAcustico) { this.inquinamentoAcustico = inquinamentoAcustico; }
	public ClasseVeicolo getClasseVeicolo() { return classeVeicolo; }
	public void setClasseVeicolo(ClasseVeicolo classeVeicolo) { this.classeVeicolo = classeVeicolo; }
	public String getClasseAmbientale() { return classeAmbientale; }
	public void setClasseAmbientale(String classeAmbientale) { this.classeAmbientale = classeAmbientale; }
	
	public boolean equals(Object obj) // due veicoli sono uguali se hanno la stessa targa
	{
		if (this == obj) return true;
		if (obj == null) return false;
		if (!(obj instanceof Veicolo)) return false;
		Veicolo other = (Veicolo) obj;
		if (targa == null) 
		{
			if (other.targa != null) return false;
		}else if (!targa.equals(other.targa)) return false;
		return true;
	}
}
