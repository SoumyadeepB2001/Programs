import java.awt.event.*;
import javax.swing.*;   
class RadioButtonQuiz extends JFrame implements ActionListener {    
    JFrame f;   
    JRadioButton r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12;
    JButton b; 
    JTextField t;
    RadioButtonQuiz(){    
    f=new JFrame("Quiz"); 
    t = new JTextField(30);
    JLabel lb0=new JLabel("PLEASE ENTER YOUT NAME: ");
    JLabel lb1=new JLabel("Q1. Who was the first President of India?");
    r1=new JRadioButton("Rajendra Prasad");    
    r2=new JRadioButton("Jawaharlal Nehru"); 
    JLabel lb2=new JLabel("Q2. Who was the first Prime Minister of India?");
    r3=new JRadioButton("Rajendra Prasad");    
    r4=new JRadioButton("Jawaharlal Nehru"); 
    JLabel lb3=new JLabel("Q3. In which year did India gain its independence from the British rule?");
    r5=new JRadioButton("1950");    
    r6=new JRadioButton("1947"); 
    JLabel lb4=new JLabel("Q4. In which year did India become a republic?");
    r7=new JRadioButton("1950");    
    r8=new JRadioButton("1947");
    JLabel lb5=new JLabel("Q5. In which year did Rabindranath Tagore win the Nobel Prize in Literature?");
    r9=new JRadioButton("1913");    
    r10=new JRadioButton("1912");
    JLabel lb6=new JLabel("Q6. In which year was the Azad Hind Fauz formed?");
    r11=new JRadioButton("1942");    
    r12=new JRadioButton("1943");
    
    lb0.setBounds(75,20,1000,30); t.setBounds(300,20,250,30);
    lb1.setBounds(75,60,1000,30);
    r1.setBounds(75,90,1000,30);    
    r2.setBounds(75,120,1000,30); 

    lb2.setBounds(75,160,1000,30);
    r3.setBounds(75,190,1000,30);    
    r4.setBounds(75,220,1000,30);  

    lb3.setBounds(75,260,1000,30);
    r5.setBounds(75,290,1000,30);    
    r6.setBounds(75,320,1000,30); 

    lb4.setBounds(75,360,1000,30);
    r7.setBounds(75,390,1000,30);    
    r8.setBounds(75,420,1000,30); 
    
    lb5.setBounds(75,460,1000,30);
    r9.setBounds(75,490,1000,30);    
    r10.setBounds(75,520,1000,30); 
    
    lb6.setBounds(75,550,1000,30);
    r11.setBounds(75,580,1000,30);    
    r12.setBounds(75,610,1000,30);

    ButtonGroup bg=new ButtonGroup(); 
    ButtonGroup bg2=new ButtonGroup();   
    ButtonGroup bg3=new ButtonGroup(); 
    ButtonGroup bg4=new ButtonGroup();
    ButtonGroup bg5=new ButtonGroup();
    ButtonGroup bg6=new ButtonGroup();

    bg.add(r1);bg.add(r2); 
    bg2.add(r3);bg2.add(r4);   
    bg3.add(r5);bg3.add(r6);
    bg4.add(r7);bg4.add(r8);
    bg5.add(r9);bg5.add(r10);
    bg6.add(r11);bg6.add(r12);
    
    b=new JButton("SUBMIT");    
    b.setBounds(200,650,80,30);    
    b.addActionListener(this);
    
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.add(lb0);f.add(t);
    f.add(lb1);f.add(lb2);f.add(lb3);f.add(lb4);f.add(lb5);f.add(lb6);
    f.add(r1);f.add(r2);   
    f.add(r3);f.add(r4);   
    f.add(r5);f.add(r6);   
    f.add(r7);f.add(r8);
    f.add(r9);f.add(r10);
    f.add(r11);f.add(r12);
    f.add(b);
    f.setSize(700,750);    
    f.setLayout(null);    
    f.setVisible(true);    
}    

public void actionPerformed(ActionEvent e){    
    int c=0;
    if(r1.isSelected()){    
        c++;    
    }  
    if(r4.isSelected()){    
        c++;    
    }
    if(r6.isSelected()){    
        c++;    
    }
    if(r7.isSelected()){    
        c++;    
    }
     if(r9.isSelected()){    
        c++;    
    }
    if(r11.isSelected()){    
        c++;    
    }
    JOptionPane.showMessageDialog(this,t.getText()+", your score is "+c);
}
public static void main(String[] args) {    
    new RadioButtonQuiz();    
}    
}    