package it.SpringBootAPI.ADSProjectOOP.database;

import java.util.Vector;

import it.SpringBootAPI.ADSProjectOOP.model.User;

public class Database {
	
	private Vector <User> database;
	
	public Database() {
		User filler = new User();
		database = filler.fillUp();
	}

	public Vector <User> getDatabase() {
		return database;
	}
}

