package StudentsRecord;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.text.MessageFormat;
import java.awt.event.ActionEvent;

public class ViewRecord {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewRecord window = new ViewRecord();
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
	public ViewRecord() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 255, 255));
		frame.setBounds(100, 100, 580, 769);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Google Sans Medium", Font.PLAIN, 24));
		textField.setBounds(195, 82, 243, 41);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("View Record");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Google Sans", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(156, 9, 243, 62);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Roll Number To View");
		lblNewLabel_1.setFont(new Font("Google Sans", Font.PLAIN, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 87, 175, 38);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		});
		btnSearch.setFont(new Font("Google Sans Medium", Font.PLAIN, 20));
		btnSearch.setBounds(443, 82, 111, 41);
		frame.getContentPane().add(btnSearch);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textPane.setBounds(10, 136, 544, 533);
		frame.getContentPane().add(textPane);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MessageFormat header = new MessageFormat("Printing in Progress");
				MessageFormat footer = new MessageFormat("Page {0, number, integer}");
				
				try
				{
					textPane.print();
				}
				catch(java.awt.print.PrinterException ev) {
					System.err.format("No Printer Found", ev.getMessage());
				}
				
			}
		});
		btnPrint.setFont(new Font("Google Sans Medium", Font.PLAIN, 20));
		btnPrint.setBounds(220, 680, 99, 41);
		frame.getContentPane().add(btnPrint);
	}
}
