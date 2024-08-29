import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int c=0;
            int r=a;
            while(c<n){
                
             r=+(int)(Math.pow(2,c))*b;
			 c++;
             System.out.print(r+" ");
             
            }
            System.out.println();
            
        }
        in.close();
    }
}
