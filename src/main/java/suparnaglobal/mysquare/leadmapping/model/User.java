/**
 * 
 */
package suparnaglobal.mysquare.leadmapping.model;

/**
 * @author dnvsr
 *
 */
public class User {
	
	public int user_id;
	public int role_id;
	public String first_name;
	public String last_name;
	public String username;
	public String password;
	public int phone;
	public String email;
	public int lead_type;
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
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
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getLead_type() {
		return lead_type;
	}
	public void setLead_type(int lead_type) {
		this.lead_type = lead_type;
	}
}
