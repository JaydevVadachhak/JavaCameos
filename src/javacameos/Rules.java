/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacameos;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author jaydev
 */
@SuppressWarnings("serial")
public class Rules extends JFrame implements ActionListener{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
    JButton b1, b2;
    
    Rules(String username){
        super("Rules - JavaCameos");
        
        l1 = new JLabel("Welcome " + username);
        l1.setFont(new Font("Viner Hand ITC", Font.BOLD, 22));
        l1.setForeground(new Color(144, 12, 63));
        l1.setBounds(145,5,450,50);
        add(l1);
        
        l2 = new JLabel("Please Read Rules Carefully!");
        l2.setFont(new Font("CALIBRI", Font.PLAIN, 16));
        l2.setBounds(150,15,500,100);
        add(l2);
        
        l3 = new JLabel("Instructions");
        l3.setFont(new Font("CALIBRI", Font.BOLD, 20));
        l3.setBounds(190,35,450,150);
        add(l3);
        
//        l4 = new JLabel();
//        l4.setFont(new Font("CALIBRI", Font.PLAIN, 16));
//        l4.setBounds(50,180,500,200);
//        l4.setText("<html>"+ 
//                "1. Total 10 questions" + "<br><br>" +
//                "2. Total 100 points possible" + "<br><br>" +
//                "3. 20 Sec Time for Each Question" + "<br><br>" +
//                "4. You will have one lifeline (50-50%)" + "<br><br>" +
//                "5. You can use lifeline only once" + "<br><br>" +
//                "6. Make sure to complete within given time (20 sec)" + "<br><br>" +
//                "7. Click submit button after completing all questions to see score" + "<br><br>" +
//                "8. All The Very Best! Do Good!" + "<br><br>" +
//            "<html>");
//        add(l4);
        
        l4 = new JLabel("20 Sec Time for Each Question");
        l4.setFont(new Font("CALIBRI", Font.PLAIN, 16));
        l4.setBounds(50,50,500,200);
        add(l4);
        
        l5 = new JLabel("You will have one lifeline (50-50%)");
        l5.setFont(new Font("CALIBRI", Font.PLAIN, 16));
        l5.setBounds(50,80,500,200);
        add(l5);
        
        l6 = new JLabel("You can use lifeline only once");
        l6.setFont(new Font("CALIBRI", Font.PLAIN, 16));
        l6.setBounds(50,110,500,200);
        add(l6);
        
        l7 = new JLabel("Total 10 questions");
        l7.setFont(new Font("CALIBRI", Font.PLAIN, 16));
        l7.setBounds(50,140,500,200);
        add(l7);
        
        l8 = new JLabel("Total 100 points possible");
        l8.setFont(new Font("CALIBRI", Font.PLAIN, 16));
        l8.setBounds(50,170,500,200);
        add(l8);
        
        l9 = new JLabel("Make sure to complete within given time (20 sec)");
        l9.setFont(new Font("CALIBRI", Font.PLAIN, 16));
        l9.setBounds(50,200,500,200);
        add(l9);
        
        l10 = new JLabel("Click submit button after completing all questions to see score");
        l10.setFont(new Font("CALIBRI", Font.PLAIN, 16));
        l10.setBounds(50,230,500,200);
        add(l10);
        
        l11 = new JLabel("All The Very Best! Do Good!");
        l11.setFont(new Font("CALIBRI", Font.PLAIN, 16));
        l11.setBounds(50,260,500,200);
        add(l11);
        
        b1 = new JButton("Start");
        b1.setFont(new Font("CALIBRI", Font.BOLD, 20));
        b1.setBounds(240,400,100,30);
        b1.setBackground(new Color(144, 12, 63));
        b1.setForeground(Color.WHITE);
        add(b1);
        b1.addActionListener(this);
        
        b2 = new JButton("Back");
        b2.setFont(new Font("CALIBRI", Font.BOLD, 20));
        b2.setBounds(120,400,100,30);
        b2.setBackground(new Color(144, 12, 63));
        b2.setForeground(Color.WHITE);
        add(b2);
        b2.addActionListener(this);
        
        getContentPane().setBackground(new Color(218, 247, 166));
        
        setBounds(300,100,500,500);
        setLayout(null);
        setSize(500,500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Rules("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){
            new QuizDashboard();
            setVisible(false);
        }else if(e.getSource() == b2){
            new JavaCameos();
            setVisible(false);
        }
    }
}
