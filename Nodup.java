import java.util.*;

public class Nodup{
  static Scanner in = new Scanner(System.in);
  static Map<String,Integer> words = new HashMap<String,Integer>();

  public static void main(String [] args)
  {
    String[] sen = in.nextLine().split(" ");

    if(checkDup(sen))
      System.out.println("no");
    else
      System.out.println("yes");

    in.close();
  }

  public static boolean checkDup(String[] sen)
  {
      for(String i : sen)
      {
        Integer f = words.get(i);
        if (f == null)
            words.put(i, 1);
        else
            return true;
        }
      return false;
  }
}
