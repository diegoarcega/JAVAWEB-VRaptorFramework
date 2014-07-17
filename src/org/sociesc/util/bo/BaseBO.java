package org.sociesc.util.bo;

import java.util.List;

import org.sociesc.util.dao.BaseDAO;
import org.sociesc.util.entity.Entity;


public abstract class BaseBO<DAO extends BaseDAO<T>, T extends Entity> {
	
	private DAO dao;
	private Class<DAO> clazz;

	public BaseBO(Class<DAO> clazz) {
		this.clazz = clazz;
		
		try {
			this.dao = this.clazz.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch(IllegalAccessException e){
			e.printStackTrace();
		}
		
	}
	
	public DAO getDao() {
		return dao;
	}

	public T findById(int id){
		return this.getDao().findById(id);
	}
	
	public List<T> findAll(){
		return this.getDao().findAll();
	}
	

}
