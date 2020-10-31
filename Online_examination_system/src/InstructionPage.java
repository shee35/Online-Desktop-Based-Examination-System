import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EmptyBorder;

public class InstructionPage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private JPanel panel1;
	private JLabel label1;
	private JLabel text1;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InstructionPage frame = new InstructionPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	InstructionPage(){
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 857, 588);
		panel1 = new JPanel();
		panel1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel1);
		
		label1 = new JLabel("Instructions");
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setFont(new Font("Times New Roman", Font.BOLD, 32));
		
		text1 = new JLabel("<html>1. Read the questions properly.<br/>2. Answer all the questions.<br/>"
			+"3. NO NEGTIVE MARKING.<br/>4. Each question is of 3 marks each."
				+"<br/>\nEach question have 4 option out of which one or more options are correct."+
				"<br/>5. Questions are organised on the basis of difficulty level with easy ones earlier and "
				+"gradually the level of question will increase."+"<br/>ALL THE BEST!!</html>");
		text1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton button1 = new JButton("Click here to begin");
		button1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		
		GroupLayout gl_contentPane = new GroupLayout(panel1);
		gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_contentPane.createSequentialGroup()
						.addContainerGap()
						.addComponent(label1, GroupLayout.PREFERRED_SIZE, 795, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
						.addGap(269)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
							.addComponent(text1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
							.addComponent(button1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGap(266))
			);
			gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_contentPane.createSequentialGroup()
						.addComponent(label1)
						.addGap(0)
						.addComponent(text1, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE)
						.addGap(0)
						.addComponent(button1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(42, Short.MAX_VALUE))
			);
			panel1.setLayout(gl_contentPane);
		
	}
}
