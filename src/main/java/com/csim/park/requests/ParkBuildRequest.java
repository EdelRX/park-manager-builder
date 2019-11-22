package com.csim.park.requests;

import java.io.Serializable;

import lombok.Data;

@Data
public class ParkBuildRequest implements Serializable{

	private static final long serialVersionUID = -3425597881126696671L;

	private String size;
	private String type;
	private int horizontalCoord;
	private int verticalCoord;
}
