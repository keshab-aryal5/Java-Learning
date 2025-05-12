package objectwithmethod;

public class BankTest {
	public static void main(String[] args) {
		//static or early binding
		Nabil nb = new Nabil();
		nb.getBankName();
		nb.interestRate();
		
		//up casting
		CentralBank bank = new NIC();
		bank.getBankName();
		
		BankTest bt = new BankTest();
		
		bt.printBank(bank);
	}
	
	//run time polymorphism
	void printBank(CentralBank bank)
	{
		bank.getBankName();
		bank.interestRate();
	}
}