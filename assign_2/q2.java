import java.util.*;

class course{
	int credit;
	String medium;
	int minNumA=3;
	int minNumB=3;
	
	course(int n,String m){
		this.credit = n;
		this.medium = m;
	}
	void display(){
		if(cntA > minNumA || cntB > minNumB){
			System.out.println("floated");
			System.exit(0);
		}
		else{
			System.out.println("not floated");
			System.out.println("credit: "+credit);
			System.out.println("medium: "+medium);

		}
	}

}

class courseA extends course{
	
	void number(){
		cntA++;
	}
	void displayA(){
		System.out.println("total no of student registered: "+cntA);
		System.out.println(":course A: ");
	}
}

class courseB extends course{

	void number(){
		cntB++;
	}
	void displayB(){
		System.out.println("total no of student registered: "+cntB);
		System.out.println(":course B: ");
	}
}

class q2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		static int cntA=0;
		static int cntB=0;
		courseA objA= new courseA();
		courseB objB= new courseB();
		course obj = new course();
		String ans = "y";
		while(ans=='y'){
			System.out.println("what course do you want course ..A/B");
			char respo;
			if(respo == 'A'){	
				objA.number();		
				System.out.println("enter credit");
				int cre=sc.nextInt();
				System.out.println("enter medium");
				String med=sc.nextLine();
				obj(cre,med);
				objA.displayA();
				obj.display();
			}
			else{
				objB.number();		
				System.out.println("enter credit");
				int cre=sc.nextInt();
				System.out.println("enter medium");
				String med=sc.nextLine();
				obj(cre,med);
				objB.displayB();
				obj.display();
			}
			System.out.println("want to enter more y/n");
			ans =sc.next().charAt(0);
		}
	}
}
