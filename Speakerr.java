class Speakerr{
	public static void volume(int level)
	{
		if(level<=0)
		{
			System.out.println("on it first");
			return ;
		}
		
		else if(level<=3)
		{
			System.out.println("0k");
			return ;
		}
		/*else if(level>3)
		{
			System.out.println("loud");
			return;
		}*/
		else if(level>=5)
		{
			System.out.println("Too loud");
			return;
		}
		else if(level>9)
		{
			System.out.println("Call to police");
			return;
		}
	}
}	