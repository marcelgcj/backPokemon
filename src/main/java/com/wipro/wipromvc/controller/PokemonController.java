package com.wipro.wipromvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.wipro.wipromvc.entity.Pokemon;
import com.wipro.wipromvc.services.PokemonServices;

@RestController

public class PokemonController {
	
	@Autowired
	PokemonServices pokemonservices;
	
	@PostMapping
	@RequestMapping("/pokemon/{idtreinador}")
	public Pokemon addpokemon(@PathVariable int idtreinador , @RequestBody Pokemon pokemon) {
		return pokemonservices.addpokemonttotrainner(idtreinador, pokemon);
	}
	
	

}
