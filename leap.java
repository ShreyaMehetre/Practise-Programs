import java.util.Scanner;
public class leap{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
int y=sc.nextInt();

if(y%4==0){
	if(y%100==0){
		if(y%400==0){
	System.out.println("Yes");}
	else{
		System.out.println("No");
	}}
	else{
System.out.println("Yes");}}
	

else{
System.out.println("NO");}}}