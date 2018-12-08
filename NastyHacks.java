import java.util.Scanner;

public class NastyHacks
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int adv[][] = new int[size][3];
        
        for(int i=0; i<size; i++)
        {
            for(int j=0; j<3; j++)
            {
               adv[i][j] = in.nextInt();
            }
            
            if(adv[i][0] > (adv[i][1] - adv[i][2]))
            {
                System.out.println("do not advertise");
            }
            else if(adv[i][0] < (adv[i][1] - adv[i][2]))
            {
                System.out.println("advertise");
            }
            else if(adv[i][0] == (adv[i][1] - adv[i][2]))
            {
                System.out.println("does not matter");
            }
        }
    }
}