package watchesstore.dao.impl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import watchesstore.dao.AuthenticationDao;
import watchesstore.model.Authentication;

@Repository
public class AuthenticationDaoImpl implements AuthenticationDao{	
	//dependency injection
	@Autowired
	SessionFactory sessionFactory;
	public void add(Authentication a) {
		
		Session session=sessionFactory.openSession();
		session.save(a);//firing an insert query
		session.flush();
	}
}
		 
	
	
		
	
