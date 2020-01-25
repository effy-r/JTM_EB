package jtm.activity05;

import jtm.activity04.Transport;

public class Ship extends Transport {

	public Ship(String id, float consumption, int tankSize) {
		super(id, consumption, tankSize);
		// TODO Auto-generated constructor stub
	}
	
	protected byte numberOfSails;

	public Ship(String getId(), byte numberOfSails) {
		
		this.id = id;
		this.numberOfSails = numberOfSails;
	}
	

	

}
