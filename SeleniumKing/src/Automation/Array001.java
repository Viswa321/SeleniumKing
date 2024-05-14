package Automation;



public class Array001 {
	public static void main(String[] args) {
		//Syntax 1
		int [] Array1 = new int[5];
		
		Array1[0] = 1;
		Array1[1] = 2;
		Array1[2] = 3;
		Array1[3] = 4;
		Array1[4] = 5;
		
		
		for (int i = 0; i <Array1.length; i++) {
			System.out.println(Array1[i]);
			
		}

		int []Array2 = {1,4,8,9,10};
		for (int i = 0; i < Array2.length; i++) {
			 System.out.println(Array2[i]);
			
		}
	}

}
