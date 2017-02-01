package watchesstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import watchesstore.dao.CustomerDao;
import watchesstore.model.Customer;
@Service
@Transactional
public class CustomerService {
	
		@Autowired
		CustomerDao dao;
		
		public void add(Customer d){
			dao.add(d);
			
		}

}


