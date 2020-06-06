package keerthi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JRadioButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

import javax.swing.JScrollPane;
import javax.swing.JScrollBar;

import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;
import java.awt.ScrollPane;
import java.awt.Point;

import javax.swing.JSplitPane;

public class question extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					question frame = new question();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public question() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1450, 1195);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 255, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Eamcet Exam !");
		lblNewLabel.setForeground(new Color(0, 0, 139));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 99));
		lblNewLabel.setBounds(48, 24, 870, 110);
		contentPane.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(SystemColor.menu);
		panel_1.setBounds(34, 161, 1292, 98);
		contentPane.add(panel_1);
		
		JLabel label = new JLabel("1)   Which allows you to define one interface and have multiple implementations?");
		label.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		label.setBounds(12, 0, 1288, 54);
		panel_1.add(label);
		
		JRadioButton radioButton = new JRadioButton("Encapsulation");
		radioButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		radioButton.setBounds(90, 63, 188, 25);
		panel_1.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Inheritance");
		radioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		radioButton_1.setBounds(321, 63, 188, 25);
		panel_1.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("Polymorphism");
		radioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		radioButton_2.setBounds(565, 63, 188, 25);
		panel_1.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("None of the above");
		radioButton_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		radioButton_3.setBounds(789, 63, 188, 25);
		panel_1.add(radioButton_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(SystemColor.menu);
		panel_2.setBounds(34, 262, 1292, 98);
		contentPane.add(panel_2);
		
		JLabel label_1 = new JLabel("2)   Which data type has this Minimum and Maximum value from 3.4e-038 to 3.4e+038?");
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		label_1.setBounds(24, 0, 1288, 54);
		panel_2.add(label_1);
		
		JRadioButton j5 = new JRadioButton("int");
		j5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		j5.setBounds(87, 63, 188, 25);
		panel_2.add(j5);
		
		JRadioButton radioButton_5 = new JRadioButton("float");
		radioButton_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		radioButton_5.setBounds(334, 63, 188, 25);
		panel_2.add(radioButton_5);
		
		JRadioButton radioButton_6 = new JRadioButton("char");
		radioButton_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		radioButton_6.setBounds(565, 63, 188, 25);
		panel_2.add(radioButton_6);
		
		JRadioButton radioButton_7 = new JRadioButton("double");
		radioButton_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		radioButton_7.setBounds(789, 63, 188, 25);
		panel_2.add(radioButton_7);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(SystemColor.menu);
		panel_3.setBounds(34, 362, 1292, 98);
		contentPane.add(panel_3);
		
		JLabel label_2 = new JLabel("3)   Which is a non-static method having the same name as its class?");

		label_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		label_2.setBounds(24, 0, 1288, 54);
		panel_3.add(label_2);
		
		JRadioButton radioButton_8 = new JRadioButton("Field");
		radioButton_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		radioButton_8.setBounds(90, 63, 188, 25);
		panel_3.add(radioButton_8);
		
		JRadioButton radioButton_9 = new JRadioButton("Method");
		radioButton_9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		radioButton_9.setBounds(334, 63, 188, 25);
		panel_3.add(radioButton_9);
		
		JRadioButton radioButton_10 = new JRadioButton("Constructor");
		radioButton_10.setFont(new Font("Tahoma", Font.PLAIN, 18));
		radioButton_10.setBounds(565, 63, 188, 25);
		panel_3.add(radioButton_10);
		
		JRadioButton radioButton_11 = new JRadioButton("None of the above");
		radioButton_11.setFont(new Font("Tahoma", Font.PLAIN, 18));
		radioButton_11.setBounds(789, 63, 188, 25);
		panel_3.add(radioButton_11);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(SystemColor.menu);
		panel_4.setBounds(34, 464, 1292, 98);
		contentPane.add(panel_4);
		
		JLabel label_3 = new JLabel("4)   If a class has multiple methods by same name but different parameters, it is known as?");
		label_3.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		label_3.setBounds(24, 0, 1288, 54);
		panel_4.add(label_3);
		
		JRadioButton radioButton_12 = new JRadioButton("Constructor overloading");
		radioButton_12.setFont(new Font("Tahoma", Font.PLAIN, 18));
		radioButton_12.setBounds(90, 63, 188, 25);
		panel_4.add(radioButton_12);
		
		JRadioButton radioButton_13 = new JRadioButton("Method overloading");
		radioButton_13.setFont(new Font("Tahoma", Font.PLAIN, 18));
		radioButton_13.setBounds(334, 63, 188, 25);
		panel_4.add(radioButton_13);
		
		JRadioButton radioButton_14 = new JRadioButton("Operator overloading");
		radioButton_14.setFont(new Font("Tahoma", Font.PLAIN, 18));
		radioButton_14.setBounds(565, 63, 188, 25);
		panel_4.add(radioButton_14);
		
		JRadioButton radioButton_15 = new JRadioButton("None of the above");
		radioButton_15.setFont(new Font("Tahoma", Font.PLAIN, 18));
		radioButton_15.setBounds(789, 63, 188, 25);
		panel_4.add(radioButton_15);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBackground(SystemColor.menu);
		panel_5.setBounds(34, 564, 1292, 98);
		contentPane.add(panel_5);
		
		JLabel label_4 = new JLabel("5)   Which of the following JDBC drivers is known as a partially java driver?");
		label_4.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		label_4.setBounds(24, 0, 1288, 54);
		panel_5.add(label_4);
		
		JRadioButton radioButton_16 = new JRadioButton("JDBC-ODBC bridge driver");
		radioButton_16.setFont(new Font("Tahoma", Font.PLAIN, 18));
		radioButton_16.setBounds(90, 63, 188, 25);
		panel_5.add(radioButton_16);
		
		JRadioButton radioButton_17 = new JRadioButton("Native-API driver");
		radioButton_17.setFont(new Font("Tahoma", Font.PLAIN, 18));
		radioButton_17.setBounds(334, 63, 188, 25);
		panel_5.add(radioButton_17);
		
		JRadioButton radioButton_18 = new JRadioButton("Network Protocol driver");
		radioButton_18.setFont(new Font("Tahoma", Font.PLAIN, 18));
		radioButton_18.setBounds(565, 63, 188, 25);
		panel_5.add(radioButton_18);
		
		JRadioButton radioButton_19 = new JRadioButton("Thin driver");
		radioButton_19.setFont(new Font("Tahoma", Font.PLAIN, 18));
		radioButton_19.setBounds(789, 63, 188, 25);
		panel_5.add(radioButton_19);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBackground(SystemColor.menu);
		panel_6.setBounds(34, 664, 1292, 98);
		contentPane.add(panel_6);
		
		JLabel label_5 = new JLabel("6)   Which are the examples of Application Server?");
		label_5.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		label_5.setBounds(12, 0, 1288, 54);
		panel_6.add(label_5);
		
		JRadioButton radioButton_20 = new JRadioButton(" Apache");
		radioButton_20.setFont(new Font("Tahoma", Font.PLAIN, 18));
		radioButton_20.setBounds(90, 63, 188, 25);
		panel_6.add(radioButton_20);
		
		JRadioButton radioButton_21 = new JRadioButton("Tomcat");
		radioButton_21.setFont(new Font("Tahoma", Font.PLAIN, 18));
		radioButton_21.setBounds(336, 63, 188, 25);
		panel_6.add(radioButton_21);
		
		JRadioButton radioButton_22 = new JRadioButton("JBoss");
		radioButton_22.setFont(new Font("Tahoma", Font.PLAIN, 18));
		radioButton_22.setBounds(562, 63, 188, 25);
		panel_6.add(radioButton_22);
		
		JRadioButton radioButton_23 = new JRadioButton("Weblogic");
		radioButton_23.setFont(new Font("Tahoma", Font.PLAIN, 18));
		radioButton_23.setBounds(789, 63, 188, 25);
		panel_6.add(radioButton_23);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBackground(SystemColor.menu);
		panel_7.setBounds(34, 765, 1292, 98);
		contentPane.add(panel_7);
		
		JLabel label_6 = new JLabel("7)   Hibernate is an?");
		label_6.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		label_6.setBounds(22, 0, 1288, 54);
		panel_7.add(label_6);
		
		JRadioButton radioButton_24 = new JRadioButton(" Open Source");
		radioButton_24.setFont(new Font("Tahoma", Font.PLAIN, 18));
		radioButton_24.setBounds(90, 63, 188, 25);
		panel_7.add(radioButton_24);
		
		JRadioButton radioButton_25 = new JRadioButton("Lightweight");
		radioButton_25.setFont(new Font("Tahoma", Font.PLAIN, 18));
		radioButton_25.setBounds(334, 63, 188, 25);
		panel_7.add(radioButton_25);
		
		JRadioButton radioButton_26 = new JRadioButton("ORM");
		radioButton_26.setFont(new Font("Tahoma", Font.PLAIN, 18));
		radioButton_26.setBounds(565, 63, 188, 25);
		panel_7.add(radioButton_26);
		
		JRadioButton radioButton_27 = new JRadioButton("all mentioned above");
		radioButton_27.setFont(new Font("Tahoma", Font.PLAIN, 18));
		radioButton_27.setBounds(789, 63, 188, 25);
		panel_7.add(radioButton_27);
		
		JButton btnNewButton = new JButton("Finish exam -->");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				thank th = new thank();
				th.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton.setBounds(1170, 962, 195, 35);
		contentPane.add(btnNewButton);
		
		
		}
}