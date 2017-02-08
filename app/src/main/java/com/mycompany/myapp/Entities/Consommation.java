package com.mycompany.myapp.Entities;

public class Consommation extends Service
{

	protected String image, nom;
	protected int type;
	
	public Consommation(String imageConso){
		setImage(imageConso);
	}
	
	public void setType(int type){
		this.type = type;
	}
	
	public int getType(){
		return this.type;
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
