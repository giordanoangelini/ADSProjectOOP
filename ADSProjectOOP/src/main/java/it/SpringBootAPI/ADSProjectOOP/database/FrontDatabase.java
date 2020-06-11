package it.SpringBootAPI.ADSProjectOOP.database;

import java.util.Vector;

import it.SpringBootAPI.ADSProjectOOP.model.FrontUser;

public class FrontDatabase {
	
	private Vector <FrontUser> frontDatabase;
	
	public FrontDatabase() {
		FrontUser filler = new FrontUser();
		frontDatabase = filler.frontFillUp();
	}

	public Vector <FrontUser> getFrontDatabase() {
		return frontDatabase;
	}
}

