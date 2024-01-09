package StarWar_1111410025;

import java.util.*;
public class AirCraft {
	
	private String manufacturer ;
	private double Length;
	private double AirSpeed ;
	private double SpaceSpeed;
	private String StdandardEngine ;
	private String HyperSpaceEngine;
	private String Weapon;
	private String Weapon_power;
	private int Passenger;
	private String Shield;
	private double[] ShieldPower;
	
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	private  String model;
	public AirCraft(String manufacturer,String getModel) {
	     this.setManufacturer(manufacturer);
	     this.setModel(getModel);
	}
	
	@Override
	public String toString() {
		return "PcRoom [manufacturer=" + manufacturer + ", Model=" + getModel() + "]";
	}
	
}


