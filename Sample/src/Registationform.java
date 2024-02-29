import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registationform {

	private JFrame frame;
	private JTextField tb1;
	private JPasswordField tb2;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registationform window = new Registationform();
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
	public Registationform() {
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
		
		JLabel lblNewLabel_1 = new JLabel("REGISTATION FORM");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(119, 11, 176, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(99, 65, 74, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		tb1 = new JTextField();
		tb1.setBounds(221, 62, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(99, 103, 74, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		tb2 = new JPasswordField();
		tb2.setBounds(221, 100, 86, 20);
		frame.getContentPane().add(tb2);
		
		JLabel lblNewLabel_4 = new JLabel("Branch");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(99, 137, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"select", "cse", "ece", "eee", "mech", "civil"}));
		cb1.setToolTipText("");
		cb1.setBounds(221, 131, 86, 22);
		frame.getContentPane().add(cb1);
		
		JLabel lblNewLabel_5 = new JLabel("Gender");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(99, 173, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JRadioButton r1 = new JRadioButton("Male");
		r1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		r1.setBounds(219, 169, 55, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("Female");
		r2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		r2.setBounds(278, 169, 109, 23);
		frame.getContentPane().add(r2);
		
		JLabel lblNewLabel_6 = new JLabel("City");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(99, 198, 46, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"select", "Hydrebad", "Mumbai", "Delhi", "bangalure"}));
		cb2.setBounds(221, 199, 86, 22);
		frame.getContentPane().add(cb2);
		
		JButton b1 = new JButton("Submit");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user=tb1.getText();
				String branch=(String)cb1.getSelectedItem();
				String city=(String)cb2.getSelectedItem();
				ButtonGroup rgb=new ButtonGroup();
				rgb.add(r1);
				rgb.add(r2);
				String gender=""; 
				if(rgb.isSelected(r1)) {
					gender="Male";
				}
				else {
					gender="Female";
				}
				JOptionPane.showMessageDialog(b1, "Name:"+user+"\nBranch:"+branch+"\nCity:"+city+"\nGender:"+gender);
			}
		});
		b1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		b1.setBounds(164, 232, 89, 23);
		frame.getContentPane().add(b1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\online\\Desktop\\Background.jpg"));
		lblNewLabel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel);
	}
}
