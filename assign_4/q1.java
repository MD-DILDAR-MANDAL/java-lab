import java.util.*;

class q1 {
    public static void main(String[] args) {
		String results = "Manchester United 1 Chelsea 0, Arsenal 1 Manchester United 1, Manchester United 3 Fulham 1, Liverpool 2 Manchester United 1, Swansea 2 Manchester United 4";
		String ans="Manchester United";
		int count=0;
		int j=0;
		int temp=0;
		int a=-1,b=-1,c=-1,d=-1,win=0,lose=0,draws=0,gscore=0,gconceded=0,npoints=0;
		for(int i=0;i<(results.length()-1);i++){
		    int getnum=0;
		    if(results.charAt(i) == ','){
		        a=-1;b=-1;c=-1;d=-1;
		    }
		    if(results.charAt(i) == ' '){
		        getnum=results.charAt(i+1) - '0';
		        if(getnum<10){
		            if(c==-1){
		                c=getnum;
		            }
		            else d=getnum;
		        }
		    }
		    if(results.charAt(i)==ans.charAt(j)){
		        j++;
		    }
		    else j=0;
		    if(j==(ans.length()-1)){
		        getnum=results.charAt(i+3) - '0';
		        if(getnum<10){
		            a=getnum;
		        }
		        j=0;
		    }
		    if(a!=-1 && c!=-1 && d!=-1){
		        if(a==c && a==d) b=c;
		        else if(a==c) b=d;
		        else b=c;
		        if(a>b){
		            win++;
    		    }
    		    else if(a<b){
    		        lose++;
    		    }
    		    else{
    		        draws++;
    		    }
    		    gscore+=a;
    		    gconceded+=b;
    		    a=-1;b=-1;c=-1;d=-1;
		    }
		}
		npoints=(3*win)+draws;
		System.out.println("Number of wins ="+win);
		System.out.println("Number of draws ="+draws);
		System.out.println("Number of defeats ="+lose);
		System.out.println("Goals scored ="+gscore);
		System.out.println("Goals conceded ="+gconceded);
		System.out.println("Number of points ="+npoints);
    }
}