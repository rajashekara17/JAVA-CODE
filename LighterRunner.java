class LighterRunner{
	public static void main(String[] args)
	{
		String ref="OFF";
		Lighter.on(ref);
		String ref2="0ff";
		Lighter.off(ref2);
		int ref3=0;
		Lighter.light(ref3);
	}
}
