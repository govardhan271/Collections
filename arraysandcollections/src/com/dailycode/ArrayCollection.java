package com.dailycode;

import java.util.Arrays;

public class ArrayCollection {
	
	public static void arrays(){
		
		int[] ids = new int[10]; //Primitive array
		System.out.println(ids[0]);
		
		int[] num = new int[] {1,2,3,4,5};
		int[] roll = {39,48,42};
		
		String[] instruments = new String[3];
		System.out.println(instruments[0]);
		
		String[] courses = {"MBBS", "BE", "BSC"};
		
		//Accessing arrays
		for(int i = 0; i < ids.length; i++) 
		{
			ids[i] = i * i;
			System.out.println(ids[i]);
		}
		
		for(String course : courses) 
		{
			System.out.println(course);
		}
		
		//sorting an array
		Arrays.sort(courses);
		System.out.println(Arrays.toString(courses));
		
		//Searching an element in array
		int[] fibArray = {0, 1, 1, 2, 3, 13, 5, 21, 8};
		Arrays.sort(fibArray);
		System.out.println(Arrays.binarySearch(fibArray, 3));
		
		//comparing arrays
		int[] arr1 = {1,2,5};
		int[] arr2 = {1,2,4};
		System.out.println(Arrays.equals(arr1, arr2));
		System.out.println(Arrays.compare(arr1, arr2));
		System.out.println(Arrays.mismatch(arr1, arr2));
		
		//Multidimensional array
		int[][] multiArray = new int[3][3];
		String[][] multiString = new String[3][10];
		String[][] tech = {
				{"HTML","CSS","JS"},
				{"Java","Python"},
				{"MySql","MongoDB"}
		};
		
		for(String[] techArray : tech) {
			for(String technology: techArray) {
				System.out.println(technology);
			}
		}
		
	}
	


}
