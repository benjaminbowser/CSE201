import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ExtFrame extends JFrame {

	private JPanel panel = new JPanel(); // main panel
	private JPanel upper = new JPanel();
	private JPanel uppest = new JPanel();
	private JPanel downer = new JPanel();
	private JPanel appList = new JPanel(); 
	
	public ExtFrame(){
		setSize(1000, 1000);
		panel.setLayout(new BorderLayout());
		upper.setLayout(new BorderLayout());

		// Title
		JLabel title = new JLabel("App World");
		title.setFont(new Font("Serif", Font.PLAIN, 56));
		uppest.add(title, BorderLayout.CENTER);
		
		
		// Log in button
		upper.add(new JButton("Log in"), BorderLayout.LINE_END);
		
		// 3 other buttons
		downer.add(new JButton("Search"), BorderLayout.WEST);
		downer.add(new JButton("App Submission"), BorderLayout.CENTER);
		downer.add(new JButton("App Aproval"), BorderLayout.EAST);
		
		appList.setBorder(BorderFactory.createLineBorder(Color.black));
			
		upper.add(uppest, BorderLayout.NORTH);
		upper.add(downer, BorderLayout.SOUTH);
		panel.add(upper, BorderLayout.NORTH);
		panel.add(appList, BorderLayout.CENTER);
		add(panel);

	}
}
