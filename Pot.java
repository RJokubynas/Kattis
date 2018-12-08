//Name: Robertas Jokubynas
//Date: 7th April 2018
//Time: 14:00

import java.util.Scanner;
import java.lang.*;

public class Pot
{
  
  public static void main(String [] args)
  {
    
    Scanner in = new Scanner(System.in);
    
    int len = in.nextInt();
    String []ar = new String[len];
    int x = 0;
    int a=0, b=0;
    
    for(int i=0; i<len; i++)
    {
      ar[i] = in.next();
      a = Integer.parseInt(ar[i].substring(0,ar[i].length()-1));
      b = Integer.parseInt(ar[i].substring(ar[i].length()-1));
      
      x += Math.pow(a,b);
    }
    
    System.out.println(x);
       
  }
  
}