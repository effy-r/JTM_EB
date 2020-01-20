package jtm.activity04;

import java.util.Locale;

public class Transport extends Road {
	// Do not change access modifiers to encapsulate internal properties!
	private String id; // Transport registration number
	private float consumption; // fuel consumption in litres per 100km
	private int tankSize; // tank size in litres
	private float fuelInTank; // fuel in tank

	/*- TODO #1
	 * Generate Constructor using Fields...
	 * which sets id, consumption, tankSize
	 * values of the newly created object
	 * And make fuel tank full.
	 */

	public Transport(String id, float consumption, int tankSize) {

		this.id = id;
		this.consumption = consumption;
		this.tankSize = tankSize;
		fuelInTank = tankSize;
	}

	/*- TODO #2
	 * Generate getters and Setters for consumption, tankSize, id, and fuelInTank fields
	 */
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public float getConsumption() {
		return consumption;
	}

	public void setConsumption(float consumption) {
		this.consumption = consumption;
	}

	public int getTankSize() {
		return tankSize;
	}

	public void setTankSize(int tankSize) {
		this.tankSize = tankSize;
	}

	public float getFuelInTank() {
		return fuelInTank;
	}

	public void setFuelInTank(float fuelInTank) {
		this.fuelInTank = fuelInTank;
	}

	/*- TODO #3
	 * Generate toString()...
	 * and implement this method, that t returns String in form:
	 * "Id:ID cons:0.0l/100km, tank:00l, fuel:00.00l"
	 * where ID and numbers are actual numbers of the transport
	 * HINT: use String.format(Locale.US, "%.2f", float) to limit shown numbers
	 * to 2 decimal for fractions, and dot as a decimal delimiter.
	 */

	// Return transport id and type as string e.g. "AAA Transport"
	// HINT: use this.getClass().getSimpleName(); to get type of transport

	protected final String getType() {
		// TODO return required value

		this.getClass().getSimpleName();

		return "" + id + " " + this.getClass().getSimpleName();
	}

	public String toString() {
		return "Id:" + getType() + " cons:" + String.format(Locale.US, "%.2f", consumption) + "l/100km, tank:"
				+ tankSize + "l, fuel:" + String.format(Locale.US, "%.2f", fuelInTank);

	}

	// HINT: use getType() to describe transport and road.toString() to describe
	// road
	// HINT: String.format(Locale.US, "%.2f", float) to format float number with
	// fixed mask

	public String move(Road road) {
		// TODO If transport has enough fuel, decrease actual amount of fuel by
		// necessary amount and return String in form:
		// "AAA Type is moving on From–To, 180km"
		// TODO If there is no enough fuel in tank, return string in form:
		// "Cannot move on From–To, 180km. Necessary
		// fuel:0.00l, fuel in tank:0.00l"

		float fuelRequired = (getDistance() * getConsumption()) / 100;
		String text = null;
		
		System.out.println("move(Road road)");

		if (fuelRequired <= getFuelInTank()) {

			text = getType() + " is moving on " + getFrom() + " — " + getTo() + ", " + getDistance() + "km";

		} else if (fuelRequired > getFuelInTank()) {
			text = "Cannot move on " + getFrom() + " — " + getTo() + ", " + getDistance() + "km. Necessary fuel:"
					+ String.format(Locale.US, "%.2f", fuelRequired) + "l, fuel in tank:" + fuelInTank + "l";

		}

		return text;

	}
}
