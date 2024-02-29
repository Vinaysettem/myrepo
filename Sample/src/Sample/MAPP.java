package Sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MAPP {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */

		public static void main(String []args){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MAPP window = new MAPP();
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
	public MAPP() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(64, 128, 128));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MOVIE APP");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(181, 11, 98, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(61, 71, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		tb1 = new JTextField();
		tb1.setBounds(160, 68, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("MOVIE NAME");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(44, 113, 70, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("NO.OF TICKETS");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(37, 151, 98, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"OG", "HI NANNA", "KALKI", "DEVARA"}));
		cb1.setBounds(160, 109, 86, 22);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4"}));
		cb2.setBounds(160, 147, 86, 22);
		frame.getContentPane().add(cb2);
		
		JButton submit = new JButton("BOOK");
		
		submit.setBounds(157, 202, 89, 23);
		frame.getContentPane().add(submit);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\online\\Desktop\\IMG.jpg"));
		lblNewLabel_4.setBounds(-16, -5, 450, 266);
		frame.getContentPane().add(lblNewLabel_4);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				if(name.equals("pooja")) {
				String mname=(String)cb1.getSelectedItem();
				String nooftickets=(String)cb2.getSelectedItem();
				int cost=Integer.valueOf(nooftickets)*200;
				int res=JOptionPane.showConfirmDialog(submit,"name:"+name+"\nmovie name:"+mname+"\ncost:"+cost);
				if(res==JOptionPane.YES_OPTION)
				{
					JOptionPane.showMessageDialog(lblNewLabel_4, "booking confirmed");
					
				}
				if(res==JOptionPane.NO_OPTION)
				{
					JOptionPane.showMessageDialog(lblNewLabel_4, "booking not confirmed");
				}
			}
			
			else {
				JOptionPane.showMessageDialog(null,"invalid user");
				
			}
				
			}
		});
	}
	}
