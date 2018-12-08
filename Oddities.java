import java.util.Scanner;

public class Oddities 
{
    public static void main(String args[])
    {
        
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int a = 0;
        int b = 0;
        
        for(int i=0; i<x; i++)
        {
            b = in.nextInt();
            a = b%2;
            
            if(a == 1 || a == -1)
            {
                System.out.println(b + " is odd");
            }
            else
            {
                System.out.println(b + " is even");
            }
        }
    }
}
