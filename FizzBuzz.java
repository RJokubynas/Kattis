import java.util.Scanner;

public class FizzBuzz
{
    public static void main(String [] args)
    {
    	Scanner in = new Scanner(System.in);

    	int x = in.nextInt();
    	int y = Integer.parseInt(in.next());
    	int n = Integer.parseInt(in.next());

    	for(int i = 1; i<=n; i++)
    	{
    		if(i%x == 0 && i%y == 0)
    		{
    			System.out.println("FizzBuzz");
    		}
    		else if(i%x == 0)
    		{
    			System.out.println("Fizz");
    		}
    		else if(i%y == 0)
    		{
    			System.out.println("Buzz");
    		}
    		else
    		{
    			System.out.println(i);
    		}



    	}

    }
}