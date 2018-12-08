import java.util.Scanner;
import java.lang.*;

public class NoDuplicates
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String str[] = in.nextLine().split(" ");
        
        for(int i=0; i<str.length; i++)
        {
            for(int j=i; j<str.length-1; j++)
            {
                if(str[i].equals(str[j+1]) == true)
                {
                    System.out.println("no");
                    System.exit(0);
                }
            }
        }
        System.out.println("yes");        
    }
}