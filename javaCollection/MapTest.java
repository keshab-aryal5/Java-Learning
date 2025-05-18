package javaCollection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
//		Map<String,Integer> map = new HashMap<>();
//		Map<String,Integer> map = new TreeMap<>();
		
		Map<String,Integer> map = new LinkedHashMap<>();
		map.put("English",91);
		map.put("Nepali", 90);
		map.put("Math", 50);
		map.put("Social", 98);
		
		System.out.println(map);
		System.out.println(map.values());
		System.out.println(map.keySet());
	}
}
