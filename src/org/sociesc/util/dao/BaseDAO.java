package org.sociesc.util.dao;

import java.sql.ResultSet;
import java.util.List;

import org.sociesc.util.connection.DbConnection;
import org.sociesc.util.entity.Entity;
import org.sociesc.util.generics.ResultSetToEntity;

public abstract class BaseDAO<T extends Entity> extends ResultSetToEntity<T>{
	
	private DbConnection connection;
	private String table;
	
	public BaseDAO(Class<T> clazz) {
		super(clazz);

		try {
			T entityTable = this.clazz.newInstance();
			table = entityTable.getTable();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		this.connection = new DbConnection();
	}
	
	public DbConnection getConnection() {
		return connection;
	}
	
	public T findById(int id){
		String sql= "SELECT * FROM " + this.table + " WHERE id = '" + id + "'"; 
		ResultSet rs = this.getConnection().executeQuery(sql);
		
		return convertResultSet(rs);
	}
	
	public List<T> findAll(){
		String sql= "SELECT * FROM " + this.table; 
		ResultSet rs = this.getConnection().executeQuery(sql);
		
		return convertResultSetToList(rs);
	}

}
