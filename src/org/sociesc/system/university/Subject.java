package org.sociesc.system.university;

import org.sociesc.util.entity.Entity;

public class Subject extends Entity {
	

	
	private int id;
	private String nome;
	private int horas;
	private String professor;
	
	public Subject(){
		
	}

	@Override
	public String getTable() {
		return "subjects";
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

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}
	



}

