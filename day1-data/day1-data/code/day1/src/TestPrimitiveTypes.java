class TestPrimitiveTypes
{
	
  public static void main(String[] args)
  {
	  int data1;
	//  byte b1=-129;//javac err
	byte b1=10;
	byte b2=20;
	//byte b3=b1+b2;//RHS : int , LHS : byte : javac err
	short s1=100;
	//short s2=s1+b1;//RHS : auto promoted to int , LHS : short
	long l1=123456789l;
	float f=l1;//long --> float : widening conversion : auto done by javac
//	f=123.456;//double --> float : narrowing conversion!
	f=123.456F;
	double d1=l1*f;//RHS : float --> widening --> double
  }
}
