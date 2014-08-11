class TransactionRecord {
	public int AccountNumber;
	public double Amount;
	public TransactionRecord(int accnum, double am){
		setAccountNumber(accnum);
		setAmount(am);
                getAccountNumber();
                getAmount();
		}
	public void setAccountNumber(int accnum){
		AccountNumber = accnum;
		}
	public int getAccountNumber(){
		return AccountNumber;
		}
	public void setAmount(double am){
		Amount = am;
		}
	public double getAmount(){
		return Amount;
		}	
}

public class TransRecord {
	public static void main(String[] args) {
		TransactionRecord add = new TransactionRecord( 10141 , 2030.68);
		System.out.println("AccountNumber: " + add.getAccountNumber());
		System.out.println("Amount: " + add.getAmount() + "$");
	}	
}
