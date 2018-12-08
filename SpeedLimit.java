import java.util.Scanner;

public class SpeedLimit
{
    public static void main(String [] args)
    {
    	Scanner in = new Scanner(System.in);
		int sum = 0;
		int n = 0;

    	while(n > -1)
    	{
    		n = in.nextInt();
    		if(n==-1)
    		{
    			System.exit(0);
    		}
    		int speed[][] = new int[n][2];

    		for(int j=0; j<n; j++)
    		{
    			speed[j][0] = in.nextInt();
    			speed[j][1] = in.nextInt();

    			if(j>0)
    			{
    				sum += speed[j][0] * (speed[j][1] - speed[j-1][1]);
    			}
    			else
    			{
    				sum += (speed[j][0] * speed[j][1]);
    			}
    		}
    		System.out.println(sum + " miles");
    		sum = 0;
    	}
    }
}