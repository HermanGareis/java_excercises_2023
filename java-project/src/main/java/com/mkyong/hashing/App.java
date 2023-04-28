package com.mkyong.hashing;

import java.io.IOException;
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

import com.mkyong.hashing.exceptions.ApachePOIException;
import com.mkyong.hashing.exceptions.BaseException;

public class App {
	public static void main(String[] args) throws BaseException {

		final List<Veicolo> vehicles = new ArrayList<>();
		
		try {
			ApachePOIUtils.readFile("C:\\Users\\Gareis\\Desktop\\cars.xlsx", vehicles);
		} catch (IOException e) {
			throw new ApachePOIException.ApachePOIX(e.getMessage());
		}
				
		
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
