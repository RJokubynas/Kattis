import java.util.Scanner;

public class DRM
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);

    String drm = in.next();

    String s = drm.substring(0,drm.length()/2);
    String e = drm.substring(drm.length()/2,drm.length());

    String rS = rotate(s);
    String rE = rotate(e);

    System.out.println(rS);
    System.out.println(rE);

    merge(rS,rE);
  }

  public static String rotate(String st)
  {
    int x = 0;
    int count = 0;
    String rVal = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    while(x < st.length())
    {
      for(int i=0; i<rVal.length(); i++)
      {
        if(rVal.charAt(i) == st.charAt(x))
        {
          count += i;
        }
      }
      x++;
    }
    x=0;
    String rt = "";

    while(x < st.length())
    {
      for(int i=0; i<rVal.length(); i++)
      {
        if(rVal.charAt(i) == st.charAt(x))
        {
          rt += rVal.charAt(count%26+i-1);
        }
      }
      x++;
    }
    return rt;
  }

  public static void merge(String a, String b)
  {
    String drm = "";
    int posA = 0;
    int posB = 0;
    String rVal = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    int x =0;

    while(x < b.length())
    {
      for(int i=0; i<rVal.length(); i++)
      {
        if(rVal.charAt(i) == a.charAt(x))
        {
          posA = i;
        }

        if(rVal.charAt(i) == b.charAt(x))
        {
          posB = i;
        }
      }
      x++;

      drm += rVal.charAt((posB+posA)%26);

    }

    System.out.println(drm);
  }
}
