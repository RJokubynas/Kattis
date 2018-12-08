import java.util.Scanner;

public class Filip 
{
    public static void main(String args[])
    {
        
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        String revX = "";
        String revY = "";
        
        for(int i=2; i>=0; i--)
        {
            revX += "" + x.charAt(i);
            revY += "" + x.charAt(i+4);
            
        }
        if(Integer.parseInt(revX) > Integer.parseInt(revY))
        {
            System.out.println(revX);
        }
        else if(Integer.parseInt(revX) < Integer.parseInt(revY))
        {
            System.out.println(revY);
        }
    }
}