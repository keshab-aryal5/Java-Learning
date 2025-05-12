package selfPractice.interfaceRevision.Question8;

public class PrinterServiceImpl implements PrinterSevice {

	@Override
	public void print(String message) {
		// TODO Auto-generated method stub
		System.out.println(message);
		
	}

	@Override
	public void print(int copies, String message) {
		// TODO Auto-generated method stub
		System.out.println(message + copies);
	}

}
