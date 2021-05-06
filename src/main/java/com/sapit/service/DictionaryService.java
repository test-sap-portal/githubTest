package com.sapit.service;

import java.lang.System.Logger;
import java.util.List;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sapit.entity.Dictionary;
import com.sapit.repository.DictionaryRepository;

public class DictionaryService {
	
	
	
	@Autowired
	private DictionaryRepository repository;
	
	public long getCount() {
		long count = repository.count();
		return count;
	}
	
	@RequestMapping("/dictionary/all")
	public List<Dictionary> getAllDictionary(){
		
		return repository.findAllDictionary();
	}
	
	@RequestMapping(method=RequestMethod.POST, value = "/dictionary/add")
	public boolean addEmployee(@RequestBody Dictionary dictionary) {
		
//		log.info("Creation/Updating Employee - "+dictionary.toString());
		return repository.insertDictionary(dictionary);
	}

	
	@RequestMapping(method=RequestMethod.DELETE, value="/dictionary/delete/{id}")
	public boolean deleteDictionary(@PathVariable long id) {
		return repository.deleteEmployee(id);
	}

	public List<Dictionary> findAllDictionaryData() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean insertDictionary(Dictionary dictionary) {
		// TODO Auto-generated method stub
		return false;
	}

	public Dictionary findDictionaryById(long id) {
		// TODO Auto-generated method stub
		return null;
	}


}
