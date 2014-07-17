package org.sociesc.system.user;

import org.sociesc.util.entity.Entity;



public class User extends Entity {

	private int id;
	private String nome;
	private String login;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getTable() {
		return "sys_user";
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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	

}
