import java.util.*;

class q4{
	public static void main(String args[]){
		int arr[];
		System.out.println("enter size of array and the element");
		Scanner sc = new Scanner(System.in);
		int size =sc.nextInt();
		arr = new int[size];
		for(int i = 0;i < size;i++){
			arr[i]=sc.nextInt();
		}

		int max=arr[0],min=arr[0];
		System.out.println("Array before exchange: arr= " + Arrays.toString(arr));
		for (int i=0;i<size;i++){
			if(arr[i]>max)	max=arr[i];
			else if(arr[i]<min) min=arr[i];
		}
		System.out.println("Min : " + min + "  Max : "+ max);
		
		for (int i=0;i<size;i++){
			if (arr[i]==min) arr[i]=max;
			else if (arr[i]==max)arr[i]=min;
		}
		System.out.println("Array after exchange: arr= " + Arrays.toString(arr));
}}
		
