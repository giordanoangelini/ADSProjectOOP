package it.SpringBootAPI.ADSProjectOOP.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import it.SpringBootAPI.ADSProjectOOP.database.Database;
import it.SpringBootAPI.ADSProjectOOP.database.FrontDatabase;
import it.SpringBootAPI.ADSProjectOOP.util.stats.DescriptionStats;
import it.SpringBootAPI.ADSProjectOOP.util.filters.FilterDescription;
import it.SpringBootAPI.ADSProjectOOP.model.User;

import java.util.Vector;

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
	@GetMapping("/filter")
	public Vector <User> getFiltered() {
		FilterDescription obj = new FilterDescription();
		return obj.filterDescription();
	}
}

