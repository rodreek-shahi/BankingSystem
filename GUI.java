import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
/**
 * Write a description of class GUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GUI
{
    JFrame GUI_Main;
    JPanel GUI_MainPanel;
    JLabel lbl_cardid,lbl_pin,lbl_welcome;
    JTextField txt_pin,txt_cardid;
    JButton btn_login,btn_Register;
    public GUI(){

        GUI_Main = new JFrame();

        GUI_MainPanel = new JPanel();

        GUI_MainPanel.setLayout(null);
        GUI_MainPanel.setVisible(true);
        GUI_MainPanel.setBackground(Color.lightGray);

        lbl_welcome = new JLabel("Welcome to Rodrik's System");
        lbl_welcome.setBounds(35,17,2050,36);
        lbl_welcome.setFont(new Font("Arial",Font.BOLD,22));

        lbl_cardid = new JLabel("Card id: ");
        lbl_cardid.setBounds(47,79,100,20);

        txt_cardid = new  JTextField();
        txt_cardid.setBounds(151,73,180,32);

        lbl_pin = new JLabel("Pin: ");
        lbl_pin.setBounds(47,125,100,20);

        txt_pin = new JTextField();
        txt_pin.setBounds(151,125,180,32);

        btn_login = new JButton("Login");
        btn_login.setBounds(228,210,100,55);

        btn_Register = new JButton("Register");
        btn_Register.setBounds(54,210,100,55);

        GUI_MainPanel.add(lbl_welcome);
        GUI_MainPanel.add(lbl_cardid);
        GUI_MainPanel.add(txt_cardid);
        GUI_MainPanel.add(lbl_pin);
        GUI_MainPanel.add(txt_pin);
        GUI_MainPanel.add(btn_login);
        GUI_MainPanel.add(btn_Register);

        GUI_Main.add(GUI_MainPanel);
        GUI_Main.setVisible(true);
        GUI_Main.setSize(399,320);
        GUI_Main.setLocationRelativeTo(null);
        GUI_Main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e){

        if (e.getSource() == Register){

        

        }
    }
}
