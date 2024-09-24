/**
 * @Placed com.exterro.creational
 */
package com.exterro.creational;

import java.util.Scanner;

/**
 * @author mrangasamy
 *
 * @date 12-Apr-2024
 */
abstract class Fruit {
	private String name;
	private String taste;

	public Fruit(String name, String taste) {
		this.name = name;
		this.taste = taste;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	public abstract String speciality();
}

class Mango extends Fruit {
	private String type;

	public Mango(String name, String taste, String type) {
		super(name, taste);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String speciality() {
		return " Fruit Speciality: " + getTaste() + " " + type + " " + getName();
	}
}

class Grapes extends Fruit {
	private String color;

	public Grapes(String name, String taste, String color) {
		super(name, taste);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String speciality() {
		return " Fruit Speciality: " + getTaste() + " " + color + " " + getName();
	}
}

class FruitFactory extends FoodFactory {
	public Fruit getFruit(String name) {
		
		Scanner input = new Scanner(System.in);
		switch (name.toLowerCase()) {
			case "mango":
				System.out.println("Enter the type:");
				String type = input.next();
				return new Mango("Mango","Sweet",type);
			case "grapes":
				System.out.println("Enter the color:");
				String color = input.next();
				String taste = "Sweet";
				if(color.equals("Green")) 
					taste = "Sour";
				return new Grapes("Grapes",taste,color);
			default:
				System.out.println("Sorry Wrong option");
				return null;
		}
	}

	@Override
	public Vegetable getVegetable(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	
}

public class FactoryDPDemo {

	public static void main(String[] args) {
		Fruit fruit = new FruitFactory().getFruit("mango");
		System.out.println(fruit.speciality());
	}

}
