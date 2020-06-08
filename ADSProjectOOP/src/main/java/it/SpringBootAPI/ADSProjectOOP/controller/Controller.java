package it.SpringBootAPI.ADSProjectOOP.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import it.SpringBootAPI.ADSProjectOOP.database.Database;
import it.SpringBootAPI.ADSProjectOOP.database.FrontDatabase;

@RestController
public class Controller {
	@GetMapping("/metadata")
	public Database getMetadata() {
		return new Database();
	}
	@GetMapping("/friends") 
	public FrontDatabase getFriends() {
		return new FrontDatabase();
	}
	/*@GetMapping("/friends")
	public Database getVector() {
		return null;
	}
	@GetMapping("/friends")
	public Database getVector() {
		return null;
	}*/
}

