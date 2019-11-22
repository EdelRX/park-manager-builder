package com.csim.park.model;

import java.io.Serializable;


import lombok.Data;

@Data
public class Location implements Serializable{

	private static final long serialVersionUID = 8040715984575584572L;
	
	private int xCoord;
	private int yCoord;
}

