import java.util.Scanner;

public class Kornislav
{
    public static void main(String [] args)
    {
    	Scanner in = new Scanner(System.in);
    	int steps[] = new int[4];
 		int a=0;
 		int b=0;
		int temp = 0;

    	for(int i=0; i<4; i++)
    	{
    		steps[i] = in.nextInt();
    	}

		for(int i=0; i<4; i++)
		{
			for(int j=0; j<4-i-1; j++)
			{
				if(steps[j] > steps[j+1])
				{
					temp = steps[j];
					steps[j] = steps[j+1];
					steps[j+1] = temp;
				}
			}

		}

		System.out.println(steps[0]*steps[2]);
    }
}