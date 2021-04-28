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
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author jaydev
 */
@SuppressWarnings("serial")
public class JavaCameos extends JFrame implements ActionListener{
    JButton btn;
    JTextField tf;
    JavaCameos() {
        super("JavaCameos");
        
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/home_icon_1.png"));
        
        JLabel l1 = new JLabel("Java Cameos");
        l1.setBounds(170, 20, 250, 50);
        l1.setFont(new Font("Viner Hand ITC", Font.BOLD, 22));
        l1.setForeground(new Color(144, 12, 63));
        add(l1);
        
        JLabel l2 = new JLabel("Enter Name");
        l2.setBounds(10, 100, 100, 25);
        l2.setFont(new Font("CALIBRI", Font.BOLD, 16));
        add(l2);
        
        tf = new JTextField();
        tf.setBounds(120, 100, 280, 25);
        add(tf);
        
        btn = new JButton("Play!");
        btn.setBounds(200, 180, 100, 30);
        btn.setBackground(new Color(144, 12, 63));
        btn.setForeground(Color.white);
        btn.addActionListener(this);
        add(btn);
        
        
        setLayout(null);
        setBounds(300,150,500,300);
        setResizable(false);
        getContentPane().setBackground(new Color(218, 247, 166));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn){
            if("".equals(tf.getText())){
                JOptionPane.showMessageDialog(null, "Please Enter Name");
            }else{
                String username = tf.getText();
                new Rules(username).setVisible(true);
                setVisible(false);
            }
        }
    }
    
    public static void main(String[] args) {
        new JavaCameos();
    }
}
