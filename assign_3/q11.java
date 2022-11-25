import java.util.*;

class Date{
    int day,year,month;
    int flag=0;
    int leap=0,maxd=0;
    int getleap(int year){
        int l=0;
        if(year%100==0 && year%400==0){
            l=1;
        }
        else if(year%4==0 && year%100!=0) l=1;
        else l=0;
        return l;
    }
    int valuemonth(int month){
        int maxday=0;
        if(getleap(year)==1){
            if(month==2) maxday=29;
        }
        else{
            if(month==2) maxday=28;
        }
        if(month==1||month==3||month==5||month==7||month==8||month==10||month==12) maxday=31;
        else if(month==4||month==6||month==9||month==11) maxday=30;
        if(month<0 || month>12) return -1;
        return maxday;
    }
    void display(){
        System.out.println("dd/mm/year:"+day+"/"+month+"/"+year);
    }
    void validate(int day,int month,int year){
        flag=0;
        this.day=day;
        this.year=year;
        this.month=month;
        leap=getleap(year);
        maxd=valuemonth(month);
        if(year>0){
            if(maxd==-1) System.out.println("Given month is not valid");
            else{
                if(day<0 || day>maxd){
                    System.out.println("Given day is not valid");
                }
                else{            
                    flag=1;
                }
            }
        }
        else System.out.println("Given year is not valid");
    }
    void incrementDate(int d,int m,int y){
        validate(d,m,y);
        if(flag==1){
            day++;
            if(day>maxd){
                day=1;
                month++;
                if(month>12){
                    month=1;
                    year++;
                }
            }
            display();
        }
    }
}

class q11{
	public static void main(String args[]){
	  Scanner sc=new Scanner(System.in);
          System.out.println("Enter day,month,year in dd/mm/year format:");
          int day=sc.nextInt();
          int month=sc.nextInt();
          int year=sc.nextInt();
          Date ob=new Date();
          ob.incrementDate(day,month,year);
	}
}