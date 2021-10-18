class Product{
	String quality;
	float price;
	int quantity;
	boolean isiMark;
	String name;
	static double totalALL;//making Static because need total of all products 
	
	Product()
	{
		System.out.println("Invoke Product constructor");
	}
	
	void display()
	{
		System.out.println(this.quality);
		System.out.println(this.price);
		System.out.println(this.quantity);
		System.out.println(this.isiMark);
		System.out.println(this.name);
	}
	
	void totalPrice()
	{
		float total=this.price*this.quantity;
		System.out.println(total);
		Product.totalALL=Product.totalALL+total;
		System.out.println(Product.totalALL);
	}
}