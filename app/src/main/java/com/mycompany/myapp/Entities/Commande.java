package com.mycompany.myapp.Entities;
import java.util.*;

public class Commande
{
	
	protected int numero;
	protected double totalFacture;
	protected String nom;
	protected ArrayList<Consommation> listeConsommations;
	
	public Commande(int numeroC){
		
		setNumero(numeroC);
		setTotalFacture(0);
		
		listeConsommations = new ArrayList<Consommation>();
	}

	public void setNom(String nom)
	{
		this.nom = nom;
	}

	public String getNom()
	{
		return nom;
	}

	public void setTotalFacture(double total)
	{
		this.totalFacture = total;
	}

	public double getTotalFacture()
	{
		return totalFacture;
	}

	public void setListeConsommations(ArrayList<Consommation> listeConsommations)
	{
		this.listeConsommations = listeConsommations;
	}

	public ArrayList<Consommation> getListeConsommations()
	{
		return listeConsommations;
	}

	public void setNumero(int numero)
	{
		this.numero = numero;
	}

	public int getNumero()
	{
		return numero;
	}
	
	public void addConsommation(Consommation c){
		
	}
}
