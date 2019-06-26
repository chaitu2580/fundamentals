package languageBasics;

public class ass14 {
	public static void main(String args[])
	{
	int c=0,n=1;
	for(int i=0;i<=n;i++)
	{
	if(n==0||n==1)
	System.out.println("neither prime nor composite");
	 if(n%i==0)
	 c++;
	}
	 if(c==2)
	 System.out.println("prime");
	else
	System.out.println("not prime");
	}
	}
