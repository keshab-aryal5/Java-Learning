package javaCollection.Assignment.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestCow {
	public static void main(String[] args) {
		Set<Cow> cowSet = new LinkedHashSet<>();
		
		cowSet.add(new Cow("kali",4,3.5));
		cowSet.add(new Cow("gori",5,3.6));
		cowSet.add(new Cow("kali",4,3.5));
		
		System.out.println(cowSet);
	}
}
