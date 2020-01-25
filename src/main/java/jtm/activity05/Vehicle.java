package jtm.activity05;

import jtm.activity04.Road;
import jtm.activity04.Transport;

public class Vehicle extends Transport {

	protected int wheels;

	public Vehicle(String id, float consumption, int tankSize, int wheels) {
		super(id, consumption, tankSize);
		this.wheels = wheels;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String move(Road road) {
		// TODO Auto-generated method stub

		String text = null;

		System.out.println();

		System.out.println("----" + getId()  + "fuel in tank" + getFuelInTank() + "Distace:" + road.getDistance()
				+ "Fuel required: " + (road.getDistance() * getConsumption()) / 100);

		if (road instanceof WaterRoad) {

			text = "Cannot drive on " + road.toString();

		} else {
			
			super.move(road);
			text = getId() + " Vehicle is driving on " + road.toString() + " with " + wheels + " wheels";

		}

		return text;

		// return super.move(road);
	}

}

/*
 * Create class Vehicle as subclass of Transport Allow to store protected int
 * number of wheels for vehicle. Implement Vehicle(String id, float consumption,
 * int tankSize, int wheels) constructor, Override method move(Road) for
 * vehicle, which returns String in form: ID Vehicle is driving on (Road as
 * String) with x wheels
 * 
 * where:
 * 
 * (Road as String) is string representation of the road, x is actual number of
 * wheels. return Cannot drive on (Road as String) if it is not Road.
 */