public class Convert_Binary_to_Decimal_Reverse{
	
		/**
		*		
		     Invalid Arguments<br>
			 class Convert_Binary_to_Decimal_Reverse choice Number<br>
			 choice = 1. Binary to decimal 2. Decimal to Binary
			 Number = Any valid number	 
		*
		**/
	
	public static void main(String args[]){
		
		int choice=Integer.parseInt(args[0]);
		int number=Integer.parseInt(args[1]);
		if (choice==1)
		{
			int binary_value,decimal_value=0,base=1,reminder=0;
			binary_value=number;
			while(number>0)
			{
				reminder=number%10;
				decimal_value=decimal_value+(reminder*base);
				number=number/10;
				base=base*2;
			}
			System.out.println("Given value is:-"+args[1]+" "+"and converted value is:-"+decimal_value);
		}
		else
		{
			int decimal_value,binary_value=0,base=1,reminder=0;
			decimal_value=number;
			while(number>0)
			{
				reminder=number%2;
				binary_value=binary_value+(reminder*base);
				number=number/2;
				base=base*10;
			}
			System.out.println("Given value is:-"+args[1]+" "+"and converted value is:-"+binary_value);
		}
	}
}