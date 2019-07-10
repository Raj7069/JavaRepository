
class ValidateEmail{

	public static void main(String args[]){
		
		int count=1;
		String mail=args[0];
		int flag=0;
		int firstChar=mail.codePointAt(0);
		if ((firstChar>=48 && firstChar<=57) || (firstChar>=97 && firstChar<=122))
			flag=1;
		else
		{
			flag=0;
			System.out.println("1st character must be an Alphanuumeric value");
			System.exit(0);
		}
		
		String emailParts[]=mail.split("@");
		int emailPartLength=emailParts[0].length();
		if (emailPartLength>=8 && emailPartLength<=20)
			flag=0;
		else
		{
			flag=0;
			System.out.println("Email length must b/w 8 to 20 character");
			System.exit(0);
		}
		for(int i=1;i<emailPartLength;i++)
		{
			int charUnicode=mail.codePointAt(i);
			if ((charUnicode==46) || (charUnicode==95) || (charUnicode>=97 && charUnicode<=122) || (charUnicode>=48 && charUnicode<=57))
				flag=1;
			else
			{
				flag=0;
				System.out.println("Only Alphanuumeric value or Underscore or dot valid");
				System.exit(0);
			}
		}
		
		int find=mail.indexOf("@");
		if (find==-1)
		{
			flag=0;
			System.out.println("Email address must contain @ sign");
			System.exit(0);
		}
		else 
			flag=0;
		
		int findDot=mail.indexOf('.');
		if (findDot==-1)
		{
			flag=0;
			System.out.println("Email must contain dot ");
			System.exit(0);
		}
		else      
			flag=1;
		
		int position= mail.indexOf("@");
		String splitDot[]=emailParts[1].split("\\.");
		int splitDotLength=splitDot[0].length();
		if (splitDotLength>2)
			flag=1;
		else
		{
			flag=0;
			System.out.println("Wrong domain name");
			System.exit(0);
		}
		if (flag==1)
			System.out.println("Valid email Id");
	}
}