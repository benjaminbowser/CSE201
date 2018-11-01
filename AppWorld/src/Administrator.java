
public class Administrator {

	private String username, password;
	
	public Administrator() {
		this("","");
	}
	
	public Administrator(String username, String password) {
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

	
	public void approveApplication(Application a){
		a.approve();

	}
	
	/**
	 * @param Which comment that needs to be Deleted 
	 * Uses the Comment class's deleteComment method to remove comments that do not fall in community standards
	 */
	public void deleteComment(Comment c ) {
		c.deleteComment();

	}
}
