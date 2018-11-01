import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import com.mysql.jdbc.Statement;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.UIManager;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.Icon;
import javax.swing.ScrollPaneConstants;

public class Info extends JFrame {

	private static String name;
	private static String desc;
	private static String publisher;
	private static String price;
	private static String rating;
	private static String genre;
	private JTextField textField;
	
	private JPanel contentPane;
	private JTable table;
	private JButton button;

	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Info frame = new Info(name, );
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	*/

	/**
	 * Create the frame.
	 */
	public Info(String appName) {
		name = appName;
		
		try {
		getApps();
		}
		catch (Exception e) {
			
		}
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 1000);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 424, 1000);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(77, 557, 100, 32);
		panel.add(comboBox);
		comboBox.addItem("*");
		comboBox.addItem("**");
		comboBox.addItem("***");
		comboBox.addItem("****");
		comboBox.addItem("*****");
		
		textField = new JTextField();
		textField.setBounds(176, 557, 144, 32);
		panel.add(textField);
		textField.setColumns(10);
		
		// Comment
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String comment = textField.getText();
				int rating = comboBox.getSelectedIndex();
				// adding to DB here

			}
			
		});


		
		button.setBounds(314, 557, 110, 32);
		panel.add(button);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Info.class.getResource("/javax/swing/plaf/basic/icons/JavaCup16.png")));
		label.setBounds(0, 0, 100, 100);
		panel.add(label);
		
		JLabel label_1 = new JLabel(name);
		label_1.setBounds(105, 0, 140, 31);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel.add(label_1);
		
		JLabel label_2 = new JLabel(publisher);
		label_2.setBounds(105, 27, 100, 26);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("Price: $"+price);
		label_3.setBounds(105, 74, 55, 26);
		panel.add(label_3);
		
		JLabel lblRating = new JLabel("Rating: "+rating+"/5.0");
		lblRating.setBounds(0, 118, 144, 26);
		panel.add(lblRating);
		
		JLabel lblGenre = new JLabel("Genre: " + genre);
		lblGenre.setBounds(227, 118, 92, 26);
		panel.add(lblGenre);
		
		JLabel lblDescription = new JLabel("Description: " + desc);
		lblDescription.setBounds(0, 156, 424, 169);
		panel.add(lblDescription);
		
		JLabel lblReview = new JLabel("Review");
		lblReview.setBounds(0, 542, 92, 26);
		panel.add(lblReview);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 589, 424, 342);
		panel.add(separator);
		
		
		String[] columnNames = {"Comment", "Rating" };
		Object[][] data = new Object[5][2];
		for(int i = 0; i < 5; i++) {
			data[i][0] = "Comment here";
			data[i][1] = i + "/5";
		}
		
		TableModel model = new DefaultTableModel(data, columnNames)
		  {
		    public boolean isCellEditable(int row, int column)
		    {
		      return false;//This causes all cells to be not editable
		    }
		  };
		table = new JTable(model);
		
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setColumnHeaderView(table);
		scrollPane.add(table.getTableHeader());
		scrollPane.setBounds(0, 589, 424, 342);
		
		scrollPane.setViewportView(table);
		
		panel.add(scrollPane);
	
	}
	
	public static Connection getApps() throws Exception {

		try {
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/201data";
			String username = "root";
			String password = "root";
			Class.forName(driver);

			Connection conn = DriverManager.getConnection(url,username,password);
			Statement stmt = (Statement) conn.createStatement();
			ResultSet rs;

			//Select Description
			//From Applications
			//WHERE Title = 'Canvas'
			
			rs = stmt.executeQuery("SELECT Description FROM 201data.Applications WHERE Title = '" + name + "'");
			while (rs.next() ) {
				desc = rs.getString("Description");
			}
			
			rs = stmt.executeQuery("SELECT CompanyName FROM 201data.Applications WHERE Title = '" + name + "'");
			while (rs.next() ) {
				publisher = rs.getString("CompanyName");
			}
			
			rs = stmt.executeQuery("SELECT Price FROM 201data.Applications WHERE Title = '" + name + "'");
			while (rs.next() ) {
				price = rs.getString("Price");
			}
			
			rs = stmt.executeQuery("SELECT Rating FROM 201data.Applications WHERE Title = '" + name + "'");
			while (rs.next() ) {
				rating = rs.getString("Rating");
			}
			
			rs = stmt.executeQuery("SELECT Category FROM 201data.Applications WHERE Title = '" + name + "'");
			while (rs.next() ) {
				genre = rs.getString("Category");
			}
			

			conn.close();
			return conn;
		} catch (Exception e ){System.out.println(e);}

		return null;
	}
	
	
	
	
	
}
