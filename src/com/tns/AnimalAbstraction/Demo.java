package com.tns.AnimalAbstraction;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal goat = new Herbivores();
		Animal tiger = new Carnivores();
		Animal bear = new Omnivores();
		goat.eat();
		tiger.eat();
		bear.eat();

	}

}
