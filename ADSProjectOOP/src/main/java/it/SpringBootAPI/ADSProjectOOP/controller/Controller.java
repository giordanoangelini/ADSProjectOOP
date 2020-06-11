package it.SpringBootAPI.ADSProjectOOP.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.SpringBootAPI.ADSProjectOOP.database.*;
import it.SpringBootAPI.ADSProjectOOP.util.stats.*;
import it.SpringBootAPI.ADSProjectOOP.model.*;
import it.SpringBootAPI.ADSProjectOOP.util.filters.*;

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
	@GetMapping("/filter/description")
	public Vector <FrontUser> getFilteredDescription() {
		FilterDescription obj = new FilterDescription();
		return obj.filterVector();
	}
	@GetMapping("/filter/link")
	public Vector <FrontUser> getFilteredLink() {
		FilterLink obj = new FilterLink();
		return obj.filterVector();
	}
	@GetMapping("/filter/hashtag")
	public Vector <FrontUser> getFilteredHashtag() {
		FilterHashtag obj = new FilterHashtag();
		return obj.filterVector();
	}
	@GetMapping("/filter/tag")
	public Vector <FrontUser> getFilteredTag() {
		FilterTag obj = new FilterTag();
		return obj.filterVector();
	}
	@GetMapping("/filter/word")
	public Vector <FrontUser> getFilteredWord(@RequestParam String word) {
		FilterWord obj = new FilterWord();
		return obj.filterVector(word);
	}
	@GetMapping("/filter/lessThan")
	public Vector <FrontUser> getFilteredLess(@RequestParam int max) {
		FilterCharacterLess obj = new FilterCharacterLess();
		return obj.filterVector(max);
	}
	@GetMapping("/filter/moreThan")
	public Vector <FrontUser> getFilteredMore(@RequestParam int min) {
		FilterCharacterMore obj = new FilterCharacterMore();
		return obj.filterVector(min);
	}
	@GetMapping("/filter/between")
	public Vector <FrontUser> getFilteredGap(@RequestParam int min, int max) {
		FilterCharacterGap obj = new FilterCharacterGap();
		return obj.filterVector(min, max);
	}
}

