package com.bike.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bike.Entity.Bike;
import com.bike.Repository.BikeRespository;
import com.bike.Service.BikeService;


@CrossOrigin(origins="http://localhost:4200")

@RestController

public class BikeController {
	
	@Autowired
	BikeService bikeService;
	
	@Autowired
	BikeRespository br;
	
	@CrossOrigin(origins="localhost:4200")
	@PostMapping("/bike")
	public Bike postBike(@RequestBody Bike bike) {
		return br.save(bike);
	}
	
	@GetMapping("/bike")
	public List<Bike> getAll() {
		return bikeService.getAll();
		
	}
	@GetMapping("/bike/{id}")
	public Bike getBike(@PathVariable int id) {
		return bikeService.getBike(id);
	}
	
	@PutMapping("/bike/{id}")
	public String updateBike(@PathVariable int id, @RequestBody Bike bike) {
		return bikeService.updateBike(id,bike);
	}
	
	@DeleteMapping("/bike/{id}")
	public String deleteBike(@PathVariable int id) {
		return bikeService.deleteBike(id);
	}

}
