/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacameos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author jaydev
 */
@SuppressWarnings("serial")
public class QuizDashboard extends JFrame implements ActionListener{
    
    JButton lifeline, next, submit;
    JLabel questionNumber, question;
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup options;
    
    static int timer = 20;
    static int count = 0;
    static int ans_given = 0;
    static int score = 0;
    
    String q[][] = new String[10][5];
    String pa[][] = new String[10][1];
    String qa[][] = new String[10][2];

    QuizDashboard() {
        
        super("Java Cameos!");
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/dashboard.jpg"));
        JLabel l1 = new JLabel(i1);
        l1.setBounds(0, 0, 700, 200);
        add(l1);
        
        questionNumber = new JLabel("1. ");
        questionNumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
        questionNumber.setBounds(40, 250, 40, 30);
        add(questionNumber);
        
        question = new JLabel("What is Your Name?");
        question.setFont(new Font("Tahoma", Font.PLAIN, 18));
        question.setBounds(60, 250, 600, 30);
        add(question);
        
        q[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        q[0][1] = "JVM";
        q[0][2] = "JDB";
        q[0][3] = "JDK";
        q[0][4] = "JRE";

        q[1][0] = "What is the return type of the hashCode() method in the Object class?";
        q[1][1] = "int";
        q[1][2] = "Object";
        q[1][3] = "long";
        q[1][4] = "void";

        q[2][0] = "Which package contains the Random class?";
        q[2][1] = "java.util package";
        q[2][2] = "java.lang package";
        q[2][3] = "java.awt package";
        q[2][4] = "java.io package";

        q[3][0] = "An interface with no fields or methods is known as?";
        q[3][1] = "Runnable Interface";
        q[3][2] = "Abstract Interface";
        q[3][3] = "Marker Interface";
        q[3][4] = "CharSequence Interface";

        q[4][0] = "In which memory a String is stored,(string using new operator)?";
        q[4][1] = "Stack";
        q[4][2] = "String memory";
        q[4][3] = "Random storage space";
        q[4][4] = "Heap memory";

        q[5][0] = "Which of the following is a marker interface?";
        q[5][1] = "Runnable interface";
        q[5][2] = "Remote interface";
        q[5][3] = "Readable interface";
        q[5][4] = "Result interface";

        q[6][0] = "Which keyword is used for accessing the features of a package?";
        q[6][1] = "import";
        q[6][2] = "package";
        q[6][3] = "extends";
        q[6][4] = "export";

        q[7][0] = "In java, jar stands for?";
        q[7][1] = "Java Archive Runner";
        q[7][2] = "Java Archive";
        q[7][3] = "Java Application Resource";
        q[7][4] = "Java Application Runner";

        q[8][0] = "Which of the following is a mutable class in java?";
        q[8][1] = "java.lang.StringBuilder";
        q[8][2] = "java.lang.Short";
        q[8][3] = "java.lang.Byte";
        q[8][4] = "java.lang.String";

        q[9][0] = "Which of the following option leads to the portability and security of Java?";
        q[9][1] = "Bytecode is executed by JVM";
        q[9][2] = "The applet makes the Java code secure and portable";
        q[9][3] = "Use of exception handling";
        q[9][4] = "Dynamic binding between objects";
        
        qa[0][1] = "JDB";
        qa[1][1] = "int";
        qa[2][1] = "java.util package";
        qa[3][1] = "Marker Interface";
        qa[4][1] = "Heap memory";
        qa[5][1] = "Remote interface";
        qa[6][1] = "import";
        qa[7][1] = "Java Archive";
        qa[8][1] = "java.lang.StringBuilder";
        qa[9][1] = "Bytecode is executed by JVM";
        
        opt1 = new JRadioButton("Option 1");
        opt1.setBounds(60, 300, 300, 30);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("Calibri", Font.PLAIN, 16));
        add(opt1);
        
        opt2 = new JRadioButton("Option 2");
        opt2.setBounds(60, 340, 300, 30);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font("Calibri", Font.PLAIN, 16));
        add(opt2);
        
        opt3 = new JRadioButton("Option 3");
        opt3.setBounds(60, 380, 300, 30);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font("Calibri", Font.PLAIN, 16));
        add(opt3);
        
        opt4 = new JRadioButton("Option 4");
        opt4.setBounds(60, 420, 300, 30);
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font("Calibri", Font.PLAIN, 16));
        add(opt4);
        
        options = new ButtonGroup();
        options.add(opt1); options.add(opt2); options.add(opt3); options.add(opt4);
        
        lifeline = new JButton("50%-50%");
        lifeline.setBounds(60, 500, 100, 30);
        lifeline.setBackground(new Color(145,207,222));
        lifeline.setFont(new Font("Calibri", Font.BOLD, 16));
        lifeline.addActionListener(this);
        add(lifeline);
        
        next = new JButton("Next");
        next.setBounds(180, 500, 100, 30);
        next.setBackground(new Color(145,207,222));
        next.setFont(new Font("Calibri", Font.BOLD, 16));
        next.addActionListener(this);
        add(next);
        
        submit = new JButton("Submit");
        submit.setBounds(550, 500, 100, 30);
        submit.setBackground(new Color(252,186,27));
        submit.setFont(new Font("Calibri", Font.BOLD, 16));
        submit.setForeground(new Color(144, 12, 63));
        submit.setEnabled(false);
        submit.addActionListener(this);
        add(submit);
        
//        getContentPane().setBackground(new Color(251, 237,226));
        getContentPane().setBackground(Color.WHITE);
        setBounds(200,50,700,600);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        start(0);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == next){
            ans_given = 1;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            repaint();
            if(options.getSelection() == null){
//                JOptionPane.showMessageDialog(null, "Please select atleast one option");
                pa[count][0] = "";
            }else{
                pa[count][0] = options.getSelection().getActionCommand();
            }
            if(count == 8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            count++;
            start(count);
        }else if(e.getSource() == lifeline){
            if(count == 2 || count == 4 ||  count == 6 || count == 8 || count == 9){
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            }else{
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            lifeline.setEnabled(false);
        }else if(e.getSource() == submit){
            ans_given = 1;
            if(options.getSelection() == null){
//                JOptionPane.showMessageDialog(null, "Please select atleast one option");
                pa[count][0] = "";
            }else{
                pa[count][0] = options.getSelection().getActionCommand();
            }
            for(int i = 0; i < pa.length; i++){
                if(pa[i][0].equals(qa[i][1])){
                    score += 10;
                }else{
                    score += 0;
                }
            }
            setVisible(false);
            new ScoreDashboard(score);
        }
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        String time = "Time Left - " + timer;
        g.setColor(new Color(144, 12, 63));
        g.setFont(new Font("Calibri", Font.BOLD, 18));
        
        if(timer > 0){
            g.drawString(time, 560, 480);
        }else{
            g.drawString("Time Up", 560, 480);
        }
        timer--;
        try{
            Thread.sleep(1000);
            repaint();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        
        if(ans_given == 1){
            ans_given = 0;
            timer = 20;
        }else if(timer < 0){
            timer = 20;
            
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            if(count == 8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            
            if(count == 9){
                if(options.getSelection() == null){
//                JOptionPane.showMessageDialog(null, "Please select atleast one option");
                    pa[count][0] = "";
                }else{
                    pa[count][0] = options.getSelection().getActionCommand();
                }
                
                for(int i = 0; i < pa.length; i++){
                    if(pa[i][0].equals(qa[i][1])){
                        score += 10;
                    }else{
                        score += 0;
                    }
                }
                
                setVisible(false);
                new ScoreDashboard(score);
            }else{
                if(options.getSelection() == null){
//                JOptionPane.showMessageDialog(null, "Please select atleast one option");
                    pa[count][0] = "";
                }else{
                    pa[count][0] = options.getSelection().getActionCommand();
                }
                count++;
                start(count);
            }
        }
//        System.out.println("Hello");
    }
    
    @SuppressWarnings("deprecation")
    public void start(int count){
        questionNumber.setText("" + (count+1) + ".");
        question.setText(q[count][0]);
        opt1.setLabel(q[count][1]);
        opt1.setActionCommand(q[count][1]);
        opt2.setLabel(q[count][2]);
        opt2.setActionCommand(q[count][2]);
        opt3.setLabel(q[count][3]);
        opt3.setActionCommand(q[count][3]);
        opt4.setLabel(q[count][4]);
        opt4.setActionCommand(q[count][1]);
        options.clearSelection();
    }
    
    public static void main(String[] args) {
        new QuizDashboard();
    }
    
}
