package SDA;

import javafx.scene.control.Labeled;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public  class PlanszaGlowna extends JFrame {
    //private static final Labeled lbl1;
    //public  JEditorPane lbl1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;



    public JLabel getLbl1() {
        return lbl1;
    }

    public JLabel getLbl2() {
        return lbl2;
    }

    public void setLbl2(JLabel lbl2) {
        this.lbl2 = lbl2;
    }

    public JLabel getLbl3() {
        return lbl3;
    }

    public void setLbl3(JLabel lbl3) {
        this.lbl3 = lbl3;
    }
    public  JLabel lbl1;
    private JLabel lbl2;
    private JLabel lbl3;
    private JButton btnGraj;

    PlanszaGlowna() {
        setLayout(null);
        setSize(500, 500);
        setTitle(" Kółko i Krzyżyk");
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);
        add(button7);
        add(button8);
        add(button9);
        add(btnGraj);

        add(lbl1);
        add(lbl2);
        add(lbl3);

        button1.setBounds(20, 20, 100, 100);
        button2.setBounds(120, 20, 100, 100);
        button3.setBounds(220, 20, 100, 100);
        button4.setBounds(20, 120, 100, 100);
        button5.setBounds(120, 120, 100, 100);
        button6.setBounds(220, 120, 100, 100);
        button7.setBounds(20, 220, 100, 100);
        button8.setBounds(120, 220, 100, 100);
        button9.setBounds(220, 220, 100, 100);

        btnGraj.setBounds(370, 20, 80, 60);
        lbl1.setBounds(400, 170, 50, 50);
        lbl2.setBounds(400, 190, 50, 50);
        lbl3.setBounds(400, 200, 50, 50);
       String imie ;
       //UstawTextButonow(imie);
       

        lbl1.setText("pierszy");
        lbl2.setText("drugi");
        lbl3.setText("trzeci");


        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
        btnGraj.setText("START");
        setVisible(true);

        btnGraj.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("START");
                //.setIcon(new ImageIcon(PlanszaGlowna.class.getResource("Resources/x.jpg")));
                //button1.setIcon(icon);
                //btnGraj.setEnabled(false);
                Players players = new Players();
            }
        });

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Pierwszy");
                button1.setIcon(new ImageIcon(PlanszaGlowna.class.getResource("Resources/x.jpg")));
                //button1.setIcon(icon);
                button1.setEnabled(false);

            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                System.out.println("Drugi");
                button2.setIcon(new ImageIcon(PlanszaGlowna.class.getResource("Resources/o.jpg")));

                button2.setEnabled(false);

            }
        });
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Trzeci");

                button3.setEnabled(false);

            }
        });
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("4");

                button4.setEnabled(false);

            }
        });
        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("5");

                button5.setEnabled(false);

            }
        });
        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("6");

                button6.setEnabled(false);

            }
        });
        button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("7");

                button7.setEnabled(false);

            }
        });
        button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("8");

                button8.setEnabled(false);

            }
        });
        button9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("9y");

                button9.setEnabled(false);

            }
        });
    }



//    public static PlanszaGlowna(String title) {
//        lbl1.setText(title);
//    }

    public String lbl1(String imie1) {
        lbl1.setText(imie1);
        return imie1;
    }
    public String setLbl1(String imie) {
        lbl1.setText(imie);
        return imie;
    }

    //    public String UstawTextButonow(String imie) {
//        lbl1.setText(imie);
//        lbl2.setText("drugi");
//        lbl3.setText("trzeci");
//        return imie;
//    }



}
