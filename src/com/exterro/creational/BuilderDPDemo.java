/**
 * @Placed com.exterro.creational
 */
package com.exterro.creational;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mrangasamy
 *
 * @date 28-May-2024
 */

class Employee {

    private String name;
    private String company;
    private boolean hasCar;//optional
    private boolean hasBike;//optional

    private Employee(EmployeeBuilder employeeBuilder) {
        name = employeeBuilder.name;
        company = employeeBuilder.company;
        hasCar = employeeBuilder.hasCar;
        hasBike = employeeBuilder.hasBike;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public boolean isHasCar() {
        return hasCar;
    }

    public boolean isHasBike() {
        return hasBike;
    }

    public static class EmployeeBuilder {
        private String name;
        private String company;
        private boolean hasCar;//optional
        private boolean hasBike;//optional

        //constructor for required fields
        public EmployeeBuilder(String name, String company) {
            this.name = name;
            this.company = company;
        }

        //setter methods for optional fields
        public EmployeeBuilder setHasCar(boolean hasCar) {
            this.hasCar = hasCar;
            return this;
        }

        public EmployeeBuilder setHasBike(boolean hasBike) {
            this.hasBike = hasBike;
            return this;
        }

        //Build the Employee object
        public Employee build() {
            return new Employee(this);
        }
    }

	@Override
	public String toString() {
		return "Employee [name=" + name + ", company=" + company + ", hasCar=" + hasCar + ", hasBike=" + hasBike + "]";
	}
    
}

public class BuilderDPDemo {
    public static void main(String[] args) {
        //Building the object of Employee thru the build() method provided in EmployeeBuilder class.
        Employee employee = new Employee.EmployeeBuilder("Vikram", "ABC").setHasCar(false).setHasBike(true).build();
        System.out.println(employee);
        Employee emp = new Employee.EmployeeBuilder("Arthi", "Exterro").setHasBike(true).build();
    }
}







//interface Item {
//	   public String name();
//	   public Packing packing();
//	   public float price();	
//	}
//interface Packing {
//	   public String pack();
//	}
//
//class Wrapper implements Packing {
//
//	   @Override
//	   public String pack() {
//	      return "Wrapper";
//	   }
//	}
//
//class Bottle implements Packing {
//
//	   @Override
//	   public String pack() {
//	      return "Bottle";
//	   }
//	}
//
//abstract class Burger implements Item {
//
//	   @Override
//	   public Packing packing() {
//	      return new Wrapper();
//	   }
//
//	   @Override
//	   public abstract float price();
//	}
//
//abstract class ColdDrink implements Item {
//
//	@Override
//	public Packing packing() {
//       return new Bottle();
//	}
//
//	@Override
//	public abstract float price();
//}
//
//class VegBurger extends Burger {
//
//	   @Override
//	   public float price() {
//	      return 25.0f;
//	   }
//
//	   @Override
//	   public String name() {
//	      return "Veg Burger";
//	   }
//	}
//class ChickenBurger extends Burger {
//
//	   @Override
//	   public float price() {
//	      return 50.5f;
//	   }
//
//	   @Override
//	   public String name() {
//	      return "Chicken Burger";
//	   }
//	}
//
//class Coke extends ColdDrink {
//
//	   @Override
//	   public float price() {
//	      return 30.0f;
//	   }
//
//	   @Override
//	   public String name() {
//	      return "Coke";
//	   }
//	}
//
//class Pepsi extends ColdDrink {
//
//	   @Override
//	   public float price() {
//	      return 35.0f;
//	   }
//
//	   @Override
//	   public String name() {
//	      return "Pepsi";
//	   }
//	}
//
//class Meal {
//	   private List<Item> items = new ArrayList<Item>();	
//
//	   public void addItem(Item item){
//	      items.add(item);
//	   }
//
//	   public float getCost(){
//	      float cost = 0.0f;
//	      
//	      for (Item item : items) {
//	         cost += item.price();
//	      }		
//	      return cost;
//	   }
//
//	   public void showItems(){
//	   
//	      for (Item item : items) {
//	         System.out.print("Item : " + item.name());
//	         System.out.print(", Packing : " + item.packing().pack());
//	         System.out.println(", Price : " + item.price());
//	      }		
//	   }	
//	}
//
//class MealBuilder {
//
//	   public Meal prepareVegMeal (){
//	      Meal meal = new Meal();
//	      meal.addItem(new VegBurger());
//	      meal.addItem(new Coke());
//	      return meal;
//	   }   
//
//	   public Meal prepareNonVegMeal (){
//	      Meal meal = new Meal();
//	      meal.addItem(new ChickenBurger());
//	      meal.addItem(new Pepsi());
//	      return meal;
//	   }
//	}
//public class BuilderDPDemo {
//	public static void main(String[] args) {
//		MealBuilder mealBuilder = new MealBuilder();
//
//	      Meal vegMeal = mealBuilder.prepareVegMeal();
//	      System.out.println("Veg Meal");
//	      vegMeal.showItems();
//	      System.out.println("Total Cost: " + vegMeal.getCost());
//
//	      Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
//	      System.out.println("\n\nNon-Veg Meal");
//	      nonVegMeal.showItems();
//	      System.out.println("Total Cost: " + nonVegMeal.getCost());
//	   
//	}
//}
