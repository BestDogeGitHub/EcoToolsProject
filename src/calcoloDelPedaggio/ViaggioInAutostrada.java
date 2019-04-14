package calcoloDelPedaggio;

import calcoloDelPedaggio.Autostrada.tipoDiTratta;

public class ViaggioInAutostrada 
{
	public static void main(String[] args) 
	{
		int prezzo;
		
		Veicolo v = new Veicolo("A4", "Audi" , "AF246EZ" , 3 , 2000.5 , 1.5 );  // creo un veicolo esemplificativo
		
		Autostrada a = new Autostrada("Fi-Pi-Li", tipoDiTratta.PIANURA );       // instanzio un autostrada
		
		a.aggiungiCasello( "Firenza", 10.50 );
		a.aggiungiCasello( "Pisa", 97.20 );
		
		prezzo = CalcoloPedaggio.CalcolaPrezzo( v , a , "Firenze" , "Pisa" );   // chiamo il metodo per il calcolo del costo del viaggio, gli passo il veicolo, l'autostrada
																				// e il nome dei caselli di arrivo e partenza

		System.out.println("Il pedaggio e'" + prezzo);							// stampo il risultato	
	}
}


/*****************************************************************************
* Per i cambiamenti riguardo alla quantita' di CO2 e alla classe euro del veicolo sono da modificare: la classe veicolo aggiungendo i campi necessari,
* i metodi 'determinaClasseVeicolo' e 'determinaTariffa' e la costante 'tariffaUnitaria' della classe CalcoloPedaggio 
******************************************************************************/