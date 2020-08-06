import java.io.*;

public class Hot{
    public static void main(String args[]){

	try {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
						   
	    System.out.print("Who are you? ");
	    System.out.print(">");
	    String s = br.readLine();
					       
	    System.out.println("Hello, " + s+"!");
					       
	    br.close();
	} catch (IOException e)
	    {

		e.printStackTrace();

	    }
    
    
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
		  
