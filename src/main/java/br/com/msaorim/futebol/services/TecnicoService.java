package br.com.msaorim.futebol.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.msaorim.futebol.entities.Tecnico;
import br.com.msaorim.futebol.repositories.TecnicoRepository;

@Service
public class TecnicoService {

	@Autowired
	private TecnicoRepository tecnicoRepository;
	
	public List<Tecnico> findAll(){
		return tecnicoRepository.findAll();
	}
}
