import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.border.EmptyBorder;

import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.AbstractButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;

public class Home extends JFrame {

	/**
	 *     
	 *     
	 *     
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1200, 800);
		contentPane = new JPanel(){  
			                public void paintComponent(Graphics g) {  
		                      Image img = Toolkit.getDefaultToolkit().getImage(  
		                                Home.class.getResource("HomeBg.jpg"));  
			                     g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);  
			                 }  
		            };  
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		JButton btnNewButton_1 = new JButton("Admin");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setIcon(null);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(800, 42, 154, 58);
		Image image2=new ImageIcon(this.getClass().getResource("Admin-icon.png")).getImage();
		btnNewButton_1.setIcon(new ImageIcon(image2));
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x=JOptionPane.showConfirmDialog(null,"Do you want to exist the Portal","Select",JOptionPane.YES_NO_OPTION);
				if(x==0)
					System.exit(0);
			}
		});
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.setBounds(1000, 42, 154, 58);
		Image image3=new ImageIcon(this.getClass().getResource("Close-icon.png")).getImage();
		btnNewButton_2.setIcon(new ImageIcon(image3));
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("Student"); 
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setIcon(null);
		btnNewButton.setBounds(600, 42, 154, 58);
		Image image1=new ImageIcon(this.getClass().getResource("StudentLogin.jpg")).getImage();
		btnNewButton.setIcon(new ImageIcon(image1));
		contentPane.add(btnNewButton);
		
//		JLabel lblNewLabel = new JLabel("Online Examination System");
//		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 34));
//		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
//		
//		JButton btnNewButton = new JButton("ADMIN");
//		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 27));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Admin_info k = new Admin_info();
				k.setVisible(true);
			}
		});
//		
//		JButton btnNewButton_1 = new JButton("STUDENT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Student_info s = new Student_info();
				s.setVisible(true);
			}
		});
//		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 27));
//		GroupLayout gl_contentPane = new GroupLayout(contentPane);
//		gl_contentPane.setHorizontalGroup(
//			gl_contentPane.createParallelGroup(Alignment.TRAILING)
//				.addGroup(gl_contentPane.createSequentialGroup()
//					.addContainerGap()
//					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 795, GroupLayout.PREFERRED_SIZE)
//					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//				.addGroup(gl_contentPane.createSequentialGroup()
//					.addGap(269)
//					.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
//					.addGap(266))
//				.addGroup(gl_contentPane.createSequentialGroup()
//					.addGap(282)
//					.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
//					.addGap(267))
//		);
//		gl_contentPane.setVerticalGroup(
//			gl_contentPane.createParallelGroup(Alignment.LEADING)
//				.addGroup(gl_contentPane.createSequentialGroup()
//					.addComponent(lblNewLabel)
//					.addGap(112)
//					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
//					.addGap(73)
//					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
//					.addContainerGap(142, Short.MAX_VALUE))
//		);
//		contentPane.setLayout(gl_contentPane);
//		
//		
//		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 27));
//		GroupLayout gl_contentPane2 = new GroupLayout(contentPane);
//		gl_contentPane2.setHorizontalGroup(
//			gl_contentPane2.createParallelGroup(Alignment.LEADING)
//				.addGroup(gl_contentPane2.createSequentialGroup()
//					.addContainerGap()
//					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 795, GroupLayout.PREFERRED_SIZE)
//					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//				.addGroup(Alignment.TRAILING, gl_contentPane2.createSequentialGroup()
//					.addGap(269)
//					.addGroup(gl_contentPane2.createParallelGroup(Alignment.TRAILING)
//						.addComponent(btnNewButton_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
//						.addComponent(btnNewButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//					.addGap(266))
//		);
//		gl_contentPane2.setVerticalGroup(
//			gl_contentPane2.createParallelGroup(Alignment.LEADING)
//				.addGroup(gl_contentPane2.createSequentialGroup()
//					.addComponent(lblNewLabel)
//					.addGap(109)
//					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
//					.addGap(76)
//					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
//					.addContainerGap(142, Short.MAX_VALUE))
//		);
//		contentPane.setLayout(gl_contentPane2);
	}
}
