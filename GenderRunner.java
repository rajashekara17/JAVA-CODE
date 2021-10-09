class GenderRunner{
	public static void main(String[] args)
	{
		boolean male  = true;
		boolean female  = true ;
		boolean other  = false;
		
		boolean[] gender={male,female,other}; // decalring array
		int size=gender.length;
		System.out.println(size);
		System.out.println("Index 0:"+gender[0]);// here print the array ref in console using index value
		System.out.println("Index 1:"+gender[1]);
		System.out.println("Index 2:"+gender[2]);	
	}
}