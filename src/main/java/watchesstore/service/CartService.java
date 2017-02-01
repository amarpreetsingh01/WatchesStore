package watchesstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import watchesstore.dao.CartDao;
import watchesstore.dao.impl.CartDaoImpl;
import watchesstore.model.Cart;
@Service
@Transactional
public class CartService {
	
		@Autowired
		CartDao dao;
	
		public void add(Cart c){
			dao.add(c);
			
		}
		public void delete(int cartId){
			dao.delete(cartId);
		}
		public long count(String custName){
			return dao.count(custName);
		}
}
