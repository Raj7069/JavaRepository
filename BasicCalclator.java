class BasicCalclator{

	public static void main(String args[]){
		
		int n1=Integer.parseInt(args[0]);
		int n2=Integer.parseInt(args[2]);
		char ch=args[1].charAt(0);
		
		
		switch(ch)
		{
			case '+' : System.out.println("Addition is:-"+(n1+n2));
					   break;
			case '-' : System.out.println("Subtraction is:-"+(n1-n2));
				       break;
			case '*' : System.out.println("Multiplication is:-"+(n1*n2));
				       break;
			case '/' : System.out.println("Division is:-"+(n1/n2));
					   break;
		}
	}
}