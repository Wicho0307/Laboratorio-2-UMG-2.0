package Laboratorio2_Luis_Sanchez;

import javax.swing.JFrame;
import laboratorio2_luis_sanchez.LoginScreen;
        
public class Laboratorio2_Luis_Sanchez {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Login");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setContentPane(new LoginScreen()); 

        frame.pack(); 
        frame.setLocationRelativeTo(null); 
        frame.setVisible(true);
    }
}