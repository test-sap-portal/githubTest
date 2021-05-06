package com.sapit.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sapit.entity.Dictionary;

public interface DictionaryRepository extends CrudRepository<Dictionary, String> {

	List<Dictionary> findAllDictionary();

	boolean insertDictionary(Dictionary dictionary);

	boolean deleteEmployee(long id);

	

	

}
