class AllistanceRunner{
	public static void main(String[] args)
	{
 Internet internet=new Internet();// instance creation
 
 String pro=internet.provider;
 
 System.out.println(pro);
 
  Deodrant deodrant=new Deodrant();// instance craetion 
  
  String bnd=deodrant.brand;
  System.out.println(bnd);
  
  int prc=deodrant.price;
  System.out.println(prc);
  
  String qlt =deodrant.quality;
  System.out.println(qlt);
  
  PowerBank powerbank=new PowerBank(); // Instance creation
  
  int cpct=powerbank.Capacity;
  System.out.println(cpct);
  
  String Comp=powerbank.Company;
  System.out.println(Comp);
  
  int Prc=powerbank.Price;
	System.out.println(Prc);
	
 Wallet	wallet=new Wallet(); // Instance creation
 
 int prcc=wallet.price;
 System.out.println(prcc);
 
 String clr=wallet.color;
 System.out.println(clr);
 
 String cmd=wallet.countrymade;
 System.out.println(cmd);
	}
 }
 