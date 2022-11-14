class delivery{
	int deliveryNum;
	int distanceCode;
	int weight;
	float fee;
	static int deliveryCnt=1;
	delivery(int year,int distanceCode,int weight){
		this.distanceCode = distanceCode;
		deliveryNum= year *10000 + deliveryCnt;
		this.weight = weight;
		if(distanceCode == 1){
			if(weight < 5) fee = 12.00f;
			else if(weight > 5 && weight < 20) fee = 16.50f;
			else if(weight >= 20)fee = 22.00f;
		}
		else{
			if(weight < 5)fee = 35.00f;
			if(weight >= 5)fee = 47.95f;
		}
		deliveryCnt++;
	}
	
	void deliveryDetails(){
		System.out.println("Delivery Number : "+deliveryNum);
		System.out.println("Code : "+ distanceCode);
		System.out.println("Weight : "+weight+ " pounds");
		System.out.println("Fee($) : "+fee);
		System.out.println();
	}
}

class q3{
	public static void main(String[] args){
		delivery obj1 = new delivery(2022,2,6);
		obj1.deliveryDetails();
		delivery obj2 = new delivery(2023,1,20);
		obj2.deliveryDetails();
		delivery obj3 = new delivery(2023,2,20);
		obj3.deliveryDetails();
		delivery obj4 = new delivery(2020,1,18);
		obj4.deliveryDetails();
	}
}
