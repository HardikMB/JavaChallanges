package basic.java.easy.introduction;
import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.io.*;
import java.util.*;

public class StringOpsPalindrome {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuffer reverseA = new StringBuffer(A).reverse();
        if(A.contains(reverseA.toString())) {
        	System.out.println("Yes");
        }
        else 
        {
        	System.out.println("No");
        }
     
    }
}
