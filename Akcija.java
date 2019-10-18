import java.util.*;

public class Akcija{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int price[] = new int[len];

        for(int i=0; i<len; i++)
            price[i] = in.nextInt();

        Arrays.sort(price);

        System.out.println(getPrice(price));
    }

    private static int getPrice(int ar[]){
        int a = 0;
        int count = 0;

        for(int i=ar.length-1; i>=0; i--){
            count++;    
            if(count == 3){
                count = 0;
                continue;
            }
            a += ar[i];
        }
        return a;
    }
}
