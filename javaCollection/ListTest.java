package javaCollection;

import java.util.LinkedList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
//		List<String> list = new ArrayList<>();
		List<String> list = new LinkedList<>();
		
		list.add("Nepal");
		list.add("India");
		list.add("Pakistan");
		list.add("Bhutan");
		
		for(String s: list)
		{
			System.out.println(s);
		}
	}
}
