package quiz.application;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Score extends JFrame implements ActionListener{
    
    Score(String name, int score){
        setBounds(400,150,750,550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2= i1.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(0,200,300,250);
        add(image);
        
        JLabel heading= new JLabel("Thank You "+ name +" for playing Mind Mania");
        heading.setBounds(90,50,700,30);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,26));
        heading.setForeground(new Color(30,144,254));
        add(heading);
        
        JLabel lblscore= new JLabel("Your Score Is: "+score);
        lblscore.setBounds(350,200,300,30);
        lblscore.setFont(new Font("Viner Hand ITC",Font.PLAIN,26));
        add(lblscore);
        
        JButton submit=new JButton("Play Again");
        submit.setBounds(380,270,120,30);
        submit.setBackground(new Color(30,144,255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    
    public static void main(String[] args) {
        new Score("User", 0);
    }
    
}
