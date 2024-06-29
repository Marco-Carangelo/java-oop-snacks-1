package org.java.snacks.lesson.snack4;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		
		String temp;
		
		names.add("Marco");
		names.add("Riccardo");
		names.add("Giovanni");
		names.add("Andrea");
		names.add("Martina");
		names.add("Eleonora");
		names.add("Giorgio");
		names.add("Davide");
		
		
		
		System.out.println(names);
		
		//A
		
		temp = names.get(0);
		names.set(0, names.get(3));
		names.set(3,temp);
		
		temp = names.get(1);
		names.set(1, names.get(7));

		names.set(7,temp);
		
		temp = names.get(2);
		names.set(2, names.get(5));
		names.set(5,temp);
		
		temp = names.get(3);
		names.set(3, names.get(6));
		names.set(6,temp);
		
		temp = names.get(4);
		names.set(4, names.get(5));
		names.set(5,temp);
		
		
		
		System.out.println(names);
		
	}
	
	
}
