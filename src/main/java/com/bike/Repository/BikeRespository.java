package com.bike.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bike.Entity.Bike;

public interface BikeRespository extends JpaRepository<Bike, Integer>{

}
