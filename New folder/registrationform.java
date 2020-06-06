package keerthi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JPasswordField;

public class registrationform extends JFrame{

	private static JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registrationform window = new registrationform();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Connection con = null; 

	/**
	 * Create the application.
	 */
	public registrationform() {
		initialize();
		con = connection.connect();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 26));
		frame.setBounds(0, 0, 1900, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel regis = new JLabel("Registration form !");
		regis.setForeground(Color.BLUE);
		regis.setBackground(Color.BLUE);
		regis.setFont(new Font("Times New Roman", Font.PLAIN, 99));
		regis.setBounds(89, 63, 777, 142);
		frame.getContentPane().add(regis);
		
		JLabel lblEnterName = new JLabel("Canditate  Name:");
		lblEnterName.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		lblEnterName.setBounds(261, 262, 405, 52);
		frame.getContentPane().add(lblEnterName);
		
		textField = new JTextField();
		textField.setBounds(731, 258, 394, 44);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblHallTicketNumber = new JLabel("Hall Ticket number:");
		lblHallTicketNumber.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		lblHallTicketNumber.setBounds(262, 354, 330, 52);
		frame.getContentPane().add(lblHallTicketNumber);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		lblPassword.setBounds(261, 434, 270, 52);
		frame.getContentPane().add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(731, 349, 394, 44);
		frame.getContentPane().add(textField_1);
		
		JButton btnNewButton = new JButton("save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String query="insert into loginstudent (Hallticket, password) values (?, ?)";
					PreparedStatement pst=con.prepareStatement(query);
					pst.setString(1,textField_1.getText());
					pst.setString(2,passwordField.getText());
				    pst.executeUpdate();
		            JOptionPane.showMessageDialog(null, "Entry Saved!");
		            }
		            catch(Exception e3){
		                JOptionPane.showMessageDialog(null, e3);    
		            }

		        
			}
		});
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton.setBounds(1148, 741, 151, 52);
		frame.getContentPane().add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(731, 462, 394, 37);
		frame.getContentPane().add(passwordField);
	}

	public void setVisible(boolean b) {
		frame.setVisible(true);
		// TODO Auto-generated method stub
		
	}
}
