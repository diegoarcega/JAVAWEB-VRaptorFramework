package org.sociesc.system.university.dao;

import org.sociesc.system.university.Course;
import org.sociesc.util.dao.BaseDAO;

public class CourseDAO extends BaseDAO<Course> {

	public CourseDAO() {
		super(Course.class);
		
	}
	
	public void insert(Course course){
		 String sql = "INSERT INTO courses(nome, sigla, turno) VALUES('"+ course.getNome() +"','"+ course.getSigla() +"','"+ course.getTurno() +"') ";
		 this.getConnection().executeUpdate(sql);
	}

}
