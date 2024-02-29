import java.awt.EventQueue;
// new change 5467
//khfghfgi
import javax.swing.JFrame;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login {

	private JFrame frame;
	private JTextField tb2;
	private JPasswordField p2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(64, 128, 128));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN PAGE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(158, 29, 160, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel tb1 = new JLabel("Username");
		tb1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tb1.setBounds(127, 98, 73, 17);
		frame.getContentPane().add(tb1);
		
		JLabel p1 = new JLabel("Password");
		p1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		p1.setBounds(127, 146, 73, 14);
		frame.getContentPane().add(p1);
		
		tb2 = new JTextField();
		tb2.setBounds(249, 95, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JButton btnNewButton = new JButton("login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user=tb2.getText();
				String password=p2.getText();
				//JOptionPane.showMessageDialog(btnNewButton, "Hello! "+user+"\n Password is:"+password);
				if(user.equals("manisha") && password.equals("1234")) {
					JOptionPane.showMessageDialog(btnNewButton, "Hello! "+user+"\nPassword is:"+password);
				}
				else {
					JOptionPane.showMessageDialog(btnNewButton, "Invalid Username or password");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(169, 197, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		p2 = new JPasswordField();
		p2.setBounds(247, 140, 89, 20);
		frame.getContentPane().add(p2);
	}
}
