package test;

import java.util.ArrayList;
import java.util.List;

public class Shop {

	public static void main(String[] args) {
		Product p1 = new PCGame("Witcher", 99);
		Product p2 = new PSGame("Mario", 15);
		Product p3 = new XboxGame("Tetris", 99);
		Product p4 = new NintendoGame("Zelda", 49);
		int sum = 0;
		List <Product> cart = new ArrayList <Product> ();
		cart.add(p1);
		cart.add(p2);
		cart.add(p3);
		cart.add(p4);
		
		for (Product x: cart){
			sum+=x.getPrice();
		}
		
		System.out.println(sum);
		
		for (Product x: cart){
			System.out.println(x.getName());
		}
		
	}

}
