//Luhn's Checksum Algorithm

import java.util.Scanner;

public class LuhnCheckAlg {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        int len = in.nextInt();
        String cc[] = new String[len];
        
        for(int i=0; i<len; i++)
        {
            cc[i] = in.next();
            
            if(CC_Check(cc[i]))        //simple if else to check if Luhn's Algorithm works
                {
                    System.out.println("PASS");
                }
                else
                {
                    System.out.println("FAIL");
                }
            }
        }


public static boolean CC_Check(String cc) {
    
            boolean check = false;    //transform check
            int totalCheck = 0;   //holds number of all digits (after check) added

                for(int j=cc.length()-1; j>=0; j--)
                {
                    int digit = Integer.parseInt(cc.substring(j,j+1));
                    
                    if(check)
                    {
                        digit *= 2;
                        if(digit > 9)
                        {
                            digit = (digit%10) + 1;
                        }
                    }
                    totalCheck += digit;
                    check = !check;
                }
                return (totalCheck % 10 == 0);        
    }
}