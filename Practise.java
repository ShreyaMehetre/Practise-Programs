package practiseproject;
import java.util.Scanner;

public class Practise {
	public static void main(String[] args) {
		
	
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
     
  for(int i=1;i<=2*a;i++) {
     int b=i;
     for(int j=i;j<2*a;j++) {
    	 if(j%2!=0) {
    		 System.out.print(b);
    	 }
     }
     System.out.println();
     
  }

}}
