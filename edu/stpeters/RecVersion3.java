package edu.stpeters;

public class RecVersion3 {

	public static void main(String[] args) {
		
		int n=5;
		long res = fact(n,1);
		System.out.println(res);
	}

	private static long fact(int n,int i) {
		
		if(i == n) return n;
		else {
			return i * fact(n,i+1);
		}
		
		
	}

}