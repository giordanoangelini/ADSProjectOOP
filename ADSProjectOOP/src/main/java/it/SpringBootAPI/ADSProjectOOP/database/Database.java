package it.SpringBootAPI.ADSProjectOOP.model;

import java.util.Vector;

public class Database {
	
	private Vector <User> database;
	
	public Database() {
		User filler = new User();
		database = filler.fillUp();
	}

	public Vector<User> getDatabase() {
		return database;
	}
	
	public static void main(String[] args) {
		Database prova = new Database();
		int i = 1;
		System.out.println(prova.getDatabase().elementAt(i).getName());
		System.out.println(prova.getDatabase().elementAt(i).getDescription());
		System.out.println(prova.getDatabase().elementAt(i).getCharacterNumber());
		System.out.println(prova.getDatabase().elementAt(i).getDescriptionProperties());
	}
}

