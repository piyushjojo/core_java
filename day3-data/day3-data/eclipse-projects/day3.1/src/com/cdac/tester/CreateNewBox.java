package com.cdac.tester;

import java.util.Scanner;

import com.cdac.core.Box;

public class CreateNewBox {

	public static void main(String[] args) {
	//	System.out.println(this);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st  box dims : w d h");
		Box b1 = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());// 10 20 30
		System.out.println(b1.getBoxDims());
		System.out.println("Enter dim offsets to create another box w.r.t to earlier box : woff doff hoff");
		Box newBox=b1.createNewBox(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		System.out.println(newBox.getBoxDims());
		System.out.println("new box' hashcode "+newBox.hashCode());
		sc.close();

	}

}
