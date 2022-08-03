package com.db.nace.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import com.db.nace.model.Nace;

public class NaceControllerTest {
	
	@InjectMocks private NaceController naceController;
	
	Nace nace = new Nace();
	
	@BeforeEach
	public void before(){
		nace.setNacelevel(4);
		nace.setNaceCode(1.25);
		nace.setNaceParent(1.1);
		nace.setDescription("Growing on non-perennial crops");
		nace.setItemSummaryMain("Growing of plants forseed production");
		nace.setItemSummarySub("This service includes related activities");
		nace.setRulings("Automated Egg hatching");
		nace.setExcludesSummary("Planing of wood activities");
		nace.setRefToISIC(145);
		
	}
	
	@Test
	void putNaceDetails() {
		//
	}
	
	@Test
	void getNaceDetails() {
		//
		
	}

}
