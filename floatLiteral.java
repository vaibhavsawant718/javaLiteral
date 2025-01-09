class floatliteral
{
	public static void main(String[]args)
	{
		
		float f=10;
		//float f1=123.456; 	  //  error: incompatible types: possible lossy conversion from double to float
		float f2=123.456F;
		double d=123.456;
		double d1=123.4568D;  
		//float f3=123.4567D; 	 //error: incompatible types: possible lossy conversion from double to float
		System.out.println(f); 
		//System.out.println(f1);
		System.out.println(f2);
		System.out.println(d);
		System.out.println(d1);
		//System.out.println(f3);
		
	}
}