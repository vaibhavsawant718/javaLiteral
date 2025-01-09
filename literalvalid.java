class checkvalid
{
	public static void main(String[] args)
	{
	  int x=0;
	  int x1=0786; // error: illegal digit in an octal literal
	  int x2=0777;
	  int x3=0xFace;
	  int x4=0xBeef;
	  int x5=0xBeer; //error: ';' expected cant extend a to f.
	  int x6=0xabb2cd;
	  System.out.println(x);
	  System.out.println(x1);
	  System.out.println(x2);
	  System.out.println(x3);
	  System.out.println(x4);
	  System.out.println(x5);
	  System.out.println(x6);
	}
}