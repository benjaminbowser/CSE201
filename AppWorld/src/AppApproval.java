import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JList;
import javax.swing.JTable;
//import com.jgoodies.forms.layout.FormLayout;
//import com.jgoodies.forms.layout.ColumnSpec;
//import com.jgoodies.forms.layout.RowSpec;
//import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class AppApproval {

	JFrame frame;
	private JTable table;
	private JButton btnApprove;
	private JButton button;
	private JLabel lblApplications;
	private JLabel lblApplicationApproval;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppApproval window = new AppApproval();
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
	public AppApproval() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 638, 424);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{259, 98, 0, 0};
		gridBagLayout.rowHeights = new int[]{20, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		lblApplicationApproval = new JLabel("Application Approval");
		GridBagConstraints gbc_lblApplicationApproval = new GridBagConstraints();
		gbc_lblApplicationApproval.insets = new Insets(0, 0, 5, 5);
		gbc_lblApplicationApproval.gridx = 0;
		gbc_lblApplicationApproval.gridy = 0;
		frame.getContentPane().add(lblApplicationApproval, gbc_lblApplicationApproval);
		
		lblApplications = new JLabel("Applications");
		GridBagConstraints gbc_lblApplications = new GridBagConstraints();
		gbc_lblApplications.insets = new Insets(0, 0, 5, 5);
		gbc_lblApplications.gridx = 0;
		gbc_lblApplications.gridy = 2;
		frame.getContentPane().add(lblApplications, gbc_lblApplications);
		
		String[] columnNames = {"App Name", "Developer", "Version" , "Release Date"};
		Object[][] data = {
			    {"Flappy Bird", "James Galloway",
			        new Integer(1), "10/30/2017"},
			       {"Pied Piper", "RIGBY",
			         new Integer(2), "1/1/2017"},
			       {"WhatsApp", "Facebook",
			        new Integer(3), "12/25/2016"},
			   };
		
		table = new JTable(data,columnNames);
		//DefaultTableModel model = (DefaultTableModel)table.getModel();
		//model.removeRow(0);
		GridBagConstraints gbc_table = new GridBagConstraints();
		gbc_table.insets = new Insets(0, 0, 0, 5);
		gbc_table.fill = GridBagConstraints.BOTH;
		gbc_table.gridx = 0;
		gbc_table.gridy = 3;
		frame.getContentPane().add(table, gbc_table);
		
		btnApprove = new JButton("Approve");
		GridBagConstraints gbc_btnApprove = new GridBagConstraints();
		gbc_btnApprove.insets = new Insets(0, 0, 0, 5);
		gbc_btnApprove.gridx = 1;
		gbc_btnApprove.gridy = 3;
		frame.getContentPane().add(btnApprove, gbc_btnApprove);
		
		button = new JButton("Reject");
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.gridx = 2;
		gbc_button.gridy = 3;
		frame.getContentPane().add(button, gbc_button);
		
	}
}
