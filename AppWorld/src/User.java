public class User  {

	private String username, password;
	
	public User() {
		this("","");
	}
	
	public User(String username, String password) {
		setUsername(username);
		setPassword(password);
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
	

	// Not sure how to set this up, but whoever is dealing with app data here is the method
	public void submitAppRequest(Application a){
		
	}
	
	public void newComment(Comment c, String input){
		c.newComment(input);
	}
	
	

	
}