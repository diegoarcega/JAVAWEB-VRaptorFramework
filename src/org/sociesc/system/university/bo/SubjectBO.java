package org.sociesc.system.university.bo;


import org.sociesc.system.university.Subject;
import org.sociesc.system.university.dao.SubjectDAO;
import org.sociesc.util.bo.BaseBO;

public class SubjectBO extends BaseBO<SubjectDAO, Subject> {
	
	public SubjectBO(){
		super(SubjectDAO.class);
	}
	
	public void insert(Subject subject) throws Exception{
		
		if(subject.getNome().trim().isEmpty()){
				throw new Exception("Nome está vazio.");
		}
		
		if(subject.getProfessor().trim().isEmpty()){
			throw new Exception("Professor está vazio.");
		}
		
		this.getDao().insert(subject);
		
	}

}
