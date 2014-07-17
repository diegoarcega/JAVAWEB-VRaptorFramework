package org.sociesc.system.university.dao;



import org.sociesc.system.university.University;
import org.sociesc.util.dao.BaseDAO;

public class UniversityDAO extends BaseDAO<University> {

	public UniversityDAO() {
		super(University.class);
	}
	
	public void insert(University universidade){
		 String sql = "INSERT INTO universities(nome, cidade, estado) VALUES('"+ universidade.getNome() +"','"+ universidade.getCidade() +"','"+ universidade.getEstado() +"') ";
		 this.getConnection().executeUpdate(sql);
	}

}
