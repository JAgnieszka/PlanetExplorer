package org.unioulu.tol.sqat2015.planetExplorer.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat2015.planetExplorer.PlanetExplorer;

public class TestPlanetExplorer {

	@Test
	public void testCreateGrid() {

		PlanetExplorer planetE= new PlanetExplorer(10, 10, "");
		
		String gridSize=planetE.gridSize();
		assertEquals("10x10",gridSize);
	}
}
