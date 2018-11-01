import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.CardLayout;
//import com.jgoodies.forms.layout.FormLayout;
//import com.jgoodies.forms.layout.ColumnSpec;
//import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JButton;
import java.awt.Color;

public class AppSubmission {

	JFrame frame;
	private JTextField txtAppSubmi;
	private JTextField appName;
	private JTextField appCompany;
	private JTextField appPrice;
	private JTextField appDescription;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppSubmission window = new AppSubmission();
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
	public AppSubmission() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 589, 377);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtAppSubmi = new JTextField();
		txtAppSubmi.setEditable(false);
		txtAppSubmi.setBackground(Color.WHITE);
		txtAppSubmi.setBounds(68, 0, 428, 26);
		txtAppSubmi.setHorizontalAlignment(SwingConstants.CENTER);
		txtAppSubmi.setText("App Submission");
		frame.getContentPane().add(txtAppSubmi);
		txtAppSubmi.setColumns(10);
		
		JLabel lblAppName = new JLabel("Name");
		lblAppName.setBounds(25, 42, 88, 20);
		frame.getContentPane().add(lblAppName);
		
		JLabel lblAppDescription = new JLabel("Description");
		lblAppDescription.setBounds(25, 150, 119, 20);
		frame.getContentPane().add(lblAppDescription);
		
		JLabel lblNewLabel = new JLabel("Price");
		lblNewLabel.setBounds(25, 114, 69, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblCompany = new JLabel("Company");
		lblCompany.setBounds(25, 78, 69, 20);
		frame.getContentPane().add(lblCompany);
		
		appName = new JTextField();
		appName.setBounds(207, 39, 276, 26);
		frame.getContentPane().add(appName);
		appName.setColumns(10);
		
		appCompany = new JTextField();
		appCompany.setColumns(10);
		appCompany.setBounds(207, 75, 276, 26);
		frame.getContentPane().add(appCompany);
		
		appPrice = new JTextField();
		appPrice.setColumns(10);
		appPrice.setBounds(207, 111, 58, 26);
		frame.getContentPane().add(appPrice);
		
		appDescription = new JTextField();
		appDescription.setColumns(10);
		appDescription.setBounds(207, 147, 221, 54);
		frame.getContentPane().add(appDescription);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(400, 229, 115, 29);
		frame.getContentPane().add(btnSubmit);
	}
}
