public class MultiCatch
{
	public static void main(String[] args)
	{
		try
		{
			int a=args.length;
			System.out.println("a = " + a);
			int b=42/a;
			int c[]={1};
			c[42]=57;
		}
		catch (ArithmeticException e)
		{
			System.out.println("Divide by 0 VJIT:");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index out of bounds:");
		}
		catch(Exception e)
		{
			System.out.println("Divide by 0:");
			System.out.println("Divide by 0 VJIT:");
		}
			System.out.println("array index out of bounds:");
}
	}