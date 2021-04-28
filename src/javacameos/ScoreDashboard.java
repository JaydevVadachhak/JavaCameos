/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacameos;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author jaydev
 */
@SuppressWarnings("serial")
public class ScoreDashboard extends JFrame implements ActionListener{
    
    JButton playAgain;
    
    public ScoreDashboard(int score) throws HeadlessException {
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 700, 200);
        add(l1);
        
        JLabel l2 = new JLabel("Thank You For Playing!");
        l2.setBounds(220,180, 400, 50);
        l2.setForeground(new Color(144, 12, 63));
        l2.setFont(new Font("Jokerman", Font.BOLD, 22));
        add(l2);
        
        playAgain = new JButton("Play Again");
        playAgain.setBounds(265,380, 150, 40);
        playAgain.setBackground(new Color(249,199,38));
        playAgain.setFont(new Font("CALIBRI", Font.BOLD, 16));
        playAgain.setForeground(Color.BLACK);
        playAgain.addActionListener(this);
        add(playAgain);
        
        JLabel l3 = new JLabel(Integer.toString(score) + "%");
        l3.setBounds(280,250, 400, 100);
        l3.setForeground(Color.WHITE);
        l3.setFont(new Font("Jokerman", Font.BOLD, 70));
        add(l3);
        
        getContentPane().setBackground(new Color(145,207,222));
//        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setBounds(200,100,700,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new ScoreDashboard(0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == playAgain){
            new JavaCameos().setVisible(true);
            setVisible(false);
        }
    }
}
