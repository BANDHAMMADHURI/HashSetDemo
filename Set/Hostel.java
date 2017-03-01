package com.full.Set;

public class Hostel {
	private String hostelName, wifi, hotWater, washingMachine, ac;
	private int rent;
	private long contact;
    private int hostelId;
	public Hostel(String hostelName, int hostelId,long contact,String wifi, String ac,  String washingMachine, String hotWater,
			int rent) {
		this.hostelName = "hostel name :" + hostelName;
		this.hostelId =  hostelId;
		this.ac = "ac facility :" + ac;
		this.hotWater = "Hot Water :" + hotWater;
		this.rent =  rent;
		this.washingMachine = "Washing Machine :" + washingMachine;
		this.wifi = " WiFi :" + wifi;
		this.contact=contact;
	}

	/*public Hostel() {
		// TODO Auto-generated constructor stub
	}
*/
	public void setHostelName(String name) {
		this.hostelName = name;
	}

	public void setHostelId(int id) {
		this.hostelId = id;
	}

	public void setAc(String ac) {
		this.ac = ac;
	}

	public void setHotWater(String hotWater) {
		this.hotWater = hotWater;
	}

	public void setWashingMachine(String washingMachine) {
		this.washingMachine = washingMachine;
	}

	public void setRent(int rent) {
		this.rent = rent;
	}

	public void setWiFi(String wifi) {
		this.wifi = wifi;
	}

	public String getHostelName() {
		return hostelName;
	}

	public int getHostelId() {
		return hostelId;
	}

	public String getWiFi() {
		return wifi;
	}

	public String getHotWater() {
		return hotWater;
	}

	public int getRent() {
		return rent;
	}

	public String getAc() {
		return ac;
	}

	public String getWashingMachne() {
		return washingMachine;
	}
	
	 @Override
	    public int hashCode()
	    {
	        return hostelId;
	    }
	 
	    @Override
	    public boolean equals(Object obj)
	    {
	        Hostel hostel = (Hostel) obj;
	 
	        return (hostelId == hostel.hostelId);
	    }

	public String toString() {
		return "\n"+hostelName + " \n hostel id is :" + hostelId + "\n Contact "+contact+"\n" + wifi + "\n " + ac + "\n " + washingMachine + "\n " + hotWater + " \n rent is :" + rent+"\n";
	}

}
