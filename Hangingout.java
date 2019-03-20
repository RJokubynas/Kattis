import java.util.*;

public class Hangingout {

    static Scanner in = new Scanner(System.in);

    public static void main(String args[]) {

    String le = in.nextLine();
    int limit = Integer.parseInt(le.substring(0,le.indexOf(" ")));
    int events = Integer.parseInt(le.substring(le.indexOf(" ")+1));
    int count = 0;
    int people = 0;

    for(int i=0; i<events; i++)
    {
        String temp = in.nextLine();

        if(temp.substring(0,5).equals("enter"))
            people += Integer.parseInt(temp.substring(temp.indexOf(" ")+1));

        if(temp.substring(0,5).equals("leave"))
            people -= Integer.parseInt(temp.substring(temp.indexOf(" ")+1));     

        if(people > limit)
        {
            count++;
            people-=Integer.parseInt(temp.substring(temp.indexOf(" ")+1));
        } 
    }
    System.out.println(count);

    }
}