package keerthi;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class frame {

	private JFrame frame;
	private JTextField halltext;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame window = new frame();
					window.frame.setVisible(true);
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
    
	public frame() {
		initialize();
		con = connection.connect();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 204));
		frame.setBounds(100,0, 1550, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblHallTicket = new JLabel("Hall Ticket Number :");
		lblHallTicket.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		lblHallTicket.setBounds(247, 323, 356, 93);
		frame.getContentPane().add(lblHallTicket);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		lblPassword.setBounds(247, 441, 276, 93);
		frame.getContentPane().add(lblPassword);
		
		JLabel lbllogin = new JLabel("Login Page !");
		lbllogin.setForeground(new Color(255, 51, 0));
		lbllogin.setFont(new Font("Sitka Subheading", Font.BOLD, 99));
		lbllogin.setBounds(42, 121, 646, 137);
		frame.getContentPane().add(lbllogin);
		
		halltext = new JTextField();
		halltext.setBounds(615, 342, 356, 44);
		frame.getContentPane().add(halltext);
		halltext.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(615, 460, 352, 44);
		frame.getContentPane().add(passwordField);
		
		JButton btnlogin = new JButton("Login");
		btnlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String query="select * from loginstudent where Hallticket=? and password=?";
					PreparedStatement pst=con.prepareStatement(query);
					pst.setString(1,halltext.getText());
					pst.setString(2,passwordField.getText());
					ResultSet rs =pst.executeQuery();
					int count = 0;
					while(rs.next()){
						count=count+1;
						
					}
					if(count == 1){
						frame.dispose();
						question que = new question();
						que.setVisible(true);			
						
					}
					else if(count == 0){
						
						JOptionPane.showMessageDialog(null,"halltickect and password are incorrect");
					}
					rs.close();
					pst.close();
					}catch(Exception e){
					JOptionPane.showMessageDialog(null, e);
				}
				
			}
		});
		btnlogin.setBackground(Color.GREEN);
		btnlogin.setFont(new Font("Times New Roman", Font.PLAIN, 38));
		btnlogin.setBounds(430, 765, 141, 53);
		frame.getContentPane().add(btnlogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				halltext.setText(null);
				passwordField.setText(null);
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.PLAIN, 38));
		btnReset.setBackground(Color.ORANGE);
		btnReset.setBounds(713, 765, 141, 53);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Login System",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
			    System.exit(0);
		}
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.PLAIN, 38));
		btnExit.setBackground(Color.RED);
		btnExit.setBounds(981, 765, 141, 53);
		frame.getContentPane().add(btnExit);
	}

	public void setVisible() {
		frame.setVisible(true);
		// TODO Auto-generated method stub
		
	}
}
