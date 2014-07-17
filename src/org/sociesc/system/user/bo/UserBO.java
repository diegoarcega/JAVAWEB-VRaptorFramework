package org.sociesc.system.user.bo;

import org.sociesc.system.user.User;
import org.sociesc.system.user.dao.UserDAO;
import org.sociesc.util.bo.BaseBO;

public class UserBO extends BaseBO<UserDAO, User> {
	
	public UserBO(){
		super(UserDAO.class);
	}
	
	public User findUserByLogin(String login){
		return this.getDao().findUserByLogin(login);
	}
	
	

}
