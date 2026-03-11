class  NotEligibleForEngineering extends RuntimeException
{
	NotEligibleForEngineering(String s){
		super(s);
	}
}
class NotEligibleForVJIT extends RuntimeException
{
	NotEligibleForVJIT(String s){
		super(s);
	}
}
class TSEngineeringAdmission
{

	public static void main(String[] args)
	{
		try{
			 int TSEAMCET=Integer.parseInt(args[0]);
		
				if(TSEAMCET<50){
					throw new NotEligibleForEngineering("sorry you are not eligible for tseamcet");
				}
				if(TSEAMCET<70){
					throw new NotEligibleForVJIT("sorry you are not eligible for tseamcet");
				}
				if(TSEAMCET>70){
					System.out.println("Welcome to VJIT-Thanks For Your Registration!");

				}
		}
		catch(NotEligibleForEngineering|NotEligibleForVJIT e){
		e. printStackTrace();
		System.out.println(e.getMessage());
		System.out.println(e.toString());
		}
		System.out.println("Rest of the Code");


	}

}