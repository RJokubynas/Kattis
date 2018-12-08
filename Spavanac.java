import java.util.Scanner; 

public class Spavanac
{ 
    public static void main(String args[])  
   { 
        Scanner in = new Scanner(System.in); 
        
        int h = in.nextInt(); 
        int m = in.nextInt(); 

        if(h > 0) 
        { 
            int nh = ((h * 60 + m - 45) / 60); 
            int nm = ((h * 60 + m - 45) % 60); 
            System.out.println(nh + " " + nm); 
        } 
        else 
        { 
            if(m > 45) 
            { 
                int nh = ((24 * 60 + m - 45) / 60); 
                int nm = ((h * 60 + m - 45) % 60); 
                System.out.println(nh + " " + nm); 
            } 
            else if(m == 45)
            {
                System.out.println("0 00");
            }
            else 
            {
                int nm = 60 + m  - 45; 
                System.out.println("23 " + nm); 
            }
        } 
    } 
} 