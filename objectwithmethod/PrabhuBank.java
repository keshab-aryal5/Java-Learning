package objectwithmethod;

public class PrabhuBank extends CentralBank{
	@Override
	void getBankName()
	{
		System.out.println("Prabhu Bank");
	}
	@Override
	void interestRate() {
		// TODO Auto-generated method stub
		System.out.println("5%");
	}

}
