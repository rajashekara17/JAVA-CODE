class AinRunner
{
public static void main(String[] args)
{

Fish fish=new Fish();//instance cration

 String clr=fish.color;
 System.out.println(clr);//literals print here
 
 fish.price=20;
 System.out.println(fish.price);//initializing using refernce variables
 
Train train=new Train();//instance cration
	float mlg=train.milage; 
	String clrr=train.color;
	System.out.println(mlg);//literals print here
	System.out.println(clrr);//literals print here

train.name="JSB";//initializing using refernce variables
System.out.println(train.name);

Charger charger=new Charger();//instance cration
String cll=charger.color;
float cpc=charger.Capcity;
System.out.println(cll);//literals print here
System.out.println(cpc);//literals print here

charger.name="APPLE";//initializing using refernce variables
System.out.println(charger.name);


}
}