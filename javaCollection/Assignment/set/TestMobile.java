package javaCollection.Assignment.set;

import java.util.HashSet;
import java.util.Set;

public class TestMobile {
	public static void main(String[] args) {
		Set<Mobile> mobileSet = new HashSet<>();
		mobileSet.add(new Mobile("Samsung","sm-a24",590000));
		mobileSet.add(new Mobile("Samsung","sm-a24",590000));
		mobileSet.add(new Mobile("Real me","rm-s23",450000));
		mobileSet.add(new Mobile("Lava","lava-l23",590000));
		
		System.out.println(mobileSet);
	}
}
