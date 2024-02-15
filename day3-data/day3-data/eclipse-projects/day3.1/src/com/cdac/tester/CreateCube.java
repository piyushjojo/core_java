package com.cdac.tester;

import java.util.Scanner;

import com.cdac.core.Box;

public class CreateCube {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side of a cube");
		Box cube=new Box(sc.nextDouble());
		System.out.println(cube.getBoxDims());
		System.out.println("vol "+cube.getVolume());
		//create def inited box with all sides = -1
		Box dummyBox=new Box();
		System.out.println(dummyBox.getBoxDims());
		sc.close();

	}

}
