package com.csim.park.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.csim.park.model.ParkModel;

@Repository
public interface ParkRepository extends MongoRepository<ParkModel, Long> {


}
