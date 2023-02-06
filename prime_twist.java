import java.io.*;
import java.util.*;

public class prime_twist {
    public static boolean isPossible(int X, int Y){
        if(X-Y>1){
            return true;
        }else{
            return  false;
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- !=0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if(isPossible(X,Y)){
                System.out.println(1);
            }else{
              System.out.println(0);  
            }
        }
    }
}
