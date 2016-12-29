package watchesstore.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import watchesstore.dao.AuthorizationDao;
import watchesstore.model.Authorization;

@Service
@Transactional
public class AuthorizationService {
	@Autowired
	AuthorizationDao dao;
	
	public void add(Authorization a){
		dao.add(a);
		
	}
}

