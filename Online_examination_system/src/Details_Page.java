import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EmptyBorder;

public class Details_Page extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Details_Page frame = new Details_Page();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Details_Page() {
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1200, 800);
		contentPane = new JPanel(){  
            public void paintComponent(Graphics g) {  
              Image img = Toolkit.getDefaultToolkit().getImage(  
                        Home.class.getResource("/studentbg.jpg"));  
                 g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);  
             }  
    }; 
    
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	getContentPane().setLayout(null);
	
	lblNewLabel_1 = new JLabel("Name");
	lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
	
	lblNewLabel_2 = new JLabel("Student ID");
	lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 25));
	
	lblNewLabel_3 = new JLabel("Questions attempted");
	lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 25));
	
	lblNewLabel_4 = new JLabel("Result");
	lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 25));
	
	ArrayList<String> names = new Student_info().gettername();
	ArrayList<String> Id_s = new Student_info().getterid();
	
	}
}
