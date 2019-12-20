package com.wipro.wipromvc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.wipromvc.entity.Trainner;
import com.wipro.wipromvc.interfaces.TrainnerInterface;

@Service
public class trainnerServices {

	@Autowired
	TrainnerInterface trainnerInterface;

	public Iterable<Trainner> searchall() {
		return trainnerInterface.findAll();
	}

	public Trainner postTrainner(Trainner trainner) {
		return trainnerInterface.save(trainner);
	}

	public String deletebyid(int id) {
		try {

			trainnerInterface.deleteById(id);
			return "OK DELETADO";

		} catch (Exception e) {
			return "Não encontrado";
		}

	}

	public Trainner updatebyid(int id) {

		Trainner trainner = trainnerInterface.findById(id).get();
		trainner.setNome("New Name");		
		return trainnerInterface.save(trainner);
	}

	public Trainner serachBYID(int id) {
		return trainnerInterface.findById(id).orElseThrow(()-> new  RuntimeException("erro não encontrado !!!!"));
	}

}
