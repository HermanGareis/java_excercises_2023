package java_excersises_2023_v2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {

		List<Veicolo> vehicles = new ArrayList<>();

		vehicles.add(new Automobile("Fiat", "AB123CD", "Rosso", "Panda", 2020, 70));
		vehicles.add(new Moto("Ducati", "AC237DE", "Rosso", "Panigale", 2021, 100));
		vehicles.add(new Automobile("Opel", "AA345FG", "Nero", "Corsa", 2019, 80));
		vehicles.add(new Moto("Honda", "AC132GH", "Nero", "CB1000R", 2020, 75));
		vehicles.add(new Automobile("Ford", "BC234DE", "Bianco", "Fiesta", 2018, 85));

		Collections.sort(vehicles, Veicolo::compareTo); // Method Reference

		VeicoloUtils utiles = VeicoloUtils.getInstance();

		long startTime = System.nanoTime();

		Consumer<Veicolo> printConsumer = (veicolo) -> System.out
				.println(veicolo.getMarca() + " " + veicolo.getModello() + " - " + veicolo.getPotenza() + " - "
						+ veicolo.getVehicleType() + " (consumer)");

		Predicate<Veicolo> isPowerful = veicolo -> veicolo.getPotenza() > 80;

		Function<Veicolo, String> getBrand = veicolo -> veicolo.getMarca();
			
		Supplier<Veicolo> newCar = () -> {
			return new Automobile("Volkswagen", "AD123GD", "Nero", "Amarok", 2023, 120);
		};
		Supplier<Veicolo> newMotorcycle = () -> {
			return new Moto("Honda", "AH1321ZX", "Verde", "CRV", 2023, 95);
		};
		
		vehicles.add(utiles.applySupplier(newCar));
		vehicles.add(utiles.applySupplier(newMotorcycle));
		
		// create thread pool execution
		ExecutorService executor = Executors.newFixedThreadPool(4);

		// execute consumer
		executor.submit(() -> utiles.applyConsumer(vehicles, printConsumer));

		// execute predicate
		executor.submit(() -> utiles.applyPredicate(vehicles, isPowerful));

		// execute function
		executor.submit(() -> utiles.applyFunction(vehicles, getBrand));

		// close
		executor.shutdown();
		try {
			if (!executor.awaitTermination(60, TimeUnit.SECONDS)) {
				executor.shutdownNow();
			}
		} catch (InterruptedException e) {
			executor.shutdownNow();
			Thread.currentThread().interrupt();
		}

		long endTime = System.nanoTime();
		long elapsedTime = endTime - startTime;
		double seconds = (double) elapsedTime / 1_000_000_000.0;
		System.out.println("Elapsed Time: " + seconds + " seconds");

	}

}
