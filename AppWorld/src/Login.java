
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	JFrame frame;
	private JTextField Username;
	private JTextField Password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 640, 480);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 640, 480);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login Page");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 30));
		lblNewLabel.setBounds(228, 56, 199, 73);
		panel.add(lblNewLabel);
		
		JLabel lblUser = new JLabel("Username");
		lblUser.setFont(new Font("Dialog", Font.BOLD, 14));
		lblUser.setBounds(339, 241, 80, 26);
		panel.add(lblUser);
		
		Username = new JTextField();
		Username.setBounds(431, 240, 130, 30);
		panel.add(Username);
		Username.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Dialog", Font.BOLD, 14));
		lblPassword.setBounds(339, 273, 80, 31);
		panel.add(lblPassword);
		
		Password = new JTextField();
		Password.setBounds(431, 274, 130, 30);
		panel.add(Password);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Username.getText().isEmpty() || Password.getText().isEmpty()){
					JOptionPane.showMessageDialog(null, "Please Input Username and Password " + "!");
				}
				else if(Username.getText().equals("One") && Password.getText().equals("12345")){
					JOptionPane.showMessageDialog(null, "Login Success " + "!");
					frame.dispose();
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								AppListW window = new AppListW(true);
								frame.dispose();
								//window.frmAppworld.setExtendedState(JFrame.MAXIMIZED_BOTH);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
				}
				else{
					JOptionPane.showMessageDialog(null, "Incorrect Username or Password " + "!");
				}
			}
		});
		btnLogin.setBounds(460, 354, 95, 29);
		panel.add(btnLogin);
		
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(353, 354, 95, 29);
		panel.add(btnRegister);
		
		// Set actionListener for the registration page 
		btnRegister.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				Register r = new Register();
				frame.dispose();
				r.run();
			}
		});
		
	}
}
