package br.com.msaorim.futebol.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.msaorim.futebol.entities.Jogador;

@Repository
public interface JogadorRepository extends JpaRepository<Jogador, Long> {
	
}
