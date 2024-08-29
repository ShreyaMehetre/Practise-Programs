
import java.util.Scanner;

public class Array5{
	
	public static void main(String[]args){
		int a=153;
		int num=a;
		int r=0;
		int d=1;
		while(a>0){
			d=a%10;
		r+=Math.pow(d,3);
		a=a/10;}
		if(r==num){
		System.out.println("Yes");}
		else{
		System.out.println("No");}
			
	
		 
		
		
}}