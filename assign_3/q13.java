import java.util.*;

class details{
    Scanner sc=new Scanner(System.in);
    String name,email;
    int age;
    void edetails(){
            System.out.println("Enter the name");
            name=sc.nextLine();
            System.out.println("Enter the email");
            email=sc.nextLine();
            System.out.println("Enter the age");
            age=sc.nextInt();
            sc.nextLine();
    }
    void disdetails(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Email:"+email);
    }
}

class q13
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String name,email;
            int age;
	    System.out.println("How many employee are in deparment: ");
	    int n=sc.nextInt();
		details[] ob;
		ob=new details[n];
		for(int i=0;i<n;i++){
		    ob[i]=new details();
		}
		for(int i=0;i<n;i++){
		    ob[i].edetails();
		}
		for(int i=0;i<n;i++){
		    ob[i].disdetails();
		}
		System.out.println("Do you want to edit the informartion (y/n)");
		char ans=sc.next().charAt(0);
		if(ans=='y'||ans=='Y'){
		    System.out.println("Pick the index from 0 to "+(n-1));
		    int a=sc.nextInt();
		    System.out.println("Enter the new value");
		    ob[a].edetails();
		    System.out.println("After edit informartion are- ");
		    for(int i=0;i<n;i++){
		         ob[i].disdetails();
		    }
		}
		
	}
}