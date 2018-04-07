package SDA;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Players extends JFrame {
    String  imie1;
    String imie2;
    int imie1SetPionek, imie2SetPionek;
    int punkty, ustawKolejnosc;
    private JButton button1;
    private JPanel panel1;
    private JTextField textField1;
    private JButton button2;
    private JButton button3;
    private JLabel label, label1;


    private JButton button4;
    private JButton button5;
    //public SDA.PlanszaGlowna planszaGlowna;

    Players() {
       
        System.out.printf("Playrs");
        ustawKolejnosc = 1;
        wyborPlayerow();
    }

    public void wyborPlayerow() {

        setLayout(null);
        //setSize(200, 200);
        setResizable(false);
        setBounds(800, 200, 300, 300);
        setTitle(" Wybór imienia");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(button1);
        button1.setBounds(10, 200, 80, 20);
        button1.setText("Ok");
        add(button2);
        button2.setBounds(110, 200, 80, 20);
        button2.setText("Anuluj");
        add(label);
        label.setBounds(10, 0, 120, 80);
        label.setText("WPISZ SWOJE IMIE :");
        add(textField1);
        textField1.setBounds(130, 30, 120, 20);
        add(label1);
        label1.setBounds(10, 50, 180, 80);
        label1.setText("WYBIERZ KRZYZYK LUB KÓŁKO");

        add(button4);
        add(button5);
        button4.setBounds(10, 110, 50, 50);
        button5.setBounds(80, 110, 50, 50);
        button4.setText("");
        button5.setText("");
//        ImageIcon imageIcon = new ImageIcon(new ImageIcon("Resources/x.jpg").getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT));
//        button4.setIcon(imageIcon);
        button4.setIcon(new ImageIcon(PlanszaGlowna.class.getResource("Resources/xsmall.jpg")));
        button5.setIcon(new ImageIcon(PlanszaGlowna.class.getResource("Resources/osmall.jpg")));

        setVisible(true);

        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("krzyzyk");

                button5.setEnabled(false);
                imie1SetPionek = 0; // 0 to krzyzyk, 1 to kołko
            }
        });
        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("kólko");

                button4.setEnabled(false);
                imie1SetPionek = 1; // 0 to krzyzyk, 1 to kołko
            }
        });


        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //System.out.println("Ok");

                    if (textField1.getText().equals("")) {
                        System.out.println("Podaj imie");
                    } else {
                        System.out.println("Imie ok " + textField1.getText());
                        
                        imie1 = textField1.getText();
                        setImie1(imie1);

                        String msg = textField1.getText();
                        setImie1(imie1);



                        //dispose();
                    }



            }

           


        });

    }

    public String getImie1(String imie1) {
        return imie1;
    }


    public void setImie1(String imie1) {
        this.imie1 = imie1;
        Class <PlanszaGlowna> p = PlanszaGlowna.class;
        System.out.println(p);;
        p.lbl1.setText(textField1.getText());//**************************
p.


    }

    @Override
    public String toString() {
        return "Players{" +
                "imie1='" + imie1 + '\'' +
                ", imie2='" + imie2 + '\'' +
                ", imie1SetPionek=" + imie1SetPionek +
                ", imie2SetPionek=" + imie2SetPionek +
                ", punkty=" + punkty +
                ", ustawKolejnosc=" + ustawKolejnosc +
                ", button1=" + button1 +
                ", panel1=" + panel1 +
                ", textField1=" + textField1 +
                ", button2=" + button2 +
                ", button3=" + button3 +
                ", label=" + label +
                ", label1=" + label1 +
                ", button4=" + button4 +
                ", button5=" + button5 +
                ", PlanszaGlowna=" + planszaGlowna +
                "} " + super.toString();
    }



    public String getImie2() {
        return imie2;
    }

    public void setImie2(String imie2) {
        this.imie2 = imie2;
    }

    public int getImie1SetPionek() {
        return imie1SetPionek;
    }

    public void setImie1SetPionek(int imie1SetPionek) {
        this.imie1SetPionek = imie1SetPionek;
    }

    public int getImie2SetPionek() {
        return imie2SetPionek;
    }

    public void setImie2SetPionek(int imie2SetPionek) {
        this.imie2SetPionek = imie2SetPionek;
    }

    public int getPunkty() {
        return punkty;
    }

    public void setPunkty(int punkty) {
        this.punkty = punkty;
    }

    public int getUstawKolejnosc() {
        return ustawKolejnosc;
    }

    public void setUstawKolejnosc(int ustawKolejnosc) {
        this.ustawKolejnosc = ustawKolejnosc;
    }
}
