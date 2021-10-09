class AllRunner{
 public static void main(String[] args)
 {
	 System.out.println("All methods invoke here:");
	 
	 System.out.println("Speaker methods invoke here:");
	 Speaker.brand();
	 Speaker.price();
	 
	 System.out.println("Printer methods invoke here:");
	 Printer.brand();
	 Printer.price();
	 
	 System.out.println("Camera methods invoke here:");
	 Camera.brand();
	 Camera.price();
		
 }
}