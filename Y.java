import java.util.*;
public class Y{
	public static void main(String[] args){
		int arr[][]=new int[5][5];
		int flag=0;
		int size=arr.length;
		for(int i=0;i<size;i++){
	for(int j=0;j<size;j++){
		if(j==size-i-1 && i==j)
			flag=1;
		if(flag==0){
			if(j==size-i-1||i==j)
					System.out.print("*");
				else
		System.out.print(" ");}
	else{
		if(j==size-i-1)
					System.out.print("*");
				else
	System.out.print(" ");}
			
}System.out.println("");}}}
					
			