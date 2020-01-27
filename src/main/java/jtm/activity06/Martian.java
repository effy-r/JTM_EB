package jtm.activity06;

public class Martian implements Alien, Humanoid, Cloneable {

	private int weight;
	public boolean alive;
	private String[] backpack;

	public Martian(int weight) {

		this.weight = weight;
		this.alive = true;
		this.backpack = new String[10];
	}
	public Martian() {
		this.weight = 42;
		this.alive = true;
		this.backpack = new String[10];
	}
	@Override
	public int getWeight() {
		// TODO Auto-generated method stub
		return this.weight;
	}

	@Override
	public void setWeight(int weight) {
		// TODO Auto-generated method stub
		this.weight = weight;
	}

	@Override
	public void eatHuman(Humanoid humanoid) {
		// TODO Auto-generated method stub

		if (humanoid.isAlive()=="Alive") {
		this.weight = this.weight + humanoid.getWeight();
		humanoid.killHimself();
		}
		else {
			this.weight = this.weight;
		}
		/**
		 * @param humanoid represents human, needed to be eaten. Human is being killed
		 *                 when it is eaten an alien gains his weight
		 */
	}

	@Override
	public int getLegCount() {
		// TODO Auto-generated method stub
		return LEG_COUNT;
	}

	@Override
	public String isAlive() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub

		if (this.alive == false) {
			return "Dead";
		} else {
			return "Alive";
		}
	}

	@Override
	public String killHimself() {
		String status = null;
		
			status = "I AM IMMORTAL!";
		
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
	protected Object clone() throws CloneNotSupportedException {
		// TODO

		return super.clone();
	}

}
