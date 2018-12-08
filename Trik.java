import java.util.Scanner;

public class Trik 
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        
        String cups = in.nextLine();
        int count = 0;
        int res = 1;
        
        while(count <  cups.length())
        {
            
            if(cups.charAt(count) == 'A' && res!=3)
            {
                if(res == 1)
                {
                    res = 2;
                }
                else
                {
                    res = 1;
                }
            }
            else if (cups.charAt(count) == 'B'  && res!=1)
            {
                if(res == 2)
                {
                    res = 3;
                }
                else
                {
                    res = 2;
                }
            }
            else if (cups.charAt(count) == 'C' && res!=2)
            {
                if(res == 1)
                {
                    res = 3;
                }
                else
                {
                    res = 1;
                }
            }
            count++;
            
        }

        System.out.println(res);
    }
}