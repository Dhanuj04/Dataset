package com.client;

import java.text.ParseException;
import java.util.ArrayList;

import com.dao.jdbc.VehicleDaoImpl;
import com.dao.vehicle.VehicleDao;

import com.entity.VehicleDetails;
import com.exception.DataAccessException;
import com.keyutil.KeyBoardUtil;

public class VehicleRental {
	public static void main(String[] args) { //throws DataAccessException{
		VehicleDao ob=new VehicleDaoImpl(); 
		while(true){
		    System.out.println("Main Menu");
		    System.out.println("1.Add a New Vehicle");
		    System.out.println("2.Book a Vehicle");
		    System.out.println("3.Vehicle Booking Report");
		    int choice=KeyBoardUtil.getInt("Please choose an option [1, 2, 3]:");
		    
		    switch(choice)
		    {
		    case 1:
		    	String a = KeyBoardUtil.getString("Enter Registration :");
		    	String b = KeyBoardUtil.getString("Vehicle Category :");
		    	String c = KeyBoardUtil.getString("Enter Manufacturer :");
		    	int d = KeyBoardUtil.getInt("Enter Daily rent :");
		    	int e = KeyBoardUtil.getInt("Enter Mileage :");
		    	String f = KeyBoardUtil.getString("Enter Fuel type :");
		    	String g = KeyBoardUtil.getString("Enter Description :");
		    	VehicleDetails v = new VehicleDetails(a,b,c,d,e,f,g);

		    	break;
		    	
		    	
		    case 2:
		    	
		    case 3:
		    	
		    }
		}
	}
}
		    
		    
		    
		    
		    
		    
		    
//		    switch(choice){
//		    case 1:
//			System.out.println("Enter Registration Number:");
//			ArrayList<VehicleDetails> l1=ob.getVehicleCategory();
//			for(VehicleDetails d:l1)
//			{
//			    System.out.println(d.getCategory());
//			    }
//			int choice2=KeyBoardUtil.getInt("Enter Vehicle Category [1,2,3] :");
//			switch(choice2){
//			case 1:
//			    ArrayList<VehicleDetails> l2=ob.getManufacturer();
//			    int i=1;
//			    System.out.println("Truck");
//			    for(Drinks d1:l2){
//				System.out.println(d1.getDrinkId()+" "+d1.getName()+"-"+d1.getDesc());
//			    }	   
//			    System.out.println();
//			    DrinkOrder order = new DrinkOrder();
//			    order.setDrinkConsumptionId(KeyBoardUtil.getInt("Choose a coffee :"));
//			    order.setDrinkQuantity(KeyBoardUtil.getInt("Enter total number of units:"));
//			    try {
//				order.setDeliveryDate(KeyBoardUtil.getDate("Enter delivery date(YYYY-MM-DD) :"));
//			    } catch (ParseException e) {
//				e.printStackTrace();
//			    }
//			    ob.addDrinkConsumptionDetails(order);
//			    System.out.println("Coffee Added successfully");
//			    
//			case 2:
//			    ArrayList<Drinks> l3=ob.getDrinkOption(choice2);
//			    System.out.println("Teas-Hot");
//			    for(Drinks d1:l3){
//				System.out.println(d1.getDrinkId()+" "+d1.getName()+"-"+d1.getDesc());
//			    }	   
//			    System.out.println();
//			    DrinkOrder order1 = new DrinkOrder();
//			    order1.setDrinkConsumptionId(KeyBoardUtil.getInt("Choose a tea :"));
//			    order1.setDrinkQuantity(KeyBoardUtil.getInt("Enter total number of units:"));
//			    try {
//				order1.setDeliveryDate(KeyBoardUtil.getDate("Enter delivery date(YYYY-MM-DD) :"));
//			    } catch (ParseException e) {
//				e.printStackTrace();
//			    }
//			    ob.addDrinkConsumptionDetails(order1);
//			    System.out.println("tea Added successfully");
//			 
//			default:
//				System.out.println("Enter valid data");
//			}
//		    case 2:
//			DrinkConsumptionSearchVO search = new DrinkConsumptionSearchVO();
//			try{
//			    
//			    search.setToDate(KeyBoardUtil.getDate("Enter to date"));
//			    search.setFromDate(KeyBoardUtil.getDate("Enter from date:"));
//			    System.out.println("Enter drink details:");
//			    ArrayList<DrinkType> l4=ob.getDrinkTypes();
//			    for(DrinkType d:l4)
//			    {
//				System.out.println(d.getDrinkId()+"\t"+d.getDrinkName());
//			    }
//			    search.setDrinkTypeId(KeyBoardUtil.getInt("Choose a Drink Type [1,2]"));
//			    ArrayList<DrinkConsumptionVO> result = ob.getDrinkConsumptionDetails(search);
//			    for(DrinkConsumptionVO drink:result){
//				System.out.println(drink.getDrinkOption()+"\t"+drink.getTotalConsumption());
//			    }
//			
//			}catch(ParseException e1){
//			    e1.printStackTrace();
//			}
//		    }
//		}
//
//	    }
//
//		    
