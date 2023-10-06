package com.dao.vehicle;

import java.util.ArrayList;

import com.entity.VehicleDetails;
import com.exception.DataAccessException;


public interface VehicleDao {
	
	void addVehicleDetails(VehicleDetails vehicledetails) throws DataAccessException;

}
