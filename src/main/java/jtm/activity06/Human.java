package jtm.activity06;

import java.util.Arrays;

public class Human implements Humanoid {

	private int weight;
	public boolean alive;
	private String[] backpack;

	@Override
	public int getWeight() {
		// TODO Auto-generated method stub
		return this.weight;
	}

	public Human() {
		this.weight = 42;
		this.alive = true;
		this.backpack = new String[10];
	}

	public Human(int initialWeight) {
		this.weight = initialWeight;
		this.alive = true;
		this.backpack = new String[10];
	}

	@Override
	public void setWeight(int weight) {

		this.weight = weight;
		// TODO Auto-generated method stub

	}

	@Override
	public String killHimself() {
		// TODO Auto-generated method stub
		String status = null;
		if (alive) {

			alive = false;
			status = "Dead";
		}
		return status;
	}

	@Override
	public int getArmCount() {

		// TODO Auto-generated method stub
		return ARM_COUNT;
	}

	@Override
	public String[] getBackpack() {
		// TODO Auto-generated method stub
		

		return this.backpack;
	}

	@Override
	public void addToBackpack(String item) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < this.backpack.length; i++) {
			if (this.backpack[i] == null) {
				this.backpack[i] = item;
				break;
			}
		}
	}

	@Override
	public String isAlive() {
		// TODO Auto-generated method stub

		if (this.alive == false) {
			return "Dead";
		} else {
			return "Alive";
		}
	}

}
