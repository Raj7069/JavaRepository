package com.vvp.lib.model;

public class Dao{

	public static Student students[]= new Student[3];
	public static Staff staffs[]=new Staff[3];
	public static HardMedia hm[]=new HardMedia[3];
	public static SoftMedia sm[]=new SoftMedia[3];
	public static void initData(){
		
		students[0]=new Student(101,"Manan",5,2,"CE");
		students[1]=new Student(102,"Sahil",8,3,"MECH");
		students[2]=new Student(103,"Devansh",1,4,"CIVIL");
		
		staffs[0]=new Staff(501,"Manohar","22-07-2004");
		staffs[1]=new Staff(502,"Chinmay","15-05-2009");
		staffs[2]=new Staff(503,"Navkar","11-10-2001");
		
		hm[0]=new HardMedia(001,"General Knoledge",5,450.00f);
		hm[1]=new HardMedia(002,"Motivation: For All",8,1000.00f);
		hm[2]=new HardMedia(003,"Life is Game",1,4500.00f);
		
		sm[0]=new SoftMedia(901,"Chand Ne Kaho Aje Athme Nahi",3,11.9f);
		sm[1]=new SoftMedia(902,"Pachtaoge",5,20.3f);
		sm[2]=new SoftMedia(903,"Gori Radha Ne Kalo kaan",6,17.2f);
	}
}