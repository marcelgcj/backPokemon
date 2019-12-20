package com.wipro.wipromvc.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Trainner {
	
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int id;
	
	private String nome;
	
	@OneToMany( fetch=FetchType.EAGER , cascade = CascadeType.ALL)
	public Set<Pokemon> pokemons;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
