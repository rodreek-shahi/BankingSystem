import java.util.ArrayList;

/**
 * BankCard checks whether client_name is empty or not 
 * @author (Rodrik Shahi "AI2")
 * @version (17.0.4.1)
 */
public class Bank_Card //Parent class is created
{
    // Declaring variables with their datatype
   private int card_id; 
   private String client_name; 
   private String issuer_bank; 
   private String bank_account;
   private int balance_amount;
   
   public Bank_Card(int card_id,int balance_amount,String bank_account,String issuer_bank) 
   // Constructor with the paramaters inclosed inside paranthsis is created
   {
       this.card_id=card_id; 
       this.client_name="";
       this.issuer_bank=issuer_bank;
       this.bank_account=bank_account;
       this.balance_amount=balance_amount;
   }
   // Accessor method for every private variable is created
   public int get$card_id() 
    {
       return this.card_id; 
    }
   public String get$bank_account()
    {
       return this.bank_account;
    }
   public String get$issuer_bank()
    {
       return this.issuer_bank;
    }
   public String get$client_name()
    {
       return this.client_name;
    }
   public int get$balance_amount()
    {
       return this.balance_amount; 
    }
    // mutator method for client_name and balance_amount is created
   public void set$client_name(String client_name)
   {
     this.client_name= client_name;
   }
   public void set$balance_amount(int balance_amount)
   {
       this.balance_amount=balance_amount;
   }
   // Display method that displays suitable message is created
   public void display()
   { 
       //if statement checks whether client_name is empty or not, if yes displays assigned message and if not displays assigned message
     if (client_name == ""){ 
         System.out.println("Invalid request: Client name is empty, please enter client name");
     }
     else{
         System.out.println("Mr/Miss "+client_name + " Your account  is " +bank_account + " type.");
         System.out.println(" Your card id is "+ card_id +" of the bank "+ issuer_bank +" and your total balance is " + balance_amount);
         System.out.println("This information is confidencial. Please keep it secret");
     }
   }
   
}
