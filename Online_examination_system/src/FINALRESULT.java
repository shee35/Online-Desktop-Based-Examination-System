import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EmptyBorder;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FINALRESULT extends JFrame {

	/**
	 * 
	 */
	
    int ans;
    static Integer[] results= new Integer[4];
	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					
					FINALRESULT frame = new FINALRESULT();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		
	}
	
	FINALRESULT( ){
		
	
		
		
		setUndecorated(true);
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setFont(new Font("Tahoma", Font.BOLD, 40));
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100,100,1500,1000);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" FINAL RESULT");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(10, 11, 713, 70);
		getContentPane().add(lblNewLabel);
		Image image2=new ImageIcon(this.getClass().getResource("/instructions.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(image2));
		
		JTextArea result_frame = new JTextArea();
		result_frame.setBackground(new Color(162, 236, 190));
		result_frame.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		
		int ans = Student_info.count[Student_info.find];
		if(ans>=24) {
		result_frame.setText("\r\n CONGRATULATIONS!! YOU HAVE PASSED THE EXAM WITH MARKS:\r\n");
		}
		else
		{
			result_frame.setText("\r\n SORRY!! YOU HAVE FAILED THE EXAM WITH MARKS:\r\n");	
		}
		result_frame.append("  "+ans +" ");
		
		for(int i=0;i<4;i++) {
			results[i]= Student_info.count[i];
		}
		result_frame.setCaretColor(result_frame.getBackground());
		result_frame.getCaret().setVisible(false);
		//txtrreadTheQuestions.setText("\r\n ALL THE BEST\n\r");
		
		result_frame.setBounds(10, 128, 713, 210);
		getContentPane().add(result_frame);
		
		
		
		JButton btnNewButton_1 = new JButton("Exit the Portal");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(10, 467, 260, 39);
		getContentPane().add(btnNewButton_1);
		
	}

	/*public static int display(int count) {
		return ans = count;
		
	}*/
}
