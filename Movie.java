class Movie{
	public static void setMovieDetails(int ticketPrice,float movieLength,String movieName,String[] actors) //declaring variable as parameter
	{
		System.out.println("TicketPrice:" +ticketPrice);
		System.out.println("movieLength:" +movieLength);
		System.out.println("movieName:" +movieName);
		System.out.println("Actores:");
		for(int actorIndex=0;actorIndex<actors.length;actorIndex++){ //Usign for loop for displaying group of elements insted print one by one.
			String actor=actors[actorIndex];
			System.out.println(actor);
		}
	}
}
