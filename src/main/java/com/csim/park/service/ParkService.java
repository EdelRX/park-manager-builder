package com.csim.park.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csim.park.model.Location;
import com.csim.park.model.ParkModel;
import com.csim.park.repositories.ParkRepository;
import com.csim.park.requests.ParkBuildRequest;

@Service
public class ParkService {

	@Autowired
	ParkRepository parkRepository;

	public boolean buildPark(ParkBuildRequest parkBuildRequest) {

		boolean result;

		try {
			ParkModel parkModel = new ParkModel();
			parkModel.setType(parkBuildRequest.getType());
			parkModel.setSize(parkBuildRequest.getSize());

			Location location = new Location();
			location.setXCoord(parkBuildRequest.getHorizontalCoord());
			location.setYCoord(parkBuildRequest.getVerticalCoord());

			parkModel.setLocation(location);
			parkRepository.save(parkModel);
			result = true;
		} catch (Exception e) {
			result = false;
		}
		return result;
	}
}
