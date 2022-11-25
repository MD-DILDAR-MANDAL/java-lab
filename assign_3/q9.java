import java.util.*;

class q9{
      public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("How many elements you want to enter: ");
	int n=sc.nextInt();
        System.out.println("Enter the array: ");
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        Arrays.sort(ar);
        int total=1,ans=1;
        for(int i=1;i<n;i++){
            
            if((ar[i]-1)==ar[i-1]) total++;
            else{
                ans=Math.max(ans,total);
                total=1;
            }
            
            if(i==n-1){
                ans=Math.max(ans,total);
            }
        }
        System.out.println(ans);
     }
}
