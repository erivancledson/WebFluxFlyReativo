package com.erivan.fly.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Passagem {
	@Id
	private String id;
	private String empresa;
	private String cidade_destino;
	private String horario_saida;
	private Double valor;
	
	public Passagem(String id, String empresa, String cidade_destino, String horario_saida, Double valor) {
		super();
		this.id = id;
		this.empresa = empresa;
		this.cidade_destino = cidade_destino;
		this.horario_saida = horario_saida;
		this.valor = valor;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getCidade_destino() {
		return cidade_destino;
	}

	public void setCidade_destino(String cidade_destino) {
		this.cidade_destino = cidade_destino;
	}

	public String getHorario_saida() {
		return horario_saida;
	}

	public void setHorario_saida(String horario_saida) {
		this.horario_saida = horario_saida;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
	

}
