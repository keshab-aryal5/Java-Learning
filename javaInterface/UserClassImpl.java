package javaInterface;

public class UserClassImpl implements UserService ,CommonService{

	@Override
	public void addUser() {
		// TODO Auto-generated method stub
		System.out.println("User added");
	}

	@Override
	public void deleteUser() {
		// TODO Auto-generated method stub
		System.out.println("user deleted");
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(".....Printing....");
	}
	


}
