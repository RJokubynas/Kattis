import java.util.Scanner;

public class BatterUp
{
    public static void main(String [] args)
    {
		Scanner in = new Scanner(System.in);

		int x = in.nextInt();
		in.nextLine();
		double res = 0;
		double count =0;

		String num[] = in.nextLine().split(" ");

		for(int i=0; i<num.length; i++)
		{
			if(Integer.parseInt(num[i]) > -1)
			{
				res += Double.parseDouble(num[i]);
				count += 1;
			}
		}
		System.out.println(res/count);
    }
}