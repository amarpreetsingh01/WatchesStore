package watchesstore.dao.impl;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import watchesstore.dao.CartDao;
import watchesstore.model.Cart;
import watchesstore.model.Product;

@Repository
public class CartDaoImpl implements CartDao{	
		//dependency injection
		@Autowired
		SessionFactory sessionFactory;
		public void add(Cart c) {
			System.out.println("in cartdao");
			Session session=sessionFactory.openSession();
			session.save(c);//firing an insert query
			session.flush();
						
		}
		public void delete(int cartId) {
				// TODO Auto-generated method stub
				Session session=sessionFactory.getCurrentSession();
				//session.delete(arg0);	
		}	
		public long count(String custName){
			Session session=sessionFactory.getCurrentSession();
			Query q=session.createQuery("select count(itemId) from Cart where custName = :custName");
			q.setString("custName", custName);
			Long itemCount=(Long)q.uniqueResult();
			//int itemCount=0;
			/*Iterator itr=q.iterate();
			while(itr.hasNext()){
				itemCount=(Integer)itr.next();
			}*/
			//int i=(Integer)itemCount;
			return  itemCount;
		}
}
