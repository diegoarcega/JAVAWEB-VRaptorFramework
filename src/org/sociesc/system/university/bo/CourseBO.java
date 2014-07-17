package org.sociesc.system.university.bo;

import org.sociesc.system.university.Course;
import org.sociesc.system.university.dao.CourseDAO;
import org.sociesc.util.bo.BaseBO;

public class CourseBO extends BaseBO<CourseDAO, Course> {
	
	public CourseBO(){
		super(CourseDAO.class);
	}
	
	public void insert(Course course) throws Exception{
		
		if(course.getNome().trim().isEmpty()){
				throw new Exception("Nome está vazio.");
		}
		
		if(course.getSigla().trim().isEmpty()){
			throw new Exception("Sigla está vazio.");
		}
		
		this.getDao().insert(course);
		
	}

}


