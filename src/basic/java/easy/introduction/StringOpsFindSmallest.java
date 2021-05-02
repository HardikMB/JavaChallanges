package basic.java.easy.introduction;

import java.io.*;
import java.util.*;

public class StringOpsFindSmallest {

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";

		// Complete the function
		// 'smallest' must be the lexicographically smallest substring of length 'k'
		// 'largest' must be the lexicographically largest substring of length 'k'
		if (s.length() <= 1000 && s.length() >= 1 && s.matches("[a-z]+") ) {
			TreeSet<String> myTs = new TreeSet<>();
			for (int i = 0; i < s.length() - k + 1; i++) {
				myTs.add(s.substring(i, i + k));
			}

			smallest = myTs.first();
			largest = myTs.last();
			return smallest + "\n" + largest;

		}
		return null;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}
}