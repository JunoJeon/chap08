package com.example;

public class TriangleExample6 {
	
	/*
	 * 		1.				2.				3.				4.
	 * 		*			*****				*****				*
	 * 		**			 ****				****			   **
	 * 		***			  ***				***				  ***
	 * 		****		   **				**				 ****
	 * 		*****			*				*				*****
	 */
	
	static abstract class Shape {
		abstract boolean test(int i, int j);
	}
	
	
	
	static void drawShape(Shape s) {
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
		
		
		System.out.println("1. ");
		drawShape(new Shape() {

			@Override
			boolean test(int i, int j) {
				return i>=j;
			}
			
		});
		System.out.println("2. ");
		drawShape(new Shape() {
			
			@Override
			boolean test(int i, int j) {
				return i<=j;
			}
		});
		System.out.println("3. ");
		drawShape(new Shape() {
			
			@Override
			boolean test(int i, int j) {
				return i+j<=4;
			}
		});
		System.out.println("4. ");
		drawShape(new Shape() {
			
			@Override
			boolean test(int i, int j) {
				return i+j>=4;
			}
		});
		System.out.println("5. rect ");
		drawShape(new Shape() {
			
			@Override
			boolean test(int i, int j) {
				return i==0||i==4||j==0||j==4;
			}
		});
		System.out.println("6. cro ");
		drawShape(new Shape() {
			
			@Override
			boolean test(int i, int j) {
				return i==j||i+j==4;
			}
		});
		

	}

}
