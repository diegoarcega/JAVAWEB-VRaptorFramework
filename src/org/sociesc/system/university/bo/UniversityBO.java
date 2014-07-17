package org.sociesc.system.university.bo;

import org.sociesc.system.university.University;
import org.sociesc.system.university.dao.UniversityDAO;
import org.sociesc.util.bo.BaseBO;

public class UniversityBO extends BaseBO<UniversityDAO, University>{
	
	public UniversityBO(){
		super(UniversityDAO.class);
	}
	
	public void insert(University universidade) throws Exception{
		
		if(universidade.getNome().trim().isEmpty()){
				throw new Exception("Nome está vazio.");
		}
		
		if(universidade.getCidade().trim().isEmpty()){
			throw new Exception("Cidade está vazio.");
		}
		
		if(universidade.getEstado().trim().isEmpty()){
			throw new Exception("Estado está vazio.");
		}
		
		this.getDao().insert(universidade);
		
	}
}
