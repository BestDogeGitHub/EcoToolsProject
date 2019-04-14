package calcoloDelPedaggio;

public class Veicolo extends MezzoSuRuote 
{
	private String targa;                    // la targa del veicolo
	private int numAssi;                     // numero degli assi del veicolo
		
	public Veicolo(String modello, String marca, String targa, int numAssi, double peso, double altezza) 
	{
		super( modello, marca, peso , altezza);
		this.targa = targa;
		this.numAssi = numAssi;	
	}

	public String getTarga() { return targa; }
	public void setTarga(String targa) { this.targa = targa; }
	public int getNumAssi() { return numAssi; }
	public void setNumAssi(int numAssi) { this.numAssi = numAssi; }
	
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
