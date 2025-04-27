package controlStatement.looping;

public class ForEachTest {
	/*
	 * *********************************** For Each ******************************
	 * #used to read data from collection (array, map,list,set etc)
	 * 
	 * Syntax:
	 * 		for(dataType var:collection)
	 * {
	 *  	body...
	 * }
	 */
	public static void main(String[] args) {
		int values[] = {2,34,2,35,64,27,17,67};
		int sum = 0;
		for(int x:values) {
			sum += x;
		}
		System.out.println(sum);
	}
}
