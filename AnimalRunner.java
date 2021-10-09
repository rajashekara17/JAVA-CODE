class AnimalRunner{
	public static void main(String[] args)
	{
		String dog = "Rio";
		String cow = "Geer";
		String cat = "Pummmi";
		
		String[] animal={dog,cow,cat,"lion","rat","tiger","monkey","godzilla"}; // decalring array
		int size=animal.length;
		System.out.println(size);
		System.out.println("Index 0:"+animal[0]);// here print the array ref in console using index value
		System.out.println("Index 1:"+animal[1]);
		System.out.println("Index 2:"+animal[2]);
		System.out.println("Index 3:"+animal[3]);
		System.out.println("Index 4:"+animal[4]);
		System.out.println("Index 5:"+animal[5]);
		System.out.println("Index 6:"+animal[6]);
		System.out.println("Index 7:"+animal[7]);
	}
}