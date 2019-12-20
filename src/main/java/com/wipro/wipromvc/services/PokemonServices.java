package com.wipro.wipromvc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.wipromvc.entity.Pokemon;
import com.wipro.wipromvc.entity.Trainner;

@Service
public class PokemonServices {
	
	@Autowired
	private trainnerServices trainnerServices;
	
	public  Pokemon addpokemonttotrainner(int idtrainner, Pokemon pokemon) {
		
		Trainner trainner2 = trainnerServices.serachBYID(idtrainner);
		trainner2.pokemons.add(pokemon);
		trainnerServices.updatebyid(idtrainner);		
		return pokemon;
	}

}
