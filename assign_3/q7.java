import java.util.*;

class q7{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int arr[];
		arr=new int[10];
		System.out.println("Enter 10 elements to an array: ");
		for (int i=0;i<10;i++) arr[i]=sc.nextInt();
		for (int i=0;i<(10-1);i++){
			for (int j=i+1;j<10;j++){
				if (arr[i]+ arr[j] == 50)
					System.out.println("( " + arr[i] + "," + arr[j] + " )" );
			}
		}
}}



