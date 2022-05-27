package com.dailycode;

public class Main {

	public static void main(String[] args) {
		ArrayCollection.arrays();
		
		Generics<String,Integer,Long,Double> obj;
		obj = new Generics<>("xyz",96,96000L,3.14);
		System.out.println(obj.getType1()+" is "+obj.getType2() +" years old and earns "+obj.getType3());
		
		System.out.println(Generics.firstArrayElement(new Integer[]{1, 2, 3}));
		System.out.println(Generics.firstArrayElement(new String[]{"a", "b", "c"}));
		System.out.println(obj.arrayElement(new String[] {"ab", "bc", "ca"}));
		
		System.out.println(NonGeneric.xyz(new Integer[]{1,2,3}));
		System.out.println(new NonGeneric().abc(new String[]{"a","b"}));


	}

}
class NonGeneric{
	public static <T> T xyz(T[] t) {
		return t[0];
	}
	
	public <T> T abc(T[] t) {
		return t[0];
	}
	
}