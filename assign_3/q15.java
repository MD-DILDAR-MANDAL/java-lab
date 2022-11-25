import java.util.*;

class student{
    Scanner sc=new Scanner(System.in);
    String name;
    int d,m,y;
    int ar[]=new int[5];
    float p,sum=0;
    void edetails(){
        System.out.println("Enter the name: ");
        name=sc.nextLine();
        System.out.println("Enter the date of birth in dd//mm//yy format: ");
        d=sc.nextInt();m=sc.nextInt();y=sc.nextInt();
        System.out.println("Enter the five marks: ");
        for(int i=0;i<5;i++){
            ar[i]=sc.nextInt();
            sum+=ar[i];
        }
        sc.nextLine();
        p=sum/5;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("DOB: "+d+"/"+m+"/"+y);
    }
}

class q15
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("How many student are there: ");
	    int n=sc.nextInt();
		student ob[]=new student[n];
		for(int i=0;i<n;i++){
		    ob[i]=new student();
		}
		for(int i=0;i<n;i++){
		    ob[i].edetails();
		}
		System.out.println("Students which Percentage is less than 40% are: ");
		for(int i=0;i<n;i++){
		    if((ob[i].p) < 40){
		        ob[i].display();
		    }
		}
		
	}
}