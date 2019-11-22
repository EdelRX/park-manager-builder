package com.csim.park.listeners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

import com.csim.park.binders.StreamBinder;
import com.csim.park.requests.ParkBuildRequest;
import com.csim.park.service.ParkService;

@Component
public class KafkaStreamListener {
	
	@Autowired
	ParkService parkService;

	@StreamListener(StreamBinder.INPUT)
	public void process(ParkBuildRequest parkBuildRequest) {
		parkService.buildPark(parkBuildRequest);
	}
}
