class test{
	public static void main(String args[])
	{
		int num = 6;
		int fact = 1;
		for(int i=1;i<=num;i++)
		{
			fact = fact*i;
		}
		System.out.println(fact+" is the factorial of "+num);
	}
}