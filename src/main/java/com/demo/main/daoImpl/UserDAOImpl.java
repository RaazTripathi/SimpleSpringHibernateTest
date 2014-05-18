package com.demo.main.daoImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.main.constants.QueryConstants;
import com.demo.main.dao.UserDAO;
import com.demo.main.domain.User;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;


	public void addUser(User user) {
		
		sessionFactory.getCurrentSession().saveOrUpdate(user);
		
	}

	@SuppressWarnings("unchecked")
	public List<User> listUser() {
		
		 return sessionFactory.getCurrentSession().createQuery(QueryConstants.GETUSER)
				.list();
	}

	
}
