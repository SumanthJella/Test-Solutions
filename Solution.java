public class PestoTechSolution{
	public static int climbStairs(int n)
	{
		if(n==1) return 1;
		if(n==2) return 2;
		int i=1;
		int j=2;
		int count = 0;
		while(i<=n-2)
		{
			count = j + i;
			i = j;
			j = count;
		}
		return count;
	}
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println("Number of ways to reach the top of stairs ="+climbStairs(n));
	}
}
