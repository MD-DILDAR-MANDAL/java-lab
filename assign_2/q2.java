import java.util.*;
class Course
{
  int credit,minimum;
  String medium;
  int count=0,flag=0;
  void number()
  {
    count++;
    if(count>minimum) flag=1;
  }
  void display()
  {
    if(flag==1)
    {
     System.out.println("Course "+medium+" is floated");
    }
    else
    {
      System.out.println("Course "+medium+" is not floated");
    }
  }
}
class Coursedetails extends Course
{
  Coursedetails(int n, String p,int mini)
  {
    credit=n;
    medium=p;
    minimum=mini;
  }
  void show(){
      System.out.println("Medium: "+medium);
      System.out.println("Credit: "+credit);
      System.out.println("Total Student: "+count);
      display();
  }
}
class q2
{
	public static void main(String args[])
  {
    int n;
    int input;
    int i;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the total number of students want to enroll in the course:-");
    n=sc.nextInt();
    Coursedetails A=new Coursedetails(3,"English",1);
    Coursedetails B=new Coursedetails(3,"Hindi",3);
    for(i=0;i<n;i++)
    {
      System.out.print("Press 1 for "+A.medium+"\nPress 2 for "+B.medium+"\n");
      input=sc.nextInt();
      switch(input)
      {
         case 1: 
            A.number();
            break;
         case 2:
            B.number();
            break;
         default:
         System.out.println("Invalid choice\n");
           
      }
    }
    A.show(); 
    B.show();
   }
}