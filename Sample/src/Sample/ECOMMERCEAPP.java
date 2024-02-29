package Sample;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ECOMMERCEAPP {

	private JFrame frame;
	int items=0;
	int bill=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ECOMMERCEAPP window = new ECOMMERCEAPP();
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
	public ECOMMERCEAPP() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 128, 192));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ECOMMERCE APP");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(132, 29, 154, 14);
		frame.getContentPane().add(lblNewLabel);
		JLabel L1 = new JLabel("CART:0");
		L1.setBounds(358, 46, 46, 14);
		frame.getContentPane().add(L1);
		
		
		JButton b1 = new JButton("New button");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items+1;
				L1.setText("CART:"+items);
				bill=bill+500;
			}
		});
		b1.setIcon(new ImageIcon("C:\\Users\\online\\Downloads\\B.jfif"));
		b1.setBounds(71, 54, 89, 152);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("New button");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items+1;
				L1.setText("CART:"+items);
				bill=bill+400;
			}
		});
		b2.setIcon(new ImageIcon("C:\\Users\\online\\Downloads\\K.jfif"));
		b2.setBounds(213, 54, 89, 152);
		frame.getContentPane().add(b2);
		
		
		JLabel lblNewLabel_1 = new JLabel("500");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(98, 217, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("400");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(240, 217, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton buy = new JButton("buy");
		
			
		buy.setBounds(335, 221, 89, 23);
		frame.getContentPane().add(buy);
		buy.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			int res=JOptionPane.showConfirmDialog(buy,"Total items selected:"+items+"\nTotal cost:"+bill);
			if(res==JOptionPane.YES_OPTION)
			{
				JOptionPane.showMessageDialog(null,"your order will be placed shortly");
			}
			if(res==JOptionPane.NO_OPTION)
			{
				JOptionPane.showMessageDialog(null,"you have cancelled your order");
			}
		}
	});
	}

}
