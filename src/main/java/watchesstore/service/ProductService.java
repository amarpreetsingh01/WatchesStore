package watchesstore.service;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import watchesstore.dao.ProductDao;
import watchesstore.model.Product;

@Service
@Transactional
public class ProductService {
	@Autowired
	ProductDao dao;
	
	public void add(Product p){
		dao.add(p);
		
	}
	
	public ArrayList<Product> getAllProducts() {
		return dao.getAllProducts();
		
	}
	public Product getProduct(int pid){
		return dao.getProduct(pid);
	}
	public void update(Product p){
		dao.update(p);
	}
	public void delete(Product p){
		dao.delete(p);
	}
}