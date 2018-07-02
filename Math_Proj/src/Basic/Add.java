package Basic;

public class Add 
{
	public static void main(String args[])
	{
		Add ob=new Add();
		ob.add(2,3);
		ob.add(45,34,58);
	}
	
	public void add(int a,int b)
	{
		int c=a;
		int d=b;
		System.out.println("sum :"+(c+d));
		
	}
	
	public void add(int a,int b,int c)
	{
		int d=a;
		int e=b;
		int f=c;
		System.out.println("sum :"+(d+e+f));

	}
}
