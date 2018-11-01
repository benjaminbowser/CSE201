import static org.junit.Assert.*;

import org.junit.Test;

public class UserTest {
	private String username;
	private String password;
	private int NumberOfSubmitRequest;
	
	
	@Test
	public void testUser() {
		User user = new User();
		user.setUsername("Tester");
		user.setPassword("12345");
//
		
		assertEqual("Tester", user.getUsername());
		assertEqual("12345", user.getPassword());
//		aseertEqual(user.getRequestCount, 1);
		
	}


	private void assertEqual(String username2, String string) {
		// TODO Auto-generated method stub
		
	}


	
		
	

}
