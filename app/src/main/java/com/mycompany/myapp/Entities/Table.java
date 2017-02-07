package com.mycompany.myapp.Entities;
import java.util.*;

public class Table
{
	
	private ArrayList<Commande> listeCommande;
	private int numero, nbPlaces, zone;
	private String saveFile;
	
	public Table(int numTable){
		setNumero(numTable);
		setNbPlaces(4);
		setZone(2);
	}
	
	public Table(int numTable, int nbPlacesTable, int zoneTable){
		
		setNumero(numTable);
		setNbPlaces(nbPlacesTable);
		setZone(zoneTable);
	}

	
	public void addCommande(){
		this.listeCommande.add(new Commande(listeCommande.size()));
	}
	
	public void setListeCommande(ArrayList<Commande> listeCommande)
	{
		this.listeCommande = listeCommande;
	}

	public ArrayList<Commande> getListeCommande()
	{
		return listeCommande;
	}
	
	public void initTable(){
		
		this.setListeCommande( new ArrayList<Commande>());
		
		this.addCommande();
	}
	
	public void setNumero(int numero)
	{
		this.numero = numero;
	}

	public int getNumero()
	{
		return numero;
	}

	public void setNbPlaces(int nbPlaces)
	{
		this.nbPlaces = nbPlaces;
	}

	public int getNbPlaces()
	{
		return nbPlaces;
	}

	public void setZone(int zone)
	{
		this.zone = zone;
	}

	public int getZone()
	{
		return zone;
	}
	
	public void saveTable(){
		
	}
	
	
}
