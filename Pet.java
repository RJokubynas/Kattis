import java.util.Scanner;

public class Pet
{
	public static void main(String [ ] args)
	{
		Scanner in = new Scanner(System.in);
		int cont[][] = new int[5][4];
		int num = 0;
		int temp = 0;
		int res = 0;

		for(int i=0; i<5; i++)
		{
			for(int j=0; j<4; j++)
			{
				cont[i][j] = in.nextInt();
				temp += cont[i][j];
			}
			if(temp > res)
			{
				res = temp;
				num = i + 1;
			}
			temp = 0;

		}
		System.out.println(num + " " + res);
	}
}