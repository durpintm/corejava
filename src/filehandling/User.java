package filehandling;

import java.io.Serializable;

public class User implements Serializable {
	
	private static final long serialVersionUID = 7284005960073974857L;
	private int id;
	private String useername;
	private transient String password;
	
	
	
	public User(int id, String useername, String password) {
		super();
		this.id = id;
		this.useername = useername;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUseername() {
		return useername;
	}
	public void setUseername(String useername) {
		this.useername = useername;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", useername=" + useername + ", password=" + password + "]";
	}
	
	

}
