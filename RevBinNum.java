import java.util.Scanner;
import java.lang.*;

public class RevBinNum {
    public static void main(String []args) {

           Scanner in = new Scanner(System.in);
           
           int num = Integer.parseInt(in.nextLine());
           
           String digits = new String("01");
           String number = new String("");
           
           int position=0;
           
           while(num> 0) 
           {
               position = num % 2;
               number = number + digits.charAt(position);
               num = num/2;
           }
           
           int len = number.length();
           //num = Integer.parseInt(number);
           position = 0;
           
           for(int x=0; x<len; x++) 
           {
            
            position+=((Integer.parseInt(number.substring(len-x-1,len-x)))*Math.pow(2,x));
            num/=10;
            }
            System.out.println(position);
    }
}