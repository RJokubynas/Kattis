import java.util.Scanner;

public class ColdSci 
{
    public static void main(String args[])
    {
        
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int a[] = new int[x];
        int count = 0;
        
        for(int i=0; i<=a.length-1; i++)
        {
          a[i] = in.nextInt();
          
            if(a[i] < 0)
            {
                count++;
            }
            
        }
        System.out.println(count);
    }
}