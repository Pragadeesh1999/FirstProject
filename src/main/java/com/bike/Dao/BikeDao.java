package com.bike.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bike.Entity.Bike;
import com.bike.Repository.BikeRespository;

@Repository
public class BikeDao {
	@Autowired
	BikeRespository bikeRepo;

	public String postBike(Bike bike) {
		 bikeRepo.save(bike);
		 return "saved successfully";
	}

	public List<Bike> getAll() {
		return bikeRepo.findAll();
	}

	public Bike getBike(int id) {
		return bikeRepo.findById(id).get();
	}

	public String updateBike(int id, Bike bike) {
		Bike b= bikeRepo.findById(id).get();
		
		b.setBrand(bike.getBrand());
		b.setPrice(bike.getPrice());
		b.setColor(bike.getColor());
		
		bikeRepo.save(b);
		return "successfully updated";
		
	}

	public String deleteBike(int id) {
		bikeRepo.deleteById(id);
		return null;
	}

}
