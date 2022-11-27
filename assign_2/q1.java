import java.util.*;
public class Main
{
    int seats=0,low=0,upp=0,mid=0,sl=0,su=0;
    void booking()
    {
        int flag=0;
        if(seats==72)
            System.out.println("RESERVATION IS FULL");
        else
        {
            Scanner s1=new Scanner(System.in);
            System.out.println("Enter your age: ");
            int age=s1.nextInt();
            if(age>=65)
            {
                System.out.print("Enter your choice of seat\n(1) Lower Berth (LB)\n(2) Upper Berth (UB)\n(3) Middle Berth (MB)\n(4) Side Lower (SL)\n(5) Side Upper (SU)\n");
                System.out.println("Seats available in - \t(1) Lower Berth (LB) - "+(18-low)+"\t(2) Upper Berth (UB)- "+(18-upp)+"\t(3) Middle Berth (MB)- "+(18-mid)+"\t(4) Side Lower (SL)- "+(9-sl)+"\t(5) Side Upper (SU)- "+(9-su)+"\n");
                int ch=s1.nextInt();
                if(ch==1){
                    if(low<18){
                        low++;
                        System.out.println("Seat Booked in Lower Berth");
                    }
                    else{
                        System.out.println("Seats are already full in that section");
                        flag=1;
                    }
                    
                }
                else if(ch==2){
                    if(upp<18){
                        upp++;
                        System.out.println("Seat Booked in Upper Berth");
                    }
                    else{
                        System.out.println("Seats are already full in that section");
                        flag=1;
                    }
                }
                else if(ch==3){
                    if(mid<18){
                        mid++;
                        System.out.println("Seat Booked in Middle Berth");
                    }
                    else{
                        System.out.println("Seats are already full in that section");
                        flag=1;
                    }
                }
                else if(ch==4){
                    if(sl<9){
                        System.out.println("Seat Booked in Side Lower");
                        sl++;
                    }
                    else{
                        System.out.println("Seats are already full in that section");
                        flag=1;
                    }
                }
                else if(ch==5){
                    if(su<9){
                        su++;
                        System.out.println("Seat Booked in Side Upper");
                    }
                    else{
                        System.out.println("Seats are already full in that section");
                        flag=1;
                    }
                }
                else {
                    System.out.println("Please Choose correct number!");
                    flag=1;
                }
                if(flag==0){
                    seats++;
                }
            }
            else
            {
                if(low<18){
                    low++;
                    System.out.println("Seat Booked in Lower Berth");
                }
                else if(upp<18){
                    upp++;
                    System.out.println("Seat Booked in Upper Berth");
                }
                else if(mid<18){
                    mid++;
                    System.out.println("Seat Booked in Middle Berth");
                }
                else if(sl<18){
                    sl++;
                    System.out.println("Seat Booked in Side Lower");
                }
                else if(su<18){
                    su++;
                    System.out.println("Seat Booked in Side Upper");
                }
                seats++;
            }
        }
    }
    void availability()
    {
        System.out.println("Only "+(72-seats)+" seates are available..");
        System.out.println("Seats available in - \n(1) Lower Berth (LB) - "+(18-low)+"\n(2) Upper Berth (UB)- "+(18-upp)+"\n(3) Middle Berth (MB)- "+(18-mid)+"\n(4) Side Lower (SL)- "+(9-sl)+"\n(5) Side Upper (SU)- "+(9-su)+"\n");
    }
    public static void main(String[] args)
    {
        Main r=new Main();
        Scanner s1=new Scanner(System.in);
        System.out.println("Welcome to Railway Reservation...\n");
        while(true)
        {
            System.out.println("\n1) Reservation process \n2) Availability of seats \n3) Exit \nEnter your choice\t");
            int choice=s1.nextInt();
            switch(choice)
            {
                case 1: r.booking();
                    break;
                case 2: r.availability();
                    break;
                case 3: System.exit(0);
                default :System.out.println("!!Choose correct option..");
            }
        }
    }
}