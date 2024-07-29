package quiz.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    
    String name;
    JButton start, back;
    
    Rules(String name){
        
        this.name= name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading= new JLabel(name+", Welcome to Mind Mania");
        heading.setBounds(50,20,700,30);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,28));
        heading.setForeground(new Color(30,144,254));
        add(heading);
        
        JLabel rules= new JLabel();
        rules.setBounds(20,90,700,350);
        rules.setFont(new Font("Tahoma",Font.PLAIN,16));
        rules.setText(
            "<html>"+ 
                "1. All questions are Mandatory." + "<br><br>" +
                "2. The quiz contains 10 questions,10 marks each." + "<br><br>" +
                "3. You will be given 15 seconds to answer each question." + "<br><br>" +
                "4. There are 4 Options for each question, if you don't select an Option in the given time limit, then you will automatically move to the next question." + "<br><br>" +
                "5. No marks for Unanswered Questions." + "<br><br>" +
                "6. You are also given a 50-50 Lifeline." + "<br><br>" +
                "7. There is no Negative Marking." + "<br><br>" +
                "8. Good Luck for the Quiz." + "<br><br>" +
            "<html>"
        );
        add(rules);
        
        back= new JButton("Back");
        back.setBounds(250,500,100,30);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start= new JButton("Start");
        start.setBounds(400,500,100,30);
        start.setBackground(new Color(30,144,254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800,650);
        setLocation(350,100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==start){
            setVisible(false);
            new Quiz(name);
        } else{
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new Rules("User");
    }
}
