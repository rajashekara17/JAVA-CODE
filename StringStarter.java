class StringStarter{
	public static void main(String[] args)
	{
		String name="RAJASHEKARA";
		System.out.println(name);
		
		int m=name.length();
		System.out.println(m);
		
		String con=name.concat("HAI");
		System.out.println(con);
		
		String rp=name.replace('A','*');
		System.out.println(rp);
		
		char at=name.charAt(8);
		System.out.println(at);
		
		boolean cnt=name.contains("SHE");
		System.out.println(cnt);
		
		boolean end=name.endsWith("B");
		System.out.println(end);
		
		boolean equ=name.equals("SAHANA");
		System.out.println(equ);
		
		String uc=name.toUpperCase();
		System.out.println(uc);
		
		String lc=name.toLowerCase();
		System.out.println(lc);
		
		String vo=name.valueOf("JA");
		System.out.println(vo);
		
		}
}
