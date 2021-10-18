class AllStarter{
	public static void main(String... sweet)
	{
		float price=10.2f;
		String brand="ABC";	
		HandBag handbag=new HandBag(price,brand);
		System.out.println(handbag.Color);
		System.out.println(handbag.size);
		System.out.println(handbag.prc);
		System.out.println(handbag.bnd);
		
		new HandBag();
		
		
		
			}
}