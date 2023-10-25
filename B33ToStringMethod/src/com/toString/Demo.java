package com.toString;

public class Demo {
		
		public static void main(String[] args) {
			Student s = new Student();
			s.id = 101;
			s.name = "cat";
			s.address="goa";
			
			System.out.println(s); // here hash-code gets generated
		}
}

      // Hashcode is 'alphanumeric number'
