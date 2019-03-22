import java.util.*;
import java.math.*;

public class Herman {
  static Scanner in = new Scanner(System.in);

  public static void main(String [] args)
  {
      double r = in.nextDouble();

      System.out.println(String.format("%.6f", (Math.PI*r*r)));
      System.out.println(String.format("%.6f", (2*r*r)));  
  }
}
