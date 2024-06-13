package org.java.snacks.lesson;

public class Studente {
	
	//Dichiarazione delle variabli di stanza
	private String userName;
	private String userLastName;
	private int userAge;
	
	//Metodo costruttore
	
	public Studente(String userName, String userLastName, int userAge) {
		
		this.userName= userName;
		this.userLastName = userLastName;
		this.userAge = userAge;
		
	}
	
	// Metodo che restituisce le informazioni dell'utente
	public String userInfo() {
		String userInfo = String.format("%s %s %d Anni", userName,userLastName, userAge);
		return userInfo;
		
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	
	
	
}
