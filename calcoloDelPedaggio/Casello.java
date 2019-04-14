package calcoloDelPedaggio;

public class Casello 
{	
	private double chilometri; // la distanza in chilometri dall'inizio del tratto di autostrada, per calcolare la distanza tra il casello di partenza e quello di arrivo
							   // basta sottrarre ai chilometri del casello di arrivo quelli del casello di partenza e poi prenderne il valore assoluto
	
	private String nome;       // il nome del casello
	
	public Casello(double chilometri, String nome) 
	{
		this.chilometri = chilometri;
		this.nome = nome;
	}

	public double getChilometri() { return chilometri; }
	public void setChilometri(double chilometri) { this.chilometri = chilometri; }
	public String getNome() { return nome; }
	public boolean setNome(String nome) {}    // metodo usato per modificare il nome di un casello, se il casello fa parte gia' di una autostrada, si deve prima controllare
	                                          // che non ci sia un altro casello gia' con quel nome, in quel caso il nome non viene modificato, questo metodo ritorna 'true'
	                                          // se la rinominazione vaa buon fine, 'false' viceversa
}