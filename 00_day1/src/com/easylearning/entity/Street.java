package com.easylearning.entity;

public class Street {
	
	private int laneNo;
	private String name;
	private LandMark landmark;
	private String pinCode;
	
	public Street() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Street(int laneNo, String name, LandMark landmark, String pinCode) {
		super();
		this.laneNo = laneNo;
		this.name = name;
		this.landmark = landmark;
		this.pinCode = pinCode;
	}



	public int getLaneNo() {
		return laneNo;
	}

	public void setLaneNo(int laneNo) {
		this.laneNo = laneNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LandMark getLandmark() {
		return landmark;
	}

	public void setLandmark(LandMark landmark) {
		this.landmark = landmark;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Street [laneNo=" + laneNo + ", name=" + name + ", landmark=" + landmark + ", pinCode=" + pinCode + "]";
	}
	
	

}
