package br.com.msaorim.futebol.teste;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.msaorim.futebol.entities.Jogador;
import br.com.msaorim.futebol.entities.Tecnico;
import br.com.msaorim.futebol.entities.Time;
import br.com.msaorim.futebol.entities.enums.Posicao;
import br.com.msaorim.futebol.repositories.JogadorRepository;
import br.com.msaorim.futebol.repositories.TecnicoRepository;
import br.com.msaorim.futebol.repositories.TimeRepository;

@Configuration
public class TesteFutebol implements CommandLineRunner {

	@Autowired
	private JogadorRepository jogadorRepository;
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private TimeRepository timeRepository;

	@Override
	public void run(String... args) throws Exception {

		Tecnico t1 = new Tecnico(null, "Rogério Ceni", "Brasil");
		Tecnico t2 = new Tecnico(null, "Fernando Diniz", "Brasil");
//			
		Time tm1 = new Time(null, "São Paulo", "SP", t1);
		Time tm2 = new Time(null, "Fluminense", "RJ", t2);

		Jogador j1 = new Jogador(null, "Igor Vinícios", "Brasil", 2, Posicao.Lateral);
		Jogador j2 = new Jogador(null, "Diego Costa", "Brasil", 4, Posicao.Zagueiro);
		Jogador j3 = new Jogador(null, "Robert Arboleda", "Equador", 5, Posicao.Zagueiro);
		Jogador j4 = new Jogador(null, "Reinaldo", "Brasil", 6, Posicao.Lateral);
		Jogador j5 = new Jogador(null, "Emiliano Rigoni", "Argentina", 7, Posicao.Atacante);
		Jogador j6 = new Jogador(null, "Luan", "Brasil", 8, Posicao.Volante);
		Jogador j7 = new Jogador(null, "Marcos Felipe", "Brasil", 1, Posicao.Goleiro);
		Jogador j8 = new Jogador(null, "Mario Pineida", "Equador", 6, Posicao.Lateral);
		Jogador j9 = new Jogador(null, "Andre", "Brasil", 7, Posicao.Volante);
		Jogador j10 = new Jogador(null, "Nonato", "Brasil", 8, Posicao.Meio_Campo);
		Jogador j11 = new Jogador(null, "Fred", "Brasil", 9, Posicao.Atacante);
		Jogador j12 = new Jogador(null, "Alan", "China", 11, Posicao.Atacante);

		jogadorRepository.saveAll(Arrays.asList(j1, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12));
		tecnicoRepository.saveAll(Arrays.asList(t1, t2));
		timeRepository.saveAll(Arrays.asList(tm1, tm2));

		j1.setTime(tm1);
		j2.setTime(tm1);
		j3.setTime(tm1);
		j4.setTime(tm1);
		j5.setTime(tm1);
		j6.setTime(tm1);
		j7.setTime(tm2);
		j8.setTime(tm2);
		j9.setTime(tm2);
		j10.setTime(tm2);
		j11.setTime(tm2);
		j12.setTime(tm2);
//		
		jogadorRepository.saveAll(Arrays.asList(j1, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12));
	}

}
