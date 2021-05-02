package basic.java.easy.introduction;
import java.io.*;
import java.util.*;

public class Eof {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. 
         * Print the file content till EOF is encountered. */
    		
    	Scanner readFile = new Scanner(System.in);
    	String tempString;
    	int i=1;
    	while(readFile.hasNext()) {
    		
    		tempString= readFile.nextLine();
    		System.out.println(i +" "+tempString);
    		i++;
    	}
    	
    }
}