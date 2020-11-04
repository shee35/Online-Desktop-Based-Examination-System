import java.awt.*;
import java.awt.event.*;  
import javax.swing.*;
import javax.swing.border.EmptyBorder;  
 
class Test extends JFrame implements ActionListener  
{  
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JLabel l;  
    JRadioButton jb[]=new JRadioButton[5];   
    JButton b1,b2,btnNewButton_1;  
    ButtonGroup bg;  
    public int min=0;
    public int sec=0;
    public int flag=0;
    Timer time;
    int count=0,question_number=0,x=1,y=1,now=0;  
    int m[]=new int[10];   
    public Test() {
    	setLocationRelativeTo(this);
    	
    }
    public Test(String s)  
    {  
    	
    	
    	
        super(s);  
        setExtendedState(Frame.MAXIMIZED_BOTH);
        contentPane = new JPanel(){  
//            public void paintComponent(Graphics g) {  
//              Image img = Toolkit.getDefaultToolkit().getImage(  
//                        Home.class.getResource("/HomeBg.jpg"));  
//                 g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);  
//             } 
        };
        // CODE FOR TIMER STARTS
        	JLabel lblNewLabel = new JLabel("Total Time:");
            lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
            lblNewLabel.setBounds(950, 33, 105, 25);
            contentPane.add(lblNewLabel);
            
            JLabel lblNewLabel_1 = new JLabel("10 Min");
            lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
            lblNewLabel_1.setBounds(1097, 33, 63, 25);
            contentPane.add(lblNewLabel_1);
            
            JLabel lblNewLabel_2 = new JLabel("Time Taken:");
            lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
            lblNewLabel_2.setBounds(950, 71, 105, 14);
            contentPane.add(lblNewLabel_2);
            
            JLabel lblNewLabel_3 = new JLabel("0");
            lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
            lblNewLabel_3.setBounds(1097, 71, 26, 14);
            contentPane.add(lblNewLabel_3);
            
            JLabel lblNewLabel_4 = new JLabel("0");
            lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
            lblNewLabel_4.setBounds(1133, 71, 27, 14);
            contentPane.add(lblNewLabel_4);
            
        	time = new Timer(1000, new ActionListener() {

    			@Override
    			public void actionPerformed(ActionEvent e) {
    				// TODO Auto-generated method stub
    				lblNewLabel_4.setText(String.valueOf(sec));
    				lblNewLabel_3.setText(String.valueOf(min));
    				if(sec==60) {
    					sec=0;
    					min++;
    					if(min==10) {
    						time.stop();
    						b1.setEnabled(false);  
    		                b2.setText("Result"); 
    		                JOptionPane.showMessageDialog(contentPane,"Time is over. Click on result button to view the result");
    		                flag=1;
    					}
    				}
    				sec++;
    			}
        		
        	});
        	time.start();
        	//CODE FOR TIMER ENDS
    
    setContentPane(contentPane);
    getContentPane().setLayout(null);
    setBounds(100,100,1500,1000);
    contentPane.setBackground(Color.WHITE);
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));



        l=new JLabel();  
        getContentPane().add(l); 
       //l.setSize(300,300);
        bg=new ButtonGroup();  
        for(int i=0;i<5;i++)  
        {  
            jb[i]=new JRadioButton();     
            getContentPane().add(jb[i]);  
            bg.add(jb[i]);  
        }  
        b1=new JButton("Next");  
        b1.setFont(new Font("Times New Roman", Font.BOLD, 15));
        b2=new JButton("Bookmark");  
        b2.setFont(new Font("Times New Roman", Font.BOLD, 15));
        Image image3=new ImageIcon(this.getClass().getResource("/Next-icon.png")).getImage();
		b1.setIcon(new ImageIcon(image3));
		Image image4=new ImageIcon(this.getClass().getResource("/Bookmark-icon.png")).getImage();
		b2.setIcon(new ImageIcon(image4));
        
        b1.addActionListener(this);  
        b2.addActionListener(this); 
        
     /*   btnNewButton_1.setBackground(null);
		btnNewButton_1.setIcon(null);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(800, 42, 154, 58);
		Image image2=new ImageIcon(this.getClass().getResource("/Admin-icon.png")).getImage();
		btnNewButton_1.setIcon(new ImageIcon(image2));
		add(btnNewButton_1);
		btnNewButton_2.setBackground(null);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.setBounds(1000, 42, 154, 58);
		Image image3=new ImageIcon(this.getClass().getResource("/Close-icon.png")).getImage();
		btnNewButton_2.setIcon(new ImageIcon(image3));
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton = new JButton(""); 
		btnNewButton.setBackground(null);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setIcon(null);
		btnNewButton.setBounds(600, 42, 154, 58);
		Image image1=new ImageIcon(this.getClass().getResource("/StudentLogin.jpg")).getImage();
		btnNewButton.setIcon(new ImageIcon(image1));
		contentPane.add(btnNewButton);
	*/	
        
        getContentPane().add(b1);getContentPane().add(b2);  
        questionset();  
        l.setBounds(30,50,910,25);  
        l.setForeground(Color.black);
        jb[0].setBounds(55,120,100,20);  
        jb[1].setBounds(55,170,100,20);  
        jb[2].setBounds(55,220,100,20);  
        jb[3].setBounds(55,270,100,20);  
        Font font = new Font("Verdana",Font.BOLD, 20);
        l.setFont(font);
        getContentPane().setLayout(null);
        //l.setPreferredSize(new Dimension(450,700));
        
        b1.setBounds(341,425,150,41);  
        b2.setBounds(94,425,150,41);
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        getContentPane().setLayout(null);
        
        
        
        //setLocation(250,100);  
        setVisible(true);  
        //setSize(1154,734);  
    }  
    public void actionPerformed(ActionEvent e)  
    {  
        if(e.getSource()==b1)  
        {  
            if(check())  
                count=count+1;  
            question_number++;  
            questionset();    
            if(question_number==9)  
            {  
                b1.setEnabled(false);  
                b2.setText("Result");  
            }  
        }  
        if(e.getActionCommand().equals("Bookmark"))  
        {  
            JButton bk=new JButton("Bookmark"+x);  
            bk.setBounds(800,20+30*x,100,30);  
            getContentPane().add(bk);  
            bk.addActionListener(this);  
            m[x]=question_number;  
            x++;  
            question_number++;  
            questionset();    
            if(question_number==9)  
                b2.setText("Result");  
            setVisible(false);  
            setVisible(true);  
        }  
        for(int i=0,y=1;i<x;i++,y++)  
        {  
        if(e.getActionCommand().equals("Bookmark"+y))  
        {  
        	if(flag==1) {
        		JOptionPane.showMessageDialog(contentPane,"Time is over. Click on result button to view the result");
        		((JButton)e.getSource()).setEnabled(false);
        	}
        	else {
            if(check())  
                count=count+1;  
            now=question_number;  
            question_number=m[y];  
            questionset();  
            ((JButton)e.getSource()).setEnabled(false);  
            question_number=now;  
        }  
        }  }
      
        if(e.getActionCommand().equals("Result"))  
        {  
        	if(check())  
                count=count+1;  
            question_number++;  
            time.stop();
			Result r=new Result(count);
			r.setBounds(100,100,1200,800);
			r.setExtendedState(Frame.MAXIMIZED_BOTH);
			r.setVisible(true);
			dispose();
            //new Result(s).setVisible(true);
            //JOptionPane.showMessageDialog(this,"correct ans="+count);  
        }  
        
    }  
    void questionset()  
    {
    	l.setBounds(30,50,910,25);  
        l.setForeground(Color.black);
        jb[0].setBounds(55,120,100,20);  
        jb[1].setBounds(55,170,100,20);  
        jb[2].setBounds(55,220,100,20);  
        jb[3].setBounds(55,270,100,20);
        jb[4].setSelected(true);  
        if(question_number==0)  
        {  
        	
            l.setText("Que1: Which of the following is not a keyword in java?");  
            jb[0].setText("private");jb[1].setText("Boolean");jb[2].setText("static");jb[3].setText("void"); 
            l.setBounds(30,50,910,25);  
            l.setForeground(Color.black);
            jb[0].setBounds(55,120,100,20);  
            jb[1].setBounds(55,170,100,20);  
            jb[2].setBounds(55,220,100,20);  
            jb[3].setBounds(55,270,100,20);
        }  
        if(question_number==1)  
        {  
        	
            l.setText("Que2: What is the size of boolean variable?");  
            jb[0].setText("8 bit");jb[1].setText("32 bit");jb[2].setText("16 bit");jb[3].setText("None of the above");
            l.setBounds(30,50,910,25);  
            l.setForeground(Color.black);
            jb[0].setBounds(55,120,100,20);  
            jb[1].setBounds(55,170,100,20);  
            jb[2].setBounds(55,220,100,20);  
            jb[3].setBounds(55,270,100,20);
        }  
        if(question_number==2)  
        {  
        	l.setBounds(30,50,910,25);  
            l.setForeground(Color.black);
            jb[0].setBounds(55,120,100,20);  
            jb[1].setBounds(55,170,100,20);  
            jb[2].setBounds(55,220,100,20);  
            jb[3].setBounds(55,270,100,20);
            l.setText("Que3: What is the default value of byte variable?");  
            jb[0].setText("0.0");jb[1].setText("null");jb[2].setText("undefined");jb[3].setText("0"); 
        }  
        if(question_number==3)  
        {  
            l.setText("Que4: String class is defined in which package?");  
            jb[0].setText("lang");jb[1].setText("Swing");jb[2].setText("Applet");jb[3].setText("awt");  
            l.setBounds(30,50,910,25);  
            l.setForeground(Color.black);
            jb[0].setBounds(55,120,100,20);  
            jb[1].setBounds(55,170,100,20);  
            jb[2].setBounds(55,220,100,20);  
            jb[3].setBounds(55,270,100,20);
        }  
        if(question_number==4)  
        {  
            l.setText("Que5: Which method must be implemented by all threads?");  
            jb[0].setText("start()");jb[1].setText("stop()");jb[2].setText("run()");jb[3].setText("wait()");
            l.setBounds(30,50,910,25);  
            l.setForeground(Color.black);
            jb[0].setBounds(55,120,100,20);  
            jb[1].setBounds(55,170,100,20);  
            jb[2].setBounds(55,220,100,20);  
            jb[3].setBounds(55,270,100,20);
        }  
        if(question_number==5)  
        {  
            l.setText("Que6: java.util.Collections is a:");  
            jb[0].setText("object");jb[1].setText("interface");jb[2].setText("class");jb[3].setText("none of the above");
            l.setBounds(30,50,910,25);  
            l.setForeground(Color.black);
            jb[0].setBounds(55,120,100,20);  
            jb[1].setBounds(55,170,100,20);  
            jb[2].setBounds(55,220,100,20);  
            jb[3].setBounds(55,270,100,20);
        }  
        if(question_number==6)  
        {  
            l.setText("Que7: Which one among these is not a class? ");  
            jb[0].setText("Swing");jb[1].setText("Actionperformed");jb[2].setText("ActionEvent");  
                        jb[3].setText("Button");  
                        l.setBounds(30,50,910,25);  
                        l.setForeground(Color.black);
                        jb[0].setBounds(55,120,100,20);  
                        jb[1].setBounds(55,170,100,20);  
                        jb[2].setBounds(55,220,100,20);  
                        jb[3].setBounds(55,270,100,20);
        }  
        if(question_number==7)  
        {  
            l.setText("Que8: Which one among these is not a function of Object class?");  
            jb[0].setText("toString");jb[1].setText("finalize");jb[2].setText("equals");  
                        jb[3].setText("getDocumentBase"); 
                        l.setBounds(30,50,910,25);  
                        l.setForeground(Color.black);
                        jb[0].setBounds(55,120,100,20);  
                        jb[1].setBounds(55,170,100,20);  
                        jb[2].setBounds(55,220,100,20);  
                        jb[3].setBounds(55,270,100,20);
        }  
        if(question_number==8)  
        {  
            l.setText("Que9: Which function is not present in Applet class?");  
            jb[0].setText("init");jb[1].setText("main");jb[2].setText("start");jb[3].setText("destroy");  
            l.setBounds(30,50,910,25);  
            l.setForeground(Color.black);
            jb[0].setBounds(55,120,100,20);  
            jb[1].setBounds(55,170,100,20);  
            jb[2].setBounds(55,220,100,20);  
            jb[3].setBounds(55,270,100,20);
        }  
        if(question_number==9)  
        {  
            l.setText("Que10: Which one among these is not a valid component?");  
            jb[0].setText("JButton");jb[1].setText("JList");jb[2].setText("JButtonGroup");  
                        jb[3].setText("JTextArea");  
                        l.setBounds(30,50,910,25);  
                        l.setForeground(Color.black);
                        jb[0].setBounds(55,120,100,20);  
                        jb[1].setBounds(55,170,100,20);  
                        jb[2].setBounds(55,220,100,20);  
                        jb[3].setBounds(55,270,100,20);
        }  
        
        for(int i=0,j=0;i<=90;i+=30,j++)  
            jb[j].setBounds(50,80+i,200,20);  
    }  
    boolean check()  
    {  
        if(question_number==0)  
            return(jb[1].isSelected());  
        if(question_number==1)  
            return(jb[2].isSelected());  
        if(question_number==2)  
            return(jb[3].isSelected());  
        if(question_number==3)  
            return(jb[0].isSelected());  
        if(question_number==4)  
            return(jb[2].isSelected());  
        if(question_number==5)  
            return(jb[2].isSelected());  
        if(question_number==6)  
            return(jb[1].isSelected());  
        if(question_number==7)  
            return(jb[3].isSelected());  
        if(question_number==8)  
            return(jb[1].isSelected());  
        if(question_number==9)  
            return(jb[2].isSelected());  
        return false;  
    }  
    public static void main(String s[])  
    {  
        new Test("ONLINE DESKTOP PORTAL");  
    }  
}