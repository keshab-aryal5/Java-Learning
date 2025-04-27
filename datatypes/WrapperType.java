package datatypes;

public class WrapperType {
	public static void main(String[] args) {
		/*
		 *  ***************************Wrapper Classes *****************************************
		 *  every primitive data type has their respective class which is known as wrapper class.
		 *  
		 *  
		 *  byte ------ Byte
		 *  short 		Short
		 *  int			Integer
		 *  long		Long
		 *  float		Float
		 *  double		Double
		 *  char		Character
		 *  boolean		Boolean
		 *  
			 *  auto boxing
			 *  int k = 343;
			 *  Integer p = k; //auto boxing
			 *  
			 *  auto unboxing
			 *  Integer p = 3434;
			 *  int k = p // auto unboxing.
		 */
		System.out.println(Integer.toBinaryString(4555));
		System.out.println(Integer.toHexString(455550));
		
		System.out.println(Byte.SIZE);
	}
}
