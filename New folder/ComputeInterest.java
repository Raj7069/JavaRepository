interface Interest
{
	public double interest(double P,double R,double N);
}
class SimpleInterest implements Interest
{
	public double interest(double P,double R,double N)
	{
		double simpleInterest;
		simpleInterest=(P*R*N)/100;
		return simpleInterest;
	}
}
class CompoundInterest implements Interest
{
	public double interest(double P,double R,double N)
	{
		double compoundInterest;
		compoundInterest=P*(Math.pow(1+(R/N),N));
		double compoundInt=compoundInterest-P;
		return compoundInt;
	}
}
class ComputeInterest
{
	public static void main(String args[])
	{
		double P = Double.parseDouble(args[1]);
		double R = Double.parseDouble(args[2]);
		double N = Double.parseDouble(args[3]);
		int choice= Integer.parseInt(args[0]);
		double calcInterest;
		switch (choice){
			
			case 1: SimpleInterest si = new SimpleInterest();
					calcInterest=si.interest(P,R,N);
					System.out.println("Simple interest is: "+calcInterest);
					break;
			case 2: CompoundInterest ci = new CompoundInterest();
					calcInterest=ci.interest(P,R,N);
					System.out.println("Compound interest is: "+calcInterest);
					break;
		}
	}
}