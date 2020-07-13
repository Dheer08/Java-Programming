class Test{
	public static void main(String args[])
	{
		int num = 21;
		int count = 0;
		for(int i=2;i<num;i++)
		{
			if (num % i == 0)
			{
				count = 1;
				break;
			}
		}
		if (count == 0)
			System.out.println(num+" is a prime Number");
		else
			System.out.println(num+" is not a prime Number ");
	}
}