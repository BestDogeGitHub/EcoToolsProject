package veicolo;

import utility.TipiEnum.ClasseAmbientale;
import utility.TipiEnum.ClasseVeicolo;

public class VeicoloPesante extends Veicolo 
{
	// costruttore per i veicoli pesanti fino al 2021
	VeicoloPesante(String modello, String marca, double peso, double altezza, String targa, int numAssi, ClasseVeicolo classeVeicolo ) 
	{
		super(modello, marca, targa,numAssi, peso, altezza, classeVeicolo );
	}
		
	// costruttore per i veicoli pesanti dopo il 2021
	VeicoloPesante(String modello, String marca, double peso, double altezza, String targa, int numAssi, int inquinamentoAcustico, 
			ClasseVeicolo classeVeicolo, ClasseAmbientale classeAmbientale) 
	{
		super(modello, marca, peso, altezza, targa, numAssi, inquinamentoAcustico, classeVeicolo, classeAmbientale);
	}
}
