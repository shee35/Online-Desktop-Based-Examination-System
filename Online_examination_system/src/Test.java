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
    
    int count=0,question_number=0,x=1,y=1,now=0;  
    int m[]=new int[10];   
    
    public Test(String s)  
    {  
    	
    	
    	
        super(s);  
        setExtendedState(Frame.MAXIMIZED_BOTH);
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
        l=new JLabel();  
        getContentPane().add(l); 
       // l.setSize(300,300);
        bg=new ButtonGroup();  
        for(int i=0;i<5;i++)  
        {  
            jb[i]=new JRadioButton();     
            getContentPane().add(jb[i]);  
            bg.add(jb[i]);  
        }  
        b1=new JButton("Bookmark");  
        b1.setFont(new Font("Times New Roman", Font.BOLD, 15));
        b2=new JButton("Next");  
        b2.setFont(new Font("Times New Roman", Font.BOLD, 14));
        Image image3=new ImageIcon(this.getClass().getResource("/Next-icon.png")).getImage();
		b2.setIcon(new ImageIcon(image3));
		Image image4=new ImageIcon(this.getClass().getResource("/Bookmark-icon.png")).getImage();
		b1.setIcon(new ImageIcon(image4));
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
        l.setBounds(30,40,450,20);  
        jb[0].setBounds(50,80,100,20);  
        jb[1].setBounds(50,110,100,20);  
        jb[2].setBounds(50,140,100,20);  
        jb[3].setBounds(50,170,100,20);  
        
        
        b1.setBounds(69,240,150,41);  
        b2.setBounds(270,240,150,41);
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        getContentPane().setLayout(null);  
        setLocation(250,100);  
        setVisible(true);  
        setSize(600,350);  
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
            bk.setBounds(480,20+30*x,100,30);  
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
            if(check())  
                count=count+1;  
            now=question_number;  
            question_number=m[y];  
            questionset();  
            ((JButton)e.getSource()).setEnabled(false);  
            question_number=now;  
        }  
        }  
      
        if(e.getActionCommand().equals("Result"))  
        {  
            if(check())  
                count=count+1;  
            question_number++;  
           
            JOptionPane.showMessageDialog(this,"correct ans="+count);  
            System.exit(0);  
        }  
    }  
    void questionset()  
    {  
        jb[4].setSelected(true);  
        if(question_number==0)  
        {  
            l.setText("Que1: Which one among these is not a primitive datatype?");  
            //l.setSize(300,300);
            jb[0].setText("int");jb[1].setText("Float");jb[2].setText("boolean");jb[3].setText("char");   
        }  
        if(question_number==1)  
        {  
            l.setText("Que2: Which class is available to all the class automatically?");  
            jb[0].setText("Swing");jb[1].setText("Applet");jb[2].setText("Object");jb[3].setText("ActionEvent");  
        }  
        if(question_number==2)  
        {  
            l.setText("Que3: Which package is directly available to our class without importing it?");  
            jb[0].setText("swing");jb[1].setText("applet");jb[2].setText("net");jb[3].setText("lang");  
        }  
        if(question_number==3)  
        {  
            l.setText("Que4: String class is defined in which package?");  
            jb[0].setText("lang");jb[1].setText("Swing");jb[2].setText("Applet");jb[3].setText("awt");  
        }  
        if(question_number==4)  
        {  
            l.setText("Que5: Which institute is best for java coaching?");  
            jb[0].setText("Utek");jb[1].setText("Aptech");jb[2].setText("SSS IT");jb[3].setText("jtek");  
        }  
        if(question_number==5)  
        {  
            l.setText("Que6: Which one among these is not a keyword?");  
            jb[0].setText("class");jb[1].setText("int");jb[2].setText("get");jb[3].setText("if");  
        }  
        if(question_number==6)  
        {  
            l.setText("Que7: Which one among these is not a class? ");  
            jb[0].setText("Swing");jb[1].setText("Actionperformed");jb[2].setText("ActionEvent");  
                        jb[3].setText("Button");  
        }  
        if(question_number==7)  
        {  
            l.setText("Que8: which one among these is not a function of Object class?");  
            jb[0].setText("toString");jb[1].setText("finalize");jb[2].setText("equals");  
                        jb[3].setText("getDocumentBase");         
        }  
        if(question_number==8)  
        {  
            l.setText("Que9: which function is not present in Applet class?");  
            jb[0].setText("init");jb[1].setText("main");jb[2].setText("start");jb[3].setText("destroy");  
        }  
        if(question_number==9)  
        {  
            l.setText("Que10: Which one among these is not a valid component?");  
            jb[0].setText("JButton");jb[1].setText("JList");jb[2].setText("JButtonGroup");  
                        jb[3].setText("JTextArea");  
        }  
        l.setBounds(30,40,450,20);  
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