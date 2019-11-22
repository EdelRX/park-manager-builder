package com.csim.park;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

import com.csim.park.binders.StreamBinder;

@SpringBootApplication
@EnableBinding(StreamBinder.class)
public class ParkManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkManagerApplication.class, args);
	}

}
