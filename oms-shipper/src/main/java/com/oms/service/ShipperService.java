package com.oms.service;

import java.util.Optional;

import com.oms.entities.Shipper;

public interface ShipperService {
	public void addShipper(Shipper shipper);

	public Optional<Shipper> getShipperById(int shipperId);
}
