package applicazione;


import autostrada.Autostrada;
import autostrada.ControllerAutostrada;
import pedaggio.ControllerPedaggio;
import pedaggio.Pedaggio;
import veicolo.ControllerVeicolo;
import veicolo.Veicolo;

public class Main 
{
	public static void main(String[] args)
	{
		Double prezzo;
		Pedaggio pedaggio;
		
		Veicolo v = ControllerVeicolo.ritornaVeicolo("AF246EZ");
		
		pedaggio = ControllerPedaggio.scegliPedaggio(v);
		
		Autostrada a = ControllerAutostrada.ritornaAutostrada(5);
		
		prezzo = pedaggio.calcoloPedaggio( v , "Firenze" , "Pisa" ,a);   // chiamo il metodo per il calcolo del costo del viaggio, gli passo il veicolo, l'autostrada
																				// e il nome dei caselli di arrivo e partenza

		System.out.println("Il pedaggio e'" + prezzo);							// stampo il risultato	
	}
}