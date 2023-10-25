package com;

import com.bb.B;
import com.bb.C;

public class Demo {
	public static void main(String[] args)
	{
		System.out.println("hii eclipseIDE");
		System.out.println("omkar wellcome");
		B b=new B(); 
		System.out.println(b);
		b.m1();
		
		//obj creation of C class.
		C cc = new C();
		System.out.println(cc.id);
		System.out.println(cc.name);
		cc.m2();
	}
		
}
