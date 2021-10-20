class Camera1{
	String brand;
	int model;
	float pixel;
	float price;
	
	
	Camera1(String brand,int model,float pixel,float price)
	{
		this.brand=brand;
		this.model=model;
		this.pixel=pixel;
		this.price=price;
		System.out.println("Camera1 Coctructor invoke here");
	}
	
	String getBrand()
	{
		this.brand=brand;
		return brand;
	}
	
	int getModel()
	{
		
		this.model=model;
		return model;
		
	}
	
	float getPixel()
	{
		this.pixel=pixel;
		return pixel;
	}
	
	float getPrice()
	{
		this.price=price;
		return price;
	
	}
	
	void setBrand(String barnd)//setter
	{
		this.brand=barnd;
		
	}
	
	void setModel(int model) //setter
	{
		this.model=model;
	}
	
	void setPixel(float pixel)//setter
	{
		this.pixel=pixel;
	}
	
	void setPrice(float price)//setter
	{
		this.price=price;
	}
	
}	
