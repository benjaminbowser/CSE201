public class Moderator {
	
	private String username, password;
	

	public Moderator(String username, String password) {
		
		
	}
	
	/**
	 * @param Which comment that needs to be Deleted 
	 * Uses the Comment class's deleteComment method to remove comments that do not fall in community standards
	 */
	public void deleteComment(Comment c ) {
		c.deleteComment();

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
	
	

}
