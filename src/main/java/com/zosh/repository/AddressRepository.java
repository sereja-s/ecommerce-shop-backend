package com.zosh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.zosh.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

	@Query("select a from Address a")
	public List<Address> getAllAddress();

}