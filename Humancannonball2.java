import java.util.*;
import java.math.*;

public class Humancannonball2 {
  static Scanner in = new Scanner(System.in);

  public static void main(String []args)
  {
    int len = Integer.parseInt(in.nextLine());

    for(int i=0; i<len; i++)
    {
      String s = in.nextLine();
      String[] ss = s.split(" ");
      System.out.println(calc(Double.parseDouble(ss[0]),Double.parseDouble(ss[1]),Double.parseDouble(ss[2]),Double.parseDouble(ss[3]),Double.parseDouble(ss[4])));
    }
  }

  public static String calc(double velocity, double angle, double distance, double height1, double height2)
  {
    String ans = "Not Safe";
    double time = distance/(velocity * Math.cos(Math.toRadians(angle)));
    double trajY = (velocity * time * Math.sin(Math.toRadians(angle))) - ((0.5*9.81)*time*time);

    if(trajY > height1+1 && trajY < height2-1)
      ans = "Safe";

    return ans;
  }
}
