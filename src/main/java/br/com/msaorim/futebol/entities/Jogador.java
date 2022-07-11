package br.com.msaorim.futebol.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.msaorim.futebol.entities.enums.Posicao;

@Entity
@Table(name = "TB_JOGADOR")
public class Jogador implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private String nacionalidade;
	private Integer numeroCamisa;
	private Posicao posicao;
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "time_id")
	private Time time;
	
	public Jogador(){
	}

	public Jogador(Long id, String nome, String nacionalidade, Integer numeroCamisa, Posicao posicao) {
		super();
		this.id = id;
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.numeroCamisa = numeroCamisa;
		this.posicao = posicao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	public Integer getNumeroCamisa() {
		return numeroCamisa;
	}
	
	public void setNumeroCamisa(Integer numeroCamisa) {
		this.numeroCamisa = numeroCamisa;
	}
	
	public Posicao getPosicao() {
		return posicao;
	}
	
	public void setPosicao(Posicao posicao) {
		this.posicao = posicao;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jogador other = (Jogador) obj;
		return Objects.equals(id, other.id);
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	
}
