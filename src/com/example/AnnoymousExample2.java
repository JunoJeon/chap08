package com.example;

public class AnnoymousExample2 {
	/*
	 * 익명 자식 객체
	 * 익명 구현 객체
	 */
	interface Showable {
		void show();
		void hide();
	}
	

	public static void main(String[] args) {
		
		Showable b = new Showable() { // 익명 구현 객체

			@Override
			public void show() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void hide() {
				// TODO Auto-generated method stub
				
			}
			
		};

		b.show();
		b.hide();
		
	}

}
