package basic.java.easy.introduction;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AreaCalculator {
	static boolean flag;
	static int B, H;
	static {

		Scanner readInputs = new Scanner(System.in);

		B = readInputs.nextInt();
		H = readInputs.nextInt();
		if (B >= -100 && B <= 100 && H >= -100 && H <= 100) {
			if (B > 0 && H > 0)
				flag = true;
			else
				flag = false;
		}

	}

	public static void main(String[] args) {

		if (flag) {

			int area = B * H;
			System.out.print(area);
		} else
			System.out.println("java.lang.Exception: Breadth and height must be positive");
	}// end of main

}// end of class
