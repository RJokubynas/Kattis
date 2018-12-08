import java.util.Scanner;

public class JudgingMoose
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int r = in.nextInt();
        
        if(l > 0 || r > 0)
        {
            if(l > r)
            {
                System.out.println("Odd " + (l*2));
            }
            else if(r > l)
            {
                System.out.println("Odd " + (r*2));
            }
            else
            {
                System.out.println("Even " + (l*2));
            }
        }
        else if(l <= 0 && r <= 0)
        {
            System.out.println("Not a moose");
        }
    }
}