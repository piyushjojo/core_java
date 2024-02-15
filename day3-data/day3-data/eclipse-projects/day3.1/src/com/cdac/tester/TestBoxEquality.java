package com.cdac.tester;

import java.util.Scanner;

import com.cdac.core.Box;

public class TestBoxEquality {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st  box dims : w d h");
		Box b1=new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());//10 20 30
		System.out.println("Enter 2nd  box dims : w d h");
		Box b2=new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());//10 20 30
		System.out.println(b1.hashCode()+" "+b2.hashCode());
		System.out.println(b1.isEqual(b2) ? "Same Dim Boxes":"Different");
	//	System.out.println(this);
		sc.close();

	}

}
