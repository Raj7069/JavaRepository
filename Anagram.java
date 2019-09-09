class Anagram{
	
	
	static void sort(char s[])
	{
	
		for(int i=0;i<s.length;i++)
		{
			for (int j=i+1;j<s.length;j++)
			{
				if (s[i]>s[j])
				{
					char temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
	}
	
	public static void main(String args[]){
		
		if (args.length!=2)
	{
		System.out.println("Invalid Argument");
		System.out.println("Two Argument needed \n1.String \n2.String");
		System.exit(0);
	}
		String s1=args[0];
		String s2=args[1];
		if(s1.length()!=s2.length())
			System.out.println("Not Anagram");
		else
		{
			char a1[]=args[0].toCharArray();
			char a2[]=args[1].toCharArray();
		    sort(a1);
			sort(a2);
			
			if(new String(a1).equals(new String(a2)))
				System.out.println("Anagram");
			else
				System.out.println("Not Anagram");
		}
	
		
	}
}