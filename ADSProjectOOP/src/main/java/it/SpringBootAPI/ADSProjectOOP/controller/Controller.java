package it.SpringBootAPI.ADSProjectOOP.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import it.SpringBootAPI.ADSProjectOOP.database.Database;
import it.SpringBootAPI.ADSProjectOOP.database.FrontDatabase;
import it.SpringBootAPI.ADSProjectOOP.util.stats.DescriptionStats;

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
	@GetMapping("/stats")
	public DescriptionStats getStats() {
		return new DescriptionStats();
	}
	/*@GetMapping("/filter")
	public Database getVector() {
		return null;
	}*/
}

