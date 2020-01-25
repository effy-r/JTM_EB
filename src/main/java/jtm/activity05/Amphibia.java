package jtm.activity05;

import jtm.activity04.Road;

public class Amphibia extends Vehicle {

	private byte sails;

	public Amphibia(String id, float consumption, int tankSize, byte sails, int wheels) {
		super(id, consumption, tankSize, wheels);
		this.sails = sails;
	}

	@Override
	public String move(Road road) {
		// TODO Auto-generated method stub

		String text = null;
		if (road instanceof WaterRoad) {

			text = getId() + " Amphibia is sailing on " + road.toString() + " with " + sails + " sails";

		} else {

			super.move(road);

			text = getId() + " Amphibia is driving on " + road.toString() + " with " + wheels + " wheels";

		}

		return text;

		// TODO Auto-generated constructor stub
	}
}

/*
 * Implement Amphibia class in a such way, that it is a Transport: Make all
 * internal properties of Amphibia private. Implement constructor
 * Amphibia(String id, float consumption, int tankSize, byte sails, int wheels)
 * Override move(Road road) method, that Amhibia behaves like a Vehicle on
 * ground road and like a Ship on water road.
 */