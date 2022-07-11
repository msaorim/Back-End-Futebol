package br.com.msaorim.futebol.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.msaorim.futebol.entities.Time;
import br.com.msaorim.futebol.repositories.TimeRepository;

@Service
public class TimeService {

	@Autowired
	private TimeRepository timeRepository;
	
	public List<Time> findAll(){
		return timeRepository.findAll();
	}
}
