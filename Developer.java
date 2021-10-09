class Developer{
	public static void writecode(){
		System.out.println("Developer write code here");
	    Manager.meeting();
	}

	
	public static void developapp(){
		System.out.println("Develop app here");
		Manager.monitor(); // invoke method from manager calss
	}
	 
	public static void compile(){
		System.out.println("Complie prgrm here:");
		Manager.organize(); // invoke method from manager calss
	}	
		 
	public static void run(){
		System.out.println("Run program here");
		Manager.planning(); // invoke method from manager calss
	}
	 
	public static void test(){
		System.out.println("Test code here");
		Manager.decidesal(); // invoke method from manager calss
	}
	
	public static void debug(){
		System.out.println("Debug code here");
	}
}
