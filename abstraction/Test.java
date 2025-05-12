package abstraction;

public class Test {
	public static void main(String[] args) {
		CentralBank bank = new NabilBank();
		bank.getBankName();
		bank.getInteresetRate();
	}
}
