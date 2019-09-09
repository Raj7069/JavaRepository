class HtmlString{
	
	public static void main(String args[]){
		
		if (args.length!=1)
		{
			System.out.println("Invalid Argument");
			System.out.println("Html String needed\ni.e. <title>raj</title>");
			System.exit(0);
		}
		String html=args[0];
		int l=args[0].length();
		char index[]=args[0].toCharArray();
		String s=new String(" ");
		for(int i=0;i<l;i++)
		{
			if(index[i]=='<' )
			{
				while(index[i]!='>')
				{
					i++;
				}
			}
			else 
			{
				s=s+index[i];
			}
		}
		System.out.println(s);
	}	
}