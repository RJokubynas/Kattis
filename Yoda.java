import java.util.*;

public class Yoda {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        
        int x = in.nextInt();
        int y = in.nextInt();
        
        String checkedX = compYoda(x,y,"");
        String checkedY = compYoda(y,x,"");
        
        System.out.println(checkedX + "\n" + checkedY);
    }
    
    private static String compYoda(int a, int b, String z){
        if(a == 0 && z.length() == 0)
            return "Yoda";
        
        if(a == 0 || b == 0)
            return ""+Integer.valueOf(a+z);
        
        if(a % 10 >= b % 10){
            z = (a%10) + z;
            return compYoda(a/10,b/10,z);
        }
        else
            return compYoda(a/10,b/10,z);
    }
}
