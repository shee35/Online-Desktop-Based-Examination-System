import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class Home extends JFrame {

	/**
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
		                                Home.class.getResource("/HomeBg.jpg"));  
			                     g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);  
			                 }  
		            };  
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		JButton btnNewButton_1 = new JButton("Admin");
		btnNewButton_1.setBackground(null);
		btnNewButton_1.setIcon(null);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(800, 42, 154, 58);
		Image image2=new ImageIcon(this.getClass().getResource("/Admin-icon.png")).getImage();
		btnNewButton_1.setIcon(new ImageIcon(image2));
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x=JOptionPane.showConfirmDialog(null,"Do you want to exit the Portal?","Select",JOptionPane.YES_NO_OPTION);
				if(x==0)
					System.exit(0);
			}
		});
		btnNewButton_2.setBackground(null);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.setBounds(1000, 42, 154, 58);
		Image image3=new ImageIcon(this.getClass().getResource("/Close-icon.png")).getImage();
		btnNewButton_2.setIcon(new ImageIcon(image3));
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("Student"); 
		btnNewButton.setBackground(null);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setIcon(null);
		btnNewButton.setBounds(600, 42, 154, 58);
		Image image1=new ImageIcon(this.getClass().getResource("/StudentLogin.jpg")).getImage();
		btnNewButton.setIcon(new ImageIcon(image1));
		contentPane.add(btnNewButton);
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Admin_info k = new Admin_info();
				k.setVisible(true);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Student_info s = new Student_info();
				s.setVisible(true);
			}
		});

	}
}
