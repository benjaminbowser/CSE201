import static org.junit.Assert.*;

import org.junit.Test;
	

public class AdministratorTest {
	String username = "Bob";
	String password = "12345";
	Application a;
	Comment c ;

	
	@Test
	public void testAdminitrator() {
		Administrator administrator = new Administrator();
		
		
		
		assertEqual("Bob",administrator.getUsername());
		assertEqual("12345", administrator.getPassword());
		

		
//		administrator.approveApplication(a);
//		assertTrue(a,administrator.toString());
//		
//		administrator.deleteComment(c);
//		assertTrue(c,administrator.deleteComment(c));

			
			

		}

	private void assertEqual(String password2, String string) {
		// TODO Auto-generated method stub
		
	}




}
		
			
			





