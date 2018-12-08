import java.util.Scanner;

public class Faktor
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        
        System.out.println((a*(b-1)) + 1);
        
    }
}