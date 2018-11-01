import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class AppList extends JFrame {
	
	private JPanel list;
	
	public AppList() {
		setLayout(new BorderLayout());
		
		list = new JPanel(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbc.weightx = 1;
		gbc.weighty = 1;
		list.add(new JPanel(), gbc);
		
		add(new JScrollPane(list));
		
		String[] columnNames = {"App Name", "Developer", "Version" , "Release Date"};
		Object[][] data = {
			    {"First App", "CrawftWare",
			        new Integer(1), "10/30/2017"},
			       {"Second App", "hmmm",
			         new Integer(2), "1/1/1970"},
			       {"Third App", "RandomMakers",
			        new Integer(3), "12/25/2016"},
			   };
		
		table = new JTable(data, columnNames);
		frame.getContentPane().add(table, BorderLayout.CENTER);
		
		JScrollPane scrollPane = new JScrollPane(table);
		table.setFillsViewportHeight(true);
		
		frame.getContentPane().add(scrollPane);
		scrollPane.setColumnHeaderView(splitPane);
	}
	
}
