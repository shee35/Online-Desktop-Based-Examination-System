import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
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
		setUndecorated(true);
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1200, 800);
		contentPane = new JPanel(){  
            public void paintComponent(Graphics g) {  
              Image img = Toolkit.getDefaultToolkit().getImage(  
                        Home.class.getResource("/Homebg.jpg"));  
                 g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this); 
             }  
    }; 
    
    JTextArea txtrreadTheQuestions = new JTextArea();
	txtrreadTheQuestions.setBackground(new Color(240, 128, 128));
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
	//Integer[] result = new Student_info().getanswers();
	
	lblNewLabel_1.setBounds(100, 33, 200, 25);
    contentPane.add(lblNewLabel_1);
    
    lblNewLabel_2.setBounds(300, 33, 250, 25);
    contentPane.add(lblNewLabel_2);
    
    lblNewLabel_3.setBounds(550, 33, 250, 25);
    contentPane.add(lblNewLabel_3);
    
    lblNewLabel_4.setBounds(850, 33, 200, 25);
    contentPane.add(lblNewLabel_4);
    
    JButton btnNewButton_1 = new JButton("Back");
	btnNewButton_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			dispose();
			Admin_info h=new Admin_info();
			h.setVisible(true);
		}
	});
	btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
	btnNewButton_1.setSize(140, 35);
	Image image3=new ImageIcon(this.getClass().getResource("/Arrows-Back-icon.png")).getImage();
	btnNewButton_1.setIcon(new ImageIcon(image3));
	btnNewButton_1.setBounds(1100, 33, 140, 35);
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
	btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 25));
	btnNewButton_2.setBounds(1100, 75, 140, 35);
	Image image2=new ImageIcon(this.getClass().getResource("/Close-icon.png")).getImage();
	btnNewButton_2.setIcon(new ImageIcon(image2));
	contentPane.add(btnNewButton_2);
    
    int x;
    JLabel[] name = new JLabel[names.size()];
    JLabel[] ids = new JLabel[names.size()];
    JLabel[] correctans = new JLabel[names.size()];
    JLabel[] res = new JLabel[names.size()];
    
    //for displaying names
    for(int i=0;i<names.size(); i++) {
    	name[i] = new JLabel(names.get(i));
    	x = (i+1)*50;
    	name[i].setBounds(100, 33+ x, 200, 25);
    	name[i].setForeground(Color.white);
    	name[i].setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
    	contentPane.add(name[i]);
    }
    
    // for displaying roll numbers
    for(int i=0;i<Id_s.size(); i++) {
    	ids[i] = new JLabel(Id_s.get(i));
    	x = (i+1)*50;
    	ids[i].setBounds(300, 33+ x, 250, 25);
    	ids[i].setForeground(Color.white);
    	ids[i].setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
    	contentPane.add(ids[i]);
    }
    
    // for displaying correct answers
    for(int i=0;i<correctans.length; i++) {
    	try {
    	correctans[i] = new JLabel(FINALRESULT.results[i].toString());}
    	catch(Exception e) {
    		correctans[i] = new JLabel(Student_info.count[i].toString());
    	}
    	x = (i+1)*50;
    	correctans[i].setBounds(550, 33+ x, 250, 25);
    	correctans[i].setForeground(Color.white);
    	correctans[i].setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
    	contentPane.add(correctans[i]);
    	
    	// for displaying final result
    	try {
    	if(FINALRESULT.results[i]>=24) {
    		res[i] = new JLabel("Pass");
        	x = (i+1)*50;
        	res[i].setBounds(850, 33+ x, 250, 25);
        	res[i].setForeground(Color.white);
        	res[i].setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
        	contentPane.add(res[i]);
    	}
    	else {
    		res[i] = new JLabel("Fail");
        	x = (i+1)*50;
        	res[i].setBounds(850, 33+ x, 250, 25);
        	res[i].setForeground(Color.white);
        	res[i].setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
        	contentPane.add(res[i]);
    	}}
    	catch(Exception e) {
    		if(Student_info.count[i]>=24) {
        		res[i] = new JLabel("Pass");
            	x = (i+1)*50;
            	res[i].setBounds(850, 33+ x, 250, 25);
            	res[i].setForeground(Color.white);
            	res[i].setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
            	contentPane.add(res[i]);
        	}
        	else {
        		res[i] = new JLabel("Fail");
            	x = (i+1)*50;
            	res[i].setBounds(850, 33+ x, 250, 25);
            	res[i].setForeground(Color.white);
            	res[i].setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
            	contentPane.add(res[i]);
        	}
    	}
    }
	}
}
