package pedaggio;

import autostrada.Autostrada;
import casello.Casello;
import veicolo.Veicolo;

public class PedaggioAChilometri implements Pedaggio{

	// metodo per il calcolo del pedaggio a chilometri che si basa sulla distanza tra i due caselli di entrata e uscita
	public Double calcoloPedaggio(Veicolo veicolo, String nomeCaselloPartenza, String nomeCaselloarrivo, Autostrada autostrada) { return null; }

	public double calcolaChilometriPercorsi( Casello CaselloEntrata, Casello CaselloUscita ) {return 0;} 
	// metodo che calcola la distanza fra due caselli dell'autostrada, viene chiamato da "calcoloPedaggio" dopo aver ottenuto i due caselli dell'autostrada
    // il casello viene cercato nella TreeMap dell'autostrada
}
