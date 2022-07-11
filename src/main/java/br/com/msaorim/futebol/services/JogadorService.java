package br.com.msaorim.futebol.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.msaorim.futebol.entities.Jogador;
import br.com.msaorim.futebol.repositories.JogadorRepository;

@Service
public class JogadorService {

	@Autowired
	private JogadorRepository jogadorRepository;
	
	public List<Jogador> findAll(){
		return jogadorRepository.findAll();
	}
	
}
