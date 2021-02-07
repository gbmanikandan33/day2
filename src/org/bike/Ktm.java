package org.bike;

public class Ktm implements Bike {

	@Override
	public void cost() {
		System.out.println("ktm cost:500000");		
	}

	@Override
	public void speed() {
		System.out.println("ktm speed:120km");
		
	}
public static void main(String[] args) {
	Ktm k=new Ktm();
	k.cost();
	k.speed();
}
	
	
	
}
