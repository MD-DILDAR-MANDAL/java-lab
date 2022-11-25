import java.util.*;

class hotel{
    Scanner sc=new Scanner(System.in);
    String name,add;
    int nr,cr;
    char g;
    void edetails(){
        System.out.println("Enter the hotel name: ");
        name=sc.nextLine();
        System.out.println("Enter the address: ");
        add=sc.nextLine();
        System.out.println("Enter the grade: ");
        g=sc.next().charAt(0);
        System.out.println("Enter the no. of rooms: ");
        nr=sc.nextInt();
        System.out.println("Enter the room charge: ");
        cr=sc.nextInt();
        sc.nextLine();
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Address: "+add);
        System.out.println("Grade: "+g);
        System.out.println("Room Charge: "+cr);
    }
}
class q16
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("How many hotel are there: ");
	    int n=sc.nextInt();
		hotel ob[]=new hotel[n];
		for(int i=0;i<n;i++){
		    ob[i]=new hotel();
		}
		for(int i=0;i<n;i++){
		    ob[i].edetails();
		}
		System.out.println("Enter your budget: ");
		int m=sc.nextInt();
		System.out.println("Enter your grade: ");
		char g=sc.next().charAt(0);
		System.out.println("Hotel name by matching ur budget: ");
		for(int i=0;i<n;i++){
		    if((ob[i].cr)<=m){
		        ob[i].display();
		    }
		}
		System.out.println("Hotel name by matching ur Grade: ");
		for(int i=0;i<n;i++){
		    if((ob[i].g)==g){
		        ob[i].display();
		    }
		}
	}
}