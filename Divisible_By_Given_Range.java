class Divisible_By_Given_Range{
	
	public static void main(String args[]){
		
		int number_1=Integer.parseInt(args[0]);
		int number_2=Integer.parseInt(args[1]);
		int Divide_no=Integer.parseInt(args[2]);
		
		for(int i=number_1;i<number_2;i++)
		{
			if(i%Divide_no==0)
				System.out.println(i+" "+"is divisibe by"+" "+Divide_no);
			else
				System.out.println(i+" "+"is not divisibe by"+" "+Divide_no);
		}
	}
}