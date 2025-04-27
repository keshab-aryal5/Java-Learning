package datatypes;

import java.math.BigInteger;

public class BigNumbers {
	/*
	 * 
	 * ------------------ Big Numbers ----------------------------
	 * 1. BigInteger
	 * 2. BigDecimal
	 * 
	 */
	public static void main(String[] args) {
		BigInteger a= BigInteger.valueOf(Long.MAX_VALUE);
		BigInteger b= BigInteger.valueOf(Long.MAX_VALUE);
		BigInteger c = a.add(b);
		System.out.println(c);
	}
}
