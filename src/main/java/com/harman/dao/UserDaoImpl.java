package com.harman.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.harman.model.User;

@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	protected SessionFactory sessionFactory;
	
	@Override
	public boolean isValidUser(String username, String password) {
		
		boolean userFound = false;
		Session session = sessionFactory.openSession();
		
		System.out.println("Checking Login -> Dao Class");
		String HQL_QUERY = "from User where username=? and password=?";
		Query query =session.createQuery(HQL_QUERY);
		query.setParameter(0, username);
		query.setParameter(1, password);
		
		List list = query.list();
		
		if((list!=null)&&(list.size()>0))
			userFound=true;
		
		session.close();
		
		return userFound;
	}

}
