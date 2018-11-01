import static org.junit.Assert.*;

import org.junit.Test;

public class ModeratorTest {
	String username = "Bob";
	String password = "12345";
	
	@Test
	public void testModerator() {
		Moderator moderator = new Moderator();
		
		
		assertEqual("Bob",moderator.getUsername());
		assertEqual("12345", moderator.getPassword());
	


	}

	private void assertEqual(String string, String password2) {
		// TODO Auto-generated method stub
		
	}
	
}
