package com.csim.park.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.csim.park.requests.ParkBuildRequest;
import com.csim.park.service.ParkService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/park-manager")
@Slf4j
public class ParkController {
	
	@Autowired
	ParkService parkService;
	
	@PostMapping("park-build")
	public ResponseEntity<String> build(@RequestBody ParkBuildRequest parkBuildRequest) {
		
		log.info("Adding park of type {}",parkBuildRequest.getType());
		
		boolean result = parkService.buildPark(parkBuildRequest);
		
		if(result) {
			log.info("Added park type {} to the database",parkBuildRequest.getType());
			return new ResponseEntity<>("Correctly added park", 
				      HttpStatus.OK);
		}else {
			return new ResponseEntity<>("Error adding house", 
				      HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
