package br.com.ibner.projetoweb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "responsavel")
public class Responsavel {

	@Id
	@GeneratedValue
	private long id;
	private String nome;
	
	public Responsavel() {
		
	}
	
	public Responsavel(String nome) {
		this.nome = nome;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	

	
}
