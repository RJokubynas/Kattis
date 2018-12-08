import java.util.Scanner;

public class QALY
{
	public static void main(String []args)
	{
		Scanner in = new Scanner(System.in);

		int num = in.nextInt(); //Periods of QALY
		double count = 0.0;

		for(int i=0; i<num; i++)
		{
			count += in.nextDouble() * in.nextDouble();
		}

		System.out.printf("%.3f",count);
	}
}