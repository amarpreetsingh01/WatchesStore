package watchesstore.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import watchesstore.dao.AuthenticationDao;
import watchesstore.model.Authentication;

@Service
@Transactional
public class AuthenticationService {
	@Autowired
	AuthenticationDao dao;
	
	public void add(Authentication a){
		dao.add(a);
		
	}
}
