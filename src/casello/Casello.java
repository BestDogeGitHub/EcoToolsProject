package casello;

public class Casello 
{	
	private double chilometri; // la distanza in chilometri dall'inizio del tratto di autostrada, per calcolare la distanza tra il casello di partenza e quello di arrivo
							   // basta sottrarre ai chilometri del casello di arrivo quelli del casello di partenza e poi prenderne il valore assoluto
	
	private String nome;       // il nome del casello
	private int autostradaId;    // riferimento all'autostrada a cui appartiene
	
	public Casello(double chilometri, String nome, int autostradaId) 
	{
		this.chilometri = chilometri;
		this.nome = nome;
		this.autostradaId = autostradaId;
	}

	public double getChilometri() { return chilometri; }
	public void setChilometri(double chilometri) { this.chilometri = chilometri; }
	public String getNome() { return nome; }
	public void setNome(String nome) {this.nome = nome;} 
	public int getAutostradaId() { return autostradaId; }
	public void setAutostradaId(int autostradaId) { this.autostradaId = autostradaId; }
	
	
}
