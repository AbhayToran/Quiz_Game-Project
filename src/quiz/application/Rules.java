
package quiz.application;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Rules extends JFrame implements ActionListener{
    String name;
    
    JButton back,start;
    int count;
    Rules(String name,int count){
        this.count=count;
        this.name=name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setTitle("Rules");
        
        JLabel heading  = new JLabel("Welcome "+name+" to Simple Minds");
        heading.setBounds(50,20,700,30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(30,144,254));
        add(heading);
        
        JLabel rules  = new JLabel();
        rules.setBounds(20,90,700,350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
           "<html>"+
                   "<b>"+"1. Number of Questions"+"</b>"+"<br><br>"+
                   "&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;"+"->The quiz contains fixed number of questions i.e 10"+"<br><br>"+
                   "<b>"+"2. Time Limit"+"</b>"+"<br><br>"+
                   "&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;"+"->You have 15 seconds to answer each question."+"<br><br>"+
                   "<b>"+"3. 50-50 Lifeline"+"</b>"+"<br><br>"+
                   "&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;"+"->Two incorrect options will be removed, leaving one correct and one incorrect choice."+"<br><br>"+
                   "<b>"+"4. 10 points per Question"+"</b>"+"<br><br>"+
                   
                   "<b>"+"5. No Negative Marking"+"</b>"+"<br><br>"+
                   
            "<html>"       
        );
        add(rules);
        
        
        back = new JButton("Back");
        back.setBounds(250,500,100,30);
        back.setBackground(new Color(30,30,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400,500,100,30);
        start.setBackground(new Color(30,144,254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800,650);
        setLocation(100,25);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== start){
            
            setVisible(false);
            new Quiz(name,count);
        }else{
            setVisible(false);
            new Login(0);
        }
    }
    public static void main(String args[]){
        new Rules("User",0);
    }
}
