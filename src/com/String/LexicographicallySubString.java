package com.String;

public class LexicographicallySubString {

	// creating a function with two parameters
	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";
		smallest = s.substring(0, k);

		// loop
		for (int i = 0; i + k < s.length(); i++) {
			if (s.substring(i, i + k).compareTo(smallest) < 0) {
				smallest = s.substring(i, i + k);

			}
		}
		largest = s.substring(0, k);

		for (int i = 0; i + k-1 < s.length(); i++) {
			if (s.substring(i, i + k).compareTo(largest) > 0) {
				largest = s.substring(i, i + k);

			}
		}
		return smallest + " \n" + largest;
	}

	public static void main(String[] args) {

		System.out.println(getSmallestAndLargest("welcometojava", 3));
	}

}
