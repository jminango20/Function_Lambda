package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> list = new ArrayList<Product>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		//List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList()); //aplico a funcao UpperCaseName a cada elemento da minha lista
		//List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
		//List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
		
		//Expresao lambda
		//Function<Product, String> function = p->p.getName().toUpperCase();
		//List<String> names = list.stream().map(function).collect(Collectors.toList());
		
		//Expresao lambda inline
		List<String> names = list.stream().map(p->p.getName().toUpperCase()).collect(Collectors.toList());

		names.forEach(System.out::println);

	}

}
