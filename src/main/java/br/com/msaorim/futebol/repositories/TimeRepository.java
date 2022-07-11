package br.com.msaorim.futebol.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.msaorim.futebol.entities.Time;

@Repository
public interface TimeRepository extends JpaRepository<Time, Long> {

}
