package com.mycompany.myapp.Entities;

public class Boisson extends Consommation
{
	
	final static public int TYPE_BEAR = 1, TYPE_WINE = 2;
	
	
	public Boisson (int typeBoisson){
		super("");
		setType(typeBoisson);
		setNom(getTypeBoisson(typeBoisson));
	}

	public void setType(int type)
	{
		this.type = type;
	}

	public int getType()
	{
		return type;
	}
	
	public String getTypeBoisson(int typeBoisson){
		
		String t;
		
		switch(typeBoisson){
			case TYPE_BEAR:
				t = "Bear";
			break;
			case TYPE_WINE:
				t = "Wine";
				break;
			default :
				t = "";
			break;
		}
		
		return t;
	}
}
