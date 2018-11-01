

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Register {

	JFrame frame;
	private JTextField Username;
	private JTextField Password;
	private NewUser user;

	public void run() {

		Register window = new Register();
		window.frame.setVisible(true);

	}

	/**
	 * Create the application.
	 */
	public Register() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 640, 480);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		//Initialize NewUser
		user = new NewUser();
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 640, 480);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		// registration page label
		JLabel lblNewLabel = new JLabel("Signup Page");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 30));
		lblNewLabel.setBounds(228, 56, 199, 73);
		panel.add(lblNewLabel);

		JLabel lblUser = new JLabel("Desired Username:");
		lblUser.setFont(new Font("Dialog", Font.BOLD, 14));
		lblUser.setBounds(339, 241, 80, 26);
		panel.add(lblUser);

		Username = new JTextField();
		user.setUserName(Username.getText());
		Username.setBounds(431, 240, 130, 30);
		panel.add(Username);
		Username.setColumns(10);

		JLabel lblPassword = new JLabel("Desired Password:");
		lblPassword.setFont(new Font("Dialog", Font.BOLD, 14));
		lblPassword.setBounds(339, 273, 80, 31);
		panel.add(lblPassword);

		Password = new JTextField();
		user.setPassWord(Password.getText());
		Password.setBounds(431, 274, 130, 30);
		panel.add(Password);

		JButton btnLogin = new JButton("Signup");
		
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Username.getText().isEmpty() || Password.getText().isEmpty()){
					JOptionPane.showMessageDialog(null, "Please Input Desired Username and Password " + "!");
				}
				else if(user.userNameTaken(user.getUserName()) ){
					JOptionPane.showMessageDialog(null, "This username is taken please try again" + "!");
					
				}
				else{
					JOptionPane.showMessageDialog(null, "Congrats! you're a member! " + "!");
				}
			}
		});
		btnLogin.setBounds(460, 354, 95, 29);
		panel.add(btnLogin);

	}

}