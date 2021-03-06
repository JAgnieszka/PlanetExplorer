package org.unioulu.tol.sqat2015.planetExplorer;

// Before submitting write your ID and finish time here. Your ID is written on project description sheets.
// ID: 144
// Finish time: 13:34
public class PlanetExplorer {
	
	private int [][]grid;
//	private int [][]tabX;
	int xPositionEX=0; //explorer
	int yPositionEX=0;//explorer
	String directionDefoultEX="N";//explorer
	
	String obsX=null;
	String obsY=null;
	String result=null;
	
	
	public PlanetExplorer(int x, int y, String obstacles){
		
		
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)" with no white spaces. 
	 *  
		Example use:
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)")  //A 100x100 grid with two obstacles at coordinates (5,5) and (7,8) 
	 */
		
		
		grid=new int[x][y];
		
//		System.out.println("obstacles.substring(0) "+obstacles.substring(0,1));
		
		if(obstacles != ""  && obstacles.substring(0,1).equals("(")){
			obsX = obstacles.substring(1,obstacles.indexOf(","));
			System.out.println("obsX "+obsX);
			obsY = obstacles.substring(obstacles.indexOf(",")+1,obstacles.length()-1);
			System.out.println("obsY "+obsY);
			
		}
//		else{
//			directionDefoultEX="N";
//		}
		
		
	}
	
	public String executeCommand(String command){
		
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" 
		 * Where pos_x and pos_y are the final coordinates, facing is the current direction the explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		
		if(command.equals("")){
			directionDefoultEX="N";
		}if(command.equals("r")){
			directionDefoultEX="E";
			
		}if(command.equals("l")){
			directionDefoultEX="W";
			
		}
		if(command.equals("f")){
			directionDefoultEX="N";
			yPositionEX=1;
		}
		if(command.equals("b")){
			directionDefoultEX="N";
			xPositionEX=1;
		}
		
		return result="("+xPositionEX+","+yPositionEX+","+directionDefoultEX+")";
	}

	public String gridSize() {
		String xx=Integer.toString(grid.length); //get x and convert to string
		String yy=Integer.toString(grid[0].length); //get x and convert to string
		
		System.out.println("xx "+xx);
		System.out.println("yy "+yy);
		
		String result= xx + "x"+ yy;
		System.out.println("result "+result);
		return result;
	}

	public String checkObstacles() {
		System.out.println("obsX1 "+obsX);
		System.out.println("obsY1 "+obsY);
		return obsX+","+obsY;
	}
}
