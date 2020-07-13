class test{
	public static void main(String args[])
	{
		int num = 153;
		int sum = 0,num_copy = num;
		int mod;
		while(num>0)
		{
			mod = num%10;
			sum = sum + mod*mod*mod;
			num = num/10;
		}
		if(sum == num_copy)
			System.out.println(num_copy+" is a armstrong Number");
		else
			System.out.println(num_copy+" is not a armstrong Number");
	}
}