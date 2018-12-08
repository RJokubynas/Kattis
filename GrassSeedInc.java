import java.util.Scanner;
import java.text.*;
public class GrassSeedInc
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        double cost = in.nextDouble();
        int size = in.nextInt();
        double fieldWL[][] = new double[size][2];
        double totalCost = 0;
        NumberFormat formatter = new DecimalFormat("#0.0000000");
        
        for(int i=0; i<size; i++)
        {
            for(int j=0; j<2; j++)
            {
               fieldWL[i][j] = in.nextDouble();
            }
            totalCost += cost * (fieldWL[i][0] * fieldWL[i][1]);
        }
        System.out.println(formatter.format(totalCost));
    }
}