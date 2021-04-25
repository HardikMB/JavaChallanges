package basic.java.easy.introduction;

import java.util.*;


class DataTypes{
    public static void main(String []argh)
    {

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if(x>=-32768 && x<=32767)System.out.println("* Short");
                if(x>=-1* (Math.pow(2, 31)) && x<=(Math.pow(2, 31)-1))System.out.println("* Integer");
                if(x>= -1* (Math.pow(2, 63)) && x<= (Math.pow(2, 63)-1))System.out.println("* Long");
               sc.close();

                //Complete the code
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}



