import static org.junit.Assert.*;

import javax.swing.JTextField;

import org.junit.Test;

public class LoginTest {

	Login test = new Login();
	JTextField Username;
	JTextField Password;
	
	@Test
	public void test() {

		Login test = new Login();
		test.frame.setVisible(true);
		
	}
	@Test
	public void testNull() {
		assertNull("get user is null", Username);
		assertNull("get passport is null", Password);
	}

	@Test
	public void testEqual() {
		String Username = "One";
		assertEquals("One",Username);
	}
	


	private void assertFalse(Object actionPerformed) {
		// TODO Auto-generated method stub
		
	}

	private void assertTure(Object actionPerformed) {
		// TODO Auto-generated method stub
		
	}

}
