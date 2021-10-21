class WrapperStarter{
	public static void main(String[] raj)
	{
		System.out.println("BYTE CONSTRUCTORE AND METHODS");
		
		Byte byte1=new Byte((byte)100);
		System.out.println(byte1);
		
		Byte byte2=new Byte((byte)80);
		System.out.println(byte2);
		
		Byte byte3=new Byte((byte)26);
		System.out.println(byte3);
		
		//Methods
		//1. byteValue
		Byte bvalue=byte1.byteValue();
		System.out.println(bvalue);
		
		//2. compare
		int bcmp=Byte.compare(byte1,byte2);
		System.out.println(bcmp);
		if(bcmp<0)
		{
			System.out.println(byte1+ "Less than" +byte2);
		}
		else if(bcmp==0)
		{
			
			System.out.println(byte1+ "Equal to" +byte2);
		}
		else
		{
			System.out.println(byte1+ "Greater than" +byte2);
		}
		
		//3.double value
		double	dvalue=byte2.doubleValue();
		System.out.println(dvalue);
		
		//4.float Value
		float fvalue=byte1.floatValue();
		System.out.println(fvalue);
		
		//5.Boolean
		boolean booleanvalue=byte3.equals(byte1);
		System.out.println(booleanvalue);
		
		//6.Hash code
		int hash=byte1.hashCode();
		System.out.println(hash);
		
		//7.long value
		long lvalue=byte3.longValue();
		System.out.println(lvalue);
		
		//8.tostring
		String svalue=byte3.toString();
		System.out.println(svalue);
		
		//10.shortValue
		short shortValue=byte2.shortValue();
		System.out.println(shortValue);
		
		System.out.println("+++++++++++INTEGER CONSTRCTOR AND METHODS++++++++++++++++");
		
		Integer integer1=new Integer(23);
		System.out.println(integer1);
		
		Integer integer2=new Integer(230);
		System.out.println(integer2);
		
		Integer integer3=new Integer(13);
		System.out.println(integer3);
		
		System.out.println("+++======INT METHODS======+++");
		
		//bitCount
		int sint=Integer.bitCount(integer1);
		System.out.println(sint);
		
		//byteValue
		byte bytevalue=integer2.byteValue();
		System.out.println(bytevalue);
		
		//Compare
		int Integercompare=Integer.compare(integer1,integer3);
		System.out.println(Integercompare);
		
		//doubleValue
		double doubleint=integer1.doubleValue();
		System.out.println(doubleint);
		
		//floatValue
		float floatint=integer3.floatValue();
		System.out.println(floatint);
		
		//shortValue
		short shortint=integer2.shortValue();
		System.out.println(shortint);
		
		//longValue
		long longint=integer3.longValue();
		System.out.println(longint);
		
		//reverse
		int revint=Integer.reverse(integer2);
		System.out.println(revint);
		
		
		System.out.println("=================LONG COSNTRUCTOR AND METHOD=================");
		
		Long long1=new Long(122);
		System.out.println(long1);
		
		Long long2=new Long(1252);
		System.out.println(long2);
		
		Long long3=new Long(102);
		System.out.println(long3);
		
		System.out.println("+++======LONG METHODS======+++");
		
		//bitCount
		int longbit=Long.bitCount(long1);
		System.out.println(longbit);
		
		//byteValue
		byte longvalue=long3.byteValue();
		System.out.println(longvalue);
		
		//Compare
		int Longcompare=Long.compare(long1,long3);
		System.out.println(Longcompare);
		
		//doubleValue
		double doublelong=long2.doubleValue();
		System.out.println(doublelong);
		
		//floatValue
		float floatlong=long3.floatValue();
		System.out.println(floatlong);
		
		//shortValue
		short shortlong=long1.shortValue();
		System.out.println(shortlong);
		
		//longValue
		long longl=long2.longValue();
		System.out.println(longl);
		
		//reverse
		long revlong=Long.reverse(long3);
		System.out.println(revlong);
		
		
		System.out.println("=================Double COSNTRUCTOR AND METHOD=================");
		
		Double double1=new Double(122.7);
		System.out.println(double1);
		
		Double double2=new Double(122.6);
		System.out.println(double2);
		
		Double double3=new Double(122.8);
		System.out.println(double3);
		
		
		
		System.out.println("+++======DOUBLE METHODS======+++");
		
		
		//byteValue
		byte doublevalue=double2.byteValue();
		System.out.println(doublevalue);
		
		//Compare
		double doublecompare=Double.compare(double1,double3);
		System.out.println(doublecompare);
		
		
		//floatValue
		float floatdouble=double1.floatValue();
		System.out.println(floatdouble);
		
		//shortValue
		short shortdouble=double3.shortValue();
		System.out.println(shortdouble);
		
		//longValue
		long longdouble=double2.longValue();
		System.out.println(longdouble);
		
		//hashCode
		int doublehash=double1.hashCode();
		System.out.println(doublehash);
		
		//intValue
		int doubleintvalue=double3.intValue();
		System.out.println(doubleintvalue);
		
		//isNaN
		boolean doublenan=double1.isNaN();
		System.out.println(doublenan);
		
		//isInfinite
		boolean doubleinfinit=double2.isInfinite();
		System.out.println(doubleinfinit);
		
		
		System.out.println("=================Float COSNTRUCTOR AND METHOD=================");
		
		Float float1=new Float(11.5);
		System.out.println(float1);
		
		Float float2=new Float(1.5);
		System.out.println(float2);
		
		Float float3=new Float(159.5);
		System.out.println(float3);
		
		System.out.println("+++======FLOAT METHODS======+++");
		
		byte floatbyteValue=float1.byteValue();
		System.out.println(floatbyteValue);
		
		int floatcompare=Float.compare(float2,float3);
		System.out.println(floatcompare);
		
		int floatcompareTo=float1.compareTo(float3);
		System.out.println(floatcompareTo);
		
		double floatdoublevalue=float2.doubleValue();
		System.out.println(floatdoublevalue);
		
		boolean Floatequals=float1.equals(float3);
		System.out.println(Floatequals);
		
		int	floathashcode=float1.hashCode();
		System.out.println(floathashcode);
		
		System.out.println("=================Short COSNTRUCTOR AND METHOD=================");
		
		Short short1=new Short((short)10);
		System.out.println(short1);
		
		Short short2=new Short((short)40);
		System.out.println(short2);
		
		Short short3=new Short((short)30);
		System.out.println(short3);
		
		Short short4=new Short("98");
		System.out.println(short4);
		
		byte shortbytevalue=short1.byteValue();
		System.out.println(shortbytevalue);
		
		double shortdoubleValue=short1.doubleValue();
		System.out.println(shortdoubleValue);
		
		boolean shortequals=short1.equals(short2);
		System.out.println(shortequals);
		
		float shortfloatvalue=short1.floatValue();
		System.out.println(shortfloatvalue);
		
		System.out.println("=================Character COSNTRUCTOR AND METHOD=================");
		
		Character character1=new Character('R');
		System.out.println(character1);
		
		Character character2=new Character('A');
		System.out.println(character2);
		
		Character character3=new Character('J');
		System.out.println(character3);
		
		Character character4=new Character('A');
		System.out.println(character4);
		
		int charcount1=Character.charCount(character3);
		System.out.println(charcount1);
		
		
		char[] name={'R','J','A'};
		int number1=Character.codePointAt(name,2);
		System.out.println(number1);
		
		char[] name1={'R','J','A','S','K','A','R','A',};
		int number2=Character.codePointAt(name1,0, 5);
		System.out.println(number2);
		
		int number3=Character.codePointBefore(name,1);
		System.out.println(number3);
		
		
		System.out.println("================Boolean COSNTRUCTOR AND METHOD=================");
		
		Boolean boolean1=new Boolean(true);
		System.out.println(boolean1);
		
		
		Boolean boolean2=new Boolean(false);
		System.out.println(boolean2);
		
		boolean booleanvalue1=boolean1.booleanValue();
		System.out.println(booleanvalue1);
		
		int booleancmp=Boolean.compare(boolean1, boolean2);
		System.out.println(booleancmp);
		
		boolean booleaneq=boolean2.equals(boolean1);
		System.out.println(booleaneq);
		
		int boolhash=boolean1.hashCode();
		System.out.println(boolhash);
		
		
	}
}


	