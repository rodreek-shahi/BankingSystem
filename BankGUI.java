import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
/**
 * Write a description of class Bank_CardGUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankGUI implements ActionListener
{
    // Array list decleration
    ArrayList<Bank_Card> Arraylist_name = new ArrayList<Bank_Card>();

    private JFrame bank_card_frame,CvcNumber_frame, CardId_frame,setCreditLimit_frame,frame_of_withdraw,frame_of_pin,display_frame,cancelCredit_frame;

    private JPanel bank_card_panel,CvcNumber_panel, CardId_panel,setCreditLimit_panel,panel_of_pin,display_panel,cancelCredit_panel;

    private JLabel lbl_cardId,lbl_clientName,lbl_issuerBank,lbl_accountType,lbl_balanceAmount,lbl_welcomeFor_BankGUI,lbl_setPin,
    lbl_welcome_CvcNumber_GUI,lbl_welcome2_CvcNumber_GUI,lbl_welcome_CardId_GUI,lbl_welcome2_CardId_GUI,lbl_gracePeriod,
    lbl_creditLimit,lbl_welcome_setCreditLimit,lbl_welcome,lbl_warning,lbl_withdraw_Date,lbl_welcome_pin,lbl_welcome_CancelCredit_GUI,
    lbl_displayDebit,lbl_displayCredit,lbl_welcome_display;

    private JTextField txt_cardId,txt_clientName,txt_balanceAmount,txt_setPin,txt_input_CvcNumber_GUI,txt_input_CardId_GUI,txt_gracePeriod,
    txt_creditLimit,txt_input,txt_inputPin,txt_input_CancelCredit_GUI,txt_cardid,txt_cvc;

    private JButton btn_add,btn_addCreditLimit,btn_reset,btn_withdrawFor_BankGUI,btn_cancelCreditLimit,btn_setCreditLimit,btn_display,
    btn_of_1,btn_of_2,btn_of_3,btn_of_4,btn_of_5,btn_of_6,btn_of_7,btn_of_8,btn_of_9,btn_of_0,btn_of_ok,btn_of_delete,btn_goBackPin,
    btn_next_CvcNumber_GUI,btn_Goback_CvcNumber_GUI,btn_next,btn_Goback_CreditId,btn_add_ForSetCreditLimit,btn_goBack_setCreditLimit,
    btn_reset_setCreditLimit,btn_of_withdraw,btn_goBackWithdraw,btn_next_CancelCredit_GUI,btn_Goback_CancelCredit_GUI,btn_displayDebit,
    btn_displayCredit,btn_goBack_display;

    private JComboBox cbx_issuerBank,cbx_accountType,cbx_withdraw_Year,cbx_withdraw_Months,cbx_withdraw_Dates;

    //for credit card only
    private JLabel lbl_Credit_welcome_Credit,lbl_Credit_cvcNumber,lbl_Credit_interestRate,lbl_Credit_expDate,lbl_guide,lbl_guide1,lbl_guide2,lbl_guide3,lbl_guide4,lbl_guide5;
    private JTextField txt_Credit_cvcNumber,txt_Credit_interestRate;
    private JComboBox cbx_Credit_expYear,cbx_Credit_issuerBank,cbx_Credit_expDates,cbx_Credit_expMonths;
    
    JFrame GUI_Main;
    JPanel GUI_MainPanel;
    JLabel lbl_cardid_main,lbl_pin_main,lbl_welcome_main;
    JTextField txt_pin_main,txt_cardid_main;
    JButton btn_login,btn_Register;
    
    public void main(String[]args){

        GUI_Main = new JFrame();

        GUI_MainPanel = new JPanel();

        GUI_MainPanel.setLayout(null);
        GUI_MainPanel.setVisible(true);
        GUI_MainPanel.setBackground(Color.lightGray);

        lbl_welcome_main = new JLabel("Welcome to Rodrik's System");
        lbl_welcome.setBounds(35,17,2050,36);
        lbl_welcome.setFont(new Font("Arial",Font.BOLD,22));

        lbl_cardid_main = new JLabel("Card id: ");
        lbl_cardid_main.setBounds(47,79,100,20);

        txt_cardid_main = new  JTextField();
        txt_cardid_main.setBounds(151,73,180,32);

        lbl_pin_main = new JLabel("Pin: ");
        lbl_pin_main.setBounds(47,125,100,20);

        txt_pin_main = new JTextField();
        txt_pin_main.setBounds(151,125,180,32);

        btn_login = new JButton("Login");
        btn_login.setBounds(228,210,100,55);

        btn_Register = new JButton("Register");
        btn_Register.setBounds(54,210,100,55);

        GUI_MainPanel.add(lbl_welcome_main);
        GUI_MainPanel.add(lbl_cardid_main);
        GUI_MainPanel.add(txt_cardid_main);
        GUI_MainPanel.add(lbl_pin_main);
        GUI_MainPanel.add(txt_pin_main);
        GUI_MainPanel.add(btn_login);
        GUI_MainPanel.add(btn_Register);

        GUI_Main.add(GUI_MainPanel);
        GUI_Main.setVisible(true);
        GUI_Main.setSize(399,320);
        GUI_Main.setLocationRelativeTo(null);
        GUI_Main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    //Constructor with Initial GUI
    public BankGUI(){

        bank_card_frame = new JFrame();

        bank_card_panel = new JPanel();

        bank_card_panel.setLayout(null);
        bank_card_panel.setVisible(true);
        bank_card_panel.setBackground(Color.lightGray);

        lbl_welcomeFor_BankGUI = new JLabel("Welcome to Bank GUI ! Enter your details below to login");
        lbl_welcomeFor_BankGUI.setBounds(42,16,1000,36);
        lbl_welcomeFor_BankGUI.setFont(new Font("Arial",Font.BOLD,22));

        lbl_cardId = new JLabel("Card Id: *");
        lbl_cardId.setBounds(43,112,200,20);

        txt_cardId = new JTextField();
        txt_cardId.setBounds(215,106,180,32);

        lbl_clientName = new JLabel("Client Name: *");
        lbl_clientName.setBounds(495,112,200,20);

        txt_clientName = new JTextField();
        txt_clientName.setBounds(624,106,180,32);

        lbl_issuerBank = new JLabel("Issuer Bank: ");
        lbl_issuerBank.setBounds(43,217,200,15);

        String banks[] = {"Kumari Bank","Nepal Bank",
                "Rastriya Banijya Bank","Agriculture Development Bank","Nabil Bank",
                "Nepal Investment Mega Bank","Standard Chartered Bank Nepal","Himalayan Bank",
                "Nepal SBI Bank","Everest Bank","Prabhu Bank","Laxmi Bank","Global IME Limited",
                "Citizens Bank International","Prime Commercial Bank","NMB Bank Nepal","NIC Asia Bank"
            ,"Siddhartha Bank","Sanima Bank","Machhapuchchhre Bank","Sunrise Bank"};
        cbx_issuerBank = new JComboBox(banks);
        cbx_issuerBank.setBounds(215,208,180,32);

        lbl_setPin = new JLabel("Set Pin: ");
        lbl_setPin.setBounds(495,214,100,20);

        txt_setPin = new JTextField();
        txt_setPin.setBounds(624,208,180,32);

        lbl_balanceAmount = new JLabel("Balance Amount: *");
        lbl_balanceAmount.setBounds(43,319,200,20);

        txt_balanceAmount = new JTextField();
        txt_balanceAmount.setBounds(215,313,180,32);

        lbl_accountType = new JLabel("Account Type: ");
        lbl_accountType.setBounds(495,319,200,20);

        String accounts[] = {"Savings","Current","Fixed Deposit"};
        cbx_accountType = new JComboBox(accounts);
        cbx_accountType.setBounds(624,313,180,32);

        btn_add = new JButton("Add Debit Card");
        btn_add.setBounds(33,426,120,50);

        btn_addCreditLimit = new JButton("Add Credit Card");
        btn_addCreditLimit.setBounds(198,428,120,50);

        btn_cancelCreditLimit = new JButton("Cancel Credit");
        btn_cancelCreditLimit.setBounds(528,428,120,50);

        btn_reset = new JButton("Clear");
        btn_reset.setBounds(693,428,120,50);

        btn_withdrawFor_BankGUI = new JButton("Withdraw");
        btn_withdrawFor_BankGUI .setBounds(363,428,120,50);

        btn_setCreditLimit = new JButton("Set Credit Limit");
        btn_setCreditLimit.setBounds(33,500,120,50);

        btn_display = new JButton("Display");
        btn_display.setBounds(198,500,120,50);

        //for credit card only////////////////////////////////////////////////////////////

        lbl_Credit_welcome_Credit = new JLabel("Note: This area is only for setting credit limit");
        lbl_Credit_welcome_Credit.setBounds(904,21,400,36);
        lbl_Credit_welcome_Credit.setFont(new Font("Arial",Font.BOLD,15));

        lbl_Credit_cvcNumber = new JLabel("CVC Number: ");
        lbl_Credit_cvcNumber.setBounds(904,106,100,20);

        txt_Credit_cvcNumber = new JTextField();
        txt_Credit_cvcNumber.setBounds(1033,103,180,32);

        lbl_Credit_interestRate = new JLabel("Interest Rate: ");
        lbl_Credit_interestRate.setBounds(904,214,100,20);

        txt_Credit_interestRate = new JTextField();
        txt_Credit_interestRate.setBounds(1033,208,180,32);

        lbl_Credit_expDate = new JLabel("Expiration Date: ");
        lbl_Credit_expDate.setBounds(904,319,200,20);

        String years[] = {"2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", 
                "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", 
                "2050", "2051", "2052", "2053", "2054", "2055", "2056", "2057", "2058", "2059", "2060", "2061", "2062", "2063", "2064", "2065", 
                "2066", "2067", "2068", "2069", "2070"};
        cbx_Credit_expYear = new <Integer>JComboBox(years);
        cbx_Credit_expYear.setBounds(1033,313,85,32);

        String months[] = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sept","Oct","Nov","Dec"};
        cbx_Credit_expMonths = new <Integer>JComboBox(months);
        cbx_Credit_expMonths.setBounds(1111,313,70,32);

        String dates[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17"
            , "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32"};
        cbx_Credit_expDates = new <Integer>JComboBox(dates);
        cbx_Credit_expDates.setBounds(1175,313,65,32);

        ////////guide labels////////////////////////////////////////////////////////////////////////////////////
        lbl_guide = new JLabel("Quick Guide:");
        lbl_guide.setBounds(890,459,1000,36);
        lbl_guide.setFont(new Font("Arial",Font.BOLD,15));

        lbl_guide1 = new JLabel("Add debit card button is used to add credit to add debit card");
        lbl_guide1.setBounds(890,489,1000,36);
        lbl_guide1.setFont(new Font("Arial",Font.ITALIC,13));

        lbl_guide2 = new JLabel("Add credit card button is used to add credit to credit card");
        lbl_guide2.setBounds(890,520,1000,36);
        lbl_guide2.setFont(new Font("Arial",Font.ITALIC,13));

        lbl_guide3 = new JLabel("Withdraw button will take you to login page and all withdraw");
        lbl_guide3.setBounds(890,550,1000,36);
        lbl_guide3.setFont(new Font("Arial",Font.ITALIC,13));

        lbl_guide4 = new JLabel("Reset button allows to reset all text fields");
        lbl_guide4.setBounds(890,575,1000,36);
        lbl_guide4.setFont(new Font("Arial",Font.ITALIC,13));

        lbl_guide5 = new JLabel("Display button allows to display detail of Cerdit or Debit Card");
        lbl_guide5.setBounds(890,600,1000,36);
        lbl_guide5.setFont(new Font("Arial",Font.ITALIC,13));

        bank_card_panel.add(lbl_welcomeFor_BankGUI);
        bank_card_panel.add(lbl_cardId);
        bank_card_panel.add(txt_cardId);
        bank_card_panel.add(lbl_clientName);
        bank_card_panel.add(txt_clientName);
        bank_card_panel.add(lbl_issuerBank);
        bank_card_panel.add(cbx_issuerBank );
        bank_card_panel.add(lbl_setPin);
        bank_card_panel.add(txt_setPin);
        bank_card_panel.add(lbl_accountType);
        bank_card_panel.add(cbx_accountType);
        bank_card_panel.add(lbl_balanceAmount);
        bank_card_panel.add(txt_balanceAmount);
        bank_card_panel.add(btn_add);
        bank_card_panel.add(btn_addCreditLimit);
        bank_card_panel.add(btn_cancelCreditLimit);
        bank_card_panel.add(btn_reset);
        bank_card_panel.add(btn_withdrawFor_BankGUI);
        bank_card_panel.add(btn_setCreditLimit);
        bank_card_panel.add(btn_display);

        //for credit card only////////////////////////////////////////////////////////////////////////

        //credit_card_panel = new JPanel();

        //credit_card_panel.setLayout(null);
        ///bank_card_panel.setVisible(true);
        //bank_card_panel.setBackground(Color.darkGray);

        bank_card_panel.add(lbl_Credit_welcome_Credit);
        bank_card_panel.add(lbl_Credit_cvcNumber);
        bank_card_panel.add(txt_Credit_cvcNumber);
        bank_card_panel.add(txt_Credit_interestRate);
        bank_card_panel.add(lbl_Credit_interestRate);
        bank_card_panel.add(lbl_Credit_expDate);
        bank_card_panel.add(cbx_Credit_expYear);
        bank_card_panel.add(cbx_Credit_expMonths);
        bank_card_panel.add(cbx_Credit_expDates);

        //for guide card only////////////////////////////////////////////////////////////////////////
        bank_card_panel.add(lbl_guide);
        bank_card_panel.add(lbl_guide1);
        bank_card_panel.add(lbl_guide2);
        bank_card_panel.add(lbl_guide3);
        bank_card_panel.add(lbl_guide4);
        bank_card_panel.add(lbl_guide5);

        bank_card_frame.add(bank_card_panel);//bank_card_frame.add(bank_card_panel);
        //bank_card_frame.add(bank_card_panel);
        //bank_card_frame.add(bank_card_panel);
        bank_card_frame.setVisible(true);
        bank_card_frame.setSize(1250,660);
        bank_card_frame.setLocationRelativeTo(null);
        bank_card_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btn_addCreditLimit.addActionListener(this);
        btn_withdrawFor_BankGUI.addActionListener(this);
        btn_reset.addActionListener(this);
        btn_add.addActionListener(this);
        btn_cancelCreditLimit.addActionListener(this);
        btn_setCreditLimit.addActionListener(this);
        btn_display.addActionListener(this);

    }

    //GUI FOR PIN
    public void GUI_pin(){
        frame_of_pin = new JFrame();

        panel_of_pin = new JPanel();

        btn_goBackPin = new JButton("<--");
        btn_goBackPin.setBounds(1,1,55,30);

        lbl_welcome_pin = new JLabel("Welcome, Please enter your 4 digit pin below to continue");
        lbl_welcome_pin.setBounds(33,10,500,55);
        lbl_welcome_pin.setFont(new Font("Arial",Font.BOLD,10));

        txt_inputPin = new JTextField();
        txt_inputPin.setBounds(30,70,285,50);

        btn_of_1 = new JButton("1");
        btn_of_1.setBounds(35,120,85,55);

        btn_of_2 = new JButton("2");
        btn_of_2.setBounds(130,120,85,55);

        btn_of_3 = new JButton("3");
        btn_of_3.setBounds(225,120,85,55);

        btn_of_4 = new JButton("4");
        btn_of_4.setBounds(35,175,85,55);

        btn_of_5 = new JButton("5");
        btn_of_5.setBounds(130,175,85,55);

        btn_of_6 = new JButton("6");
        btn_of_6.setBounds(225,175,85,55);

        btn_of_7 = new JButton("7");
        btn_of_7.setBounds(35,230,85,55);

        btn_of_8 = new JButton("8");
        btn_of_8.setBounds(130,230,85,55);

        btn_of_9 = new JButton("9");
        btn_of_9.setBounds(225,230,85,55);

        btn_of_ok = new JButton("OK");
        btn_of_ok.setBounds(35,285,85,55);

        btn_of_0 = new JButton("0");
        btn_of_0.setBounds(130,285,85,55);

        btn_of_delete = new JButton("Dlt");
        btn_of_delete.setBounds(225,285,85,55);

        panel_of_pin.add(btn_goBackPin);
        panel_of_pin.add(txt_inputPin);
        panel_of_pin.add(btn_of_1);
        panel_of_pin.add(btn_of_2);
        panel_of_pin.add(lbl_welcome_pin);
        panel_of_pin.add(btn_of_3);
        panel_of_pin.add(btn_of_4);
        panel_of_pin.add(btn_of_5);
        panel_of_pin.add(btn_of_6);
        panel_of_pin.add(btn_of_7);
        panel_of_pin.add(btn_of_8);
        panel_of_pin.add(btn_of_9);
        panel_of_pin.add(btn_of_ok);
        panel_of_pin.add(btn_of_0);
        panel_of_pin.add(btn_of_delete);

        panel_of_pin.setLayout(null);
        panel_of_pin.setBackground(Color.lightGray);

        frame_of_pin.add(panel_of_pin);
        frame_of_pin.setVisible(true);
        frame_of_pin.setLocationRelativeTo(null);
        frame_of_pin.setSize(360,400);
        frame_of_pin.setLocationRelativeTo(null);
        frame_of_pin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btn_of_1.addActionListener(this);
        btn_of_2.addActionListener(this);
        btn_of_3.addActionListener(this);
        btn_of_4.addActionListener(this);
        btn_of_5.addActionListener(this);
        btn_of_6.addActionListener(this);
        btn_of_7.addActionListener(this);
        btn_of_8.addActionListener(this);
        btn_of_9.addActionListener(this);
        btn_of_ok.addActionListener(this);
        btn_of_0.addActionListener(this);
        btn_of_delete.addActionListener(this);
        btn_goBackPin.addActionListener(this);

    }

    //GUI of withdraw
    public void GUI_withdraw(){
        frame_of_withdraw = new JFrame();

        //frame_of_withdraw = new Jframe();

        lbl_welcome = new JLabel("Enter Desired amount to withdraw");
        lbl_welcome.setBounds(53,10,500,55);
        lbl_welcome.setFont(new Font("Arial",Font.BOLD,15));

        lbl_warning = new JLabel("Please note Transaction limit is 10 lakhs per day");
        lbl_warning.setBounds(53,30,500,55);
        lbl_warning.setFont(new Font("Arial",Font.BOLD,10));

        btn_goBackWithdraw = new JButton("<--");
        btn_goBackWithdraw.setBounds(1,1,55,30);

        txt_input = new JTextField();
        txt_input.setBounds(30,70,285,50);

        btn_of_1 = new JButton("1");
        btn_of_1.setBounds(35,120,85,55);

        btn_of_2 = new JButton("2");
        btn_of_2.setBounds(130,120,85,55);

        btn_of_3 = new JButton("3");
        btn_of_3.setBounds(225,120,85,55);

        btn_of_4 = new JButton("4");
        btn_of_4.setBounds(35,175,85,55);

        btn_of_5 = new JButton("5");
        btn_of_5.setBounds(130,175,85,55);

        btn_of_6 = new JButton("6");
        btn_of_6.setBounds(225,175,85,55);

        btn_of_7 = new JButton("7");
        btn_of_7.setBounds(35,230,85,55);

        btn_of_8 = new JButton("8");
        btn_of_8.setBounds(130,230,85,55);

        btn_of_9 = new JButton("9");
        btn_of_9.setBounds(225,230,85,55);

        btn_of_withdraw = new JButton("Withdraw");
        btn_of_withdraw.setBounds(35,285,85,55);

        btn_of_0 = new JButton("0");
        btn_of_0.setBounds(130,285,85,55);

        btn_of_delete = new JButton("Dlt");
        btn_of_delete.setBounds(225,285,85,55);

        lbl_withdraw_Date = new JLabel("Withdrawn Date: ");
        lbl_withdraw_Date.setBounds(25,352,200,55);

        String years[] = {"2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", 
                "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", 
                "2050", "2051", "2052", "2053", "2054", "2055", "2056", "2057", "2058", "2059", "2060", "2061", "2062", "2063", "2064", "2065", 
                "2066", "2067", "2068", "2069", "2070"};
        cbx_withdraw_Year = new JComboBox(years);
        cbx_withdraw_Year.setBounds(125,365,85,32);

        String months[] = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sept","Oct","Nov","Dec"};
        cbx_withdraw_Months = new JComboBox(months);
        cbx_withdraw_Months.setBounds(201,365,70,32);

        String dates[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17"
            , "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32"};
        cbx_withdraw_Dates = new JComboBox(dates);
        cbx_withdraw_Dates.setBounds(262,365,65,32);

        frame_of_withdraw.add(btn_goBackWithdraw);
        frame_of_withdraw.add(txt_input);
        frame_of_withdraw.add(btn_of_1);
        frame_of_withdraw.add(btn_of_2);
        frame_of_withdraw.add(lbl_welcome);
        frame_of_withdraw.add(lbl_warning);
        frame_of_withdraw.add(btn_of_3);
        frame_of_withdraw.add(btn_of_4);
        frame_of_withdraw.add(btn_of_5);
        frame_of_withdraw.add(btn_of_6);
        frame_of_withdraw.add(btn_of_7);
        frame_of_withdraw.add(btn_of_8);
        frame_of_withdraw.add(btn_of_9);
        frame_of_withdraw.add(btn_of_withdraw);
        frame_of_withdraw.add(btn_of_0);
        frame_of_withdraw.add(btn_of_delete);
        frame_of_withdraw.add(lbl_withdraw_Date);
        frame_of_withdraw.add(cbx_withdraw_Year);
        frame_of_withdraw.add(cbx_withdraw_Months);
        frame_of_withdraw.add(cbx_withdraw_Dates);

        //frame_of_withdraw.setLayout(null);
        //frame_of_withdraw.setBackground(Color.lightGray);

        //frame_of_withdraw.add(frame_of_withdraw);

        frame_of_withdraw.setLayout(null);
        frame_of_withdraw.setVisible(true);
        frame_of_withdraw.setSize(360,450);
        frame_of_withdraw.setLocationRelativeTo(null);
        frame_of_withdraw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btn_of_1.addActionListener(this);
        btn_of_2.addActionListener(this);
        btn_of_3.addActionListener(this);
        btn_of_4.addActionListener(this);
        btn_of_5.addActionListener(this);
        btn_of_6.addActionListener(this);
        btn_of_7.addActionListener(this);
        btn_of_8.addActionListener(this);
        btn_of_9.addActionListener(this);
        btn_of_withdraw.addActionListener(this);
        btn_of_0.addActionListener(this);
        btn_of_delete.addActionListener(this);
        btn_goBackWithdraw.addActionListener(this);

    }

    //GUI to set credit limit
    public void SetCreditLimit_GUI(){
        setCreditLimit_frame = new JFrame();

        setCreditLimit_panel = new JPanel();

        lbl_welcome_setCreditLimit = new JLabel("To set Credit limit, Enter the details below");
        lbl_welcome_setCreditLimit.setBounds(70,9,500,55);
        lbl_welcome_setCreditLimit.setFont(new Font("Arial",Font.BOLD,15));

        lbl_gracePeriod = new JLabel("Grace Period");
        lbl_gracePeriod.setBounds(53,109,100,20);

        txt_gracePeriod = new JTextField();
        txt_gracePeriod.setBounds(218,103,180,32);

        lbl_creditLimit = new JLabel("Credit Limit");
        lbl_creditLimit.setBounds(53,188,100,20);

        txt_creditLimit = new JTextField();
        txt_creditLimit.setBounds(218,176,180,32);

        btn_add_ForSetCreditLimit =new JButton("Set Credit Limit");
        btn_add_ForSetCreditLimit.setBounds(40,267,120,50);

        btn_goBack_setCreditLimit = new JButton("Go Back");
        btn_goBack_setCreditLimit.setBounds(168,267,120,50);

        btn_reset_setCreditLimit = new JButton("Clear");
        btn_reset_setCreditLimit.setBounds(297,267,120,50);

        setCreditLimit_frame.add(setCreditLimit_panel);
        setCreditLimit_panel.add(lbl_welcome_setCreditLimit);
        setCreditLimit_panel.add(lbl_gracePeriod);
        setCreditLimit_panel.add(txt_gracePeriod);
        setCreditLimit_panel.add(lbl_creditLimit);
        setCreditLimit_panel.add(txt_creditLimit);
        setCreditLimit_panel.add(btn_add_ForSetCreditLimit);
        setCreditLimit_panel.add(btn_goBack_setCreditLimit);
        setCreditLimit_panel.add(btn_reset_setCreditLimit);

        setCreditLimit_panel.setLayout(null);
        setCreditLimit_panel.setVisible(true);
        setCreditLimit_panel.setBackground(Color.lightGray);

        setCreditLimit_frame.setLocationRelativeTo(null);
        setCreditLimit_frame.setVisible(true);
        setCreditLimit_frame.setSize(457,369);
        setCreditLimit_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btn_add_ForSetCreditLimit.addActionListener(this);
        btn_goBack_setCreditLimit.addActionListener(this);
        btn_reset.addActionListener(this);

    }

    //GUI to check Card Id
    public void CardId_GUI(){
        CardId_frame = new JFrame();

        CardId_panel = new JPanel();

        lbl_welcome_CardId_GUI = new JLabel("Please enter your Card Id below");
        lbl_welcome_CardId_GUI.setBounds(45,0,1000,55);
        lbl_welcome_CardId_GUI.setFont(new Font("Arial",Font.BOLD,20));

        lbl_welcome2_CardId_GUI = new JLabel("Please note that, You have to add debit card before this");
        lbl_welcome2_CardId_GUI.setBounds(65,20,1000,55);
        lbl_welcome2_CardId_GUI.setFont(new Font("Arial",Font.BOLD,10));

        txt_input_CardId_GUI = new JTextField();
        txt_input_CardId_GUI.setBounds(101,65,200,45);

        btn_next = new JButton("Next");
        btn_next.setBounds(211,115,120,50);

        btn_Goback_CreditId = new JButton("Go Back");
        btn_Goback_CreditId.setBounds(60,115,120,50);

        CardId_panel.setLayout(null);
        CardId_panel.setVisible(true);
        CardId_panel.setBackground(Color.lightGray);

        CardId_panel.add(lbl_welcome_CardId_GUI);
        CardId_panel.add(lbl_welcome2_CardId_GUI);
        CardId_panel.add(txt_input_CardId_GUI);
        CardId_panel.add(btn_Goback_CreditId);
        CardId_frame.add(CardId_panel);
        CardId_panel.add(btn_next);

        CardId_frame.setVisible(true);
        CardId_frame.setSize(392,225);
        CardId_frame.setLocationRelativeTo(null);
        CardId_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btn_next.addActionListener(this);
        btn_Goback_CreditId.addActionListener(this);

    }

    //GUI to check cvc number
    public void CardId_GUI_forCreditLimit(){
        CvcNumber_frame = new JFrame();

        CvcNumber_panel = new JPanel();

        lbl_welcome_CvcNumber_GUI = new JLabel("Please enter your Card Id below");
        lbl_welcome_CvcNumber_GUI.setBounds(30,0,1000,55);
        lbl_welcome_CvcNumber_GUI.setFont(new Font("Arial",Font.BOLD,20));

        lbl_welcome2_CvcNumber_GUI = new JLabel("Please note that, You have to add credit card before this");
        lbl_welcome2_CvcNumber_GUI.setBounds(65,20,1000,55);
        lbl_welcome2_CvcNumber_GUI.setFont(new Font("Arial",Font.BOLD,10));

        txt_input_CvcNumber_GUI = new JTextField();
        txt_input_CvcNumber_GUI.setBounds(101,65,200,45);

        btn_next_CvcNumber_GUI = new JButton("Next");
        btn_next_CvcNumber_GUI.setBounds(211,115,120,50);

        btn_Goback_CvcNumber_GUI = new JButton("Go Back");
        btn_Goback_CvcNumber_GUI.setBounds(60,115,120,50);

        CvcNumber_panel.setLayout(null);
        CvcNumber_panel.setVisible(true);
        CvcNumber_panel.setBackground(Color.lightGray);

        CvcNumber_panel.add(lbl_welcome_CvcNumber_GUI);
        CvcNumber_panel.add(lbl_welcome2_CvcNumber_GUI);
        CvcNumber_panel.add(txt_input_CvcNumber_GUI);
        CvcNumber_panel.add(btn_Goback_CvcNumber_GUI);
        CvcNumber_frame.add(CvcNumber_panel);
        CvcNumber_panel.add(btn_next_CvcNumber_GUI);

        CvcNumber_frame.setVisible(true);
        CvcNumber_frame.setSize(392,225);
        CvcNumber_frame.setLocationRelativeTo(null);
        CvcNumber_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btn_next_CvcNumber_GUI.addActionListener(this);
        btn_Goback_CvcNumber_GUI.addActionListener(this);

    }

    //GUI to display credit card and debit card
    public void Display_GUI(){
        display_frame = new JFrame();

        display_panel = new JPanel();

        lbl_welcome_display = new JLabel("To display your details press respective buttons");
        lbl_welcome_display.setBounds(70,9,500,55);
        lbl_welcome_display.setFont(new Font("Arial",Font.BOLD,15));

        lbl_displayDebit = new JLabel("To display Debit Card type card Id and click here:");
        lbl_displayDebit.setBounds(20,109,1000,20);

        txt_cardid = new JTextField();
        txt_cardid.setBounds(330,70,100,35);

        btn_displayDebit = new JButton("Display");
        btn_displayDebit.setBounds(330,103,100,32);

        lbl_displayCredit = new JLabel("To display Credit Card type card Id and click here:");
        lbl_displayCredit.setBounds(20,188,1000,20);

        txt_cvc = new JTextField();
        txt_cvc.setBounds(330,150,100,35);

        btn_displayCredit = new JButton("Display");
        btn_displayCredit.setBounds(330,183,100,32);

        btn_goBack_display = new JButton("Go Back");
        btn_goBack_display.setBounds(180,267,120,50);

        display_frame.add(display_panel);
        display_panel.add(txt_cardid);
        display_panel.add(txt_cvc);
        display_panel.add(lbl_welcome_display);
        display_panel.add(lbl_displayDebit);
        display_panel.add(btn_displayDebit);
        display_panel.add(lbl_displayCredit);
        display_panel.add(btn_displayCredit);
        display_panel.add(btn_goBack_display);

        display_panel.setLayout(null);
        display_panel.setVisible(true);
        display_panel.setBackground(Color.lightGray);

        display_frame.setVisible(true);
        display_frame.setSize(500,369);
        display_frame.setLocationRelativeTo(null);
        display_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btn_displayDebit.addActionListener(this);
        btn_displayCredit.addActionListener(this);
        btn_goBack_display.addActionListener(this);
    }

    //Gui to cancel credit
    public void CancelCredit_GUI(){
        cancelCredit_frame = new JFrame();

        cancelCredit_panel = new JPanel();

        lbl_welcome_CancelCredit_GUI = new JLabel("Please enter the Card Id you want to cancel credit for");
        lbl_welcome_CancelCredit_GUI.setBounds(45,0,1000,55);
        lbl_welcome_CancelCredit_GUI.setFont(new Font("Arial",Font.BOLD,15));

        txt_input_CancelCredit_GUI = new JTextField();
        txt_input_CancelCredit_GUI.setBounds(101,65,200,45);

        btn_next_CancelCredit_GUI = new JButton("Next");
        btn_next_CancelCredit_GUI.setBounds(211,115,120,50);

        btn_Goback_CancelCredit_GUI = new JButton("Go Back");
        btn_Goback_CancelCredit_GUI.setBounds(60,115,120,50);

        cancelCredit_panel.setLayout(null);
        cancelCredit_panel.setVisible(true);
        cancelCredit_panel.setBackground(Color.lightGray);

        cancelCredit_panel.add(lbl_welcome_CancelCredit_GUI);
        cancelCredit_panel.add(txt_input_CancelCredit_GUI);
        cancelCredit_panel.add(btn_Goback_CancelCredit_GUI);

        cancelCredit_panel.add(btn_next_CancelCredit_GUI);

        cancelCredit_frame.add(cancelCredit_panel);

        cancelCredit_frame.setVisible(true);
        cancelCredit_frame.setSize(392,225);
        cancelCredit_frame.setLocationRelativeTo(null);
        cancelCredit_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btn_next_CancelCredit_GUI.addActionListener(this);
        btn_Goback_CancelCredit_GUI.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        
        //For new addition 
        if (e.getSource() == btn_Register){
            
            BankGUI bankGUI = new BankGUI();
            GUI_Main.dispose();
        }
        
        
        ///////////////////////////////////////////////////////////////

        //to add debit card
        if(e.getSource() == btn_add ){
            //to check set pin number is greater than 4 or not
            //int length_of_setPin = txt_setPin.getText().length();
            if(txt_setPin.getText().length() == 4){
                if(txt_cardId.getText().equals("") || txt_clientName.getText().equals("") || txt_balanceAmount.getText().equals("") || txt_setPin.equals("") || txt_setPin.equals("")){
                    JOptionPane.showMessageDialog(bank_card_frame, "'*' Fields cannot be left empty", "Error",JOptionPane.ERROR_MESSAGE);
                }
                else{
                    for (Bank_Card obj_cardIdCheck : Arraylist_name) {
                        if (obj_cardIdCheck instanceof Debit_Card) {
                            if(Integer.parseInt(txt_cardId.getText()) == (((Debit_Card)obj_cardIdCheck).get$card_id())){ 
                                JOptionPane.showMessageDialog(bank_card_frame, "Please enter unique card id this is already taken", "Error", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                        }
                    }
                    try{
                        int card_id = Integer.parseInt(txt_cardId.getText());

                        String client_name = txt_clientName.getText();
                        String issuer_bank = String.valueOf(cbx_issuerBank.getSelectedItem());
                        String bank_account = String.valueOf(cbx_accountType.getSelectedItem());
                        int balance_amount = Integer.parseInt(txt_balanceAmount.getText());
                        int pin_number = Integer.parseInt(txt_setPin.getText());

                        //Bank_Card obj_bankCard = new Bank_Card(card_id,balance_amount,bank_account,issuer_bank);
                        Debit_Card obj_debitCard = new Debit_Card(card_id,balance_amount,bank_account,issuer_bank,client_name,pin_number);
                        //Arraylist_name.add(obj_bankCard);
                        Arraylist_name.add(obj_debitCard);

                        JOptionPane.showMessageDialog(bank_card_frame,"Debit Card Added successfully");
                    }
                    catch( NumberFormatException f){
                        JOptionPane.showMessageDialog(bank_card_frame, "Please enter valid input in the Text Field", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }

            }
            else{
                JOptionPane.showMessageDialog(bank_card_frame, "Pin number should be of 4 digit", "Error",JOptionPane.ERROR_MESSAGE);
            }
        } 

        //for adding credit card 
        if(e.getSource() == btn_addCreditLimit){
            if(txt_setPin.getText().length() == 4){
                if (txt_cardId.getText().equals("") || txt_clientName.getText().equals("") || txt_balanceAmount.getText().equals("")) {
                    JOptionPane.showMessageDialog(bank_card_frame, "'*' Fields cannot be left empty", "Error", JOptionPane.WARNING_MESSAGE);}
                else{
                    if(txt_Credit_cvcNumber.getText().equals("") && txt_Credit_interestRate.getText().equals("")){
                        JOptionPane.showMessageDialog(bank_card_frame, "Either cvc number or interest rate is not entered", "Error",JOptionPane.ERROR_MESSAGE);}
                    else{
                        for (Bank_Card obj_cardIdChecker : Arraylist_name) {
                            if (obj_cardIdChecker instanceof Credit_Card) {
                                if(Integer.parseInt(txt_cardId.getText()) == (((Credit_Card)obj_cardIdChecker).get$card_id())){ 
                                    JOptionPane.showMessageDialog(bank_card_frame, "Please enter unique card id this is already taken", "Error", JOptionPane.ERROR_MESSAGE);
                                    return;
                                }
                            }
                        }
                        try{
                            int card_id = Integer.parseInt(txt_cardId.getText());
                            String client_name = txt_clientName.getText();
                            String issuer_bank = String.valueOf(cbx_issuerBank.getSelectedItem());
                            String bank_account = String.valueOf(cbx_accountType.getSelectedItem());
                            int balance_amount = Integer.parseInt(txt_balanceAmount.getText());
                            int cvc_number = Integer.parseInt(txt_Credit_cvcNumber.getText());
                            int interest_rate = Integer.parseInt(txt_Credit_interestRate.getText());
                            String Credit_expYear = String.valueOf(cbx_Credit_expYear.getSelectedItem());
                            String Credit_expMonths = String.valueOf(cbx_Credit_expMonths.getSelectedItem());
                            String Credit_expDates = String.valueOf(cbx_Credit_expDates.getSelectedItem());
                            String expiration_date = Credit_expYear +" "+ Credit_expMonths +" "+ Credit_expDates;

                            Credit_Card obj_creditCard = new Credit_Card(card_id,balance_amount,bank_account,issuer_bank,client_name,cvc_number,interest_rate,expiration_date);
                            Arraylist_name.add(obj_creditCard); 

                            JOptionPane.showMessageDialog(bank_card_frame,"Credit Card Added sucessfully");
                        }

                        catch( NumberFormatException f){
                            JOptionPane.showMessageDialog(bank_card_frame, "Please enter valid input in the Text Field", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            }
            else{
                JOptionPane.showMessageDialog(bank_card_frame, "Pin number should be of 4 digit", "Error",JOptionPane.ERROR_MESSAGE);
            }
        }

        if(e.getSource()==btn_display){
            Display_GUI();

        }

        ///////////////////////////////

        if(e.getSource() == btn_displayDebit){
            if(txt_cardid.getText().equals("")){
                JOptionPane.showMessageDialog(bank_card_frame, "Please enter card id", "Error",JOptionPane.ERROR_MESSAGE);
            }
            else{
                boolean foundCard = false;
                try{
                    for(Bank_Card object: Arraylist_name){

                        if(object instanceof Debit_Card && Integer.parseInt(txt_cardid.getText()) == ((Debit_Card)object).get$card_id()){
                            ((Debit_Card)object).display();
                            JOptionPane.showMessageDialog(bank_card_frame,"MR/MRS/MS "+((Debit_Card)object).get$client_name() +" Your card id is " + ((Debit_Card)object).get$card_id() + " Your Balance amount is " + ((Debit_Card)object).get$balance_amount() + " of Bank " + ((Debit_Card)object).get$issuer_bank() + " and account type "+ ((Debit_Card)object).get$bank_account());
                            display_frame.dispose();
                            foundCard = true;
                            break;
                        }
                    }
                    if(!foundCard){
                        JOptionPane.showMessageDialog(bank_card_frame, "Cannot find the card id", "Error",JOptionPane.ERROR_MESSAGE);
                    }
                }
                catch(ClassCastException a){

                }
            }
        }

        if(e.getSource() == btn_displayCredit){
            if(txt_cvc.getText().equals("")){
                JOptionPane.showMessageDialog(bank_card_frame, "Please enter card id", "Error",JOptionPane.ERROR_MESSAGE);
            }
            else{
                boolean cardFound = false;
                try{
                    for(Bank_Card object: Arraylist_name){
                        if(Integer.parseInt(txt_cvc.getText()) == ((Credit_Card)object).get$card_id()){
                            if(object instanceof Credit_Card){
                                ((Credit_Card)object).display();

                                JOptionPane.showMessageDialog(bank_card_frame,"MR/MRS/MS "+((Credit_Card)object).get$client_name() +" Your card id is " + ((Credit_Card)object).get$card_id() + " Your Balance amount is " + ((Credit_Card)object).get$balance_amount() + " of Bank " + 
                                    ((Credit_Card)object).get$issuer_bank() + " and account type "+ ((Credit_Card)object).get$bank_account()+" Your CVC number is "+((Credit_Card)object).get$cvc_number() +" with interest rate "+ ((Credit_Card)object).get$interest_rate() + " which expires on " + ((Credit_Card)object).get$expiration_date());
                                
                                cardFound = true;
                                break;
                            }
                        }
                    }

                    if(!cardFound){
                        JOptionPane.showMessageDialog(bank_card_frame, "Cannot find the card id", "Error",JOptionPane.ERROR_MESSAGE);
                    }
                }
                catch(ClassCastException a){

                }
            }
        }

        //to goto withdrawing gui's
        if(e.getSource() == btn_withdrawFor_BankGUI ){

            JOptionPane.showMessageDialog(bank_card_frame, "Please note that you have to add a debit card before proceeding. If you haven't, go back and add a debit card.", "Warning", JOptionPane.WARNING_MESSAGE);

            CardId_GUI();

        }
        //to check the correct pin and withdraw amount
        if (e.getSource() == btn_next) {
            if (txt_input_CardId_GUI.getText().equals("")) {
                JOptionPane.showMessageDialog(bank_card_frame, "Please enter card id", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                boolean cardFound = false;
                Debit_Card debitCard = null;
                for (Bank_Card obj_cardId : Arraylist_name) {
                    if (obj_cardId.get$card_id() == Integer.parseInt(txt_input_CardId_GUI.getText())) {
                        if (obj_cardId instanceof Debit_Card) {
                            cardFound = true;
                            debitCard = (Debit_Card) obj_cardId;
                            break;
                        } else {
                            JOptionPane.showMessageDialog(bank_card_frame, "Please enter valid card id or add debit card before trying", "Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                    }
                }
                if (cardFound) {
                    GUI_pin();
                    CardId_frame.dispose();
                } else {
                    JOptionPane.showMessageDialog(bank_card_frame, "Card ID not found", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else if (e.getSource() == btn_of_ok) {
            for (Bank_Card obj_pin : Arraylist_name) {
                if (obj_pin.get$card_id() == Integer.parseInt(txt_input_CardId_GUI.getText())) {
                    if (obj_pin instanceof Debit_Card) {
                        //debitCard = (Debit_Card) obj_pin;
                        if (Integer.parseInt(txt_inputPin.getText()) == ((Debit_Card)obj_pin).get$pin_number()) {
                            GUI_withdraw();
                            frame_of_pin.dispose();
                            JOptionPane.showMessageDialog(frame_of_pin, "Login successfully");
                        } else {
                            JOptionPane.showMessageDialog(frame_of_pin, "You have entered wrong pin, please enter correct pin ");
                            txt_inputPin.setText("");
                        }
                    }
                }
            }
        }
        else if (e.getSource() == btn_of_withdraw) {
            int pin_number = Integer.parseInt(txt_inputPin.getText());
            String withdraw_Year = String.valueOf(cbx_withdraw_Year.getSelectedItem());
            String withdraw_Months = String.valueOf(cbx_withdraw_Months.getSelectedItem());
            String withdraw_Dates = String.valueOf(cbx_withdraw_Dates .getSelectedItem());
            String date_of_withdrawal = withdraw_Year +" "+ withdraw_Months +" "+ withdraw_Dates;
            int amount_to_withdraw = Integer.parseInt(txt_input.getText());

            for (Bank_Card obj_withdraw : Arraylist_name) {
                if (obj_withdraw.get$card_id() == Integer.parseInt(txt_input_CardId_GUI.getText())) {
                    if(Integer.parseInt(txt_input.getText()) > obj_withdraw.get$balance_amount()){
                        JOptionPane.showMessageDialog(frame_of_withdraw, "You do not have enough balance", "Error", JOptionPane.ERROR_MESSAGE);  
                    }
                    else{
                        ((Debit_Card)obj_withdraw).with_draw(amount_to_withdraw,date_of_withdrawal,pin_number);

                        JOptionPane.showMessageDialog(frame_of_withdraw,Integer.parseInt(txt_input.getText()) + " ,Withdrawn sucessfully");
                        frame_of_withdraw.dispose();
                    }
                }
            }
        }

        //for setting credit limit
        if (e.getSource() == btn_setCreditLimit) {
            JOptionPane.showMessageDialog(bank_card_frame, "Please note that you have to add a credit card before proceeding. If you haven't, go back and add a credit card.", "Warning", JOptionPane.WARNING_MESSAGE);

            CardId_GUI_forCreditLimit();

        }
        if (e.getSource() == btn_next_CvcNumber_GUI) {
            if (txt_input_CvcNumber_GUI.getText().equals("")) {
                JOptionPane.showMessageDialog(bank_card_frame, "Please enter card id", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                boolean cardId_found = false;
                for (Bank_Card obj_cardNum : Arraylist_name) {
                    if (obj_cardNum.get$card_id() == Integer.parseInt(txt_input_CvcNumber_GUI.getText())) {
                        if (obj_cardNum instanceof Credit_Card) {
                            cardId_found= true;
                            break;
                        } else {
                            JOptionPane.showMessageDialog(bank_card_frame, "Please enter valid card id or add credit card before trying", "Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                    }
                }
                if (cardId_found) {
                    SetCreditLimit_GUI();
                    CvcNumber_frame.dispose();
                } else {
                    JOptionPane.showMessageDialog(bank_card_frame, "Card Id not found", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else if (e.getSource() == btn_add_ForSetCreditLimit) {
            int cvc =  Integer.parseInt(txt_input_CvcNumber_GUI.getText());
            boolean creditCardFound = false;
            for (Bank_Card obj_creditLimit : Arraylist_name) {
                if(obj_creditLimit instanceof Credit_Card && obj_creditLimit.get$card_id() == cvc) {
                    double new_credit_limit = Double.parseDouble(txt_creditLimit.getText());
                    int new_grace_period = Integer.parseInt(txt_gracePeriod.getText());
                    ((Credit_Card)obj_creditLimit).set$credit_limit(new_credit_limit,new_grace_period);
                    JOptionPane.showMessageDialog(setCreditLimit_frame,"Credit Limit added sucessfully");
                    creditCardFound = true;
                    setCreditLimit_frame.dispose();
                    break;
                }
            }
            if (!creditCardFound) {
                JOptionPane.showMessageDialog(bank_card_frame, "Credit Card not found", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } 
        if (e.getSource() == btn_cancelCreditLimit) {
            CancelCredit_GUI();
        }

        if (e.getSource() == btn_next_CancelCredit_GUI) {
            if (txt_input_CancelCredit_GUI.getText().equals("")) {
                JOptionPane.showMessageDialog(bank_card_frame, "Please enter Card Id", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                boolean creditCardFound = false;
                for(Bank_Card objk : Arraylist_name){
                    if (objk instanceof Credit_Card && ((Credit_Card)objk).get$card_id() == Integer.parseInt(txt_input_CancelCredit_GUI.getText())) {
                        if (((Credit_Card)objk).get$credit_limit() == 0.0) {
                            JOptionPane.showMessageDialog(bank_card_frame, "Credit limit not set for this card", "Error", JOptionPane.ERROR_MESSAGE);
                        } else {
                            ((Credit_Card)objk).cancel_credit_card();
                            JOptionPane.showMessageDialog(bank_card_frame, "Credit Cancelled sucessfully of Card Id "+ ((Credit_Card)objk).get$card_id() , "Sucess", JOptionPane.INFORMATION_MESSAGE);
                        }
                        creditCardFound = true;
                        break;
                    }
                }
                if (!creditCardFound) {
                    JOptionPane.showMessageDialog(bank_card_frame, "Credit Card not found", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        //to give functionality to 0-9 buttons
        if(e.getSource() == btn_of_1){
            if (txt_inputPin.getText().length() < 4) {
                txt_inputPin.setText(txt_inputPin.getText() + "1");
            }
        }
        if(e.getSource() == btn_of_2){if (txt_inputPin.getText().length() < 4) {
                txt_inputPin.setText(txt_inputPin.getText() + "2");
            }
        }
        if(e.getSource() == btn_of_3){if (txt_inputPin.getText().length() < 4) {
                txt_inputPin.setText(txt_inputPin.getText() + "3");
            }
        }
        if(e.getSource() == btn_of_4){if (txt_inputPin.getText().length() < 4) {
                txt_inputPin.setText(txt_inputPin.getText() + "4");
            }
        }
        if(e.getSource() == btn_of_5){if (txt_inputPin.getText().length() < 4) {
                txt_inputPin.setText(txt_inputPin.getText() + "5");
            }
        }
        if(e.getSource() == btn_of_6){if (txt_inputPin.getText().length() < 4) {
                txt_inputPin.setText(txt_inputPin.getText() + "6");
            }
        }
        if(e.getSource() == btn_of_7){if (txt_inputPin.getText().length() < 4) {
                txt_inputPin.setText(txt_inputPin.getText() + "7");
            }
        }
        if(e.getSource() == btn_of_8){if (txt_inputPin.getText().length() < 4) {
                txt_inputPin.setText(txt_inputPin.getText() + "8");
            }
        }
        if(e.getSource() == btn_of_9){if (txt_inputPin.getText().length() < 4) {
                txt_inputPin.setText(txt_inputPin.getText() + "9");
            }
        }
        if(e.getSource() == btn_of_0){if (txt_inputPin.getText().length() < 4) {
                txt_inputPin.setText(txt_inputPin.getText() + "0");
            }
        }
        if(e.getSource() == btn_of_delete){
            txt_inputPin.setText(""); 
        }

        //for Withdraw

        ////////Withdraw/////////////
        try{
            if(e.getSource() == btn_of_1){
                txt_input.setText(txt_input.getText() + "1");
            }

            if(e.getSource() == btn_of_2){
                txt_input.setText(txt_input.getText() + "2");
            }

            if(e.getSource() == btn_of_3){
                txt_input.setText(txt_input.getText() + "3");
            }

            if(e.getSource() == btn_of_4){
                txt_input.setText(txt_input.getText() + "4");
            }

            if(e.getSource() == btn_of_5){
                txt_input.setText(txt_input.getText() + "5");
            }

            if(e.getSource() == btn_of_6){
                txt_input.setText(txt_input.getText() + "6");
            }

            if(e.getSource() == btn_of_7){
                txt_input.setText(txt_input.getText() + "7");
            }

            if(e.getSource() == btn_of_8){
                txt_input.setText(txt_input.getText() + "8");
            }

            if(e.getSource() == btn_of_9){
                txt_input.setText(txt_input.getText() + "9");
            }

            if(e.getSource() == btn_of_0){
                txt_input.setText(txt_input.getText() + "0");
            }

            if(e.getSource() == btn_of_delete){
                txt_input.setText(""); 
            }
            if(e.getSource() == btn_of_withdraw){
                int a = Integer.parseInt(txt_input.getText());

            }
        }
        catch(NullPointerException r){

        }

        ///Go back buttons 
        //to go back from withdraw and pin
        if(e.getSource()==btn_goBackPin){

            frame_of_pin.dispose();
        }
        //go back from credit card check
        if(e.getSource()==btn_Goback_CreditId){

            CardId_frame.dispose();
        }

        if(e.getSource()==btn_goBackWithdraw){

            frame_of_withdraw.dispose();
        }

        if(e.getSource()==btn_Goback_CvcNumber_GUI){

            CvcNumber_frame.dispose();
        }

        if(e.getSource()==btn_goBack_display){

            display_frame.dispose();
        }

        if(e.getSource()==btn_goBack_setCreditLimit){

            setCreditLimit_frame.dispose();
        }

        if(e.getSource()==btn_Goback_CancelCredit_GUI){

            cancelCredit_frame.dispose();
        }

        //reset button 
        if(e.getSource() == btn_reset){
            txt_cardId.setText("");
            txt_clientName.setText("");
            txt_balanceAmount.setText("");
            txt_setPin.setText("");
            txt_Credit_cvcNumber.setText("");
            txt_Credit_interestRate.setText("");

        }

    }
}

