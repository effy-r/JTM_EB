package jtm.activity05;

import jtm.activity04.Road;
import jtm.activity04.Transport;

public class Ship extends Transport {

	protected byte sails;

	public byte getSails() {
		return sails;
	}

	public void setSails(byte sails) {
		this.sails = sails;
	}

	public Ship(String id, float consumption, int tankSize, byte sails) {
		super(id, consumption, tankSize);

		this.sails = sails;
		// TODO Auto-generated constructor stub
	}

	public Ship ( String id, byte sails) {
		super(id,0,0);
		this.sails=sails;
		
	}
	@Override
	public String move(Road road) {
		// TODO Auto-generated method stub

		String text = null;
		
		//System.out.println(getId() + "/" + road.toString() + "/" + getId() + "--------------"  + getClass().getName());

		if (road instanceof WaterRoad) {

			text = getId() + " Ship is sailing on " + road.toString() + " with " + sails + " sails";
			

		} else {
			text = "Cannot sail on " + road.toString();

		}

		return text;
		// return super.move(road);
	}

}
