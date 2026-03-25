class A implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("\t From ThreadA: i= " +i);
		}
		
		System.out.println("Exit from A");
	}
}
class ThreadTest2
{
	public static void main(String args[])
	{
		A threadA = new A();
		Thread t1 = new Thread(threadA);
		t1.start();
	}
}