package org.sociesc.system.user.dao;

import java.sql.ResultSet;

import org.sociesc.system.user.User;
import org.sociesc.util.dao.BaseDAO;

public class UserDAO extends BaseDAO<User> {

	public UserDAO() {
		super(User.class);
		
	}
	
	public User findUserByLogin(String login){
		String sql = "SELECT * FROM sys_user WHERE login = '" + login + "'";
		ResultSet rs =  this.getConnection().executeQuery(sql);
		
		return this.convertResultSet(rs) ;
	}

}
