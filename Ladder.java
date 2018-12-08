import java.util.Scanner;
import java.lang.*;

public class Ladder
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int v = in.nextInt();
        
        System.out.println((int)Math.ceil(h / Math.sin((Math.toRadians(v)))));
    }
}