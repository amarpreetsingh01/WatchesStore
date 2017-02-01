package watchesstore.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import watchesstore.dao.CustomerDao;
import watchesstore.model.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao{	
		//dependency injection
		@Autowired
		SessionFactory sessionFactory;
		public void add(Customer c) {
			
			Session session=sessionFactory.openSession();
			session.save(c);//firing an insert query
			session.flush();
		}
}


