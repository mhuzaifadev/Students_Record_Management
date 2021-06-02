package StudentsRecord;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import com.mysql.jdbc.Connection;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.text.MessageFormat;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import StudentsRecord.connection.*;

public class StudentsRecord {

	private JFrame frame;
	private JTextField jtxtDOB;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentsRecord window = new StudentsRecord();
					Connect.connects();
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
	public StudentsRecord() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 255, 255));
		frame.setBounds(0, 0, 712, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		ImageIcon logo = new ImageIcon("Students_Management_System.png");
		
		JButton btnAdd = new JButton("Add/Modify");
		btnAdd.setFont(new Font("Google Sans Medium", Font.BOLD, 28));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add_Record addR = new Add_Record();
				addR.NewScreen();
			}
		});
		btnAdd.setBounds(104, 265, 246, 95);
		frame.getContentPane().add(btnAdd);
		
		JButton btnModify = new JButton("View Record");
		btnModify.setFont(new Font("Google Sans Medium", Font.BOLD, 28));
		btnModify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewRecord viewR = new ViewRecord();
				viewR.NewScreen();
			}
		});
		btnModify.setBounds(389, 265, 246, 101);
		frame.getContentPane().add(btnModify);
		
		JLabel lblNewLabel = new JLabel("2019 - SE - 235        Muhammad Huzaifa Shahbaz\r\n");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBackground(new Color(204, 255, 204));
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(158, 387, 421, 45);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblSe = new JLabel("2019 - SE - 234        Zain - ul - Abidin\r\n");
		lblSe.setHorizontalAlignment(SwingConstants.LEFT);
		lblSe.setForeground(Color.BLACK);
		lblSe.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		lblSe.setBackground(new Color(204, 255, 204));
		lblSe.setBounds(158, 415, 421, 45);
		frame.getContentPane().add(lblSe);
		
		JLabel lblNewLabel_1_1 = new JLabel("2019 - SE - 231        Maham Abbasi\r\n");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		lblNewLabel_1_1.setBackground(new Color(204, 255, 204));
		lblNewLabel_1_1.setBounds(158, 443, 421, 45);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("2019 - SE - 238        Tazzakka Arif");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		lblNewLabel_1_1_1.setBackground(new Color(204, 255, 204));
		lblNewLabel_1_1_1.setBounds(158, 471, 421, 45);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel logoLabel = new JLabel(" ");
		logoLabel.setBounds(83, 64, 535, 130);
		frame.getContentPane().add(logoLabel);
		logoLabel.setIcon(new ImageIcon("C:\\Users\\Muhammad Huzaifa\\eclipse-workspace\\StudentsRecord\\logo.png"));
	}
}
