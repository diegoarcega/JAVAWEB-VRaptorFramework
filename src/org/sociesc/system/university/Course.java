package org.sociesc.system.university;

import org.sociesc.util.entity.Entity;

public class Course extends Entity {
	
	private int id;
	private String nome;
	private String sigla;
	private int turno;
	
	public Course(){
		
	}

	@Override
	public String getTable() {
		return "courses";
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public int getTurno() {
		return turno;
	}

	public void setTurno(int turno) {
		this.turno = turno;
	}
	
	

}

