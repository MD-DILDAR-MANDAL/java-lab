import java.util.*;

class passengers{
	String name;
	int age;
	String seatchoice;
	public void passengers(){
		System.out.println("Enter the name: ");
		this.name=scn.nextLine();
		System.out.println("Enter the age: ");
		this.age=scn.nextInt();
		System.out.println("Enter the Seat choice: ");
		System.out.println("low, mid, up, upside, lowside");
		this.seatchoice=nextLine();
	}
}

class reservation{
	String pname;
	String seatalloted;
	public static reservation(String namep,String pseatallocated){
		this.pname=namep;
		this.seatalloted=pseatalloted;}
	void display(){
		System.out.println("Passenger name: " + name );
		System.out.println("Seat alloted: " + seatalloted);
	}
}

class as2q1{
	static void allocate(){
		switch((arr[i].seatchoice)){
			case "low":
				if (low>0){
					System.out.println("Seat booked");
					low--;
					arrr[i].reservation(name,"low");}
				else{
					System.out.println("Seat filled up");
					System.out.println("Alloting to other empty seats");
					otherseat((arr[i].seatchoice));}
			case "mid":
				if (mid>0){
					System.out.println("Seat booked");
					mid--;
					arrr[i].reservation(name,"mid");}
				else{
					System.out.println("Seat filled up");
					System.out.println("Alloting to other empty seats");
					otherseat((arr[i].seatchoice));}
			case "up":
				if (up>0){
					System.out.println("Seat booked");
					up--;
					arrr[i].reservation(name,"up");}
				else{
					System.out.println("Seat filled up");
					System.out.println("Alloting to other empty seats");
					otherseat((arr[i].seatchoice));}
			case "upside":
				if (upside>0){
					System.out.println("Seat booked");
					upside--;
					arrr[i].reservation(name,"upside");}
				else{
					System.out.println("Seat filled up");
					System.out.println("Alloting to other empty seats");
					otherseat((arr[i].seatchoice));}
			case "lowside":
				if (lowside>0){
					System.out.println("Seat booked");
					lowside--;
					arrr[i].reservation(name,"lowside");}
				else{
					System.out.println("Seat filled up");
					System.out.println("Alloting to other empty seats");
					otherseat((arr[i].seatchoice));}
	}
}
	public static void otherseat((arr[i].seatchoice)){
		if (low>0)
			arrr[i].reservation(name,"low");
		else if (mid>0)
			arrr[i].reservation(name,"mid");
		else if (up>0)
			arrr[i].reservation(name,"up");
		else if (upside>0)
			arrr[i].reservation(name,"upside");
		else if (lowside>0)
			arrr[i].reservation(name,"lowside");
	}
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		//Program is just limited for 24 seats as per the constraints set
		System.out.println("Total seats left is 24");
		System.out.println("The Seats are reserved for female");
		int upside=3,lowside=3,up=6,mid=6,low=6,n=24;
		//Array initialisation for Passenger class
		passengers arr[];
		arr = new details[24];
		//Array initialisation for reservation class
		reservation arrr[];
		arrr=new reservation[24];
		for (int i=0;i<24;++i)	arr[i].passsengers();
		//Alloting seats to senior citizen
		for (int i=0;i<24;i++){
			if (arr[i].age>=65)	allocate();
		}
		//To allocate the seats to passenger below 65 years
		for (int i=0;i<24;i++){
			if (arr[i].age<65)	allocate();
		}		 
		//Printing the allocated seats
		for (int i=0;i<24;i++){
			arrr[i].display();
			System.out.println();
		}
	}
}
		
			

