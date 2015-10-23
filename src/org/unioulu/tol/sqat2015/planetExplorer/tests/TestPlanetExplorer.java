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
	public void testGridAndOneOdstacles() {

		PlanetExplorer planetE= new PlanetExplorer(7, 5, "(5,5)");
		
		String gridSize=planetE.gridSize();
		assertEquals("7x5",gridSize);
		
		String checkObstacles=planetE.checkObstacles();
		assertEquals("5,5",checkObstacles);
	}
	
	@Test
	public void testGridAndOneOdstacles2() {

		PlanetExplorer planetE= new PlanetExplorer(17, 5, "(15,5)");
		
		String gridSize=planetE.gridSize();
		assertEquals("17x5",gridSize);
		
		String checkObstacles=planetE.checkObstacles();
		assertEquals("15,5",checkObstacles);
	}
	
	@Test
	public void testGridAndEmptyexecuteCommand() {

		PlanetExplorer planetE= new PlanetExplorer(17, 5, "");
		
		String gridSize=planetE.gridSize();
		assertEquals("17x5",gridSize);
		
		String executeCommand=planetE.executeCommand("");
		assertEquals("(0,0,N)",executeCommand);
	}
	
	@Test
	public void testGridAndEmptyexecuteCommand2() {

		PlanetExplorer planetE= new PlanetExplorer(20, 20, "");
		
		String executeCommand=planetE.executeCommand("");
		assertEquals("(0,0,N)",executeCommand);
	}
	
	@Test
	public void testGridAndexecuteCommandR() {

		PlanetExplorer planetE= new PlanetExplorer(20, 20, "r");
		
		String executeCommand=planetE.executeCommand("r");
		assertEquals("(0,0,E)",executeCommand);
	}
	
	@Test
	public void testGridAndexecuteCommandL() {

		PlanetExplorer planetE= new PlanetExplorer(20, 20, "l");
		
		String executeCommand=planetE.executeCommand("r");
		assertEquals("(0,0,E)",executeCommand);
	}
}
