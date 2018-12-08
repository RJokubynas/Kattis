import java.util.Scanner;

public class NumberFun
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        double num[][] = new double[test][3];
        
        for(int i=0; i<test; i++)
        {
            for(int j=0; j<3; j++)
            {
               num[i][j] = in.nextDouble();
            }
            
            if((num[i][0] + num[i][1]) == num[i][2])
            {
                System.out.println("Possible");
            }
            else if((num[i][0] - num[i][1]) == num[i][2] || (num[i][1] - num[i][0]) == num[i][2])
            {
                System.out.println("Possible");
            }
            else if((num[i][0] * num[i][1]) == num[i][2])
            {
                System.out.println("Possible");
            }
            else if((num[i][0] / num[i][1]) == num[i][2] || (num[i][1] / num[i][0]) == num[i][2])
            {
                System.out.println("Possible");
            }
            else
            {
                System.out.println("Impossible");
            }
    }
    }
}