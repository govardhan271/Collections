package com.dailycode;

public class Generics<T,S,U,V> {
	
	private T type1;
	private S type2;
	private U type3;
	private V type4;	
	
	public Generics(T type1, S type2, U type3, V type4) {
		this.type1 = type1;
		this.type2 = type2;
		this.type3 = type3;
		this.type4 = type4;
	}
	
	
	public T getType1() {
		return type1;
	}
	public void setType1(T type1) {
		this.type1 = type1;
	}
	
	public S getType2() {
		return type2;
	}
	public void setType2(S type2) {
		this.type2 = type2;
	}
	
	public U getType3() {
		return type3;
	}
	public void setType3(U type3) {
		this.type3 = type3;
	}
	
	public V getType4() {
		return type4;
	}
	public void setType4(V type4) {
		this.type4 = type4;
	}
	
	//Generic Static Method
	public static <T> T firstArrayElement(T[] t) {	// Independent of class T
		
		if(t.length>0) {
			return t[0];
		}
		
		return null;
	}
	
	//Non generic static method
	public T arrayElement(T[] t) {//This T should be as T of Class 
		
		if(t.length>0) {
			return t[0];
		}
		
		return null;
	}
}

