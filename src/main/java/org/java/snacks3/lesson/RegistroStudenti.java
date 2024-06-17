package org.java.snacks3.lesson;

import org.java.snacks.lesson.Studente; 

public class RegistroStudenti {
	
	//Dichiarazione delle variabili di stanza
	
	private Studente[] listaStudenti;
	
	//Metodo costruttore
	public  RegistroStudenti() {
		
		listaStudenti = new Studente[0];
	}
	
	//Metodo per aggiungere uno studente al registro
	public void aggiungiStudente(Studente nuovoStudente) {
		
		//Creo un array con un posto in più rispetto all'originale
		Studente[] nuovaLista = new Studente[this.listaStudenti.length+1];
		
		//Copio tutti gli elementi dell'array di partenza nel nuovo array
		for(int i=0; i<listaStudenti.length; i++)
		{
			nuovaLista[i]= listaStudenti[i];
		}
		
		//Popolo l'ultima posizione dell'array con il nuovo elemento
		nuovaLista[nuovaLista.length-1] = nuovoStudente;
		
		//Sovrascrivo il riferimento del vecchio array con quello nuovo
		this.listaStudenti = nuovaLista;
	}
	
	//Metodo per stampare il registro studenti
	public void stampaStudenti() {
		
		for(int i=0;i<listaStudenti.length;i++)
		{
			System.out.println(listaStudenti[i].userInfo());
			
		}
	}
		
	
	
}

