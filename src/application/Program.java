package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entitie.Product;

public class Program {

	public static void main(String[] args) {
		
	List<Product> products = new ArrayList<>();
		
		products.add(new Product("Tv", 900.00));
		products.add(new Product("Mouse", 50.00));
		products.add(new Product("Tablet", 350.50));
		products.add(new Product("HD Case", 80.90));
		
		Function<Product, String> fun = p -> p.getName().toUpperCase();
		
		List<String> newList = products.stream()
				.map(fun)
				.collect(Collectors.toList());
		
		newList.forEach(System.out::println);

	}

}
