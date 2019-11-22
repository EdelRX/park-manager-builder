package com.csim.park.model;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="park-management")
public class ParkModel implements Serializable{
	
	private static final long serialVersionUID = -3232223244881989090L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private BigInteger id;
	
	private String size;
	private String type;
	private Location location;
}
