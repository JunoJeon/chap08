package com.example;

import java.util.TimerTask;

public class InterfaceExample {
	
	static class A { //일반클래스
		class AA {
			
		}
		static int count;
		int num;
		static {
			
		}
		public A() {
			
		}
		void show() {
			
		}
		static int getCount() {
			return count;
		}
	}
	
	static abstract class B { 		//abstract 가붙으면 무조건 추상클래스 (불완전한 클래스)
		static int count=0;
		int num;
		
		public B() {

		}
		void show() {
			
		}
		static int getCount() {
			return count;
		}
		
		abstract void hide();		// 추상 메소드
	}
	
	static class AA extends A {
		
	}
	static class BB extends B {

		@Override
		void hide() {		//B를 부모로 삼는 대신에 오버라이드 강제
			
		}
		
	}
	
	static class Task extends TimerTask { //추상클래스아 run강제

		@Override
		public void run() {
			
		}
		
	}
	
	static abstract class D {		//순수 추상클래스 자바에서는 별도로 인터페이스로 만들어놨다.
		abstract void show();
		abstract void hide();
	}
	
	static class DD extends D {

		@Override
		void show() {
			
		}

		@Override
		void hide() {
			
		}
		
	}
	
	interface Showable { 		//인터페이스는 형용사형대로 이름을 준다
		void show();
		void hide();
	}
	interface Moveable {
		void left();
		void right();
		void up();
		void down();
	}
	
	static class E implements Showable,Moveable { 	//구현 클래스

		@Override
		public void show() {
			
		}

		@Override
		public void hide() {
			
		}

		@Override
		public void left() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void right() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void up() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void down() {
			// TODO Auto-generated method stub
			
		}
		
	}

	public static void main(String[] args) {
		
		A a = new A();
//		B b = new B(); 추상클래스는 미완성클래스라 new 불가능
//		Showable s = new Showable(); 불완전한 클래스
		
		B b = null;
		Showable s = null;
		
		A al = new AA();
		B b1 = new BB();
		Showable s1 = new E();
	}

}
