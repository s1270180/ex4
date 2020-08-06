import java.io.*;

public class HoT{

    public static void main(String args[]){

	try {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
						   
	    System.out.println("Who are you? ");
	    System.out.print(">");
	    String s = br.readLine();
					       
	    System.out.println("Hello, " + s+"!");
					       
	
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
	    if(head>=2){
		System.out.println(""+s+ " won!");
	    }else System.out.println(""+s+ " lost!"); 

	    br.close();
	} catch (IOException e)
	    {

		e.printStackTrace();

	    }
    }
}
		  
