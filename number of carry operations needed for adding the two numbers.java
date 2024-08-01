import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c;
        int d;
        int count=0;
        int rem=0;
        while(a!=0 && b!=0){
            c=a%10;
            d=b%10;
            if((c+d+rem)>9){
                count++;
                int sum = c+d+rem;
                rem=sum/10;    
            }
            a=a/10;
            b=b/10;
            
        }
        System.out.println(count);
    }
}
