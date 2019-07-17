package com.oms.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.oms.entities.Shipper;
import com.oms.service.ShipperService;

@RestController
@RequestMapping("/shipper")
public class ShipperController {
	@Autowired
	private ShipperService shipperService;

	@PostMapping("saveShipper")
	public void addShipper(@RequestBody Shipper shipper) {
		shipperService.addShipper(shipper);
	}

	@GetMapping("/getShipperById")
	public Optional<Shipper> getShipperById(@RequestParam int shipperId) {
		Optional<Shipper> shipper = shipperService.getShipperById(shipperId);
		return shipper;
	}
}
