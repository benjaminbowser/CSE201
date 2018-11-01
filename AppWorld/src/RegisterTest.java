import static org.junit.Assert.*;

import javax.swing.JTextField;

import org.junit.Test;

public class RegisterTest {
	JTextField Username;
	JTextField Password;
	NewUser user;
	Register test = new Register();
	
	@Test
	public void test() {
		
		test.frame.setVisible(true);
		
	}
	
	@Test
	public void testNull() {
		assertNull("get user is null", Username);
		assertNull("get passport is null", Password);
	}
	
	@Test
	public void testEqual() {
		String Username = "New";
		String Password = "123";
		assertEquals("New",Username);
		assertEquals("123",Password);
	}
	
	

}
