package com.mit.pojo;

import java.util.List;
import java.util.Scanner;

import com.mit.service.ProductService;
import com.mit.service.ProductServiceImpl;

public class ProductMenu {
	private static ProductService service= new ProductServiceImpl();
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		while(true) {
			System.out.println("1.Save\n2.Find\n3.List\n4.Price\n 5.Delete\n 6.Exit");
			System.out.println("Enter choice:");
			int choice=scanner.nextInt();
			
			switch(choice) {
			case 1:save();break;
			case 2:find();break;
			case 3:list();break;
			case 4:price();break;
			case 5:delete();break;
			case 6:System.exit(0);
			default:System.out.println("Invalid choice");
			}
		}
	}

	private static void delete() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Product Code:");
		int c=scanner.nextInt();
		try {
			if(service.delete(c))
				System.out.println("Product deleted with code: " +c);
					
		}catch(InvalidProductException e) {
			e.printStackTrace();
		}
		}

	private static void price() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Min Price:");
		double min=scanner.nextDouble();
		System.out.println("Enter Max Price:");
		double max=scanner.nextDouble();
		
		List<Product> items=service.findByPriceRange(min,max);
		items.forEach(System.out::println);
		
}

	private static void list() {
		List<Product> items=service.listAll();
		items.forEach(System.out::println);
		
	}

	private static void find() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Product Code:");
		int c=scanner.nextInt();
		try {
			Product p=service.findByCode(c);
			System.out.println(p);
		}catch(InvalidProductException e) {
			e.printStackTrace();
		}
}

	private static void save() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Product Code:");
		int c=scanner.nextInt();
		System.out.println("Enter Product Name:");
		String n=scanner.next();
		System.out.println("ENter Product Price:");
		double p=scanner.nextDouble();
		
		service.save(new Product(c,n,p));
	}
	

}
