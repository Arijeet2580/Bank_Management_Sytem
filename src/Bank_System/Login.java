package Bank_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JLabel title,cardNo,pin;
    JTextField cardTf;
    JPasswordField passTf;
    JButton signIn,clear,signUp;

    Login(){
        setTitle("LOGIN PAGE");
        //Title
        title = new JLabel("WELCOME TO ATM");
        title.setFont(new Font("Arial", Font.BOLD, 38));
        title.setBounds(200,40,450,40);
        add(title);
        //card Number Section
        cardNo = new JLabel("Card No:");
        cardNo.setFont(new Font("Times New Roman", Font.BOLD, 20));
        cardNo.setBounds(130,150,375,30);
        add(cardNo);

        cardTf = new JTextField(15);
        cardTf.setBounds(300,150,230,30);
        cardTf.setFont(new Font("Arial", Font.BOLD, 20));
        add(cardTf);
        //Password Section
        pin = new JLabel("PIN:");
        pin.setFont(new Font("Times New Roman", Font.BOLD, 20));
        pin.setBounds(130,220,375,30);
        add(pin);

        passTf = new JPasswordField(15);
        passTf.setFont(new Font("Arial", Font.BOLD, 14));
        passTf.setBounds(300,220,230,30);
        add(passTf);
        //Sign In Section
        signIn = new JButton("SIGN IN");
        signIn.setBackground(Color.BLACK);
        signIn.setForeground(Color.WHITE);
        signIn.setFont(new Font("Arial", Font.BOLD, 14));
        signIn.setBounds(300,300,100,30);
        add(signIn);

        //Clear Section
        clear = new JButton("CLEAR");
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.setFont(new Font("Arial", Font.BOLD, 14));
        clear.setBounds(430,300,100,30);
        add(clear);

        //SignUp Section
        signUp = new JButton("SIGN UP");
        signUp.setBackground(Color.BLACK);
        signUp.setForeground(Color.WHITE);
        signUp.setFont(new Font("Arial", Font.BOLD, 14));
        signUp.setBounds(300,350,230,30);
        add(signUp);
        //Absolute Layout
        setLayout(null);

        //Event Listener
        signIn.addActionListener(this);
        clear.addActionListener(this);
        signUp.addActionListener(this);

        //Background White
        getContentPane().setBackground(Color.WHITE);

        //Size & Location
        setSize(800,480);
        setLocation(550,200);
        //setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent ae){
        try{
            /*
            if(ae.getSource()==signIn){
                Conn c1 = new Conn();
                String cardno  = cardTf.getText();
                String pin  = passTf.getText();
                String q  = "select * from login where cardno = '"+cardno+"' and pin = '"+pin+"'";

                ResultSet rs = c1.s.executeQuery(q);
                if(rs.next()){
                    setVisible(false);
                    new Transactions(pin).setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
                }
            }*/
            if(ae.getSource()==clear){
                cardTf.setText("");
                passTf.setText("");
            }else if(ae.getSource()==signUp){
                setVisible(false);
                new SignUp().setVisible(true);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Login().setVisible(true);
    }
}



