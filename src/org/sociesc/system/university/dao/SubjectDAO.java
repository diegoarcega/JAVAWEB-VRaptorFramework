package org.sociesc.system.university.dao;

import org.sociesc.system.university.Subject;
import org.sociesc.util.dao.BaseDAO;

public class SubjectDAO extends BaseDAO<Subject> {

	public SubjectDAO() {
		super(Subject.class);
	}
	
	public void insert(Subject subject){
		 String sql = "INSERT INTO subjects(nome, horas, professor) VALUES('"+ subject.getNome() +"','"+ subject.getHoras() +"','"+ subject.getProfessor() +"') ";
		 this.getConnection().executeUpdate(sql);
	}

}
