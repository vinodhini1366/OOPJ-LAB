class A extends Thread 
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
class B extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("\t From ThreadB: i= " +i);
		}	
		System.out.println("Exit from B");
	}
}
class C extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("\t From ThreadC: i= " +i);
		}	
		System.out.println("Exit from C");
	}
}
class ThreadPriority
{
	public static void main(String[] args) 
	{
		A threadA = new A();
		B threadB = new B();
		C threadC = new C();

		//threadC.setPriority(Thread.MAX_PRIORITY);
		//threadB.setPriority(Thread.MAX_PRIORITY);
		//threadA.setPriority(Thread.MAX_PRIORITY);
		threadC.setPriority(10);
		threadB.setPriority(10);
		threadA.setPriority(10);

		threadA.start();
        threadB.start();
        threadC.start();
	}
}