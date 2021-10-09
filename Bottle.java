class Bottle{
	public static void setBottle(int price,String color,String quality, String[] brands){
		System.out.println("Bottle Price:" +price);
		System.out.println("Bottle color:" +color);
		System.out.println("Bottle Quality:" +quality);
		System.out.println("Bottle Barands:");
		
		for(int bottleIndex=0;bottleIndex<brands.length;bottleIndex++){ //Usign for loop for displaying group of elements insted print one by one.
			String brand=brands[bottleIndex];
		    System.out.println(brand);
		}
	}
}