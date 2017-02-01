package watchesstore.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Authentication {
@Id
@NotEmpty(message="user name cannot be left blank")
private String username;
@NotEmpty(message="password cannot be left blank")
private String password;
@NotEmpty(message="email cannot be left blank")
private String email;
@NotEmpty(message="contact cannot be left blank")
private String contact;
private boolean enabled=true;

public boolean isEnabled() {
	return enabled;
}
public void setEnabled(boolean enabled) {
	this.enabled = enabled;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
}




