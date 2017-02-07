package com.mycompany.myapp.Entities;

public abstract class Service
{
	protected int codeId;
	protected String nom;
	protected double prix, tva;
	
	public Service()
	{}

	public void setPrix(double prix)
	{
		this.prix = prix;
	}

	public double getPrix()
	{
		return prix;
	}

	public void setTva(double tva)
	{
		this.tva = tva;
	}

	public double getTva()
	{
		return tva;
	}

	public void setCodeId(int codeId)
	{
		this.codeId = codeId;
	}

	public int getCodeId()
	{
		return codeId;
	}

	public void setNom(String nom)
	{
		this.nom = nom;
	}

	public String getNom()
	{
		return nom;
	}
	
	abstract public void commander(Service s);
	
	abstract public void facturer(Service s);
	
	abstract public void servir(Service s);
}
