package java_excercises_2023;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		
		
		
        List<Automobile> automobiles = new ArrayList<>();
        
        automobiles.add(new Automobile("Fiat", "AB123CD", "Rosso", "Panda", 2020, 70));
        automobiles.add(new Automobile("Opel", "AA345FG", "Nero", "Corsa", 2019, 80));
        automobiles.add(new Automobile("Ford", "BC234DE", "Bianco", "Fiesta", 2018, 85));
                
           
        //Collections.sort(automobiles, (Automobile a, Automobile b) -> a.compareTo(b)); //Lambda Expression to sort using comparable
        
        //Collections.sort(automobiles, Automobile::compareTo); // Method Reference 

        Collections.sort(automobiles, new AutomobilePowerComparator()); //Sort using comparator

        
        //automobiles.forEach(automobile -> System.out.println(automobile.getMarca() + " - " + automobile.getPotenza())); //Lambda expresion to print 
        
        AutomobileUtils utiles = AutomobileUtils.getInstance();
        
        Consumer<Automobile> printConsumer = (automobile) -> System.out.println(automobile.getMarca() + " - " + automobile.getPotenza());    
            
        System.out.println("Consumer:");
        utiles.applyConsumer(automobiles, printConsumer);
        
        
        System.out.println();
        
        
        Predicate<Automobile> isPowerful = automobile -> automobile.getPotenza() > 80;
        
        System.out.println("Predicate:");
        utiles.applyPredicate(automobiles, isPowerful);
        
        
        System.out.println();
        
        
        Function<Automobile,String> getBrand =  automobile -> automobile.getMarca(); 
        
        System.out.println("Function:");
        utiles.applyFunction(automobiles, getBrand);

        
        Supplier<Automobile> newCar = () -> {
        	return new Automobile("Volkswagen", "AD123GD", "Nero", "Amarok", 2023, 120);
        };
        
        
        automobiles.add(utiles.applySupplier(newCar));
        
        System.out.println();
        System.out.println("Supplier:");
        
        automobiles.stream()
        .filter(isPowerful)
        .forEach(automobile -> System.out.println(automobile.getMarca() + " is powerful: " + automobile.getPotenza()));
        
	}

}
