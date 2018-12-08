import java.util.Scanner;
import java.lang.*;

public class Planina
{
    public static void main(String [] args)
    {
    Scanner in = new Scanner(System.in);
    int iter = in.nextInt();

    System.out.println(Points(iter,1,1));
    }

    public static int Points(int iter, int num, int pnt)
    {
        if(iter==0)
        {
            return pnt;
        }

        if(iter>0)
        {
            for(int i=0; i<Math.pow(2,iter); i++)
            {
                num+=2;
                pnt = pnt + num;
            }
        return pnt;
        }
      return 0;
    }

}