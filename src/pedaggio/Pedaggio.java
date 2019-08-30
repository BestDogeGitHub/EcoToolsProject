package pedaggio;

import autostrada.Autostrada;
import veicolo.Veicolo;
import casello.Casello;

public interface Pedaggio {
	
	static final double iva = 0.22 ;
	
	public Double calcoloPedaggio(Veicolo veicolo, String nomeCaselloPartenza, String nomeCaselloarrivo, Autostrada autostrada);

}
