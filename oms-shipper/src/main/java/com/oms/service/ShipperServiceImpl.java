package com.oms.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oms.entities.Shipper;
import com.oms.repositories.ShipperRepository;

@Service
public class ShipperServiceImpl implements ShipperService {
	@Autowired
	private ShipperRepository shipperRepository;

	@Override
	public void addShipper(Shipper shipper) {

		shipperRepository.save(shipper);
	}

	@Override
	public Optional<Shipper> getShipperById(int shipperId) {
		Optional<Shipper> shipper = shipperRepository.findById(shipperId);
		return shipper;
	}

}
