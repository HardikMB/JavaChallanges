package basic.java.easy.introduction;

import java.util.Scanner;

public class JavaLoops {
	static Scanner readInput = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Java Loops Challanges\n" 
							+ "1.Java Loops I\n" + "2.Java Loops II"
							+ "\nSelecct Challange:\n");
	
		int selectedChallange = readInput.nextInt();
		switch (selectedChallange) {
		case 1:
			System.out.println("Selected Java Loops I");
			firstLoopChallange() ;
			break;
		case 2:
			secondChallange();
			break;
		default:
			break;
		}
	}
	
	public static void firstLoopChallange() {
		System.out.println("Objective: \n"+
		"In this challenge, we're going to use loops to help us do some simple math by\n"+
		"print a table of integer accepted as input only within range of 2 to 20.");
		
		System.out.println("Select an integer:");
		int number = readInput.nextInt();
	
		if(number>=2 && number<=20) 
			for (int i = 1; i <=10; i++) {
				System.out.println(number +" x " + i + " = "+number*i   );
		}
	}
	
	public static void secondChallange() {
		System.out.println("Create  series as shown using three integers a ,b,n for Q number of times\n"
				+"(a + 2^0 *b) +(a + 2^1 * b) + (a + 2^2 * b) ..(a + 2^(n-1) *b) ");
		
		System.out.println("Input number of times Q:");
		int qTimes = readInput.nextInt();
		int a,b,n;
		
		for (int i = 0; i < qTimes; i++) {
			a = readInput.nextInt();
			b = readInput.nextInt();
			n = readInput.nextInt();
			int temp =0;
			for (int j = 0; j < n ; j++) {
				
				System.out.print(temp+ a+(int) Math.pow(b,j ) * b  +" "  );
				
				temp = temp+(((int)Math.pow(2,j))*b);
			}
			System.out.println("\nEnter Next sequence of a,b,n:");
		}

	}
}
