public class HoT{
    public static void main(String args[]){
	int head = 0;
	int i =0;	
	System.out.println("Tossing a coin...");
	for(i=0;i<3;i++){
	    int coin = (int)(Math.random()*10);
			  
	    if(coin > 4){
		System.out.println("Round " +(i+1)+ ": Heads");
		head++;
	    
	    }
	    else{
		System.out.println("Round " +(i+1)+": Tails");
	    }
	
	   
	}
	System.out.println("Heads: " +head+ ", Tails: " +(3-head));
    }
}
		  
