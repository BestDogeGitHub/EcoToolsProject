package autostrada;

import java.util.*;

import casello.Casello;
import utility.TipiEnum.ClasseVeicolo;
import utility.TipiEnum.tipoDiTratta;

public class Autostrada
{	
	private int id;
	private String nome;
	private tipoDiTratta tipoAutostrada;
	private TreeMap<ClasseVeicolo,Double> tariffaUnitaria; // Mappa delle tariffe per ogni classe di veicolo
	private ArrayList<Casello> listaCaselli;  // Mappa dei caselli dell'autostrada,ognuno associato al suo id

	public Autostrada( int id, String nome, tipoDiTratta tipoAutostrada, TreeMap<ClasseVeicolo,Double> tariffaUnitaria, ArrayList<Casello> listaCaselli) 
	{
		this.id = id;
		this.nome = nome;
		this.tipoAutostrada = tipoAutostrada;
		this.tariffaUnitaria = tariffaUnitaria;
		this.listaCaselli = listaCaselli;
	}

	public int getId() { return id; }
	public void setId(int id) { this.id = id; }
	public String getNome() { return nome; }
	public void setNome(String nome) { this.nome = nome; }
	public tipoDiTratta getTipoAutostrada() { return tipoAutostrada; }
	public void setTipoAutostrada(tipoDiTratta tipoAutostrada) { this.tipoAutostrada = tipoAutostrada; }
	public TreeMap<ClasseVeicolo, Double> getTariffaUnitaria() { return tariffaUnitaria; }
	public void setTariffaUnitaria(TreeMap<ClasseVeicolo, Double> tariffaUnitaria) { this.tariffaUnitaria = tariffaUnitaria; }
	public ArrayList<Casello> getListaCaselli() { return listaCaselli; }
	public void setListaCaselli(ArrayList<Casello> listaCaselli) { this.listaCaselli = listaCaselli; }
}
