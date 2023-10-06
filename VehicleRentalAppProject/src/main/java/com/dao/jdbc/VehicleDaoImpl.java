package com.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.vehicle.VehicleDao;
import com.entity.VehicleDetails;
import com.exception.DataAccessException;

public class VehicleDaoImpl extends BaseDao implements VehicleDao {


    Connection con=null;
    PreparedStatement ps=null;
    private static final String ADD_VEHICLE_DETAILS="insert into vehicledetails(Regno,vcategory,manufacturer, drent, milage, fueltype, decription) values(?,?,?,?,?,?,?)";
	
	@Override
	public void addVehicleDetails(VehicleDetails vehicledetails) throws DataAccessException {
		// TODO Auto-generated method stub
		try{
		    con=getConnection();
		    ps=con.prepareStatement(ADD_VEHICLE_DETAILS);
		    ps.setString(1, vehicledetails.getRegNo());
		    ps.setString(2, vehicledetails.getCategory());
		    ps.setString(3, vehicledetails.getManufacturer());
		    ps.setDouble(4, vehicledetails.getDRent());
		    ps.setFloat(5, vehicledetails.getMileage());
		    ps.setString(6, vehicledetails.getFType());
		    ps.setString(7, vehicledetails.getDescp());
		    ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		    System.out.println("unable to load");
		}finally{
		    releaseResources(con, ps);
		}
		
	}


}
