package javaCollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
	public static void main(String[] args) {
//		Set<String> set = new HashSet<>();
//		Set<String> set = new TreeSet<>();
		
		Set<String> set = new LinkedHashSet<>();
		set.add("Java");
		set.add("Sql");
		set.add("sql");
		set.add("Java");
		set.add("php");
		set.add("android");
		
		for(String s: set)
		{
			System.out.println(s);
		}
		
	}
}
