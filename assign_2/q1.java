import java.util.*;

class details{
			string name;
			string gender;
			int age;
			string seatype;
			public void details(){
				System.out.println("enter name: ");
				this.name=sc.nextLine();
				System.out.println("enter gender...male/female ");
				this.gender=sc.nextLine();
				System.out.println("enter age: ");
				this.age=sc.nextInt();
				System.out.println("seatype...low,up,mid,sidelow,sideup");
				this.seatype=sc.nextLine();
			}
			public void display(){
				System.out.println("name: "+ name);
				System.out.println("gender: "+ gender);
				System.out.println("age: "+age);
				System.out.println("seatype"+seatype);
			}
}

class q1{
	Scanner sc=new Scanner(System.in);
	public static void main(String args[]){
		char ans="y";
		int low=0,up=0,mid=0,sidelow=0,sideup=0;
		while(ans == "y"){
			System.out.println("enter no. of people for reservation");
			int nop = sc.nextInt();
			
			details arr[];
			arr = new details[nop];
			
			for(int i=0;i<nop;i++){
				arr[i].details();

			}
			
			
			//if 3 seats per then 1 seat for aged 
			//aged cnt++ with seat choice :condition:
			if(seatype == "low" && low)
			for(int i=0;i<nop;i++){
				arr[i].display();
			}
			
			
			System.out.println("want to enter again ...y/n");
			ans=sc.next().CharAt(0);
		}
	}
}
