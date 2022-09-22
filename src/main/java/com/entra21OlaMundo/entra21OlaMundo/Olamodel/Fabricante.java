package com.entra21OlaMundo.entra21OlaMundo.Olamodel;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Fabricante")
public class Fabricante implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String origem;

	@JsonIgnore
	@OneToMany(mappedBy = "fabricante")
	private Set<Modelo> modelos = new HashSet<>();

	public Fabricante() {
	}

	public Fabricante(Long id, String nome, String origem, Set<Modelo> modelos) {
		this.id = id;
		this.nome = nome;
		this.origem = origem;
		this.modelos = modelos;
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

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

}
