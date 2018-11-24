package com.sun.vo;

public class Enginner extends Persion {
	// Ö°ÒµÃû³Æ
	private String profession;
	
	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	@Override
	public String toString() {
		return "Enginner [profession=" + profession + "]";
	}

}
