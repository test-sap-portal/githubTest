package com.sapit.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sapit.entity.Dictionary;
import com.sapit.service.DictionaryService;

@RestController
public class DictionaryController {
	
	
Logger log = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private DictionaryService service;
	
	@RequestMapping("/dictionary/count")
	public long count() {
		log.info("Search total number of dictionary data");
		return service.getCount();
	}
	
	@RequestMapping("/dictionary/all")
	public List<Dictionary> getAllEmployees(){
		log.info("Searching all dictionary data");
		return service.findAllDictionaryData();
	}
	
	@RequestMapping(method=RequestMethod.POST, value = "/employee/add")
	public boolean addDictionary(@RequestBody Dictionary dictionary) {
		
		log.info("Creation/Updating Dictionary - "+dictionary.toString());
		return service.insertDictionary(dictionary);
	}
	
	@RequestMapping("/dictionary/id/{id}" )
	public Dictionary findById(@PathVariable long id) {
		log.info("Searching dictionary with ID - "+ id);
		return service.findDictionaryById(id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/employee/delete/{id}")
	public boolean deleteDictionary(@PathVariable long id) {
		return service.deleteDictionary(id);
	}
	

 
}
