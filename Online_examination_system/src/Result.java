import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class Result extends JFrame {
	private JPanel contentPane;
	public String str;
	public Result(int count) {
		// TODO Auto-generated constructor stub
		str=Integer.toString(count);
		
	}
	int ans;
	
	public Result() {
		setExtendedState(Frame.MAXIMIZED_BOTH);
		//setUndecorated(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1200, 800);
		contentPane = new JPanel(){  
//			                public void paintComponent(Graphics g) {  
//		                      Image img = Toolkit.getDefaultToolkit().getImage(  
//		                                Home.class.getResource("/HomeBg.jpg"));  
//			                     g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);  
//			                 }  
		            };  
		            
		        	
		    		
		    		System.out.println(ans);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(199, 50, 49, 14);
		contentPane.add(lblNewLabel);
		lblNewLabel.setText(ans+"");
		contentPane.setVisible(true);
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		contentPane.setVisible(true);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Result frame = new Result();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	
	}
}
