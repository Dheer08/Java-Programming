class Test{
	public static void main(String args[])
	{
		int a = 10;
		float f = a; // Widening
		System.out.println(f);
		
		int b = (int)f; // Typecasting or Narrowing
		// int(f) is wrong
		System.out.println(b);

		int x = 130;
		byte k = (byte)x;//overflow
		System.out.println(k);
	}
}