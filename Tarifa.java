import java.util.Scanner;

public class Tarifa
{
    public static void main(String [] args)
    {
		Scanner in = new Scanner(System.in);

		int z = in.nextInt();
		int x = in.nextInt();

		int num[] = new int[x];

		for(int i=0; i<num.length; i++)
		{
			num[i] = in.nextInt();
		}

		System.out.println(mega(z,x,num));
    }

    public static int mega(int z, int x, int num[])
    {

		if(x == 0)
		{
			return z;
		}

		return z - num[x-1] + mega(z, x-1, num);
    }
}