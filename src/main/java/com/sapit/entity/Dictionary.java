package com.sapit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "DICTIONARY_TABLE")
public class Dictionary {
	
	
	@Id //Defining this as a primary key
	@GeneratedValue
	private String wordId;
	private String word;
	private String wordLanguage;
	
	
	
	
	public Dictionary(String wordId, String word, String wordLanguage) {
		super();
		this.wordId = wordId;
		this.word = word;
		this.wordLanguage = wordLanguage;
	}
	public String getWordId() {
		return wordId;
	}
	public void setWordId(String wordId) {
		this.wordId = wordId;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getWordLanguage() {
		return wordLanguage;
	}
	public void setWordLanguage(String wordLanguage) {
		this.wordLanguage = wordLanguage;
	}
	
	@Override
	public String toString() {
		return "Dictionary [wordId=" + wordId + ", word=" + word + ", wordLanguage=" + wordLanguage + "]";
	}
	

}
