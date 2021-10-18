class ProductStarter{
	public static void main(String[] value)
	{
		 Product product=new Product();
	     product.display();//default values
		 product.quality="good";
		 product.price=10.5f;
		 product.quantity=5;
		 product.isiMark=true;
		 product.name="ABCD";
		 product.display(); //after initialize
		 
		 
		 Product product1=new Product();
		 product1.quality="good";
		 product1.price=12.5f;
		 product1.quantity=5;
		 product1.isiMark=true;
		 product1.name="A";
		 product1.display(); //after initialize
		 
		 Product product2=new Product();
		 product2.quality="good";
		 product2.price=12.5f;
		 product2.quantity=5;
		 product2.isiMark=true;
		 product2.name="B";
		 product2.display(); //after initialize
		 
		 Product product3=new Product();
		 product3.quality="good";
		 product3.price=12.5f;
		 product3.quantity=6;
		 product3.isiMark=true;
		 product3.name="C";
		 product3.display(); //after initialize
		 
		 Product product4=new Product();
		 product4.quality="good";
		 product4.price=12.5f;
		 product4.quantity=6;
		 product4.isiMark=true;
		 product4.name="D";
		 product4.display(); //after initialize
		 
		 Product product5=new Product();
		 product5.quality="good";
		 product5.price=12.5f;
		 product5.quantity=6;
		 product5.isiMark=true;
		 product5.name="E";
		 product5.display();
		 
		 product.totalPrice();
		 System.out.println("1st Product");
		 product1.totalPrice();
		 System.out.println("2nd Product");
		 product2.totalPrice();
		 System.out.println("3rd Product");
		 product3.totalPrice();
		 System.out.println("4st Product");
		 product4.totalPrice();
		 System.out.println("5st Product");
		 product5.totalPrice();
		 
		 
	}
	
}
