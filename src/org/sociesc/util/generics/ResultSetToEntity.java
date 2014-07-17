package org.sociesc.util.generics;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public abstract class ResultSetToEntity<T> {

	protected Class<T> clazz;
	
	public ResultSetToEntity(Class<T> clazz) {
		this.clazz = clazz;
	}

	public T convertResultSet(ResultSet rs) {
		Field[] fields = clazz.getDeclaredFields();
		boolean hasData = true;
		
		if (rs != null) {
			try {
				if (rs.isBeforeFirst()) {
					if (!rs.next()){
						hasData = false;
					}
				}
			} catch (SQLException e) {
			}
		} else {
			hasData = false;
		}
		
		T clazzInstance = null;
		if (hasData) {
			try {
				clazzInstance = (T) clazz.newInstance();
				
				for (Field field : fields) {
					try {
						field.setAccessible(true);
						Object value = rs.getObject(field.getName());
						try {
							field.set(clazzInstance, value);
						} catch (IllegalAccessException e) {
							System.out.println("The field '" + field.getName() + "' is not Accessible.");
						}
						
					} catch (SQLException e) {
					}
				}
				
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		
		return clazzInstance;
	}
	
	public List<T> convertResultSetToList(ResultSet rs) {
		List<T> listT = new ArrayList<T>();
		
		try {
			while (rs.next()) {
				listT.add(this.convertResultSet(rs));
			}
		} catch (Exception e) {
		}
		
		return listT;
	}
	
}
