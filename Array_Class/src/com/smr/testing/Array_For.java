package com.smr.testing;

public class Array_For {
public static void main(String[] args) {
		
		int a[] = new int[8];
		a[0] = 20;
		a[1] = 40;
		a[3] = 60;
		a[4] = 80;
		a[5] = 100;
		a[6] = 120;
		
		System.out.println(a[5]);
		
		int l = a.length;
		System.out.println(l);
		System.out.println("-----");
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			System.out.println("--------");
			
		}
		
	}

}
