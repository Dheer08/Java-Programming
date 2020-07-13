class test{
	public static void main(String args[])
	{
		int num = 353;
		int num_copy = num;
		int reverse_num = 0,mod;
		while(num!=0)
		{
			mod = num%10;
			reverse_num = reverse_num*10 + mod;
			num = num/10;
		}
		System.out.println(num_copy+" "+reverse_num);
		if(num_copy == reverse_num)
			System.out.println(num_copy+" is a palindrom Number");
		else 
			System.out.println(num_copy+ " is not a palindrom Number");
	}
}