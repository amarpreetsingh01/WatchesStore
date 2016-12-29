package watchesstore.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Authorization {
@Id
private String userName;
private String roleName="ROLE_USER";
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getRoleName() {
	return roleName;
}
public void setRoleName(String rollName) {
	this.roleName = rollName;
}

	
}