class PrimeNo
{
	static int Prime(int number)
	{
			int count=0;
			if(number==2)
				return 1;
			else
			{
			for(int i=1;i<=number;i++)
			{
				if(number%i==0)
				{
					count++;
				}
			}
			if(count==2)
				return 1;
			else
				return 0;
		}
	}
	public static void main(String args[])
	{
		int Max_no=Integer.parseInt(args[0]);
		int i=2,value=0,count=0;
		while(count!=Max_no)
		{
			value=Prime(i);
			if(value==1)
			{
				count++;
				System.out.println(i);
			}
			i++;
		}
	}
}