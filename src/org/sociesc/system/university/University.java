package org.sociesc.system.university;

import org.sociesc.util.entity.Entity;

public class University extends Entity {
	
	private int id;
	private String nome;
	private String cidade;
	private String estado;
	
	public University(){
		
	}

	@Override
	public String getTable() {
		return "universities";
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}

