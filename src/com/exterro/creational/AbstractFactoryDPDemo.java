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

abstract class Vegetable {
	private String name;
	private String nutrition;

	public Vegetable(String name, String nutrition) {
		super();
		this.name = name;
		this.nutrition = nutrition;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNutrition() {
		return nutrition;
	}

	public void setNutrition(String nutrition) {
		this.nutrition = nutrition;
	}

	public abstract String getBenefit();
}

class Tomato extends Vegetable {
	private String type;

	public Tomato(String name, String nutrition, String type) {
		super(name, nutrition);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBenefit() {
		return type + " " + getName() + " with " + getNutrition();
	}
}

class Capsicum extends Vegetable {
	private String color;

	public Capsicum(String name, String nutrition, String color) {
		super(name, nutrition);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBenefit() {
		return color + " color " + getName() + " with " + getNutrition();
	}
}
abstract class FoodFactory{  
	  public abstract Vegetable getVegetable(String name);  
	  public abstract Fruit getFruit(String name);
	
	}

class FactoryCreator {  
    public static FoodFactory getFactory(String choice){  
     if(choice.equalsIgnoreCase("vegetable")){  
        return new VegetableFactory();  
     } else if(choice.equalsIgnoreCase("fruit")){  
        return new FruitFactory();  
     }  
     return null;  
  }  
}
class VegetableFactory extends FoodFactory{
	public Vegetable getVegetable(String name) {
		Scanner input = new Scanner(System.in);

		
		switch (name.toLowerCase()) {
		case "tomato":
			System.out.println("Enter the type:");
			String type = input.next();
			return new Tomato("Tomato", "Vitamin C", type);
		case "capsicum":
			System.out.println("Enter the color:");
			String color = input.next();
			return new Capsicum("Capsicum", "Vitamin A", color);
		default:
			return null;
		}
	}

	@Override
	public Fruit getFruit(String name) {
		
		return null;
	}
}



public class AbstractFactoryDPDemo {

	public static void main(String[] args) {
		
		FoodFactory factory = FactoryCreator.getFactory("vegetable");
		Vegetable veggie = factory.getVegetable("tomato");
		System.out.println(veggie.getBenefit());
	}

}
