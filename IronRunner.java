class IronRunner{
	public static void main(String[] value)
	{
		String clothtype ="Silk";
		IronBox.heating("Cotton"); // passing value for parameter
		IronBox.heating(clothtype); // passing value for parameter
		boolean yes = true;
		IronBox.streamWater(yes);
		
	}
}
