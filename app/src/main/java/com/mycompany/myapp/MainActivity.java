package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import com.mycompany.myapp.Entities.*;
import java.util.*;

public class MainActivity extends Activity
{
	
	Table t;
	TextView commandview, tableview, testview, listeCommandeView;
	Commande c;
	ArrayList<Commande> listeCommandes;
	Button btnCommand, btnAddBear, btnDeleteBear, btnAddWine, btnDeleteWine;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		tableview = (TextView) findViewById(R.id.table);
		commandview = (TextView) findViewById(R.id.commande);
		testview = (TextView) findViewById(R.id.test);
		listeCommandeView = (TextView) findViewById(R.id.liste_commande);
		
		t = new Table(1);
		t.initTable();
		listeCommandes = t.getListeCommande();
		c = listeCommandes.get(listeCommandes.size()-1);
		tableview.setText("Numero de table = "+t.getNumero());
		commandview.setText("Numero de commande = "+c.getNumero()+"\n");
		testview.setText("size list = "+listeCommandes.size());
		
		btnCommand = (Button) findViewById(R.id.add_command);
		btnAddBear = (Button) findViewById(R.id.add_bear);
		btnDeleteBear = (Button) findViewById(R.id.delete_bear);
		btnAddWine = (Button) findViewById(R.id.add_wine);
		btnDeleteWine = (Button) findViewById(R.id.delete_wine);
		
		btnCommand.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				t.addCommande();
				int x = listeCommandes.size();
				c = listeCommandes.get(x-1);
				testview.setText("size list = "+x);
				commandview.setText("");
				for(int i = 0 ; i < x ;i++)
				{
					commandview.setText(commandview.getText()+"Numero de commande = "+listeCommandes.get(i).getNumero()+"\n");
				}
			}
		});
		
		btnAddBear.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				String s;
				c.addConsommation(new Boisson(Boisson.TYPE_BEAR));
				int x = c.getListeConsommations().size();
			
				s = "Commande "+c.getNumero()+" | Composé de : =\n";
				for(int i = 0; i < x ; i++){
					s = s+"Boisson : "+c.getListeConsommations().get(i).getNom()+"\n";
				}
				listeCommandeView.setText(s);
			}
			});
			
		btnDeleteBear.setOnClickListener(new View.OnClickListener(){
				public void onClick(View v){
					
					String s = "Aucune bière à supprimer !";
					ArrayList<Consommation> listeConso = c.getListeConsommations();
					int x = listeConso.size();
					while(listeConso.get(x-1) != null){
						if(listeConso.get(x-1).getType() == Boisson.TYPE_BEAR){
							listeConso.remove(x-1);
							s = "Une bière de supprimée.";
						}
						else{
							x -= 1;
						}
						listeCommandeView.setText(s);
					}
				}
			});
			
		btnAddWine.setOnClickListener(new View.OnClickListener(){
				public void onClick(View v){
					String s;
					c.addConsommation(new Boisson(Boisson.TYPE_WINE));
					int x = c.getListeConsommations().size();

					s = "Commande "+c.getNumero()+" | Composé de : =\n";
					for(int i = 0; i < x ; i++){
						s = s+"Boisson : "+c.getListeConsommations().get(i).getNom()+"\n";
					}
					listeCommandeView.setText(s);
				}
			});

		btnDeleteWine.setOnClickListener(new View.OnClickListener(){
				public void onClick(View v){

				}
			});
    }

}
