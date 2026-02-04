class methodoverloadingdemo  
{
	float sum(float a, float b)
	{
		return a+b;
	}
	double sum(double a, double b, double c)
	{
		return a+b+c;
	}
	public static void main(String[] args) 
	{
		methodoverloadingdemo obj = new methodoverloadingdemo();
		float result = obj.sum(10,20);
		System.out.println("sum of two numbers:" + result);
		System.out.println("sum of three numbers:" + result);
		
	}
}
