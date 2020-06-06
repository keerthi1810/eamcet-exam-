package keerthi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class enterance {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					enterance window = new enterance();
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
	public enterance() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 20, 147));
		frame.setBounds(0, 0, 1550, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Eamcet Exam!");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 99));
		lblNewLabel.setBounds(141, 116, 982, 99);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnregistration = new JButton("Register");
		btnregistration.setBackground(Color.GREEN);
		btnregistration.setForeground(Color.DARK_GRAY);
		btnregistration.setFont(new Font("Times New Roman", Font.PLAIN, 36));
		btnregistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				registrationform reg = new registrationform();
				reg.setVisible(true);
			}
		});
		btnregistration.setBounds(502, 309, 224, 56);
		frame.getContentPane().add(btnregistration);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				frame l=new frame();
				l.setVisible();
			}
		});
		btnLogin.setForeground(Color.BLACK);
		btnLogin.setFont(new Font("Times New Roman", Font.PLAIN, 36));
		btnLogin.setBackground(Color.YELLOW);
		btnLogin.setBounds(502, 400, 224, 56);
		frame.getContentPane().add(btnLogin);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnExit.setForeground(Color.BLACK);
		btnExit.setFont(new Font("Times New Roman", Font.PLAIN, 36));
		btnExit.setBackground(Color.RED);
		btnExit.setBounds(502, 490, 224, 56);
		frame.getContentPane().add(btnExit);
	}

}
