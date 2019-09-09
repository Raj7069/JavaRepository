interface P{
	
	int p=5;
	public void  displayp();
}

interface P1 extends P{
	
	int p1=10;
	public void displayp1();
}

interface P2 extends P{
	
	int p2=15;
	public void displayp2();
}

interface P12 extends P1,P2{

	int p12=20;
	public void displayp12();
}

class InterfaceInheritance implements P12{
	
		public void displayp(){
			System.out.println(p);
		}
		public void displayp1(){
			System.out.println(p1);
		}
		public void displayp2(){
			System.out.println(p2);
		}
		public void displayp12(){
			System.out.println(p12);
		}
	public static void main(String args[]){
			InterfaceInheritance ii=new InterfaceInheritance();
			ii.displayp();
			ii.displayp1();
			ii.displayp2();
			ii.displayp12();
			
	}
}
