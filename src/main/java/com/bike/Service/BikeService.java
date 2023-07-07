package com.bike.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bike.Dao.BikeDao;
import com.bike.Entity.Bike;

@Service
public class BikeService {
	@Autowired
	BikeDao bikeDao;

	public String postBike(Bike bike) {
		return bikeDao.postBike(bike);
	}

	public List<Bike> getAll() {
		return bikeDao.getAll();
	}

	public Bike getBike(int id) {
		return bikeDao.getBike(id);
	}

	public String updateBike(int id, Bike bike) {
		return bikeDao.updateBike(id,bike);
	}

	public String deleteBike(int id) {
		return bikeDao.deleteBike(id);
	}

}
