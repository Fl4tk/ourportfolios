package com.ourportfolios.model;

import lombok.Data;

@Data
public class Sample {
	private int id;
	private String name;
	
	public Sample(int id, String name) {
		this.id = id;
		this.name = name;
	}
}
