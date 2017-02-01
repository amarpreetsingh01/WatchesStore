package watchesstore.dao;

import watchesstore.model.Cart;

//ProductDao contains Product related CRUD Operations
public interface CartDao {
	void add(Cart c);	
	void delete(int cartId);
	long count(String custName);
}
