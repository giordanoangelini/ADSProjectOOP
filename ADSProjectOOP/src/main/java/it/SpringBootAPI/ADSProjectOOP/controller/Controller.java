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
		Object param1 = "";
		Object param2 = "";
		FilterDescription obj = new FilterDescription();
		return obj.filterVector(param1, param2);
	}
	@GetMapping("/filter/link")
	public Vector <FrontUser> getFilteredLink() {
		Object param1 = "";
		Object param2 = "";
		FilterLink obj = new FilterLink();
		return obj.filterVector(param1, param2);
	}
	@GetMapping("/filter/hashtag")
	public Vector <FrontUser> getFilteredHashtag() {
		Object param1 = "";
		Object param2 = "";
		FilterHashtag obj = new FilterHashtag();
		return obj.filterVector(param1, param2);
	}
	@GetMapping("/filter/tag")
	public Vector <FrontUser> getFilteredTag() {
		Object param1 = "";
		Object param2 = "";
		FilterTag obj = new FilterTag();
		return obj.filterVector(param1, param2);
	}
	@GetMapping("/filter/word")
	public Vector <FrontUser> getFilteredWord
	(@RequestParam Object word) {
		Object param2 = "";
		FilterWord obj = new FilterWord();
		return obj.filterVector(word, param2);
	}
	@GetMapping("/filter/lessThan")
	public Vector <FrontUser> getFilteredLess
	(@RequestParam Object max) {
		Object param2 = "";
		FilterCharacterLess obj = new FilterCharacterLess();
		return obj.filterVector(max, param2);
	}
	@GetMapping("/filter/moreThan")
	public Vector <FrontUser> getFilteredMore
	(@RequestParam Object min) {
		Object param2 = "";
		FilterCharacterMore obj = new FilterCharacterMore();
		return obj.filterVector(min, param2);
	}
	@GetMapping("/filter/between")
	public Vector <FrontUser> getFilteredGap
	(@RequestParam Object min, @RequestParam Object max) {
		FilterCharacterGap obj = new FilterCharacterGap();
		return obj.filterVector(min, max);
	}
}

