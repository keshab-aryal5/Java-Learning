package datatypes;

public class TypeCasting {
	public static void main(String[] args) {
		/*
		 * *** Type Casting*****
		 * #syntax:
		 * 	data_type var = (data_type) value;
		 * 1.implicit casting (automatic)
		 * byte -> short -> int ->long -> float -> double
		 * 2.explicit casting.
		 * double->float->long->int->short->byte->char
		 */
		byte c = 111;
		int d = c; // auto casting...
		
		double k = 546784343.23434;
		int m = (int)k;
//		float f = (float)k; //explicit casting....
		int f = (int)k;
		System.out.println(f);
		
		
	}
}
