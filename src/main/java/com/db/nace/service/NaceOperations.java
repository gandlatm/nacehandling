package com.db.nace.service;

import java.util.Optional;

import com.db.nace.model.Nace;

public interface NaceOperations {
	
	public void putNaceDetails(Nace nace);
	
	
	public Optional<Nace> getNaceDetails(int i);

}
