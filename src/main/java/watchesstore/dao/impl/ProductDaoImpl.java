package watchesstore.dao.impl;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import watchesstore.dao.ProductDao;
import watchesstore.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao{
	
	//dependency injection
	@Autowired
	SessionFactory sessionFactory;
	public void add(Product p) {
		Session session=sessionFactory.openSession();
		session.save(p);//firing an insert query
		 
	}
	public ArrayList<Product> getAllProducts() {
	Session session=sessionFactory.getCurrentSession();
	ArrayList<Product> plist=(ArrayList)session.createQuery("from Product").list();
		return plist;
	}
	public Product getProduct(int pid) {
		Session session=sessionFactory.getCurrentSession();
		Product p=(Product)session.get(Product.class, pid);
		return p;
}
	public void update(Product p) {
	Session session=sessionFactory.getCurrentSession();
	session.saveOrUpdate(p);
	}
	public  void delete(Product p) {
		Session session=sessionFactory.getCurrentSession();
		session.delete(p);
		
	}	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	