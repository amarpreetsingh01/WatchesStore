package watchesstore.dao;
import java.util.ArrayList;

import watchesstore.model.Product;

//ProductDao contains Product related CRUD Operations
public interface ProductDao {
	void add(Product p);
	ArrayList<Product> getAllProducts();
	Product getProduct(int pid);
	void update(Product p);
	void delete(Product p);
 
}
