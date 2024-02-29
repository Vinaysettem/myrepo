package Sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class newlogin {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					newlogin window = new newlogin();
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
	public newlogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(236, 238, 145));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN PAGE WITH DB CONNECTION");
		lblNewLabel.setBounds(72, 22, 275, 14);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("USER NAME");
		lblNewLabel_1.setBounds(60, 84, 76, 14);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PASSWORD");
		lblNewLabel_2.setBounds(60, 142, 86, 14);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		frame.getContentPane().add(lblNewLabel_2);
		
		tb1 = new JTextField();
		tb1.setBounds(232, 82, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setBounds(232, 140, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JButton submit = new JButton("LOGIN");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String password=tb2.getText();
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql:  //localhost:3306/mydb","root","mrec");
					PreparedStatement stn=con.prepareStatement("select name,password from users where name=? and password=?");
					
			        stn.setString(1, name);
					stn.setString(2, password);
					ResultSet rs=stn.executeQuery();
					if(rs.next())
					{
						JOptionPane.showMessageDialog(submit,"valid user");
						
					}
					else
					{
						JOptionPane.showMessageDialog(submit,"invalid user");
						
					}
					
				}
				
				catch(SQLException e1)
				{
					e1.printStackTrace();
				}
			}
		});
		submit.setBounds(166, 198, 89, 23);
		submit.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		frame.getContentPane().add(submit);
	}
}
