class literal2
{
	public static void main(String[]args)
	{
		
		int x=10;      //valid 
		int x1=10L;    //error: incompatible types: possible lossy conversion from long to int   
		long l=10L;  //valid 
		long l1=10;  //valid 
 		
		byte b=10;
		byte b1=127;
		byte b2=128;  //error: incompatible types: possible lossy conversion from int to byte
		short s=32767;
		short s1=32768;  // error: incompatible types: possible lossy conversion from int to short
 		
		System.out.println(x);
		System.out.println(x1);
		System.out.println(l);
		System.out.println(l1);	

		System.out.println(b);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(s);		
		System.out.println(s1);
		
	}
}