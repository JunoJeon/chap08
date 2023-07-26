package com.example;

public class TriangleExample2 {
	
	/*
	 * 		1.				2.				3.				4.
	 * 		*			*****				*****				*
	 * 		**			 ****				****			   **
	 * 		***			  ***				***				  ***
	 * 		****		   **				**				 ****
	 * 		*****			*				*				*****
	 */
	static void triangle1() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i>=j)
					System.out.print('*');
				else
					System.out.print(' ');
			}
			System.out.println();
		}
	}
	
	static void triangle2() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i<=j)
					System.out.print('*');
				else
					System.out.print(' ');
			}
			System.out.println();
		}
	}
	
	static void triangle3() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i+j<=4)
					System.out.print('*');
				else
					System.out.print(' ');
			}
			System.out.println();
		}
	}
	static void triangle4() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i+j>=4)
					System.out.print('*');
				else
					System.out.print(' ');
			}
			System.out.println();
		}
	}
	
	static void rectangle() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i==0||i==4||j==0||j==4)
					System.out.print('*');
				else
					System.out.print(' ');
			}
			System.out.println();
		}
	}
	
	static void cross() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i==j||i+j==4)
					System.out.print('*');
				else
					System.out.print(' ');
			}
			System.out.println();
		}
	}
	
	static class Show {
		boolean test(int i, int j) {
			return i>=j;
		}
	}
	
	static void drawShape(Show s) {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(s.test(i, j))
					System.out.print('*');
				else
					System.out.print(' ');
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		Show s = new Show();
		
		System.out.println("1. ");
		drawShape(s);
		System.out.println("2. ");
		drawShape(s);
		System.out.println("3. ");
		drawShape(s);
		System.out.println("4. ");
		drawShape(s);
		System.out.println("5. rect ");
		drawShape(s);
		System.out.println("6. cro ");
		drawShape(s);
		

	}

}
