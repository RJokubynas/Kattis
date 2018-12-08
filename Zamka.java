import java.util.Scanner;

public class Zamka 
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        
        int low = in.nextInt();
        int high = in.nextInt();
        int num = in.nextInt();
        
        while(numFind(low) != num)
        {
            low++;
        }
        System.out.println(low);
        
        while(numFind(high) != num)
        {
            high--;
        }
        System.out.println(high);
    }
    
    public static int numFind(int find)
    {
        int counter = 0;
        
        while(find > 0)
        {
            counter += find % 10;
            find = find / 10;
        }
        return counter;
    }
}