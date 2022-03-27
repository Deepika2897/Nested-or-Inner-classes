package com.nestedclass;
 interface MyInterface{
	 void add();
	 void sub();
 }
	

public class AnonymousInterfaceInnerClass {

	public static void main(String[] args) {
		//Anonymous inner interface class
		
		MyInterface ob=new MyInterface() {

			@Override
			public void add() {
				System.out.println("Add method");
				
			}

			@Override
			public void sub() {
				System.out.println("Subtract method");
				
			}
			
		};
		ob.add();
		ob.sub();
		

	}

}

