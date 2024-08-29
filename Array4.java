import java.util.Scanner;
public class Array4{
	public static void main(String[]args){
		int [][]arr={{1,2,3},{4,5,6,7},{8,9,10,11},{22,33}};
		int [][]brr=new int [arr.length][];
		for(int i=0,c=arr.length-1;i<brr.length;i++,c--){
			brr[i]=new int[arr[c].length];
			//System.out.println(brr[i].length);
		
		
}
    for(int i=0,c=arr.length-1;i<brr.length;i++,c--){
		for(int j=0;j<brr[i].length;j++){
	brr[i][j]=arr[c][j];
	//System.out.println(brr[i][j]);
	}}
	
	for(int i=0;i<brr.length;i++){
		System.out.print("{");
		for(int j=0;j<brr[i].length;j++){
	System.out.print(+brr[i][j]+",");
	
	}
		System.out.print("}");
	System.out.println();}
   

}}