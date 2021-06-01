package StudentsRecord;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

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
		frame.setBounds(0, 0, 712, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAdd = new JButton("ADD Record");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add_Record addR = new Add_Record();
				addR.NewScreen();
			}
		});
		btnAdd.setBounds(78, 128, 197, 23);
		frame.getContentPane().add(btnAdd);
		
		JButton btnModify = new JButton("New button");
		btnModify.setBounds(78, 201, 197, 23);
		frame.getContentPane().add(btnModify);
		
		JButton btnView = new JButton("New button");
		btnView.setBounds(78, 284, 89, 23);
		frame.getContentPane().add(btnView);
		
		JLabel lblNewLabel = new JLabel("Student Record Management Tool");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBackground(new Color(204, 255, 204));
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(156, 11, 341, 79);
		frame.getContentPane().add(lblNewLabel);
	}
}
