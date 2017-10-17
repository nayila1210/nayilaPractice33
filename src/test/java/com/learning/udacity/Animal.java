package com.learning.udacity;

public class Animal {
	String color;
	public String name;
	public int weight;
	final static String ORGAN="eye";// due to final static, organ has to be upper case;
	public static int age=6;
	
	public void run() {
		final int localSpeed=5;//  you can only use final for local variable;
		int speed=0;
		//public int speed=0;// can't use access modifier for local variable
		
		for(int i=0;i<4;i++) {
		speed ++;
	  System.out.println("animal is running at the speed of "+speed);}
		
	}
	

	public static void main(String[] args) {
		
		Animal cat=new Animal();
		
		cat.color="red";
		cat.name="Mimi";
		cat.weight=12;
		cat.run();
		//System.out.println(localSpeed);Error! you can not access local variable
		
		System.out.println(ORGAN);// static variable can be accessed!
		System.out.println(cat.ORGAN);// do not recommend!
		System.out.println(Animal.ORGAN);// you can access by calling class name;
		System.out.println(cat.age);// do not recommend!
		System.out.println(Animal.age);
		
		
		
		
		
		
		//cat.speed// local variable can not be accessed out side of method!
		
	}

	}
