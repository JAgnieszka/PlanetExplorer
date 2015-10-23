package org.unioulu.tol.sqat2015.planetExplorer.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat2015.planetExplorer.PlanetExplorer;

public class TestPlanetExplorer {

	@Test
	public void testCreateGrid() {

		PlanetExplorer planetE= new PlanetExplorer(10, 5, "");
		
		String gridSize=planetE.gridSize();
		assertEquals("10x5",gridSize);
	}
	
	@Test
	public void testCreateGrid100x100() {

		PlanetExplorer planetE= new PlanetExplorer(100, 100, "");
		
		String gridSize=planetE.gridSize();
		assertEquals("100x100",gridSize);
	}
	
	@Test
	public void testCreateGridXxYxNorth() {

		PlanetExplorer planetE= new PlanetExplorer(0,0, "");
		
		String gridSize=planetE.gridSize();
		assertEquals("0x0",gridSize);
	}
}
