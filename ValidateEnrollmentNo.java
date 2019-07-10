class ValidateEnrollmentNo{

		public static void main(String args[]){
			
			String enrollment=args[0];
			
			String year= enrollment.substring(0,2);
			int flag=0;
			if (year.equals("17") || year.equals("16") || year.equals("18"))
				flag=1;
			else
			{
				flag=0;
				System.out.println("Invalid 1st 2 digit !!!");
				System.exit(0);
			}
			
			String code= enrollment.substring(2,5);
			if (code.equals("047"))
					flag=1;
			else
			{
				flag=0;
				System.out.println("Invalid college code");
				System.exit(0);
			}
			
			String academicSem=enrollment.substring(5,7);
			if (academicSem.equals("01") || academicSem.equals("31"))
				flag=1;
			else
			{
				flag=0;
				System.out.println("Invalid Academic Sem !!!");
				System.exit(0);
			}
			
			String deptCode=enrollment.substring(7,9);
			if (deptCode.equals("07") )
				flag=1;
			else
			{
				flag=0;
				System.out.println("Invalid Department code !!!");
				System.exit(0);
			}
			
			int number=Integer.parseInt(enrollment.substring(9,12));
			if (number>=1 && number<=100)
				flag=1;
			else
			{
				flag=0;
				System.out.println("Invalid unique number");
				System.exit(0);
			}
			if (flag==1)
				System.out.println("valid enrollment number");
		}
}