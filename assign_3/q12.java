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

    void compareTwo(int d,int m,int y,int d2,int m2,int y2){
        validate(d,m,y);
        if(flag==1){
            validate(d2,m2,y2);
            if(flag==1){
                if(d==d2 &&m==m2&&y==y2){
                    System.out.println("Date are same");
                }
                else if(y>y2){
                    System.out.println("Date 1 is "+(y-y2)+" years ahead");
                }
                else if(y<y2){
                    System.out.println("Date 2 is "+(y2-y)+"years ahead");
                }
                else if(y==y2){
                    if(m>m2){
                        System.out.println("Date 1 is "+(m-m2)+" months ahead");
                    }
                    else if(m<m2){
                        System.out.println("Date 2 is "+(m2-m)+" months ahead");
                    }
                    else if(m==m2){
                        if(d>d2){
                            System.out.println("Date 1 is "+(d-d2)+" days ahead");
                        }
                        else{
                            System.out.println("Date 1 is "+(d2-d)+" days ahead");
                        }
                    }
                }
            }
            else{
                System.out.println("Date 2 is not valid");
            }
        }
        else{
            System.out.println("Date 1 is not valid");
        }
    }
}

class q12{
	public static void main(String args[]){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter day,month,year in dd/mm/year format:");
          int day=sc.nextInt();
          int month=sc.nextInt();
          int year=sc.nextInt();
          System.out.println("Enter day,month,year in dd/mm/year format:");
          int day2=sc.nextInt();
          int month2=sc.nextInt();
          int year2=sc.nextInt();
          Date ob=new Date();
          ob.compareTwo(day,month,year,day2,month2,year2);
	}
}
