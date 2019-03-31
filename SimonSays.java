import java.util.*;

public class SimonSays
{
  static Scanner in = new Scanner(System.in);

  public static void main(String [] args)
  {
    int len = Integer.parseInt(in.nextLine());

    for(int i=0; i<len; i++)
    {
      String ss = in.nextLine();
      if(ss.length() > 9)
        if(ss.substring(0,10).equals("Simon says"))
          System.out.println(ss.substring(11));
    }
  }
}
