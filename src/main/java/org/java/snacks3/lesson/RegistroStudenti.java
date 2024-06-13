package org.java.snacks3.lesson;

import org.java.snacks.lesson.Studente; 

public class RegistroStudenti {
	
	//Dichiarazione delle variabili di stanza
	
	private Studente[] listaStudenti;
	
	//Metodo costruttore
	public  RegistroStudenti() {
		
		listaStudenti = new Studente[30];
	}
	
	//Metodo per aggiungere uno studente al registro
	public void aggiungiStudente(Studente nuovoStudente) {
		
		for(int i=0; i<listaStudenti.length; i++)
		{
			if(listaStudenti[i] == null) {
				listaStudenti[i] = nuovoStudente;
				break;
			}
		}
	}
	
	//Metodo per stampare il registro studenti
	public void stampaStudenti() {
		int i=0;
		while(i<listaStudenti.length && listaStudenti[i] != null)
		{
			System.out.println(listaStudenti[i].userInfo());
			i++;
		}
	}
		
	
	
}

