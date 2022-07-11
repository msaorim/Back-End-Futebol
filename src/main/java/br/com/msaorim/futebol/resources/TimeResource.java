package br.com.msaorim.futebol.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.msaorim.futebol.entities.Time;
import br.com.msaorim.futebol.services.TimeService;

@RestController
@RequestMapping(value = "/times")
public class TimeResource {
	
	
	@Autowired
	private TimeService timeService;
	
	@GetMapping
	public ResponseEntity<List<Time>> findAll(){
		List<Time> times = timeService.findAll();
		return ResponseEntity.ok().body(times);
	}

}
