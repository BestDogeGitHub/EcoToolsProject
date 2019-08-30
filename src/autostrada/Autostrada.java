package autostrada;

import java.util.*;

import casello.Casello;

public class Autostrada implements StradaPrivataAPagamento 
{	
	public enum tipoDiTratta   // variabile enumerativa utilizzata per indicare il tipo di autostrada
	{
		PIANURA ,
		MONTAGNA;
	}
	
	private String nome;
	private tipoDiTratta tipoAutostrada;
	private HashMap<String,Casello> listaCaselli;  // struttura dati per mantenere i caselli dell' autostrada, in pratica ha la funzione di simulare un database
        // in cui ogni tupla rappresenta un casello identificato dal suo nome che ha la funzione di chiave primaria

	public Autostrada(String nome, tipoDiTratta tipoAutostrada) 
	{
		this.nome = nome;
		this.tipoAutostrada = tipoAutostrada;
		this.listaCaselli= new HashMap<String,Casello>();
	}

	public String getNome() { return nome; }
	public void setNome(String nome) { this.nome = nome; }
	public tipoDiTratta getTipoAutostrada() { return tipoAutostrada; }
	public void setTipoAutostrada(tipoDiTratta tipoAutostrada) { this.tipoAutostrada = tipoAutostrada; }
	
	public double calcolaChilometriPercorsi( String nomeCaselloPartenza, String nomeCaselloarrivo ) {return 0;} // metodo che calcola la distanza fra due caselli dell'autostrada,
        // il casello viene cercato nell' HashMap tramite il suo nome, torna la distanza se i due caselli esistono, '-1' viceversa
	
	public boolean aggiungiCasello( String nome, double chilometri ) {return false;} // metodo che aggiunge un casello all'HashMap e gli assegna il suo nome come chiave,
	// non fa niente se esiste gia' un casello con quel nome nell'HashMap, ritorna 'true' se il casello viene aggiunto con successo, 'false' viceversa
}
