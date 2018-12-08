import java.util.Scanner;

public class Bijele
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        int ar[] = new int[6];
        
        for(int i=0; i<6; i++)
        {
            ar[i] = in.nextInt();
        }
        
        for(int i=0; i<2; i++)
        {
            if(ar[i] == 1)
            {
                System.out.print(0 + " ");
            }
            else
            {
                System.out.print(1 - ar[i] + " ");
            }
 
        }
        
        for(int i=2; i<5; i++)
        {
            if(ar[i] == 2)
            {
                System.out.print(0 + " ");
            }
            else
            {
                System.out.print(2 - ar[i] + " ");
            }
        }
        
            if(ar[5] == 8)
            {
                System.out.print(0);
            }
            else
            {
                System.out.print(8 - ar[5] + " ");
            }
    }
}