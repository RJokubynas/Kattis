import java.util.*;


public class Everywhere {

    static Scanner in = new Scanner(System.in);

    public static void main(String args[]) {
        
        int x = in.nextInt();
        int y = in.nextInt();

        if(x+y == 0 || x==0 & y%2==0)
            System.out.println("possible");
        else if(x < y & y%2==0)
            System.out.println("possible");
        else if(x > 0 & y%2==0)
            System.out.println("possible");
        else
            System.out.println("impossible");
    }
}