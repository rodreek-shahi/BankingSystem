/**
 * CreditCard checks sets credit_limit and also cancels it if necessary
 * @author (Rodrik Shahi "AI2")
 * @version (17.0.4.1)
 */
public class Credit_Card extends Bank_Card // Child class is created and linked to parent class
{
    // Declaring variables with their datatype
    private int cvc_number;
    private double credit_limit;
    private double interest_rate;
    private String expiration_date;
    private int grace_period;
    private boolean is_granted;
    
    // Constructor with the paramaters inclosed inside paranthsis is created
    public Credit_Card(int card_id,int balance_amount,String bank_account,String issuer_bank,String client_name,int cvc_number,double interest_rate,String expiration_date)
    {
        super(card_id,balance_amount,bank_account,issuer_bank);// calling parameters from Bank_Card
        super.set$client_name(client_name);//calling mutator method of client_name from Bank_Card and setting client's name
        this.cvc_number=cvc_number;
        this.interest_rate=interest_rate;
        this.expiration_date=expiration_date;
        this.grace_period=grace_period;
        this.is_granted=false;
    }
    /** Accessor method to get access to private variables **/
    public int get$cvc_number()
    {
        return this.cvc_number;
    }
    public double get$credit_limit()
    {
        return this.credit_limit;
    }
    public double get$interest_rate()
    {
        return this.interest_rate;
    }
    public String get$expiration_date()
    {
        return this.expiration_date;
    }
    public int get$grace_period()
    {
        return this.grace_period;
    }
    public boolean get$is_granted()
    {
        return this.is_granted;
    }
    // set$credit_limit mutator method is created
    public void set$credit_limit(double new_credit_limit,int new_grace_period)
    {
        // if new_credit_limit does not exceeds 2.5 times balance_amount IF condition executes or ELSE condition gets executed
        if(new_credit_limit<=super.get$balance_amount()*2.5){
            System.out.println("Credit is granted");
            this.is_granted=true;
            this.credit_limit=new_credit_limit;
            this.grace_period=new_grace_period;
        }
        else{
            System.out.println("The credit cannot granted because it exceeds your balance amount");
            System.out.println("Please try lowering the credit limit");
            System.out.println("Thank you");
        }
    }
    // Calling this method sets the value of cvc_number, credit_limit and grace_period to 0 and is_granted to false
    public void cancel_credit_card()
    {
        this.cvc_number=0;
        this.credit_limit=0;
        this.grace_period=0;
        this.is_granted=false;
    }
    // Display method that displays suitable message is created
    public void display()
    {
        // if is_granted is true IF condition executes if not ELSE condition gets executed
        if(is_granted == true){
            super.display(); // Calls display method from Bank_Card
            System.out.println("Similarly your credit limit is "+this.credit_limit +" and grace period is "+this.grace_period);
        }
        else{
            super.display();
            System.out.println("No card issued");
        }
    }
}

