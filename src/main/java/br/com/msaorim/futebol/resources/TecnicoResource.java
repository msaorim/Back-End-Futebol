package br.com.msaorim.futebol.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.msaorim.futebol.entities.Tecnico;
import br.com.msaorim.futebol.services.TecnicoService;

@RestController
@RequestMapping(value = "/tecnicos")
public class TecnicoResource {
	
	@Autowired
	private TecnicoService tecnicoService;
	
	@GetMapping
	public ResponseEntity<List<Tecnico>> findAll(){
		List<Tecnico> tecnicos = tecnicoService.findAll();
		return ResponseEntity.ok().body(tecnicos);
	}

}
