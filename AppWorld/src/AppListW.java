import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JList;
import java.awt.List;
import javax.swing.JScrollBar;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JSplitPane;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.mysql.jdbc.Statement;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class AppListW {

	private JFrame frmAppworld;
	private JTextField txtSearch;
	private JTable table;
	private boolean loggedIn = false;
	private static ArrayList<String> title;
	private static ArrayList<String> price;
	private static ArrayList<String> rating;
	private static ArrayList<String> companyName;
	private static ArrayList<String> release;
	private static ArrayList<String> desc;
	private static ArrayList<String> cat;
	private static ArrayList<String> approved;
	private static ArrayList<String> id;
	private static ArrayList<String> version;
	private boolean theme = true;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppListW window = new AppListW(false);
					window.frmAppworld.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppListW(boolean logged) {
		loggedIn = logged;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frmAppworld = new JFrame();
		frmAppworld.setTitle("APPWORLD");
		frmAppworld.setSize(1000,1000);
		//frame.setBounds(100, 100, 450, 300);
		frmAppworld.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.LIGHT_GRAY);
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		table.setBackground(Color.LIGHT_GRAY);
		frmAppworld.getContentPane().setBackground(Color.LIGHT_GRAY);
		
		// changing theme button
				JButton btnTheme = new JButton("Theme");
				btnTheme.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						if (theme){
							frmAppworld.getContentPane().setBackground(Color.gray);
							panel.setBackground(Color.gray);
							scrollPane.setBackground(Color.gray);
							table.setBackground(Color.gray);
						}
						else {
							frmAppworld.getContentPane().setBackground(Color.LIGHT_GRAY);
							panel.setBackground(Color.LIGHT_GRAY);
							scrollPane.setBackground(Color.LIGHT_GRAY);
							table.setBackground(Color.LIGHT_GRAY);
						}
						theme = !theme;
					}
					
				});

		GroupLayout groupLayout = new GroupLayout(frmAppworld.getContentPane());
		groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addContainerGap()
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 932, Short.MAX_VALUE)
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 932, Short.MAX_VALUE))
						.addContainerGap())
				);
		groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addGap(12)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 226, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
						.addGap(15))
				);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{181, 0, 0, 0, 0, 0, 253, 0, 0, 0, 0, 177, 1, 0};
		gbl_panel.rowHeights = new int[]{226, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);

		JButton btnAppSubmission = new JButton("App Submission");
		btnAppSubmission.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_btnAppSubmission = new GridBagConstraints();
		gbc_btnAppSubmission.gridwidth = 2;
		gbc_btnAppSubmission.anchor = GridBagConstraints.SOUTHWEST;
		gbc_btnAppSubmission.insets = new Insets(0, 0, 0, 5);
		gbc_btnAppSubmission.gridx = 2;
		gbc_btnAppSubmission.gridy = 0;
		panel.add(btnAppSubmission, gbc_btnAppSubmission);
		btnAppSubmission.setVerticalAlignment(SwingConstants.TOP);
		btnAppSubmission.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		JButton btnAppApprovalforMods = new JButton("App Approval(For Mods)");
		btnAppApprovalforMods.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_btnAppApprovalforMods = new GridBagConstraints();
		gbc_btnAppApprovalforMods.anchor = GridBagConstraints.SOUTHWEST;
		gbc_btnAppApprovalforMods.insets = new Insets(0, 0, 0, 5);
		gbc_btnAppApprovalforMods.gridx = 4;
		gbc_btnAppApprovalforMods.gridy = 0;
		panel.add(btnAppApprovalforMods, gbc_btnAppApprovalforMods);

		JLabel lblAppWorld = new JLabel("App World");
		GridBagConstraints gbc_lblAppWorld = new GridBagConstraints();
		gbc_lblAppWorld.anchor = GridBagConstraints.ABOVE_BASELINE;
		gbc_lblAppWorld.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblAppWorld.insets = new Insets(0, 0, 0, 5);
		gbc_lblAppWorld.gridx = 5;
		gbc_lblAppWorld.gridy = 0;
		panel.add(lblAppWorld, gbc_lblAppWorld);
		lblAppWorld.setFont(new Font("Bauhaus 93", Font.PLAIN, 56));
		lblAppWorld.setHorizontalAlignment(SwingConstants.CENTER);

		txtSearch = new JTextField();
		txtSearch.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_txtSearch = new GridBagConstraints();
		gbc_txtSearch.anchor = GridBagConstraints.SOUTH;
		gbc_txtSearch.insets = new Insets(0, 0, 0, 5);
		gbc_txtSearch.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtSearch.gridx = 6;
		gbc_txtSearch.gridy = 0;
		panel.add(txtSearch, gbc_txtSearch);
		txtSearch.setHorizontalAlignment(SwingConstants.CENTER);
		txtSearch.setText("Search");
		txtSearch.setColumns(10);

		//Login Button
		JButton btnLogin = new JButton("Login");
		btnLogin.setVerticalAlignment(SwingConstants.TOP);
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_btnLogin = new GridBagConstraints();
		gbc_btnLogin.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnLogin.insets = new Insets(0, 0, 0, 5);
		gbc_btnLogin.gridx = 9;
		gbc_btnLogin.gridy = 0;
		panel.add(btnLogin, gbc_btnLogin);
		if (loggedIn) {
			btnLogin.setEnabled(false);
		}
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login newLogin = new Login();
				frmAppworld.dispose();
				newLogin.frame.setVisible(true);

			}

		});

		// Add Data here

		try {
			getApps();
		}
		catch (Exception e){

		}

		String[] columnNames = {"App Name", "Developer", "Version" , "Release Date", "Description"};
		
		
		String[][] data2 = new String[id.size()][5];

		
		int totalEntriesLeft = id.size()-1; // total number of apps
		System.out.println(totalEntriesLeft);
		//int columnCounter = 3; // used to avoid out of bounds error in rows
		while (totalEntriesLeft > -1) {
			data2[totalEntriesLeft][4] = desc.get(totalEntriesLeft);
			data2[totalEntriesLeft][3] = release.get(totalEntriesLeft);
			data2[totalEntriesLeft][2] = version.get(totalEntriesLeft);
			data2[totalEntriesLeft][1] = companyName.get(totalEntriesLeft);
			data2[totalEntriesLeft][0] = title.get(totalEntriesLeft);
			totalEntriesLeft--;
		}

		// Add here




		TableModel model = new DefaultTableModel(data2, columnNames)
		{
			public boolean isCellEditable(int row, int column)
			{
				return false;//This causes all cells to be not editable
			}
		};
		table = new JTable(model);
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					JTable target = (JTable)e.getSource();
					int row = target.getSelectedRow();
					int column = target.getSelectedColumn();
					// Data in row
					String data  = (String) target.getModel().getValueAt(row, 0);
					String publisher = (String) target.getModel().getValueAt(row, 1);

					Info info = new Info(data, publisher); // Pass data here
					info.setVisible(true);
				}
			}
		});

		scrollPane.setColumnHeaderView(table);
		scrollPane.add(table.getTableHeader() );
		frmAppworld.getContentPane().setLayout(groupLayout);
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

			rs = stmt.executeQuery("SELECT Title FROM 201data.Applications");
			title = new ArrayList<String>();
			while (rs.next() ) {
				String name = rs.getString("title");
				title.add(name);
			}

			rs = stmt.executeQuery("SELECT Price FROM 201data.Applications");
			price = new ArrayList<String>();
			while (rs.next() ) {
				String cost = rs.getString("Price");
				price.add(cost);
			}

			rs = stmt.executeQuery("SELECT Rating FROM 201data.Applications");
			rating = new ArrayList<String>();
			while (rs.next() ) {
				String rate = rs.getString("Rating");
				rating.add(rate);
			}

			rs = stmt.executeQuery("SELECT CompanyName FROM 201data.Applications");
			companyName = new ArrayList<String>();
			while (rs.next() ) {
				String company = rs.getString("CompanyName");
				companyName.add(company);
			}

			rs = stmt.executeQuery("SELECT ReleaseDate FROM 201data.Applications");
			release = new ArrayList<String>();
			while (rs.next() ) {
				String date = rs.getString("ReleaseDate");
				release.add(date);
			}

			rs = stmt.executeQuery("SELECT Description FROM 201data.Applications");
			desc = new ArrayList<String>();
			while (rs.next() ) {
				String description = rs.getString("Description");
				desc.add(description);
			}

			rs = stmt.executeQuery("SELECT Category FROM 201data.Applications");
			cat = new ArrayList<String>();
			while (rs.next() ) {
				String category = rs.getString("Category");
				cat.add(category);
			}

			rs = stmt.executeQuery("SELECT Approved FROM 201data.Applications");
			approved = new ArrayList<String>();
			while (rs.next() ) {
				String approve = rs.getString("Approved");
				approved.add(approve);
			}

			rs = stmt.executeQuery("SELECT IDNumber FROM 201data.Applications");
			id = new ArrayList<String>();
			while (rs.next() ) {
				String ident = rs.getString("IDNumber");
				id.add(ident);
			}
			
			rs = stmt.executeQuery("SELECT Version FROM 201data.Applications");
			version = new ArrayList<String>();
			while (rs.next() ) {
				String ver = rs.getString("Version");
				version.add(ver);
			}

			System.out.println(release.toString());


			conn.close();
			return conn;
		} catch (Exception e ){System.out.println(e);}

		return null;
	}




}

