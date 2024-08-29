import java.util.Scanner;
public class Demo2{


public static void main(String[] args) {
	 int [] myArray=new int []{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	 int []myArray1=new int[20];
	 int k=0;
		 for(int j=0;j<myArray.length;j++){
			 if(myArray[j]==1||myArray[j]==3||myArray[j]==4||myArray[j]==5||myArray[j]==6||myArray[j]==7||myArray[j]==8||myArray[j]==11||myArray[j]==13||myArray[j]==17||myArray[j]==20){
myArray1[k]=myArray[j];
k++;

}
}
for (int i=0;i<k;i++){
	if(myArray[i]==0){
		break;
	}
System.out.print(myArray1[i]+" ");}



}}
		
	//op:- 	1,3,4,5,6,7,8,11,13,17,20