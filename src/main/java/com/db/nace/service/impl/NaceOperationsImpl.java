package com.db.nace.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db.nace.model.Nace;
import com.db.nace.repository.NaceRepository;
import com.db.nace.service.NaceOperations;

@Service
public class NaceOperationsImpl implements NaceOperations{
	
	@Autowired
	NaceRepository naceRepository;

	@Override
	public void putNaceDetails(Nace nace) {
		// TODO Auto-generated method stub
		naceRepository.save(nace);
		
	}

	@Override
	public Optional<Nace> getNaceDetails(int naceOrder) {
		// TODO Auto-generated method stub
		return naceRepository.findById(naceOrder);
	}

}
