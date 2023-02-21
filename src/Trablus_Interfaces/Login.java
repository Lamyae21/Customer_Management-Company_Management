package Trablus_Interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	
	
	
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				
				
				try {
					Login frame = new Login();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @return 
	 */
	
	

	public void AddImage() {
	    setTitle("Add Image");

	    ImageIcon imageIcon = new ImageIcon("Images/Logo.PNG"); // Replace with your image file path
	    JLabel imageLabel = new JLabel(imageIcon);

	    getContentPane().add(imageLabel);
	    pack();
	    setLocationRelativeTo(null);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  }
	
	
	
	
	
	public Login() {
		
		
		
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 372, 405);
		contentPane = new JPanel();
		
		
		
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Label1 = new JLabel("Giris yapmak");
		Label1.setFont(new Font("Calisto MT", Font.BOLD | Font.ITALIC, 18));
		Label1.setBounds(93, 24, 233, 33);
		contentPane.add(Label1);
		
		
		//Start 
		
		JButton BtnStart = new JButton("Baslang\u0131\u00E7");
		BtnStart.setFont(new Font("Calisto MT", Font.BOLD | Font.ITALIC, 14));
		BtnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				if(textField.getText().equals("user") && textField_1.getText().equals("user")) { //user
					
					Formulaire F = new Formulaire();
					F.newScreen();
					JOptionPane.showMessageDialog(null,"Hoş geldin! ");
				}
				else {
					JOptionPane.showMessageDialog(null,"Kullanıcı adı ve şifre yanlış. ");
				}
				
				
				
				
			}
		});
		BtnStart.setForeground(SystemColor.activeCaptionText);
		BtnStart.setBackground(SystemColor.info);
		BtnStart.setBounds(111, 227, 116, 33);
		contentPane.add(BtnStart);
		
		textField = new JTextField();
		textField.setBounds(127, 98, 168, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Kullanıcı Adı");
		lblNewLabel.setFont(new Font("Calibri Light", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(10, 108, 107, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Sifre");
		lblNewLabel_1.setFont(new Font("Calibri Light", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setBounds(21, 165, 96, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(127, 155, 168, 33);
		contentPane.add(textField_1);
		
		//photo 
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Login.class.getResource("/Images/R.jpg")));
		lblNewLabel_2.setBounds(0, 0, 356, 366);
		contentPane.add(lblNewLabel_2);
		
		
	}
}
