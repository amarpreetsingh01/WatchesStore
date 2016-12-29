package watchesstore.dao.impl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import watchesstore.dao.AuthorizationDao;
import watchesstore.model.Authorization;

@Repository
public class AuthorizationDaoImpl implements AuthorizationDao{	
	//dependency injection
	@Autowired
	SessionFactory sessionFactory;
	public void add(Authorization a) {
		
		Session session=sessionFactory.openSession();
		session.save(a);//firing an insert query
		session.flush();
	}
}

