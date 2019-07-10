public class CurrencyConvertor{
	
		/**
		*		
		     Invalid Arguments<br/>
			 class CurrencyConvertor choice Number<br/>
			 choice = 1. USD to INR 2. INR to USD <br/> 
			 Number = Any valid number	 
		*
		**/
	
	public static void main(String args[]){
	
		float value=Float.parseFloat(args[0]);
		int rate=70;
		int choice=Integer.parseInt(args[1]);
		
		if(choice==1)
			System.out.println("$"+value+"="+value*rate+"INR");
		else		
			System.out.println("INR"+value+"="+(value/rate)+"$");
	}
}