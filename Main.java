package com.gmail.kostamazanenko;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		BlackList bl = new BlackList(2);
		Stack stack = new Stack(10, bl);
		
		Class cl = bl.getClass();
		bl.addClass(cl.getClass());
		
		stack.add(new Scanner(System.in));
		
		try {
			stack.add(new PrintWriter("hhhh.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		stack.add(cl);

		System.out.println(stack.getHead().getClass());
	}

}
