class MovieRunner{
	public static void main(String[] args){
		int ticketprice=123;
		float movielength=1.30f;
		String moviename="ROBERT";
		
		String[] actors={"Darshan","Vinodh_Prabhaker","Asha_Bhat","Ravishanker"}; //Declaring array refernce or values
		Movie.setMovieDetails(ticketprice,movielength,moviename,actors);//inovke method and passing refernces here
		
		System.out.println("++++++++================+++++++++");
		
		int price=600;
		String color="Blue";
		String quality="Good";

		String[] brands={"PUMA","GLENN","CELTA","DELTA"};
		Bottle.setBottle(price,color,quality,brands);
	}
}