class Lighter{
	public static boolean on(String btn) // here using boolean return type
	{
		if(btn=="ON"){
			System.out.println("Light is on");
		return true;
		}
		else
		{
			System.out.println("Lihgt is off");
			return false;
		}
	}
		
		public static boolean off(String btnn) // here using boolean return type
		{
		if(btnn=="Off"){
			System.out.println("Light is of");
		return true;
		}
		else
		{
			System.out.println("Lihgt is on");
			return false;
		}
	}
	
	public static boolean light(int width) // here using boolean return type
	{
		if(width>0){
			System.out.println("Its True");
			return true;
		}
		else{
			System.out.println("Its False");
			return false;
		}
	}
}