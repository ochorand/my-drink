package com.mycompany.myapp.Entities;

public class Consommation extends Service
{

	protected String image, nom;
	
	public Consommation(String imageConso){
		setImage(imageConso);
	}


	public void setNom(String nom)
	{
		this.nom = nom;
	}

	public String getNom()
	{
		return nom;
	}
	

	public void setImage(String image)
	{
		this.image = image;
	}

	public String getImage()
	{
		return image;
	}
	
	
	@Override
	public void commander(Service s)
	{
		// TODO: Implement this method
	}

	@Override
	public void servir(Service s)
	{
		// TODO: Implement this method
	}

	@Override
	public void facturer(Service s)
	{
		// TODO: Implement this method
	}



	
	
	
}
