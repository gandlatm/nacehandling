package com.db.nace.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.db.nace.model.Nace;
import com.db.nace.service.NaceOperations;

@RestController
@RequestMapping("/nace-service")
public class NaceController {

	@Autowired
	NaceOperations naceOperations;

	@PostMapping(path = "/put/nace-details")
	public void putNaceDetails(@RequestBody Nace nace) {

		naceOperations.putNaceDetails(nace);

	}

	@GetMapping(path = "/get/nace-details")
	public Optional<Nace> getNaceDetails(int Order) {

		return naceOperations.getNaceDetails(Order);

	}

}
