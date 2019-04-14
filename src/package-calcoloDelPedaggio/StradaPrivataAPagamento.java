package calcoloDelPedaggio;

public interface StradaPrivataAPagamento // interfaccia per la gestione di una strada privata a pagamento con caselli 
{
	double calcolaChilometriPercorsi( String nomeCaselloPartenza, String nomeCaselloarrivo ); // metodo per il calcolo della distanza in chilometri tra due caselli
	
	boolean aggiungiCasello( String nome, double chilometri ); // metodo per aggiungere un casello alla strada privata
}
