package calcoloDelPedaggio;

public class CalcoloPedaggio 
{
	private static int iva = 22;  // iva da aggiungere al prezzo finale
	
	private static final double [][] tariffaUnitaria ={{ 0.07231, 0.07401, 0.09862, 0.14864, 0.17530}, //le tariffe unitarie, la prima riga sono le tariffe per le autostrade
			                                           { 0.08547, 0.08749, 0.11414, 0.17426, 0.20629}};//in pianura per ogni classe di veicolo, la seconda per quelle in montagna
	
	private static int determinaClasseVeicolo( Veicolo v ){} // metodo che dato un veicolo ne determina la classe
	
	private static int determinaTariffa( Veicolo v, Autostrada a){} // metodo che determina la tariffa unitaria in base alla classe del veicolo, chiamando 
	                                                                // 'determinaClasseVeicolo', e il tipo dell'autostrada
	
	public static int CalcolaPrezzo( Veicolo v, Autostrada a, String nomeCaselloPartenza, String nomeCaselloarrivo ){} // metodo chiamato nel main per determinare il prezzo del
    // pedaggio, chiama 'determinaTariffa' per ottenere la tariffa, e 'calcolaChilometriPercorsi' per ottenere i chilometri totali	
}