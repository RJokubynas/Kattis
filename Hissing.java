import java.util.Scanner;

public class Hissing 
{
    public static void main(String args[])
    {
        
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        String z = "";
        boolean b = false;
        
        for(int i=0; i<x.length()-1; i++)
        {
            z = x.substring(i,i+2);
            
            if(z.equals("ss"))
            {
                b = true;
            }
            
        }
        if(b==true)
        {
            System.out.println("hiss");
        }
        else if(b==false)
        {
            System.out.println("no hiss");
        }
    }
}