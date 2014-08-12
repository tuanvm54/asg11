
class TransactionRecord extends AccountRecord{
	public int AccountNumber;
	public double Amount;
        
	public TransactionRecord(int accnum, double am){
		setAccountNumber(accnum);
		setAmount(am);
                getAccountNumber();
                getAmount();
		}
	public void setAccountNumber(int accnum){
		this.AccountNumber = accnum;
		}
	public int getAccountNumber(){
		return this.AccountNumber;
		}
	public void setAmount(double am){
		this.Amount = am;
		}
	public double getAmount(){
		return this.Amount;
		}
        public double combine01(){
        return this.Amount;
        }
}



 class AccountRecord{
    private int account;
    private String firstName;
    private String lastName;
    private double balance;
    private double balanceAfter;
    public double result;
    public AccountRecord(){
    this (0, "", "", 0.0);
    }
    public AccountRecord(int acct, String first, String last, double bal){
    setAccount(acct);
    setFirstName(first);
    setLastName(last);
    setBalance(bal);
    }
    
    public void setAccount(int acct){
    this.account = acct;
    }
    public int getAccount(){
    return this.account;
    }
    
    public void setFirstName(String first){
    firstName = first;
    }
    public String getFirstName(){
    return firstName;
    }
    
    public void setLastName(String last){
    lastName = last;
    }
    public String getLastName(){
    return lastName;
    }
    
    public void setBalance(double bal){
    this.balance = bal;
    }
    public double getBalance(){
    return this.balance;
    }
    
    public double combine02(){
    return this.balance;
    }
    // Method Combine
    public double combine(double x, double y)
    {
    result = x - y;
    return result;
    }
    //End method Combine
 }


public class AccRecord{
    public static void main(String[] args) {
    AccountRecord test = new AccountRecord(1102, "VuManh", "Tuan", 100324.48);
    TransactionRecord add = new TransactionRecord( 1102 , 2030.68);
    System.out.print("Account: " + test.getAccount() + " | ");
    System.out.print("FirstName: " + test.getFirstName() + " | ");
    System.out.print("LastName: " + test.getLastName() + " | ");
    System.out.println("Balance: " + test.getBalance() + "$");
    System.out.print("Account: " + add.getAccountNumber() + " | ");
    System.out.println("Amount: " + add.getAmount() + "$");
    
    if(test.getAccount() == add.getAccountNumber())
    {
    System.out.println("Matching Account !");
    System.out.println("Outstanding Balance: " + test.combine(test.combine02(), add.combine01()) + "$");
    }
    
    }
}


    

