/**
 * DebitCard allows to withdraw amount from bank account
 * @author (Rodrik Shahi "AI2")
 * @version (17.0.4.1)
 */
public class  Debit_Card extends Bank_Card // Child class is created and linked to parent class
{
    // Declaring variables with their datatype
    private int pin_number;
    private int amount_to_withdraw;
    private String date_of_withdrawal;
    private boolean withdrawal_status;
    
    // Constructor with the paramaters inclosed inside paranthsis is created
    public Debit_Card(int card_id, int balance_amount, String bank_account, String issuer_bank,String client_name,int pin_number)
    {
        super(card_id,balance_amount,bank_account, issuer_bank); // calling parameters from Bank_Card
        super.set$client_name(client_name); //calling mutator method of client_name from Bank_Card and setting client's name
        this.pin_number= pin_number;
        this.amount_to_withdraw=amount_to_withdraw;
        this.withdrawal_status = false;
    }
    /** Accessor method to get access to private variables **/
    public int get$pin_number()
    {
        return this.pin_number;
    }
    public boolean get$withdrawal_status()
    {
        return this.withdrawal_status;
    }
    public int get$amount_to_withdraw()
    {
        return this.amount_to_withdraw;
    }
    /** Mutator method for amount_to_withdraw **/
      public void set$amount_to_withdraw(int amount_to_withdraw)
    {
        this.amount_to_withdraw=amount_to_withdraw;
    }
    public void with_draw(int amount_to_withdraw,String date_of_withdrawal,int pin_number)
    {
        // IF condition compares the orginal pin_number and entered pin number and if it matches enters nested loop else exits to ELSE statement
       if (this.pin_number==pin_number){
           // if amount_to_withdraw is less or equal to balance_amount IF condition executes else ELSE condition executes
           if (amount_to_withdraw <= super.get$balance_amount()){
           System.out.println("Amount withdrawal sucessfully executed ");
           System.out.println("Thank You");
           this.withdrawal_status=true;
           this.amount_to_withdraw=amount_to_withdraw;
           this.date_of_withdrawal=date_of_withdrawal;
           int new_balance_amount=super.get$balance_amount()-this.get$amount_to_withdraw();
           super.set$balance_amount(new_balance_amount);
           }
           else{
           System.out.println("Sorry you have insufficient balance to continue this transaction");
           }
       }
       else{
           System.out.println("Dear user you have entered wrong pin");
           System.out.println("Please Try Again");
       }
       
    }
    // Display method that displays suitable message is created
       public void display()
       {
       // if withdrawal_status is true IF condition executes if not ELSE condition gets executed
       if (this.withdrawal_status == true){
           super.display(); // Calls display method from Bank_Card
           System.out.println("Dear user you pin number is " + this.pin_number);
           System.out.println("You have withdrawn " +this.amount_to_withdraw +(" On ")+ date_of_withdrawal);
           
       }
       else{
           System.out.println("Dear costumer you haven't carried out any transaction yet");
           System.out.println("Your balance amount is " + super.get$balance_amount());
       }
    }
    }


