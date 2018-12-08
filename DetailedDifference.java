import java.util.Scanner;

public class DetailedDifference 
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String str[] = new String[len*2];
        String dD[] = new String[len*2];
        
        for(int i=0; i<len*2 ; i++)
        {
            str[i] = in.next();
        }
        
        for(int i=0; i<len*2; i+=2)
        {
            dD[i] = "";
            for(int j=0; j<str[i].length(); j++)
            {
                if(str[i].charAt(j) == str[i+1].charAt(j))
                {
                    dD[i] += ".";
                }
                else
                {
                    dD[i] += "*";
                }
            }
            System.out.println(str[i] + "\n" +  str[i+1] + "\n" + dD[i] + "\n");
            
        }
    }
}