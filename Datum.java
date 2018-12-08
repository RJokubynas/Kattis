import java.util.*;

public class Datum 
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();
        int month = in.nextInt();
        
        String days = "Monday Tuesday Wednesday Thursday Friday Saturday Sunday ";
        
        Calendar cal = Calendar.getInstance();
        cal.set(2009,month-1,day);
        Date date = cal.getTime();
        String dayToString = ("" + date).substring(0,3);
        
        for(int i=0; i<days.length(); i++)
        {
            if(dayToString.charAt(0) == days.charAt(i) && dayToString.charAt(1) == days.charAt(i+1) && dayToString.charAt(2) == days.charAt(i+2))
            {
                System.out.println(days.substring(i,days.lastIndexOf(' ',i+9)));
            }
        }
    }
}