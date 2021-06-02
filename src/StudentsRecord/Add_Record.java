package StudentsRecord;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.SQLException;
import java.text.MessageFormat;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import com.mysql.jdbc.Statement;

import StudentsRecord.connection.Connect;

public class Add_Record {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField jtxtRoll;
	private JTextField jtxtFName;
	private JTextField jtxtLName;
	private JTextField jtxtAddress;
	private JTextField jtxtDOB;
	private JTextField jtxtBatchNo;
	private JTextField jtxtS1;
	private JTextField jtxtS2;
	private JTextField jtxtS3;
	private JTextField jtxtS4;
	private JTextField jtxtS5;
	private JTextField jtxtS6;
	private JTextField jtxtGrade;
	private JTextField jtxtTotalMarks;
	private JTextField jtxtPerc;
	private JTextField jtxtGPA;
	private JTextField qp1;
	private JTextField qp2;
	private JTextField qp3;
	private JTextField qp4;
	private JTextField qp5;
	private JTextField qp6;
	private JTextField ft1;
	private JTextField ft2;
	private JTextField ft3;
	private JTextField ft4;
	private JTextField ft5;
	private JTextField ft6;
	private JTextField ch1;
	private JTextField ch2;
	private JTextField ch3;
	private JTextField ch4;
	private JTextField ch5;
	private JTextField ch6;
	private JTextField grade1;
	private JTextField grade2;
	private JTextField grade3;
	private JTextField grade4;
	private JTextField grade5;
	private JTextField grade6;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;
	private JTextField t6;
	private JTextField jtxtDob;
	private JComboBox cmbDepart;
	private JLabel lblNewLabel_1_3;
	private JLabel lblNewLabel_4;
	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_Record window = new Add_Record();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Add_Record() {
		initialize();
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1816, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(224, 255, 255));
		panel.setBorder(new LineBorder(new Color(0, 191, 255), 12));
		panel.setBounds(2, 0, 1077, 448);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		jtxtRoll = new JTextField();
		jtxtRoll.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtxtRoll.setBounds(182, 23, 321, 32);
		panel.add(jtxtRoll);
		jtxtRoll.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Student ID");
		lblNewLabel.setFont(new Font("Raleway Medium", Font.PLAIN, 20));
		lblNewLabel.setBounds(28, 23, 106, 38);
		panel.add(lblNewLabel);
		
		jtxtFName = new JTextField();
		jtxtFName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtxtFName.setColumns(10);
		jtxtFName.setBounds(182, 58, 321, 32);
		panel.add(jtxtFName);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setFont(new Font("Raleway Medium", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(28, 58, 106, 38);
		panel.add(lblNewLabel_1);
		
		jtxtLName = new JTextField();
		jtxtLName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtxtLName.setColumns(10);
		jtxtLName.setBounds(182, 93, 321, 32);
		panel.add(jtxtLName);
		
		JLabel lblNewLabel_1_1 = new JLabel("Last Name");
		lblNewLabel_1_1.setFont(new Font("Raleway Medium", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(28, 93, 106, 38);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Semester");
		lblNewLabel_1_1_1.setFont(new Font("Raleway Medium", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(28, 128, 144, 38);
		panel.add(lblNewLabel_1_1_1);
		
		jtxtAddress = new JTextField();
		jtxtAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtxtAddress.setColumns(10);
		jtxtAddress.setBounds(182, 314, 321, 105);
		panel.add(jtxtAddress);
		
		
		jtxtBatchNo = new JTextField();
		jtxtBatchNo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtxtBatchNo.setColumns(10);
		jtxtBatchNo.setBounds(182, 163, 321, 32);
		panel.add(jtxtBatchNo);
		
		JLabel lblNewLabel_2 = new JLabel("Batch");
		lblNewLabel_2.setFont(new Font("Raleway Medium", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(28, 163, 106, 38);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("Gender");
		lblNewLabel_1_2.setFont(new Font("Raleway Medium", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(28, 237, 106, 38);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Date of Birth");
		lblNewLabel_1_1_2.setFont(new Font("Raleway Medium", Font.PLAIN, 20));
		lblNewLabel_1_1_2.setBounds(28, 272, 144, 38);
		panel.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_3 = new JLabel("Subject 01");
		lblNewLabel_3.setFont(new Font("Raleway Medium", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(555, 52, 106, 38);
		panel.add(lblNewLabel_3);
		
		jtxtS1 = new JTextField();
		jtxtS1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtxtS1.setColumns(10);
		jtxtS1.setBounds(690, 52, 55, 32);
		panel.add(jtxtS1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Subject 02");
		lblNewLabel_3_1.setFont(new Font("Raleway Medium", Font.PLAIN, 20));
		lblNewLabel_3_1.setBounds(555, 87, 106, 38);
		panel.add(lblNewLabel_3_1);
		
		jtxtS2 = new JTextField();
		jtxtS2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtxtS2.setColumns(10);
		jtxtS2.setBounds(690, 87, 55, 32);
		panel.add(jtxtS2);
		
		jtxtS3 = new JTextField();
		jtxtS3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtxtS3.setColumns(10);
		jtxtS3.setBounds(690, 122, 55, 32);
		panel.add(jtxtS3);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Subject 03");
		lblNewLabel_3_1_1.setFont(new Font("Raleway Medium", Font.PLAIN, 20));
		lblNewLabel_3_1_1.setBounds(555, 122, 106, 38);
		panel.add(lblNewLabel_3_1_1);
		
		jtxtS4 = new JTextField();
		jtxtS4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtxtS4.setColumns(10);
		jtxtS4.setBounds(690, 157, 55, 32);
		panel.add(jtxtS4);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Subject 04");
		lblNewLabel_3_1_1_1.setFont(new Font("Raleway Medium", Font.PLAIN, 20));
		lblNewLabel_3_1_1_1.setBounds(555, 157, 106, 38);
		panel.add(lblNewLabel_3_1_1_1);
		
		jtxtS5 = new JTextField();
		jtxtS5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtxtS5.setColumns(10);
		jtxtS5.setBounds(690, 192, 55, 32);
		panel.add(jtxtS5);
		
		JLabel lblNewLabel_3_1_1_1_1 = new JLabel("Subject 05");
		lblNewLabel_3_1_1_1_1.setFont(new Font("Raleway Medium", Font.PLAIN, 20));
		lblNewLabel_3_1_1_1_1.setBounds(555, 192, 106, 38);
		panel.add(lblNewLabel_3_1_1_1_1);
		
		jtxtS6 = new JTextField();
		jtxtS6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtxtS6.setColumns(10);
		jtxtS6.setBounds(690, 227, 55, 32);
		panel.add(jtxtS6);
		
		JLabel lblNewLabel_3_1_1_1_1_1 = new JLabel("Subject 06");
		lblNewLabel_3_1_1_1_1_1.setFont(new Font("Raleway Medium", Font.PLAIN, 20));
		lblNewLabel_3_1_1_1_1_1.setBounds(555, 227, 106, 38);
		panel.add(lblNewLabel_3_1_1_1_1_1);
		
		jtxtGrade = new JTextField();
		jtxtGrade.setEnabled(false);
		jtxtGrade.setColumns(10);
		jtxtGrade.setBounds(690, 268, 163, 32);
		panel.add(jtxtGrade);
		
		JLabel lblNewLabel_3_1_1_1_1_1_1_1 = new JLabel("Grade");
		lblNewLabel_3_1_1_1_1_1_1_1.setFont(new Font("Raleway Medium", Font.PLAIN, 20));
		lblNewLabel_3_1_1_1_1_1_1_1.setBounds(555, 268, 106, 38);
		panel.add(lblNewLabel_3_1_1_1_1_1_1_1);
		
		jtxtTotalMarks = new JTextField();
		jtxtTotalMarks.setEnabled(false);
		jtxtTotalMarks.setColumns(10);
		jtxtTotalMarks.setBounds(690, 303, 163, 32);
		panel.add(jtxtTotalMarks);
		
		JLabel lblNewLabel_3_1_1_1_1_1_1_1_1 = new JLabel("Total Marks");
		lblNewLabel_3_1_1_1_1_1_1_1_1.setFont(new Font("Raleway Medium", Font.PLAIN, 20));
		lblNewLabel_3_1_1_1_1_1_1_1_1.setBounds(555, 303, 143, 38);
		panel.add(lblNewLabel_3_1_1_1_1_1_1_1_1);
		
		jtxtPerc = new JTextField();
		jtxtPerc.setEnabled(false);
		jtxtPerc.setColumns(10);
		jtxtPerc.setBounds(690, 338, 163, 32);
		panel.add(jtxtPerc);
		
		JLabel lblNewLabel_3_1_1_1_1_1_1_1_1_1 = new JLabel("Percentage");
		lblNewLabel_3_1_1_1_1_1_1_1_1_1.setFont(new Font("Raleway Medium", Font.PLAIN, 20));
		lblNewLabel_3_1_1_1_1_1_1_1_1_1.setBounds(555, 338, 143, 38);
		panel.add(lblNewLabel_3_1_1_1_1_1_1_1_1_1);
		
		jtxtGPA = new JTextField();
		jtxtGPA.setEnabled(false);
		jtxtGPA.setColumns(10);
		jtxtGPA.setBounds(690, 374, 163, 32);
		panel.add(jtxtGPA);
		
		JLabel lblNewLabel_3_1_1_1_1_1_1_1_1_1_1 = new JLabel("G.P.A.");
		lblNewLabel_3_1_1_1_1_1_1_1_1_1_1.setFont(new Font("Raleway Medium", Font.PLAIN, 20));
		lblNewLabel_3_1_1_1_1_1_1_1_1_1_1.setBounds(555, 374, 106, 38);
		panel.add(lblNewLabel_3_1_1_1_1_1_1_1_1_1_1);
		
		JComboBox cmbSemester = new JComboBox();
		cmbSemester.setFont(new Font("Tahoma", Font.PLAIN, 17));
		cmbSemester.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08"}));
		cmbSemester.setBounds(182, 128, 321, 32);
		panel.add(cmbSemester);
		
		JComboBox cmbGender = new JComboBox();
		cmbGender.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female", "Other"}));
		cmbGender.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cmbGender.setBounds(182, 237, 321, 32);
		panel.add(cmbGender);
		
		qp1 = new JTextField();
		qp1.setForeground(new Color(0, 0, 128));
		qp1.setFont(new Font("Raleway SemiBold", Font.BOLD, 21));
		qp1.setEnabled(false);
		qp1.setColumns(10);
		qp1.setBounds(1000, 52, 55, 32);
		panel.add(qp1);
		
		qp2 = new JTextField();
		qp2.setForeground(new Color(0, 0, 128));
		qp2.setFont(new Font("Raleway SemiBold", Font.BOLD, 21));
		qp2.setEnabled(false);
		qp2.setColumns(10);
		qp2.setBounds(1000, 87, 55, 32);
		panel.add(qp2);
		
		qp3 = new JTextField();
		qp3.setForeground(new Color(0, 0, 128));
		qp3.setFont(new Font("Raleway SemiBold", Font.BOLD, 21));
		qp3.setEnabled(false);
		qp3.setColumns(10);
		qp3.setBounds(1000, 122, 55, 32);
		panel.add(qp3);
		
		qp4 = new JTextField();
		qp4.setForeground(new Color(0, 0, 128));
		qp4.setFont(new Font("Raleway SemiBold", Font.BOLD, 21));
		qp4.setEnabled(false);
		qp4.setColumns(10);
		qp4.setBounds(1000, 157, 55, 32);
		panel.add(qp4);
		
		qp5 = new JTextField();
		qp5.setForeground(new Color(0, 0, 128));
		qp5.setFont(new Font("Raleway SemiBold", Font.BOLD, 21));
		qp5.setEnabled(false);
		qp5.setColumns(10);
		qp5.setBounds(1000, 192, 55, 32);
		panel.add(qp5);
		
		qp6 = new JTextField();
		qp6.setForeground(new Color(0, 0, 128));
		qp6.setFont(new Font("Raleway SemiBold", Font.BOLD, 21));
		qp6.setEnabled(false);
		qp6.setColumns(10);
		qp6.setBounds(1000, 227, 55, 32);
		panel.add(qp6);
		
		ft1 = new JTextField();
		ft1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ft1.setColumns(10);
		ft1.setBounds(752, 52, 55, 32);
		panel.add(ft1);
		
		ft2 = new JTextField();
		ft2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ft2.setColumns(10);
		ft2.setBounds(752, 87, 55, 32);
		panel.add(ft2);
		
		ft3 = new JTextField();
		ft3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ft3.setColumns(10);
		ft3.setBounds(752, 122, 55, 32);
		panel.add(ft3);
		
		ft4 = new JTextField();
		ft4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ft4.setColumns(10);
		ft4.setBounds(752, 157, 55, 32);
		panel.add(ft4);
		
		ft5 = new JTextField();
		ft5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ft5.setColumns(10);
		ft5.setBounds(752, 192, 55, 32);
		panel.add(ft5);
		
		ft6 = new JTextField();
		ft6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ft6.setColumns(10);
		ft6.setBounds(752, 227, 55, 32);
		panel.add(ft6);
		
		ch1 = new JTextField();
		ch1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ch1.setColumns(10);
		ch1.setBounds(816, 52, 55, 32);
		panel.add(ch1);
		
		ch2 = new JTextField();
		ch2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ch2.setColumns(10);
		ch2.setBounds(816, 87, 55, 32);
		panel.add(ch2);
		
		ch3 = new JTextField();
		ch3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ch3.setColumns(10);
		ch3.setBounds(816, 122, 55, 32);
		panel.add(ch3);
		
		ch4 = new JTextField();
		ch4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ch4.setColumns(10);
		ch4.setBounds(816, 157, 55, 32);
		panel.add(ch4);
		
		ch5 = new JTextField();
		ch5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ch5.setColumns(10);
		ch5.setBounds(816, 192, 55, 32);
		panel.add(ch5);
		
		ch6 = new JTextField();
		ch6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ch6.setColumns(10);
		ch6.setBounds(816, 227, 55, 32);
		panel.add(ch6);
		
		grade1 = new JTextField();
		grade1.setForeground(new Color(0, 0, 128));
		grade1.setFont(new Font("Raleway SemiBold", Font.BOLD, 21));
		grade1.setEnabled(false);
		grade1.setColumns(10);
		grade1.setBounds(946, 52, 44, 32);
		panel.add(grade1);
		
		grade2 = new JTextField();
		grade2.setForeground(new Color(0, 0, 128));
		grade2.setFont(new Font("Raleway SemiBold", Font.BOLD, 21));
		grade2.setEnabled(false);
		grade2.setColumns(10);
		grade2.setBounds(946, 87, 44, 32);
		panel.add(grade2);
		
		grade3 = new JTextField();
		grade3.setForeground(new Color(0, 0, 128));
		grade3.setFont(new Font("Raleway SemiBold", Font.BOLD, 21));
		grade3.setEnabled(false);
		grade3.setColumns(10);
		grade3.setBounds(946, 122, 44, 32);
		panel.add(grade3);
		
		grade4 = new JTextField();
		grade4.setForeground(new Color(0, 0, 128));
		grade4.setFont(new Font("Raleway SemiBold", Font.BOLD, 21));
		grade4.setEnabled(false);
		grade4.setColumns(10);
		grade4.setBounds(946, 157, 44, 32);
		panel.add(grade4);
		
		grade5 = new JTextField();
		grade5.setForeground(new Color(0, 0, 128));
		grade5.setFont(new Font("Raleway SemiBold", Font.BOLD, 21));
		grade5.setEnabled(false);
		grade5.setColumns(10);
		grade5.setBounds(946, 192, 44, 32);
		panel.add(grade5);
		
		grade6 = new JTextField();
		grade6.setForeground(new Color(0, 0, 128));
		grade6.setFont(new Font("Raleway SemiBold", Font.BOLD, 21));
		grade6.setEnabled(false);
		grade6.setColumns(10);
		grade6.setBounds(946, 227, 44, 32);
		panel.add(grade6);
		
		JLabel lblNewLabel_3_2 = new JLabel("  F.T");
		lblNewLabel_3_2.setFont(new Font("Raleway Medium", Font.PLAIN, 20));
		lblNewLabel_3_2.setBounds(752, 11, 44, 38);
		panel.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("  Ses");
		lblNewLabel_3_2_1.setFont(new Font("Raleway Medium", Font.PLAIN, 20));
		lblNewLabel_3_2_1.setBounds(690, 11, 44, 38);
		panel.add(lblNewLabel_3_2_1);
		
		JLabel lblNewLabel_3_2_2 = new JLabel("C. Hrs");
		lblNewLabel_3_2_2.setFont(new Font("Raleway Medium", Font.PLAIN, 20));
		lblNewLabel_3_2_2.setBounds(816, 11, 55, 38);
		panel.add(lblNewLabel_3_2_2);
		
		JLabel lblNewLabel_3_2_2_1 = new JLabel("Grade");
		lblNewLabel_3_2_2_1.setFont(new Font("Raleway Medium", Font.PLAIN, 18));
		lblNewLabel_3_2_2_1.setBounds(946, 11, 55, 38);
		panel.add(lblNewLabel_3_2_2_1);
		
		JLabel lblNewLabel_3_2_2_1_1 = new JLabel("  Q.P.");
		lblNewLabel_3_2_2_1_1.setFont(new Font("Raleway Medium", Font.PLAIN, 18));
		lblNewLabel_3_2_2_1_1.setBounds(1000, 11, 55, 38);
		panel.add(lblNewLabel_3_2_2_1_1);
		
		JLabel lblNewLabel_3_2_3 = new JLabel("Total");
		lblNewLabel_3_2_3.setFont(new Font("Raleway Medium", Font.PLAIN, 20));
		lblNewLabel_3_2_3.setBounds(881, 11, 55, 38);
		panel.add(lblNewLabel_3_2_3);
		
		t1 = new JTextField();
		t1.setForeground(new Color(0, 0, 128));
		t1.setFont(new Font("Raleway SemiBold", Font.BOLD, 21));
		t1.setEnabled(false);
		t1.setColumns(10);
		t1.setBounds(881, 52, 55, 32);
		panel.add(t1);
		
		t2 = new JTextField();
		t2.setForeground(new Color(0, 0, 128));
		t2.setFont(new Font("Raleway SemiBold", Font.BOLD, 21));
		t2.setEnabled(false);
		t2.setColumns(10);
		t2.setBounds(881, 87, 55, 32);
		panel.add(t2);
		
		t3 = new JTextField();
		t3.setForeground(new Color(0, 0, 128));
		t3.setFont(new Font("Raleway SemiBold", Font.BOLD, 21));
		t3.setEnabled(false);
		t3.setColumns(10);
		t3.setBounds(881, 122, 55, 32);
		panel.add(t3);
		
		t4 = new JTextField();
		t4.setForeground(new Color(0, 0, 128));
		t4.setFont(new Font("Raleway SemiBold", Font.BOLD, 21));
		t4.setEnabled(false);
		t4.setColumns(10);
		t4.setBounds(881, 157, 55, 32);
		panel.add(t4);
		
		t5 = new JTextField();
		t5.setForeground(new Color(0, 0, 128));
		t5.setFont(new Font("Raleway SemiBold", Font.BOLD, 21));
		t5.setEnabled(false);
		t5.setColumns(10);
		t5.setBounds(881, 192, 55, 32);
		panel.add(t5);
		
		t6 = new JTextField();
		t6.setForeground(new Color(0, 0, 128));
		t6.setFont(new Font("Raleway SemiBold", Font.BOLD, 21));
		t6.setEnabled(false);
		t6.setColumns(10);
		t6.setBounds(881, 227, 55, 32);
		panel.add(t6);
		
		jtxtDob = new JTextField();
		jtxtDob.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtxtDob.setColumns(10);
		jtxtDob.setBounds(182, 272, 321, 32);
		panel.add(jtxtDob);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Address");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Raleway Medium", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_1.setBounds(28, 310, 106, 38);
		panel.add(lblNewLabel_1_1_1_1_1);
		
		cmbDepart = new JComboBox();
		cmbDepart.setModel(new DefaultComboBoxModel(new String[] {"SE", "CE", "CS", "BM", "EE", "EL", "CV"}));
		cmbDepart.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cmbDepart.setBounds(182, 198, 321, 32);
		panel.add(cmbDepart);
		
		lblNewLabel_1_3 = new JLabel("Department");
		lblNewLabel_1_3.setFont(new Font("Raleway Medium", Font.PLAIN, 20));
		lblNewLabel_1_3.setBounds(28, 198, 130, 32);
		panel.add(lblNewLabel_1_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(1089, 41, 711, 517);
		frame.getContentPane().add(panel_1);
		panel_1.setBorder(new LineBorder(new Color(0, 191, 255), 12));
		panel_1.setBackground(new Color(100, 149, 237));
		panel_1.setLayout(null);
		
		JTextArea jtxtTranscript = new JTextArea();
		jtxtTranscript.setFont(new Font("Times New Roman", Font.BOLD, 14));
		jtxtTranscript.setForeground(new Color(0, 0, 0));
		jtxtTranscript.setEnabled(false);
		jtxtTranscript.setBounds(10, 11, 691, 495);
		panel_1.add(jtxtTranscript);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(2, 455, 1077, 103);
		frame.getContentPane().add(panel_2);
		panel_2.setBorder(new LineBorder(new Color(0, 191, 255), 12));
		panel_2.setBackground(new Color(224, 255, 255));
		panel_2.setLayout(null);
		
		JButton btnResult = new JButton("Result");
		btnResult.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double[] R = new double[14];
				R[0] = Double.parseDouble(jtxtS1.getText());
				R[1] = Double.parseDouble(jtxtS2.getText());
				R[2] = Double.parseDouble(jtxtS3.getText());
				R[3] = Double.parseDouble(jtxtS4.getText());
				R[4] = Double.parseDouble(jtxtS5.getText());
				R[5] = Double.parseDouble(jtxtS6.getText());
				R[6] = Double.parseDouble(ft1.getText());
				R[7] = Double.parseDouble(ft2.getText());
				R[8] = Double.parseDouble(ft3.getText());
				R[9] = Double.parseDouble(ft4.getText());
				R[10] = Double.parseDouble(ft5.getText());
				R[11] = Double.parseDouble(ft6.getText());
				
				
				int[] CH = new int[8];
				CH[0] = Integer.parseInt(ch1.getText());
				CH[1] = Integer.parseInt(ch2.getText());
				CH[2] = Integer.parseInt(ch3.getText());
				CH[3] = Integer.parseInt(ch4.getText());
				CH[4] = Integer.parseInt(ch5.getText());
				CH[5] = Integer.parseInt(ch6.getText());
				
				CH[6] = CH[0]+CH[1]+CH[2]+CH[3]+CH[4]+CH[5];
				
				double[] T = new double[8];
				for (int i = 0;i<=5;i++) {
					T[i] = R[i]+R[i+6];
				}
				
				double[] GP = new double[8];
				for(int i=0;i<=5;i++) {
					if (R[i] < 25 || R[i+6]<25) {
						GP[i] = 0.0;
					}
					else if (T[i] >= 90) {
						GP[i] = 4.0;
					}
					else if (T[i] >= 70) {
						GP[i] = T[i]-70;
						GP[i] = GP[i]%2;
						GP[i] = 3.0 + GP[i]/10;
					} 
					else if (T[i] >= 60) {
						GP[i] = T[i]-60;
						GP[i] = 2.0 + GP[i]/10;
					}
					else if (T[i] >= 50) {
						GP[i] = T[i]-50;
						GP[i] = 1.0 + GP[i]/10;
					}
					else {
						GP[i] = 0.0;
					}
				}
				
				double[] QP = new double[8];
				for (int i =0;i<=5;i++) {
					QP[i] = GP[i]*CH[i];
				}
				
				QP[6] = QP[0]+QP[1]+QP[2]+QP[3]+QP[4]+QP[5];
				

				String[] Gr = new String[8];
				for (int i =0;i<=5;i++) {
					
					if(GP[i]==4.0) {
						Gr[i]= "A+";
					}
					else if(GP[i]>=3.5) {
						Gr[i]= "A";
					}
					else if(GP[i]>=3.0) {
						Gr[i]= "A-";
					}
					else if(GP[i]>=2.5) {
						Gr[i]= "B+";
					}
					else if(GP[i]>=2.0) {
						Gr[i]= "B";
					}
					else if(GP[i]>=1.5) {
						Gr[i]= "C";
					}
					else if(GP[i]>=1.0) {
						Gr[i]= "D";
					}
					else if(GP[i]==0.0) {
						Gr[i]= "F";
					}
				}

				
				
				
				String T0 = String.format("%.1f", T[0]);
				t1.setText(T0);
				
				String T1 = String.format("%.1f", T[1]);
				t2.setText(T1);
				
				String T2 = String.format("%.1f", T[2]);
				t3.setText(T2);
				
				String T3 = String.format("%.1f", T[3]);
				t4.setText(T3);
				
				String T4 = String.format("%.1f", T[4]);
				t5.setText(T4);
				
				String T5 = String.format("%.1f", T[5]);
				t6.setText(T5);
				
				T[6]=T[0]+T[1]+T[2]+T[3]+T[4]+T[5];
						
				String QP0 = String.format("%.1f", QP[0]);
				qp1.setText(QP0);
				
				String QP1 = String.format("%.1f", QP[1]);
				qp2.setText(QP1);
				
				String QP2 = String.format("%.1f", QP[2]);
				qp3.setText(QP2);
				
				String QP3 = String.format("%.1f", QP[3]);
				qp4.setText(QP3);
				
				String QP4 = String.format("%.1f", QP[4]);
				qp5.setText(QP4);
				
				String QP5 = String.format("%.1f", QP[5]);
				qp6.setText(QP5);
				
				grade1.setText(Gr[0]);
				grade2.setText(Gr[1]);
				grade3.setText(Gr[2]);
				grade4.setText(Gr[3]);
				grade5.setText(Gr[4]);
				grade6.setText(Gr[5]);
								
				
				String percentage = String.format("%.2f", T[6]/6);
				jtxtPerc.setText(percentage);
				
				String totalMarks = String.format("%.0f", T[6]);
				jtxtTotalMarks.setText(totalMarks);
				
				String gpa = String.format("%.2f", QP[6]/CH[6]);
				jtxtGPA.setText(gpa);
				
				for(int i=0;i<=5;i++) {
					if (Gr[i] == "F")
					{
						jtxtGrade.setText("F");
						break;
					}
					if(QP[6]/CH[6]==4.0) {
						jtxtGrade.setText("A+");;
					}
					else if(QP[6]/CH[6]>=3.5) {
						jtxtGrade.setText("A");;
					}
					else if(QP[6]/CH[6]>=3.0) {
						jtxtGrade.setText("A-");;
					}
					else if(QP[6]/CH[6]>=2.5) {
						jtxtGrade.setText("B+");;
					}
					else if(QP[6]/CH[6]>=2.0) {
						jtxtGrade.setText("B");
					}
					else if(QP[6]/CH[6]>=1.5) {
						jtxtGrade.setText("C");
					}
					else if(QP[6]/CH[6]>=1.0) {
						jtxtGrade.setText("D");
					}
					else if(QP[6]/CH[6]==0.0) {
						jtxtGrade.setText("F");
					}
				}
				
				
			}
		});
		btnResult.setBounds(22, 21, 176, 61);
		panel_2.add(btnResult);
		
		JButton btnTranscript = new JButton("Transcript");
		btnTranscript.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtxtTranscript.setText("");
				jtxtTranscript.append(
						"\t    SIR SYED UNIVERSITY OF ENGINEERING & TECHNOLOGY\n\n"
						+"\t\t    TRANSCRIPT  OF  SEMESTER  "+cmbSemester.getSelectedItem().toString()+"\n"
						+ "======================================================================================\n"
						+ "Roll #\t"+jtxtRoll.getText()+"\t\tDepartment"+cmbDepart.getSelectedItem().toString()+"\n"
						+ "First Name\t"+jtxtFName.getText()+"\t"
						+ "Last Name\t"+jtxtLName.getText()+"\n"
						+ "Sex\t"+cmbGender.getSelectedItem().toString()+"\t\t"
						+ "Date Of Birth:\t"+jtxtDob.getText()+"\t"
						+ "Batch   "+jtxtBatchNo.getText()+"\n"
						+ "======================================================================================\n"
						+"Subjects\tSessional\tFinals\tTotal\tCredit\tGrade\tQuality\n"
						+"\tMarks\tMarks\tMarks\tHours\t\tPoints\n"
						+ "__________________________________________________________________________________________________\n"
						+ "Subject 01\t"+jtxtS1.getText()+"\t"+ft1.getText()+"\t"+t1.getText()+"\t"+ch1.getText()+"\t"+grade1.getText()+"\t"+qp1.getText()+"\n"
						+ "Subject 02\t"+jtxtS2.getText()+"\t"+ft2.getText()+"\t"+t2.getText()+"\t"+ch2.getText()+"\t"+grade2.getText()+"\t"+qp2.getText()+"\n"
						+ "Subject 03\t"+jtxtS3.getText()+"\t"+ft3.getText()+"\t"+t3.getText()+"\t"+ch3.getText()+"\t"+grade3.getText()+"\t"+qp3.getText()+"\n"
						+ "Subject 04\t"+jtxtS4.getText()+"\t"+ft4.getText()+"\t"+t4.getText()+"\t"+ch4.getText()+"\t"+grade4.getText()+"\t"+qp4.getText()+"\n"
						+ "Subject 05\t"+jtxtS5.getText()+"\t"+ft5.getText()+"\t"+t5.getText()+"\t"+ch5.getText()+"\t"+grade5.getText()+"\t"+qp5.getText()+"\n"
						+ "Subject 06\t"+jtxtS6.getText()+"\t"+ft6.getText()+"\t"+t6.getText()+"\t"+ch6.getText()+"\t"+grade6.getText()+"\t"+qp6.getText()+"\n"
						+ "=====================================================================================\n"
						+ "Grade\t"+jtxtGrade.getText()+"\t\t"
						+ "Total Marks\t"+jtxtTotalMarks.getText()+"\n"
						+ "Percentage\t"+jtxtPerc.getText()+"\t\t"
						+ "G.P.A\t"+jtxtGPA.getText()+"\n"
						+ "=====================================================================================\n"
						+ "This is computer generated Transcript."
						
						);
			}
		});
		btnTranscript.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnTranscript.setBounds(219, 21, 176, 61);
		panel_2.add(btnTranscript);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MessageFormat header = new MessageFormat("Printing in Progress");
				MessageFormat footer = new MessageFormat("Page {0, number, integer}");
				
				try
				{
					jtxtTranscript.print();
				}
				catch(java.awt.print.PrinterException ev) {
					System.err.format("No Printer Found", ev.getMessage());
				}
			}
		});
		btnPrint.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnPrint.setBounds(418, 21, 176, 61);
		panel_2.add(btnPrint);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField temp = null;
				for (Component c:panel.getComponents()) {
					if(c.getClass().toString().contains("javax.swing.JtextField")) {
						temp = (JTextField)c;
						temp.setText(null);
					}
				}
				jtxtTranscript.setText(null);
				jtxtRoll.setText(null);
				jtxtFName.setText(null);
				jtxtLName.setText(null);
				jtxtBatchNo.setText(null);
				jtxtDOB.setText(null);
				jtxtAddress.setText(null);
				jtxtTranscript.setText(null);
				jtxtS1.setText(null);
				jtxtS2.setText(null);
				jtxtS3.setText(null);
				jtxtS4.setText(null);
				jtxtS5.setText(null);
				jtxtS6.setText(null);
				jtxtGrade.setText(null);
				jtxtTotalMarks.setText(null);
				jtxtPerc.setText(null);
				jtxtGPA.setText(null);
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnReset.setBounds(618, 21, 176, 61);
		panel_2.add(btnReset);
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				InsertStudentDataInDB(
						jtxtRoll.getText(),
						jtxtFName.getText(),
						jtxtLName.getText(),
						Integer.parseInt(cmbDepart.getSelectedItem().toString()), // semester change
						Integer.parseInt(jtxtBatchNo.getText()),
						jtxtDob.getText(),
						cmbDepart.getSelectedItem().toString(),
						cmbGender.getSelectedItem().toString(),
						jtxtAddress.getText(), // address
						Integer.parseInt(jtxtS1.getText()),
						Integer.parseInt(jtxtS2.getText()),
						Integer.parseInt(jtxtS3.getText()),
						Integer.parseInt(jtxtS4.getText()),
						Integer.parseInt(jtxtS5.getText()),
						Integer.parseInt(jtxtS6.getText()),
						Integer.parseInt(ft1.getText()),
						Integer.parseInt(ft2.getText()),
						Integer.parseInt(ft3.getText()),
						Integer.parseInt(ft4.getText()),
						Integer.parseInt(ft5.getText()),
						Integer.parseInt(ft6.getText()),
						Integer.parseInt(t1.getText()),
						Integer.parseInt(t2.getText()),
						Integer.parseInt(t3.getText()),
						Integer.parseInt(t4.getText()),
						Integer.parseInt(t5.getText()),
						Integer.parseInt(t6.getText()),
						
						Integer.parseInt(ch1.getText()),
						Integer.parseInt(ch2.getText()),
						Integer.parseInt(ch3.getText()),
						Integer.parseInt(ch4.getText()),
						Integer.parseInt(ch5.getText()),
						Integer.parseInt(ch6.getText()),
						
						grade1.getText(),
						grade2.getText(),
						grade3.getText(),
						grade4.getText(),
						grade5.getText(),
						grade6.getText(),
						
						Double.parseDouble(qp1.getText()),
						Double.parseDouble(qp2.getText()),
						Double.parseDouble(qp3.getText()),
						Double.parseDouble(qp4.getText()),
						Double.parseDouble(qp5.getText()),
						Double.parseDouble(qp6.getText()),
						
						jtxtTotalMarks.getText(),
						jtxtGrade.getText(),
						jtxtPerc.getText(),
						jtxtGPA.getText(),
						
						);
			}
		});
		btnUpload.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnUpload.setBounds(815, 21, 176, 61);
		panel_2.add(btnUpload);
		
		lblNewLabel_4 = new JLabel("TRANSCRIPT");
		lblNewLabel_4.setFont(new Font("Google Sans Medium", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_4.setBounds(1337, 0, 229, 41);
		frame.getContentPane().add(lblNewLabel_4);
	}
	

	
    public static void InsertStudentDataInDB(String Student_ID, String firstName, String lastName, int semester, int batch, String DOB,
    		String department, String gender, String address, int ses1, int ses2, int ses3, int ses4, int ses5,int ses6,
    		int ft1, int ft2, int ft3, int ft4, int ft5, int ft6, int total1, int total2, int total3, int total4, int total5, int total6,
    		int ch1, int ch2, int ch3, int ch4, int ch5, int ch6, String grade1,  String grade2,  String grade3,  String grade4,  String grade5,  String grade6,  
    		double qp1, double qp2, double qp3, double qp4, double qp5, double qp6, 
    		int totalMarks, String grade, float percentage, float gpa) {
	 
				try {	
					String query = "INSERT INTO tb_student_rec(`Student ID`,`First Name`,`Last Name`, `Semester`,`Batch`,`Date of Birth`,`Department`,`Gender`,`Address`,`Ses 01`,`Ses 02`,`Ses 03`,`Ses 04`,`Ses 05`,`Ses 06`,`F.T 01`,`F.T 02`,`F.T 03`,`F.T 04`,`F.T 05`,`F.T 06`,`CH1`,`CH2`,`CH3`,`CH4`,`CH5`,`CH6`,`grade1`,`grade2`,`grade3`,`grade4`,`grade5`,`grade6`,`QP1`,`QP2`,`QP3`,`QP4`,`QP5`,`QP6`,`Total 1`,`Total 2`,`Total 3`,`Total 4`,`Total 5`,`Total 6`,`Total Marks`,`Grade`,`Percentage`,`GPA`\r\n"
							+ ",) VALUES('"+Student_ID+"' , "+firstName+", "+lastName+","+semester+","+batch+","+DOB+","+department+","+gender+","+address+","+ses1+","+ses2+","+ses3+","+ses4+","+ses5+","+ses6+","+ft1+","+ft2+","+ft3+","+ft4+","+ft5+","+ft6+","+ch1+","+ch2+","+ch3+","+ch4+","+ch5+","+ch6+","+qp1+","+qp2+","+qp3+","+qp4+","+qp5+","+qp6+","+total1+","+total2+","+total3+","+total4+","+total5+","+total6+","+totalMarks+","+grade+","+percentage+","+gpa+") ";
							 
					Statement st = null;
					st = (Statement) Connect.con.createStatement();
					st.executeUpdate(query) ;
				} catch (SQLException ex) {
					System.out.println("Data Not Inserted" + ex.getMessage());
				 
				}
			}
	
	
	

}
