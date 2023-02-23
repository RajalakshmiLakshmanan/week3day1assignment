package week3day1.assignment;

public class AxisBank extends BankInfo{
      public void deposit() {
    	  System.out.println("deposit at Axis Bank");
      }
	public static void main(String[] args) {
		AxisBank account = new AxisBank();
		account.fixed();
		account.saving();
		account.deposit();	

	}

}
