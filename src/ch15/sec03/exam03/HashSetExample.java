package ch15.sec03.exam03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.w3c.dom.ls.LSOutput;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Java");
		
		// Iterator를 이용하여 객체를 하나씩가져와 제거
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
			if (element.equals("JSP"));
			iterator.remove();
		}
		System.out.println();
		
		// set의 remove를 이용하여 제거
		set.remove("JDBC");
		
		for(String element: set) {
			System.out.println(element);
		}
	}
	
	
	

}
