package basic.java.easy.introduction;
import java.io.*;
import java.util.*;
import java.util.Locale.IsoCountryCode;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CurrencyFormatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        if(payment <=0 || payment<=Math.pow(10,9)){
            // Write your code here.
              Locale ind = new Locale("en", "IN");
            // Write your code here.
           NumberFormat a  = NumberFormat.getCurrencyInstance(Locale.US);
           String  us= a.format(payment);
           
           NumberFormat in =   NumberFormat.getCurrencyInstance(ind);
           String india = in.format(payment);
           
           NumberFormat chn =   NumberFormat.getCurrencyInstance(Locale.CHINA);
           String china = chn.format(payment);
           
           NumberFormat frn =   NumberFormat.getCurrencyInstance(Locale.FRANCE);
           String france = frn.format(payment);
           
            System.out.println("US: " + us);
            System.out.println("India: " + india);
            System.out.println("China: " + china);
            System.out.println("France: " + france);
        }
       } 
}