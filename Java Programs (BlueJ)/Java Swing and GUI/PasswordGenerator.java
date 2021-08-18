import java.util.*;
import java.awt.event.*;
import javax.swing.*;   
class PasswordGenerator extends JFrame implements ActionListener
{
    JFrame f=new JFrame("Password Generator");
    JButton b;
    JTextField t;
    JTextField tt;
    PasswordGenerator()
    {
        JLabel lb0=new JLabel("Enter the required length of your password:");
        JLabel lb1=new JLabel("Your new password is:");
        t = new JTextField(50);
        tt = new JTextField(50);
        tt.setEditable(false);   
        b=new JButton("SUBMIT");
        lb0.setBounds(75,50,1000,30); 
        lb1.setBounds(75,90,1000,30);
        t.setBounds(400,50,200,30);
        tt.setBounds(400,90,400,30);
        b.setBounds(350,130,80,30); 
        b.addActionListener(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(lb0);f.add(t);
        f.add(b);f.add(tt);
        f.setSize(850,300); 
        f.add(lb1);
        f.setLayout(null);    
        f.setVisible(true); 
    }
    public void actionPerformed(ActionEvent e){    
        char ch[]=new char[94];
        for(int i=33;i<=126;i++)
        ch[i-33]=(char)i;
        String pass="";
        Scanner sc=new Scanner(System.in);
        String s=t.getText();
        int n=Integer.parseInt(s);
       for(int i=0;i<n;i++)
       {
        int rnd = (int)(Math.random()*ch.length);
        pass=pass+ch[rnd];
       }
       tt.setText(pass);
    }
    
    public static void main(String args[])
    {
       new PasswordGenerator();
    }
}