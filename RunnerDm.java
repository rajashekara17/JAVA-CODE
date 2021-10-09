class RunnerDm{
	public static void main(String[] args)
	{
		System.out.println("All Developer and Manager Methods Invoke here");
		Developer.developapp();
		Developer.writecode();
		Developer.compile();
		Developer.run();
		Developer.test();
		Developer.debug(); 
		
		System.out.println("All Manager Method invoke here:");
		
		Manager.meeting();
		Manager.monitor();
		Manager.organize();
		Manager.planning();
		Manager.decidesal();
	}
}
