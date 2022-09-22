package com.entra21OlaMundo.entra21OlaMundo.Olamodel;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Modelo")
public class Modelo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;
	private String cor;
	private Integer ano;
	private Integer quantPorta;

	@ManyToOne
	@JoinColumn(name = "fabricanteId")
	private Fabricante fabricante;

	public Modelo() {
	}

	public Modelo(Long id, String nome, String cor, Integer ano, Integer quantPorta, Fabricante fabricante) {
		this.id = id;
		this.nome = nome;
		this.cor = cor;
		this.ano = ano;
		this.quantPorta = quantPorta;
		this.fabricante = fabricante;
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

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Integer getQuantPorta() {
		return quantPorta;
	}

	public void setQuantPorta(Integer quantPorta) {
		this.quantPorta = quantPorta;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

}
