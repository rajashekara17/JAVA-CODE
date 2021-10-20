class Camera1Starter{
	public static void main(String[] rags)
	{	
		Camera1 camera1=new Camera1("ABC",2012,5.2f,62.11f);
		String brand1=camera1.getBrand();
		int model1=camera1.getModel();
		float pixel1=camera1.getPixel();
		float price1=camera1.getPrice();
		
		if(brand1!=null)//null check
		{
			System.out.println(brand1);
		}
		if(model1!=0)//null check
		{
			System.out.println(model1);
		}
		if(pixel1!=0)//null check
		{
			System.out.println(pixel1);
		}
		if(price1!=0)//null check
		{
			System.out.println(price1);
		}
		
		camera1.setBrand("VIVO"); //upadate using setter method
		camera1.setModel(1995);  //upadate using setter method
		camera1.setPixel(52.3f); //upadate using setter method
		camera1.setPrice(62.4f); //upadate using setter method
		
		System.out.println(camera1.getBrand());
		System.out.println(camera1.getModel());
		System.out.println(camera1.getPixel());
		System.out.println(camera1.getPrice());
		}
}

	
		